package med.voll.apimed.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.apimed.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco
) {
}
