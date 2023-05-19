package Exercicio2;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private int identificador;
    private static int contador = 0;

    public Funcionario(String nome, LocalDate dataAdmissao, double salario) {
        this.nome = nome;
        setgetDataDaAdmissao(dataAdmissao);
        setSalario(salario);
        contador++;
        identificador = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDaAdmissao() {
        return dataAdmissao;
    }

    public void setgetDataDaAdmissao(LocalDate dataAdmissao) {
        if (dataAdmissao.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de admissao nao pode ser no futuro.");
        }
        this.dataAdmissao = dataAdmissao;
    }

    public void setSalario(double salario) {
        if (salario < 700) {
            throw new IllegalArgumentException("O salário não pode ser inferior a R$ 00,00.");
        }
        this.salario = salario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getSalario() {
        return salario;
    }
}
