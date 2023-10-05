package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizarPaciente(
        Long idPaciente,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
