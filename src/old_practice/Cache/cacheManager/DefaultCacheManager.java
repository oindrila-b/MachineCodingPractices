package old_practice.Cache.cacheManager;

import old_practice.Cache.eviction.Eviction;
import old_practice.Cache.exceptions.KeyNotFoundException;
import old_practice.Cache.exceptions.NullElementException;
import old_practice.Cache.storage.Storage;

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
