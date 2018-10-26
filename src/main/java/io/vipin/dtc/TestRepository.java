package io.vipin.dtc;

import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@ViewIndexed(designDoc = "test")
@Repository
public interface TestRepository extends CrudRepository<Test,String>{

}
