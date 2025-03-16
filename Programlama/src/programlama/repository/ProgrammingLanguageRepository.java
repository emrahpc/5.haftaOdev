package programlama.repository;

import programlama.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();
    void update(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    ProgrammingLanguage getById(int id);
}