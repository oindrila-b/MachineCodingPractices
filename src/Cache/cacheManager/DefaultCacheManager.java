package Cache.cacheManager;

import Cache.eviction.Eviction;
import Cache.exceptions.KeyNotFoundException;
import Cache.exceptions.NullElementException;
import Cache.storage.Storage;

public class DefaultCacheManager implements CacheManager{

    private final Storage storageService;
    private final Eviction evictionService;

    public DefaultCacheManager(Storage storageService, Eviction evictionService) {
        this.storageService = storageService;
        this.evictionService = evictionService;
    }

    @Override
    public void addData(String key, String value) throws NullElementException {
            storageService.storeData(key,value);
    }

    @Override
    public String getData(String key) throws KeyNotFoundException, NullElementException {
        return storageService.getData(key);
    }
}
