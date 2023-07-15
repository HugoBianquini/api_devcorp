package devcorp.atividade.api.entity;

import javax.persistence.*;

import devcorp.atividade.api.dto.DadosAtualizarEventoDTO;
import devcorp.atividade.api.dto.EventDTO;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "events")
@Entity(name = "Event")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Event {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String sigla;
    private String descricao;
    private Long id_edicao;

    public Event(EventDTO eventDTO){
        this.nome = eventDTO.getNome();
        this.sigla = eventDTO.getSigla();
        this.descricao = eventDTO.getDescricao();
        this.id_edicao = eventDTO.getId_edicao();
    }

    public void AtualziarDados(DadosAtualizarEventoDTO eventoAtualizar) {
        if(eventoAtualizar.getNome() != null){
            this.nome = eventoAtualizar.getNome();
        }
        if(eventoAtualizar.getSigla() != null){
            this.sigla = eventoAtualizar.getSigla();
        }
        if(eventoAtualizar.getDescricao() != null){
            this.descricao = eventoAtualizar.getDescricao();
        }
        if(eventoAtualizar.getId_edicao() != null){
            this.id_edicao = eventoAtualizar.getId_edicao();
        }
    }

    public void AtualizarIdEdicao(Long id_edicao){
        this.id_edicao = id_edicao;
    }
}
