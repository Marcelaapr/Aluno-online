package br.com.alunoonline.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data //gets e sets
@NoArgsConstructor //construtor vazio
@AllArgsConstructor //construtor fixo
@Entity // isso é uma anotação. Esta dizendo que essa classe abaixo é um entidade.
public class Aluno implements Serializable {
    @Id // To dizendo que ele é uma chave primária.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String cpf;
}
