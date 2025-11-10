package ${package}.application.usecase;

import ${package}.domain.model.MyEntity;
import java.util.UUID;

public interface GetMyEntityUseCase {
    MyEntity getMyEntity(UUID id);
}
