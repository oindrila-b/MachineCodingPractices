package old_practice.Cache.storage;

import old_practice.Cache.exceptions.KeyNotFoundException;
import old_practice.Cache.exceptions.NullElementException;

public interface Storage {

    void storeData(String key, String value) throws NullElementException;

    String getData(String key) throws KeyNotFoundException, NullElementException;

    void removeData(String key);


}
