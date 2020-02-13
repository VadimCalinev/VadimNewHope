package persistance;

import java.util.List;

import data.FelineInterface;

public interface FelineRepositoryInterface {

    public boolean save(FelineInterface feline);

    public boolean delete(FelineInterface feline); //

    public boolean update(FelineInterface feline); // Сначала находим этот объект, потом перезаписываем

    public FelineInterface findByName(String name);

    public FelineInterface findByRace(String race);


    public List<FelineInterface> findAll(); // Будет возвращать Empty List, если объекта не найдено

    public FelineInterface findById(Integer id); // Будет возвращать null, если объекта не найдено

}
