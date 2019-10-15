package guru.spring.framework.sfgpetclinic.Map;

import guru.spring.framework.sfgpetclinic.model.Owner;
import guru.spring.framework.sfgpetclinic.services.CurdService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CurdService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return this.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
