package old_practice.Cache.cacheManager;

import old_practice.Cache.exceptions.KeyNotFoundException;
import old_practice.Cache.exceptions.NullElementException;

public interface CacheManager {

    void addData(String key, String value) throws NullElementException;

    String getData(String key) throws KeyNotFoundException, NullElementException;

}
