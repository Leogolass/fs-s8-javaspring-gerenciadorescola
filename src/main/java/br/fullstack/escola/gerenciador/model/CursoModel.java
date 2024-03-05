package br.fullstack.escola.gerenciador.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Data
@Getter
public class CursoModel {

    private static Integer id = 1;
    @Setter
    private String nome;
    @Setter
    private String descricao;
    @Setter
    private int cargaHoraria;

    public CursoModel(String name, String descricao, int cargaHoraria) {
        id = gerarProximoID();
        this.nome = name;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    private static int gerarProximoID() {
        return id++;
    }

}
