package devcorp.atividade.api.entity;

import javax.persistence.*;

import devcorp.atividade.api.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String login;
    private String email;
    private String nome;
    private String afiliacao;

    public User(UserDTO userDTO) {
        this.login = userDTO.getLogin();
        this.email = userDTO.getEmail();
        this.nome = userDTO.getNome();
        this.afiliacao = userDTO.getAfiliacao();
    }
}
