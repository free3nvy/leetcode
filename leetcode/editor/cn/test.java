import datastruct.ListNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class test {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}

