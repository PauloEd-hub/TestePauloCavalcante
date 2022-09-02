package entities;

import java.util.Date;
import java.util.UUID;

public class Dependente {
    private String nome;
    private Date dataNascimento;

    public Dependente() {
    }

    public Dependente(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Dependente: " +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
