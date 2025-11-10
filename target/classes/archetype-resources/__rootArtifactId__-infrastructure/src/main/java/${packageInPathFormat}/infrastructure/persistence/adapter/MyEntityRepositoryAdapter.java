package ${package}.infrastructure.persistence.adapter;

import ${package}.domain.model.MyEntity;
import ${package}.domain.port.MyEntityRepository;
import ${package}.infrastructure.persistence.entity.MyEntityDbo;
import ${package}.infrastructure.persistence.mapper.MyEntityMapper;
import ${package}.infrastructure.persistence.repository.MyEntityJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class MyEntityRepositoryAdapter implements MyEntityRepository {

    private final MyEntityJpaRepository jpaRepository;
    private final MyEntityMapper mapper;

    public MyEntityRepositoryAdapter(MyEntityJpaRepository jpaRepository, MyEntityMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public MyEntity save(MyEntity myEntity) {
        MyEntityDbo dbo = mapper.toDbo(myEntity);
        MyEntityDbo savedDbo = jpaRepository.save(dbo);
        return mapper.toDomain(savedDbo);
    }

    @Override
    public Optional<MyEntity> findById(UUID id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }
}
