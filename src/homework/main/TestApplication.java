package main;


import data.Cat;
import data.FelineInterface;
import persistance.FelineRepository;
import persistance.FelineRepositoryInterface;

import java.util.ArrayList;


public class TestApplication implements Cloneable{

    public static void main(String[] args) throws CloneNotSupportedException {

        FelineRepositoryInterface fr = new FelineRepository();
        // ^^^^^^^^^^^^ | ^^ | ^^^^^^^
        // Тип переменной | Название |

        ((FelineRepository) fr).generate();

        // System.out.println(fr.get(11));

        FelineInterface cat = fr.findById(22);
        cat.setByName("Masya");



        for (FelineInterface f : fr.findAll()) {
            System.out.println(f);
        }

        // getByName(String name) -> List<FelineInterface>
        // getByRace(String race) -> List<FelineInterface>
        Cat cat1 = (Cat) fr.findById(1);
        Cat cat2 = (Cat) cat1.clone();
        cat2.setByName("another name");
        System.out.println(cat1);
        System.out.println(cat2);
    }

}
