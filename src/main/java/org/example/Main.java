package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        //initializeaza urmatoarele tipuri de date: HashMap(are interfata Map), Double, Set, acorda-le valori, incearca sa le afisezi, fa operatii cu ele

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "mere");
        hashMap.put(1, "pere");
        hashMap.put(2, "struguri");
        System.out.println("Hash Map: " + hashMap);
        String ceva = hashMap.get(1) + hashMap.get(0);
        System.out.println(ceva);

        Double numarDoubleOne = 1.24;
        System.out.println("Numar double: " + numarDoubleOne);
        Double numarDoubleTwo = 3.76;
        Double diferentaDouble = numarDoubleOne - numarDoubleTwo;
        System.out.println(diferentaDouble);

        Set<String> hs = new HashSet<>();
        hs.add("Madalin");
        hs.add("Steloi");
        hs.add("Andrei");
        System.out.println("Set: " + hs);
        String[] listaSetHs = hs.toArray(new String[hs.size()]);
        List<String> listaSetHsTwo = new ArrayList<>(List.of(listaSetHs));
        System.out.println(listaSetHsTwo.get(0) + listaSetHsTwo.get(1));

        String fraza = "BUNA SUNT PROASTA\\";
        System.out.println(fraza.toLowerCase().replace("\\", ""));

        Cafea latte = new Latte("integral", 200);
        Cafea expresso = new Expresso();

        latte.toarnaCafea();
        latte.fierbeCafea();
        expresso.fierbeCafea();
        expresso.toarnaCafea();
        System.out.println(latte);
        System.out.println(EnumDemo.EUR);
    }
}