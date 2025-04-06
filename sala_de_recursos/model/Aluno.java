package com.saladerecursos.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String diagnostico;
    private int idade;
    private LocalDate diasAtendimento;
    private String frequencia;
    private LocalDateTime horario;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public LocalDate getDiasAtendimento() { return diasAtendimento; }
    public void setDiasAtendimento(LocalDate diasAtendimento) { this.diasAtendimento = diasAtendimento; }

    public String getFrequencia() { return frequencia; }
    public void setFrequencia(String frequencia) { this.frequencia = frequencia; }

    public LocalDateTime getHorario() { return horario; }
    public void setHorario(LocalDateTime horario) { this.horario = horario; }
}