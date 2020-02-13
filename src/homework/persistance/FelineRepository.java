package persistance;

import java.util.ArrayList;
import java.util.List;

import data.FelineInterface;
import data.Cat;

public class FelineRepository implements FelineRepositoryInterface {

    private List<FelineInterface> felines;

    public FelineRepository() {
        felines = new ArrayList<>();
    }

    @Override
    public boolean save(FelineInterface feline) {
        return false;
    }

    @Override
    public boolean delete(FelineInterface feline) {
        return false;
    }

    @Override
    public boolean update(FelineInterface feline) {
        return false;
    }

    public FelineInterface findByName(String name) {
        for (FelineInterface feline : felines) {
            if (feline.findByName().equals(name)) {
                Cat cat = (Cat) feline;
                return cat.clone();
            }
        }
        return null;
    }

    public FelineInterface findByRace(String race) {
        for (FelineInterface feline : felines) {
            if (feline.findByRace().equals(race)) {
                Cat cat = (Cat) feline;
                return cat.clone();
            }
        }
        return null;
    }

    @Override
    public List<FelineInterface> findAll() {
        ArrayList<FelineInterface> cloneFelines = new ArrayList<>();
        for (FelineInterface feline : felines) {
            Cat cat = (Cat) feline;
            cloneFelines.add(cat.clone());
        }
        return cloneFelines;
    }

    @Override
    public FelineInterface findById(Integer id) {
        for (FelineInterface feline : felines) {
            if (feline.findById().equals(id)) {
                Cat cat = (Cat) feline;
                return cat.clone();
            }
        }
        return null;
    }


    // For testing
    // Fill the list with data
    public void generate() {
        felines.add(new Cat(11, "Барсик", "Шотландская", 2019));
        felines.add(new Cat(22, "Мурсик", "Британская", 2017));
        felines.add(new Cat(33, "Шурсик", "Персидская", 2018));
    }

}
