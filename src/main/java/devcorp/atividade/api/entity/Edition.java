package devcorp.atividade.api.entity;

import javax.persistence.*;

import devcorp.atividade.api.dto.EditionDTO;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Table(name = "editions")
@Entity(name = "Edition")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Edition {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;
    private int ano;
    private Date data_inicial;
    private Date data_final;
    private String cidade;
    private Long id_evento;

    public Edition(EditionDTO editionDTO){
        this.numero = editionDTO.getNumero();
        this.ano = editionDTO.getAno();
        this.data_inicial = editionDTO.getData_inicial();
        this.data_final = editionDTO.getData_final();
        this.cidade = editionDTO.getCidade();
        this.id_evento = editionDTO.getId_evento();
    }
}
