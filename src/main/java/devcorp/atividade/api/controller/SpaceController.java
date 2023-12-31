package devcorp.atividade.api.controller;

import devcorp.atividade.api.entity.Space;
import devcorp.atividade.api.interfaces.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/spaces")
public class SpaceController {
    @Autowired
    private SpaceRepository repository;

    @PostMapping
    public ResponseEntity<Space> Cadastrar(@RequestBody Space space){
        System.out.println(space);
        repository.save(space);
        return ResponseEntity.status(HttpStatus.CREATED).body(space);
    }

    @GetMapping
    public List<Space> Listar(){
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Space> editar(@PathVariable("id") Long spaceId, @RequestBody Space spaceInfo) {
        Space space = repository.findById(spaceId).get();

        space.setNome(spaceInfo.getNome());
        space.setLocalizacao(spaceInfo.getLocalizacao());
        space.setCapacidade(spaceInfo.getCapacidade());
        space.setRecursos(spaceInfo.getRecursos());


        final Space eventAtt = repository.save(space);
        return ResponseEntity.ok(eventAtt);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deletar(@PathVariable("id") Long spaceId) {
        Space space = repository.findById(spaceId).get();

        repository.delete(space);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Espaço Deletado", Boolean.TRUE);
        return response;
    }
}

