package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long idPaciente, String nome, String email, String telefone, String cpf, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getIdPaciente(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }
}
