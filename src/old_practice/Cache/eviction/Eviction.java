package old_practice.Cache.eviction;

import old_practice.Cache.exceptions.NullElementException;

public interface Eviction {

    void setAccessedKey(String key) throws NullElementException;

    String evictData();

}
