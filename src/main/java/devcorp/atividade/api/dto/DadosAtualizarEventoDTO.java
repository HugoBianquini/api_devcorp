package devcorp.atividade.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosAtualizarEventoDTO {
        Long id;
        String nome;
        String sigla;
        String descricao;
        Long id_edicao;

        public DadosAtualizarEventoDTO() {
        }
}
