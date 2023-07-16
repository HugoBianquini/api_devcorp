package devcorp.atividade.api.controller;

import devcorp.atividade.api.dto.UserDTO;
import devcorp.atividade.api.entity.User;
import devcorp.atividade.api.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public ResponseEntity<User> Cadastrar(@RequestBody UserDTO userDTO){
        User newUser = new User(userDTO);
        repository.save(newUser);
        return ResponseEntity.ok(newUser);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> ListarTodos(){
        List<UserDTO> users = repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> Listar(@PathVariable Long id) throws Exception {
        User user = repository.findById(id).orElseThrow(() -> new Exception("Evento não encontrado"));
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> Deletar(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.ok("Deletado com sucesso");
    }

    @PutMapping
    public void Atualizar(@RequestBody UserDTO userDTO){
        repository.save(new User(userDTO));
    }


}
