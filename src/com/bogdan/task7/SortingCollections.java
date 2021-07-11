package com.bogdan.task7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingCollections {

    public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone X", "Apple", 600);
        Phone phone2 = new Phone("Pixel 2", "Google", 500);
        Phone phone3 = new Phone("iPhone 8", "Apple",450);
        Phone phone4 = new Phone("iPhone 7", "Apple",450);
        Phone phone5 = new Phone("Nokia 9", "HMD Global",150);
        Phone phone6 = new Phone("Nokia A", "HMD Global",150);
        Phone phone7 = new Phone("Galaxy S10", "Samsung", 600);
        Phone phone8 = new Phone("Galaxy S9A", "Samsung", 450);
        Phone phone9 = new Phone("Galaxy S9B", "Samsung", 450);
        Phone phone10 = new Phone("Galaxy S8", "Samsung", 300);

        List<Phone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);
        phones.add(phone6);
        phones.add(phone7);
        phones.add(phone8);
        phones.add(phone9);
        phones.add(phone10);

        System.out.println("Before sorting: ");
        for (Phone phone : phones) {
            System.out.println(phone.toString());
        }

        /*
        //Option 1
        Comparator<Phone> comparator = new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        phones.sort(comparator);
        */

        /*
        //Option 2
        phones.sort(((o1, o2) -> o1.getCompany().compareTo(o2.getCompany())));
        */

        //Option 3
        phones.sort(Comparator.comparing(Phone::getPrice).thenComparing(Phone::getName));

        System.out.println("After sorting: ");
        for (Phone phone : phones) {
            System.out.println(phone.toString());
        }
    }
}
