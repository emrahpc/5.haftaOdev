package programlama.business;

import programlama.entities.Technology;
import programlama.repository.TechnologyRepository;

import java.util.List;

public class TechnologyService {


        private TechnologyRepository repository;

        public TechnologyService(TechnologyRepository repository) {
            this.repository = repository;
        }

        public void add(Technology technology) {
            repository.add(technology);
        }

        public List<Technology> getAll() {
            return repository.getAll();
        }

        public void update(Technology technology) {
            repository.update(technology);
        }

        public void delete(int id) {
            repository.delete(id);
        }

        public Technology getById(int id) {
            return repository.getById(id);
        }

}
