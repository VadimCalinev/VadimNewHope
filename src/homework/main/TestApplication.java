package main;

import data.Cat;
import data.FelineInterface;
import persistence.FelineRepository;

public class TestApplication {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		//FelineInterface cat = new Cat(1, "Murzik", "British", 2018);
		//FelineInterface cat2 = new Cat(2, "Murzik", "Britishe", 2018);
		//FelineInterface clonned = cat.clone();
		//FelineInterface clonned2 = cat2.clone();
		//FelineRepository StupidReposirtory = new FelineRepository();
		//StupidReposirtory.generate();
		//System.out.println(StupidReposirtory.findByName("Murzik"));
		//System.out.println(StupidReposirtory.findByRace("Britishe"));
		
		FelineRepository fr = new FelineRepository();
		fr.generate();
		FelineInterface original = fr.findById(22);
		original.setYear(1900);
		original.setId(10000);
		fr.save(original);
		System.out.println( fr.findAll());
		
		
		
	}
}

