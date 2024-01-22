package Cache.cacheManager;

import Cache.exceptions.KeyNotFoundException;
import Cache.exceptions.NullElementException;

public interface CacheManager {

    void addData(String key, String value) throws NullElementException;

    String getData(String key) throws KeyNotFoundException, NullElementException;

}
