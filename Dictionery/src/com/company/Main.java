package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, HashSet<String>> sections = new HashMap<>();
        sections.put("Car", new HashSet<>());
        sections.put("Zamek", new HashSet<>());
        sections.get("Car").add("samochód");
        sections.get("Car").add("auto");
        sections.get("Zamek").add("Castle");
        sections.get("Zamek").add("Lock");


        System.out.println(sections);
    }
}
