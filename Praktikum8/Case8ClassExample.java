package Praktikum8;

import java.util.*;

public class Case8ClassExample {
    private HashMap<String, Object> dataMap;

    public Case8ClassExample() {
        dataMap = new HashMap<>();
    }

    public void addData(String key, Object value) {
        dataMap.put(key, value);
    }

    public Object getData(String key) {
        return dataMap.get(key);
    }

    public boolean containsKey(String key) {
        return dataMap.containsKey(key);
    }

    public void removeData(String key) {
        dataMap.remove(key);
    }

    public void displayAllData() {
        for (Map.Entry<String, Object> entry : dataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
