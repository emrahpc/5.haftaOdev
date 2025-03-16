package programlama.repository;

import programlama.entities.Technology;

import java.util.List;

public interface TechnologyRepository {
    void add(Technology technology);
    List<Technology> getAll();
    void update(Technology technology);
    void delete(int id);
    Technology getById(int id);

}
