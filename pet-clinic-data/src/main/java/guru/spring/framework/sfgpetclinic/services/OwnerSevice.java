package guru.spring.framework.sfgpetclinic.services;

import guru.spring.framework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerSevice extends CurdService<Owner,Long>{
    Owner findByLastName(String lastName);
}
