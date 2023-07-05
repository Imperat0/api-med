package med.voll.apimed.pacientes;

public record DadosListagemPaciente(String nome, String email, String cpf) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
