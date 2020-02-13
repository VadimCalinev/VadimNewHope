package data;


public class Cat implements FelineInterface, Cloneable {

  private String name;
  private String race;
  private int year;
  private Integer id;

  public Cat(Integer id, String name, String race, int year) {
    this.id = id;
    this.name = name;
    this.race = race;
    this.year = year;

  }


  @Override
  public void setByName(String x) {

  }

  @Override
  public String findByName() {
    return name;
  }

  @Override
  public void setByRace(String x) {

  }

  @Override
  public String findByRace() {
    return race;
  }

  @Override
  public void setYear(int year) {
    this.year = year;

  }

  @Override
  public int getYear() {
    return year;
  }

  @Override
  public void setId(Integer id) {
    this.id = id;

  }

  @Override
  public Integer findById() {
    return id;
  }

  @Override
  public String toString() {
    return "Cat{" +
            "ID='" + id + '\'' +
            "name='" + name + '\'' +
            ", race='" + race + '\'' +
            ", year=" + year +
            '}';
  }

  @Override
  public FelineInterface clone() throws CloneNotSupportedException {
    FelineInterface feline = (FelineInterface)super.clone();
    feline.setByName(this.name);
    feline.setByRace(this.race);
    feline.setYear(this.year);
    return feline;
  }
}
