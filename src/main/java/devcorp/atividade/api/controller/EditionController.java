package devcorp.atividade.api.controller;

import devcorp.atividade.api.dto.EditionDTO;
import devcorp.atividade.api.entity.Edition;
import devcorp.atividade.api.interfaces.EditionRepository;
import devcorp.atividade.api.interfaces.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/editions")
public class EditionController {

    @Autowired
    private EditionRepository repository;
    @Autowired
    private EventRepository eventRepository;

    @PostMapping
    public void Cadastrar(@RequestBody EditionDTO editionDTO){
        repository.save(new Edition(editionDTO));
    }

    @GetMapping
    public List<EditionDTO> Listar(){
        return repository.findAll().stream().map(EditionDTO::new).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void DeletarEvento(@PathVariable Long id){
        repository.deleteById(id);
    }
}
