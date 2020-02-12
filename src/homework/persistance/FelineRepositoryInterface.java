package persistance;

import java.util.List;

import data.FelineInterface;

public interface FelineRepositoryInterface {

    public boolean save(FelineInterface feline);

    public boolean delete(FelineInterface feline); //

    public boolean update(FelineInterface feline); // Сначала находим этот объект, потом перезаписываем

    public List<FelineInterface> all(); // Будет возвращать Empty List, если объекта не найдено

    public FelineInterface get(Integer id); // Будет возвращать null, если объекта не найдено

}
