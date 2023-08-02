package med.voll.apimed.domain.consulta.validacoes.agendamento;

import med.voll.apimed.domain.ValidacaoException;
import med.voll.apimed.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorHorario implements IValidadorAgendamentoConsulta {

    public void validar (DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAbertura =  dataConsulta.getHour() < 7;
        var depoisEncerramento = dataConsulta.getHour() > 18;
        if (domingo || antesDaAbertura || depoisEncerramento) {
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clínica");
        }
    }
}
