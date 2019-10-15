package guru.spring.framework.sfgpetclinic.Map;

import guru.spring.framework.sfgpetclinic.model.Vet;
import guru.spring.framework.sfgpetclinic.services.CurdService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CurdService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
