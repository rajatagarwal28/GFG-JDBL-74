package ErrorAndExceptions;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class DB {
    Map<String, String> hm
            = new HashMap<String, String>();
    DB() {
        hm.put("as", "102");
    }

    public void updateData(String key, String value) throws DBNotFoundException {
        if (hm.containsKey(key)) {
            hm.put(key,value);
        } else {
//            throw new Exception("key doesnt exist");
            throw new DBNotFoundException("key doesnt exist");
        }
    }

    public void writeData(String key, String value) throws Exception{
        hm.put(key,value);
    }
}
