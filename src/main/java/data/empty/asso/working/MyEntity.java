package data.empty.asso.working;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import javax.persistence.ManyToOne;
import java.util.Objects;

@MappedEntity
public class MyEntity {

	@Id
	@GeneratedValue
	private long lid;

	@ManyToOne
	private final MyOther other;

    public MyEntity(long lid) {
        this(lid, null);
    }

    public MyEntity(long lid, MyOther other) {
		this.lid = lid;
        this.other = other;
    }

	public long getLid() {
		return lid;
	}

	public void setLid(long lid) {
		this.lid = lid;
	}

    public MyOther getOther() {
        return other;
    }
}
