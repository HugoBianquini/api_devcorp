package devcorp.atividade.api.controller;

import devcorp.atividade.api.dto.DadosAtualizarEventoDTO;
import devcorp.atividade.api.dto.EventDTO;
import devcorp.atividade.api.entity.Event;
import devcorp.atividade.api.interfaces.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventRepository repository;

    @PostMapping
    public void Cadastrar(@RequestBody EventDTO eventDTO){
        repository.save(new Event(eventDTO));
    }

    @GetMapping
    public List<EventDTO> Listar(){
        return repository.findAll().stream().map(EventDTO::new).collect(Collectors.toList());
    }

    @PutMapping
    public void AtualizarEvento(@RequestBody DadosAtualizarEventoDTO eventoAtualizar){
        var evento = repository.getReferenceById(eventoAtualizar.getId());
        evento.AtualziarDados(eventoAtualizar);
    }

    @DeleteMapping("/{id}")
    public void DeletarEvento(@PathVariable Long id){
        repository.deleteById(id);
    }
}
