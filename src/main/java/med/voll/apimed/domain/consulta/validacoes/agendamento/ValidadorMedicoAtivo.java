package med.voll.apimed.domain.consulta.validacoes.agendamento;

import med.voll.apimed.domain.ValidacaoException;
import med.voll.apimed.domain.consulta.DadosAgendamentoConsulta;
import med.voll.apimed.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements IValidadorAgendamentoConsulta {

    @Autowired
    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        if (dados.idMedico() == null) {
            return;
        }


        var medicoAtivo = repository.findAtivoById(dados.idMedico());
        if (!medicoAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com médico excluído");
        }
    }
}
