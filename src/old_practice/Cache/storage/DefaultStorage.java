package old_practice.Cache.storage;

import old_practice.Cache.eviction.DefaultLRUEvictionService;
import old_practice.Cache.eviction.Eviction;
import old_practice.Cache.exceptions.KeyNotFoundException;
import old_practice.Cache.exceptions.NullElementException;

import java.util.HashMap;
import java.util.Map;

public class DefaultStorage implements Storage{

    private final int DEFAULT_CAPACITY = 5;
    private Integer capacity;
    private final Map<String, String> storageMap;
    private Eviction evictionService;

    public DefaultStorage(Integer capacity, Eviction evictionService) {
        this.capacity = capacity == 0 ? DEFAULT_CAPACITY : capacity;
        storageMap = new HashMap<>(capacity);
        this.evictionService = evictionService;
    }

    public DefaultStorage() {
        this.capacity = DEFAULT_CAPACITY;
        storageMap = new HashMap<>(capacity);
        this.evictionService = new DefaultLRUEvictionService();
    }

    @Override
    public void storeData(String key, String value) throws NullElementException {
        if (storageMap.size() == capacity) {
            String removalKey = evictionService.evictData();
            removeData(removalKey);
        }
        storageMap.put(key,value);
        evictionService.setAccessedKey(key);
    }

    @Override
    public String getData(String key) throws KeyNotFoundException, NullElementException {
        if (!storageMap.containsKey(key)) throw new KeyNotFoundException();
        evictionService.setAccessedKey(key);
        return storageMap.get(key);
    }

    @Override
    public void removeData(String key) {
        if (!storageMap.containsKey(key)) return;
        storageMap.remove(key);
    }
}
