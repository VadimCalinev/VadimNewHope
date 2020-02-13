package persistance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import data.FelineInterface;
import data.Cat;

public class FelineRepository implements FelineRepositoryInterface {

    private List<FelineInterface> felines;
    private List<FelineInterface> felines2;

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

    @Override
    public FelineInterface findByName(String name) {
        for (FelineInterface f : felines) {
            if (f.findByName().equals(name)) {
                return ((Cat) f).clone();
            }
        }
        return null;
    }

    @Override
    public FelineInterface findByRace(String race) {
        for (FelineInterface f : felines) {
            if (f.findByRace().equals(race)) {
                return ((Cat) f).clone();
            }
        }
        return null;
    }


    @Override
    public List<FelineInterface> findAll() {
        ArrayList<FelineInterface> felines2 = new ArrayList<>();
        for (FelineInterface feline : felines) {
            Cat cat = (Cat) feline;
            felines2.add(cat.clone());
        }
        return felines2;
    }



    @Override
    public FelineInterface findById(Integer id) {
        for (FelineInterface f : felines) {
            if (Objects.equals(f.findById(), id)) {
                return ((Cat) f).clone();
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
