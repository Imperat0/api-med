package med.voll.apimed.domain.medico;

import med.voll.apimed.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, String Nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
