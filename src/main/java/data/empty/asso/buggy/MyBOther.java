package data.empty.asso.buggy;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import java.util.Objects;

@MappedEntity
public class MyBOther {

	@Id
	@GeneratedValue
	private String lid;

    public MyBOther(String lid) {
		this.lid = lid;
	}

	public String getLid() {
		return lid;
	}
}
