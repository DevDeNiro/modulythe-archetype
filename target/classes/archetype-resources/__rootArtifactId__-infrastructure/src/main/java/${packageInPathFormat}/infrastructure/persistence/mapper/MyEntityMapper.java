package ${package}.infrastructure.persistence.mapper;

import ${package}.domain.model.MyEntity;
import ${package}.infrastructure.persistence.entity.MyEntityDbo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MyEntityMapper {
    MyEntityDbo toDbo(MyEntity myEntity);
    MyEntity toDomain(MyEntityDbo myEntityDbo);
}
