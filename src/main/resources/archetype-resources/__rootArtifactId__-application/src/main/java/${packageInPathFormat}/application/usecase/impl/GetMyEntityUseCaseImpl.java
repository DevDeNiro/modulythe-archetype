package ${package}.application.usecase.impl;

import ${package}.application.usecase.GetMyEntityUseCase;
import ${package}.domain.model.MyEntity;
import ${package}.domain.port.MyEntityRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class GetMyEntityUseCaseImpl implements GetMyEntityUseCase {

    private final MyEntityRepository myEntityRepository;

    public GetMyEntityUseCaseImpl(MyEntityRepository myEntityRepository) {
        this.myEntityRepository = myEntityRepository;
    }

    @Override
    public MyEntity getMyEntity(UUID id) {
        return myEntityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("MyEntity not found with id: " + id));
    }
}
