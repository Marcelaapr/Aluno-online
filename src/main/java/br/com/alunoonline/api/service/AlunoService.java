package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AlunoService {
    @Autowired // Importa o repositório para dentro do service.
    AlunoRepository alunoRepository;

    public void create(Aluno aluno) { //Bloco de código para criar um aluno.
        alunoRepository.save(aluno); //Primeira regra de negócios
    }
    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> findById(Long id) {
        return alunoRepository.findById(id);
    }
}
