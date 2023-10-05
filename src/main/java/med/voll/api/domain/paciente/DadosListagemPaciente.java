package med.voll.api.paciente;

public record DadosListagemPaciente(
        Long idPaciente,
        String nome,
        String email,
        String telefone,
        String cpf) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getIdPaciente(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf());
    }
}
