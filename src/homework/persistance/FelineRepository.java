package persistance;

import java.util.ArrayList;
import java.util.List;

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
                try {
                    return ((Cat) f).clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public FelineInterface findByRace(String race) {
        for (FelineInterface f : felines) {
            if (f.findByRace().equals(race)) {
                try {
                    return ((Cat) f).clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public List<FelineInterface> findAll() {
        for (FelineInterface f : felines) {
            try {
                felines2.add(((Cat) f).clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return felines2;
    }

    @Override
    public FelineInterface findById(Integer id) {
        for (FelineInterface f : felines) {
            if (f.findById() == id) {
                try {
                    return ((Cat) f).clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
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
