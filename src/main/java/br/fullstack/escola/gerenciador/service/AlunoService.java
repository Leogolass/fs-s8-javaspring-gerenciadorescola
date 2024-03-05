package br.fullstack.escola.gerenciador.service;

import br.fullstack.escola.gerenciador.model.AlunoModel;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class AlunoService {

    public AlunoModel cadastro(AlunoModel aluno) throws Exception{
        if (validar(aluno)){
            AlunoModel.inserir(aluno);
        }

        return aluno;
    }

    private boolean validar (AlunoModel aluno) throws Exception {
        if (aluno.getName() == null || aluno.getName().isBlank()){
            throw new Exception("Nome é obrigatório!");
        }

        return true;
    }

    public AlunoModel buscarAlunoPorID(Integer id) throws Exception {
        return AlunoModel.buscaAlunoPorID(id);
    }

    public static List consultarTodosAlunos() {
        return (List) AlunoModel.getAlunosLista();
    }
}
