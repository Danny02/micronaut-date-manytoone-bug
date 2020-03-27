package data.empty.asso.buggy;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.CrudRepository;

import static io.micronaut.data.model.query.builder.sql.Dialect.H2;

@JdbcRepository(dialect = H2)
public interface MyBEntityRepository extends CrudRepository<MyBEntity, Long> {
}
