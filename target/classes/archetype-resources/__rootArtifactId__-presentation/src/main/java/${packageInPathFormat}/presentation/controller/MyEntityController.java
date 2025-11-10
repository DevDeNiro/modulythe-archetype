package ${package}.presentation.controller;

import ${package}.application.usecase.GetMyEntityUseCase;
import ${package}.domain.model.MyEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/my-entities")
public class MyEntityController {

    private final GetMyEntityUseCase getMyEntityUseCase;

    public MyEntityController(GetMyEntityUseCase getMyEntityUseCase) {
        this.getMyEntityUseCase = getMyEntityUseCase;
    }

    @GetMapping("/{id}")
    public MyEntity getMyEntity(@PathVariable UUID id) {
        return getMyEntityUseCase.getMyEntity(id);
    }
}
