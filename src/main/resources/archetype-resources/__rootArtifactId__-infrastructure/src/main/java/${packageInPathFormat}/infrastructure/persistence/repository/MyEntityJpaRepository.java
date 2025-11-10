package ${package}.infrastructure.persistence.repository;

import ${package}.infrastructure.persistence.entity.MyEntityDbo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MyEntityJpaRepository extends JpaRepository<MyEntityDbo, UUID> {
}
