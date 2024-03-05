package br.fullstack.escola.gerenciador.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
public class AlunoModel {
    @Getter private static List<AlunoModel> alunosLista = new ArrayList<>();
    @Getter private static Integer id = 1;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Timestamp dataNascimento;

    public static AlunoModel inserir(AlunoModel aluno) {
        id = gerarProximoID();
        alunosLista.add(aluno);
        return aluno;
    }

    private static int gerarProximoID() {
        return id++;
    }

    public static AlunoModel buscaAlunoPorID(Integer id) throws Exception {
        for (AlunoModel aluno : alunosLista) {
            if (aluno.getId().equals(id)){
                return aluno;
            }
        }

        throw new Exception("Aluno não encontrado");
    }

}
