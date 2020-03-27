package data.empty.asso;

import data.empty.asso.buggy.MyBEntity;
import data.empty.asso.buggy.MyBEntityRepository;
import data.empty.asso.working.MyEntity;
import data.empty.asso.working.MyEntityRepository;
import data.empty.asso.working.MyOther;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class MyEntityRepositoryTest {


    @Inject
    MyEntityRepository repository;

    @Test
    void emptyRelation() {
        var ent = repository.save(new MyEntity(-1));
        assertFalse(ent.getLid() == -1);

        var found = repository.findById(ent.getLid()).get();

        repository.update(found);
    }

    @Test
    void nonemptyRelation() {
        var ent = repository.save(new MyEntity(-1, new MyOther("foo")));
        assertFalse(ent.getLid() == -1);

        var found = repository.findById(ent.getLid()).get();
        assertNotNull(found.getOther());
        assertEquals(found.getOther().getLid(), "foo");

        repository.update(found);
    }

    @Inject
    MyBEntityRepository brepository;

    @Test
    void emptyRelation2() {
        var ent = brepository.save(new MyBEntity(-1, null));
        assertFalse(ent.getLid() == -1);

        var found = brepository.findById(ent.getLid()).get();

        brepository.update(found);
    }
}