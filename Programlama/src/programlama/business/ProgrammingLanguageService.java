package programlama.business;

import programlama.entities.ProgrammingLanguage;
import programlama.repository.ProgrammingLanguageRepository;

import java.util.List;

public class ProgrammingLanguageService {

    private ProgrammingLanguageRepository repository;

    public ProgrammingLanguageService(ProgrammingLanguageRepository repository) {
        this.repository = repository;
    }

    public void add(ProgrammingLanguage programmingLanguage) {
        repository.add(programmingLanguage);
    }

    public List<ProgrammingLanguage> getAll() {
        return repository.getAll();
    }

    public void update(ProgrammingLanguage programmingLanguage) {
        repository.update(programmingLanguage);
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public ProgrammingLanguage getById(int id) {
        return repository.getById(id);
    }








}
