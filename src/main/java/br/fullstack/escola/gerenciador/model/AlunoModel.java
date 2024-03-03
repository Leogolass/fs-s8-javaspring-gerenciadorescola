package br.fullstack.escola.gerenciador.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Data
@Getter
public class AlunoModel {
    private static Integer id = 1;
    @Setter
    private String name;
    @Setter
    private Timestamp dataNascimento;

    public static int gerarProximoID() {
        return id++;
    }
}
