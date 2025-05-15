package zznn_hashmap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        /*
         * HashMap adalah struktur data untuk menyimpan daftar data menggunakan pasangan key dan value
         */

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        // method untuk menambahkan item kedalam hashmap
        capitalCities.put("Indonesia", "Jakarta");
        capitalCities.put("Malaysia", "Kuala Lumpur");
        capitalCities.put("Thailand", "Bangkok");
        capitalCities.put("China", "Beijing");

        // method untuk akses item
        String getFirstItem = capitalCities.get("Indonesia");
        System.out.println(getFirstItem);

        // method untuk hapus item
        capitalCities.remove("Indonesia");
        System.out.println(capitalCities);

        // mencetak ukuran dari hashmap
        int sizeOfCapitalCities = capitalCities.size();
        System.out.println(sizeOfCapitalCities);

        // looping hashmap menggunakan foreach untuk menampilkan key didalam hashmap
        for(String keyFromCapitalCities: capitalCities.keySet()) {
            System.out.println(keyFromCapitalCities);
        }

        // looping hashmap menggunakan foreach untuk menampilkan valuenya
        for(String valueOfCapitalCities: capitalCities.values()) {
            System.out.println(valueOfCapitalCities);
        }

        // looping hashmap untuk menampilkan key dan valuenya
        for(String i: capitalCities.keySet()) {
            System.out.println(i + "=>" + capitalCities.get(i));
        }

        // menggunakan tipe lain didalam hashmap
        HashMap<String, Integer> users = new HashMap<String, Integer>();
        users.put("Adi", 30);
        users.put("Budi", 28);
        users.put("Cici", 35);

        for(String user: users.keySet()) {
                System.out.println(user + "=>" + users.get(user));
        }
    }
    
}
