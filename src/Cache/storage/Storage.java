package Cache.storage;

import Cache.exceptions.KeyNotFoundException;
import Cache.exceptions.NullElementException;

public interface Storage {

    void storeData(String key, String value) throws NullElementException;

    String getData(String key) throws KeyNotFoundException, NullElementException;

    void removeData(String key);


}
