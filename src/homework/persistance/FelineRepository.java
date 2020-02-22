package persistence;

import data.Cat;
import data.FelineInterface;

import java.util.ArrayList;
import java.util.List;

public class FelineRepository implements FelineRepositoryInterface {
    private List<FelineInterface> felines;

    public FelineRepository() {
        felines = new ArrayList<>();
    }

    @Override
    public boolean save(FelineInterface feline) {
        if (!update(feline))
            felines.add(feline);
        return true;
    }

    @Override
    public boolean delete(FelineInterface feline) {
    	 ArrayList<FelineInterface> cloneFelines = new ArrayList<>();
    		  if (findById(cloneFelines.getId())).equals(cloneFelines.getId())){
    	felines.remove(feline);
    	}
        return false;
    }

    @Override
    public boolean update(FelineInterface feline) {
        for (FelineInterface oneFeline : felines) {
            if (feline.getId().equals(oneFeline.getId())) {
                felines.set(felines.indexOf(oneFeline), feline);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<FelineInterface> findAll() throws CloneNotSupportedException {
        ArrayList<FelineInterface> cloneFelines = new ArrayList<>();
        for (FelineInterface feline : felines) {
            cloneFelines.add(feline.clone());
        }
        return cloneFelines;
    }

    @Override
    public FelineInterface findById(Integer id) throws CloneNotSupportedException {
        for (FelineInterface feline : felines) {
            if (feline.getId().equals(id)) {
                return feline.clone();
            }
        }
        return null;
    }

    public List<FelineInterface> findByName(String name) throws CloneNotSupportedException {
    	ArrayList<FelineInterface> cloneFelinesNames = new ArrayList<>();
        for (FelineInterface feline : felines) {
        	if(name.equals(feline.getName())){
        	cloneFelinesNames.add(feline.clone());
        }
        }
        return cloneFelinesNames;
           
    }

    public List<FelineInterface> findByRace(String race) throws CloneNotSupportedException {
        	ArrayList<FelineInterface> cloneFelinesRace= new ArrayList<>();
        	 for (FelineInterface feline : felines) {
            if(race.equals(feline.getRace())){
        	cloneFelinesRace.add(feline.clone());
            }
        }
        return cloneFelinesRace;
           
    }

    // For testing
    // Fill the list with data
    public void generate() {
        felines.add(new Cat(11, "Барсик", "Шотландская", 2019));
        felines.add(new Cat(22, "Murzik", "Britishe", 2017));
        felines.add(new Cat(33, "Шурсик", "Персидская", 2018));
    }
}
