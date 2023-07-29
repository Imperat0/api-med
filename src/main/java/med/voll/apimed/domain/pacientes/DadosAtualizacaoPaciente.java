package med.voll.apimed.domain.pacientes;

import jakarta.validation.constraints.NotNull;
import med.voll.apimed.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
