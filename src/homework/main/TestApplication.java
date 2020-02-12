package main;

import data.FelineInterface;
import persistance.FelineRepository;
import persistance.FelineRepositoryInterface;

public class TestApplication {

    public static void main(String[] args) {

        FelineRepositoryInterface fr = new FelineRepository();
        // ^^^^^^^^^^^^ | ^^ | ^^^^^^^
        // Тип переменной | Название |

        ((FelineRepository) fr).generate();

        // System.out.println(fr.get(11));

        FelineInterface cat = fr.get(22);
        cat.setName("Masya");



        for (FelineInterface f : fr.all()) {
            System.out.println(f);
        }

        // getByName(String name) -> List<FelineInterface>
        // getByRace(String race) -> List<FelineInterface>

    }

}
