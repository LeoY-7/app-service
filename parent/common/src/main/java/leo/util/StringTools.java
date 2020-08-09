package  leo.util;
import java.util.HashMap;

public class StringTools {

    public void dataMask(HashMap<String, String> map) {
        for (String key:map.keySet()
             ) {
            if ("base_acct_no".equals(key)) {
                map.put(key, "Masked:" + map.get(key));
            }
        }
    }
}
