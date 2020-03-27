package data.empty.asso.buggy;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import javax.annotation.Nullable;
import javax.persistence.ManyToOne;
import java.util.Objects;

@MappedEntity
public class MyBEntity {

    @Id
    @GeneratedValue
    private long lid;

    @ManyToOne
    private final MyBOther other;

//    with this empty constructor no exception would be thrown on find
//    it would create an other entity will null as id
//    this would then throw an exception on update
//    public MyBEntity() {
//    }

    public MyBEntity(long lid, MyBOther other) {
        this.lid = lid;
        this.other = other;
    }

    public long getLid() {
        return lid;
    }

    public void setLid(long lid) {
        this.lid = lid;
    }

    public MyBOther getOther() {
        return other;
    }
}
