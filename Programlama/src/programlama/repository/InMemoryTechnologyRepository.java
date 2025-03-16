package programlama.repository;


import programlama.entities.Technology;
import programlama.repository.TechnologyRepository;

import java.util.ArrayList;
import java.util.List;

    public class InMemoryTechnologyRepository implements TechnologyRepository {
        private List<Technology> technologies = new ArrayList<>();

        @Override
        public void add(Technology technology) {
            technologies.add(technology);
        }

        @Override
        public List<Technology> getAll() {
            return technologies;
        }

        @Override
        public void update(Technology technology) {
            // Güncelleme işlemi yapılabilir
            for (int i = 0; i < technologies.size(); i++) {
                if (technologies.get(i).getId() == technology.getId()) {
                    technologies.set(i, technology);
                    return;
                }
            }
        }

        @Override
        public void delete(int id) {
            technologies.removeIf(technology -> technology.getId() == id);
        }

        @Override
        public Technology getById(int id) {
            return technologies.stream().filter(technology -> technology.getId() == id).findFirst().orElse(null);
        }
    }













}
