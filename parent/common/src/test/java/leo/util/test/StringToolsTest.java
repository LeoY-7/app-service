package leo.util.test;

import leo.util.StringTools;

import java.util.HashMap;

public class StringToolsTest {

    public static void main(String[] arg) {
        StringTools st = new StringTools();
        HashMap<String, String> testMap = new HashMap<String, String>();
        testMap.put("account", "122123123");
        testMap.put("base_acct_no", "222123123");

        st.dataMask(testMap);
        System.out.println(testMap);
    }
}
