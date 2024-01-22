package Cache.eviction;

import Cache.exceptions.NullElementException;

public interface Eviction {

    void setAccessedKey(String key) throws NullElementException;

    String evictData();

}
