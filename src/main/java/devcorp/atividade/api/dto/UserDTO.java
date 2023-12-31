package devcorp.atividade.api.dto;

import lombok.Getter;
import lombok.Setter;
import devcorp.atividade.api.entity.User;

@Getter
@Setter
public class UserDTO {

        long id;
        String login;
        String email;
        String nome;
        String afiliacao;

        public UserDTO() {
        }

        public UserDTO(User user){
                this.id = user.getId();
                this.login = user.getLogin();
                this.nome = user.getNome();
                this.email = user.getEmail();
                this.afiliacao = user.getAfiliacao();
        }
}
