package med.voll.apimed.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.apimed.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco
) {
}
