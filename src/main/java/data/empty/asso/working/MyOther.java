package data.empty.asso.working;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import java.util.Objects;

@MappedEntity
public class MyOther {

	@Id
	@GeneratedValue
	private String lid;

    public MyOther(String lid) {
		this.lid = lid;
	}

	public String getLid() {
		return lid;
	}
}
