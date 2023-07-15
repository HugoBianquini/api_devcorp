package devcorp.atividade.api.dto;

import lombok.Getter;
import lombok.Setter;
import devcorp.atividade.api.entity.Edition;

import java.sql.Date;

@Getter
@Setter
public class EditionDTO {
        Long id;
        int numero;
        int ano;
        Date data_inicial;
        Date data_final;
        String cidade;
        Long id_evento;

        public EditionDTO() {
        }

        public EditionDTO(Edition edition){
                this.id = edition.getId();
                this.numero = edition.getNumero();
                this.ano = edition.getAno();
                this.data_inicial = edition.getData_inicial();
                this.data_final = edition.getData_final();
                this.cidade = edition.getCidade();
                this.id_evento = edition.getId_evento();
        }

}

