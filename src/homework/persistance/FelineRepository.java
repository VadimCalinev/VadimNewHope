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

    @Override
    public List<FelineInterface> all() {
        return felines;
    }

    @Override
    public FelineInterface get(Integer id) {
        for (FelineInterface f : felines) {
            if ( f.getId() == id ) {
                return f;
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
