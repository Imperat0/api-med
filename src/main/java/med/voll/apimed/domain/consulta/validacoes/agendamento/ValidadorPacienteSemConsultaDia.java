package med.voll.apimed.domain.consulta.validacoes.agendamento;

import med.voll.apimed.domain.ValidacaoException;
import med.voll.apimed.domain.consulta.ConsultaRepository;
import med.voll.apimed.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteSemConsultaDia implements IValidadorAgendamentoConsulta {

    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHorario = dados.data().withHour(18);

        var pacientePossuiConsultaDia = repository.existsByPacienteIdAndDataBetween(dados.idPaciente(), primeiroHorario, ultimoHorario);
        if (pacientePossuiConsultaDia ) {
            throw new ValidacaoException("Paciente já possui uma consulta agendada nesse dia?");
        }
    }
}
