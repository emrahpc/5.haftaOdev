package programlama.repository;

import programlama.entities.ProgrammingLanguage;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository {


    private List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        // Güncelleme işlemi yapılabilir
    }

    @Override
    public void delete(int id) {
        programmingLanguages.removeIf(language -> language.getId() == id);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguages.stream().filter(language -> language.getId() == id).findFirst().orElse(null);
    }





}
