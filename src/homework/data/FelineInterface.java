package data;

public interface FelineInterface {

    public void  setByName(String x);

    public String  findByName();

    public void setByRace(String x);

    public String findByRace();

    public void setYear(int x);

    public int getYear();

    void setId(Integer id);

    Integer findById();
}
