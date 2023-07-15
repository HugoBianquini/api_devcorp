package devcorp.atividade.api.dto;

import lombok.Getter;
import lombok.Setter;
import devcorp.atividade.api.entity.Event;

@Getter
@Setter
public class EventDTO {
    Long id;
    String nome;
    String sigla;
    String descricao;
    Long id_edicao;

    public EventDTO() {
    }

    public EventDTO(Event event){
        this.id = event.getId();
        this.nome = event.getNome();
        this.sigla = event.getSigla();
        this.descricao = event.getDescricao();
        this.id_edicao = event.getId_edicao();
    }
}
