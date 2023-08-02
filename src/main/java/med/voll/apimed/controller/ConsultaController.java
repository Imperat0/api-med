package med.voll.apimed.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.apimed.domain.consulta.AgendaDeConsultas;
import med.voll.apimed.domain.consulta.DadosAgendamentoConsulta;

import med.voll.apimed.domain.consulta.DadosCancelamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consultas")
public class ConsultaController {
    @Autowired
    private AgendaDeConsultas agenda;

    @PostMapping
    @Transactional
    public ResponseEntity agendar (@RequestBody @Valid DadosAgendamentoConsulta dados) {
        var dto = agenda.agendar(dados);
            return ResponseEntity.ok(dto);
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity cancelar(@RequestBody @Valid DadosCancelamentoConsulta dadosCancelamentoConsulta) {
        agendaDeConsultas.cacelar(dadosCancelamentoConsulta);

        return ResponseEntity.noContent().build();
    }
}
