package guru.spring.framework.sfgpetclinic.Map;

import guru.spring.framework.sfgpetclinic.model.Pet;
import guru.spring.framework.sfgpetclinic.services.CurdService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CurdService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
