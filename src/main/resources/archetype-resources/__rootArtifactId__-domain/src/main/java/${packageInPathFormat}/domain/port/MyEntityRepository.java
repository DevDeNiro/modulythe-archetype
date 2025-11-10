package ${package}.domain.port;

import ${package}.domain.model.MyEntity;
import java.util.Optional;
import java.util.UUID;

public interface MyEntityRepository {
    MyEntity save(MyEntity myEntity);
    Optional<MyEntity> findById(UUID id);
}
