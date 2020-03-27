package data.empty.asso;

import data.empty.asso.buggy.MyBEntity;
import data.empty.asso.buggy.MyBEntityRepository;
import data.empty.asso.working.MyEntity;
import data.empty.asso.working.MyEntityRepository;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class MyEntityRepositoryTest {

    @Inject
    MyEntityRepository repository;

    @Inject
    MyBEntityRepository brepository;

    @Test
    void working() {
        var ent = repository.save(new MyEntity(-1, null));
        assertFalse(ent.getLid() == -1);

        var found = repository.findById(ent.getLid()).get();

        repository.update(found);
    }

    @Test
    void buggy() {
        var ent = brepository.save(new MyBEntity(-1, null));
        assertFalse(ent.getLid() == -1);

        var found = brepository.findById(ent.getLid()).get();

        brepository.update(found);
    }
}