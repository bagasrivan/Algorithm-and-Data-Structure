package Praktikum8;

import java.util.*;

public class PostTestKeren {
    public static void main(String[] args) {
        Map<Integer, String> sample = new TreeMap<Integer, String>();
        sample.put(1, "Minggu");
        sample.put(2, "Senin");
        sample.put(3, "Selasa");
        sample.put(4, "Rabu");
        sample.put(5, "Kamis");
        sample.put(6, "Jumat");
        sample.put(7, "Sabtu");

        System.out.println("output : " + sample.keySet());
    }
}
