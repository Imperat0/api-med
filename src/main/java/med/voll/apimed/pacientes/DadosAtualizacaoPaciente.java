package med.voll.apimed.pacientes;

import jakarta.validation.constraints.NotNull;
import med.voll.apimed.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
