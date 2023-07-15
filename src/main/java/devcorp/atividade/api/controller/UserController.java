package devcorp.atividade.api.controller;

import devcorp.atividade.api.dto.UserDTO;
import devcorp.atividade.api.entity.User;
import devcorp.atividade.api.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public void Cadastrar(@RequestBody UserDTO userDTO){
        repository.save(new User(userDTO));
    }

    @GetMapping
    public List<UserDTO> Listar(){
        return repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
    }
}
