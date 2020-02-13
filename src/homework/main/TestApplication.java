package main;


import data.FelineInterface;
import persistance.FelineRepository;
import persistance.FelineRepositoryInterface;



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

    }

}
