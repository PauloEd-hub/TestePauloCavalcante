package entities;

import java.util.Date;
import java.util.UUID;

public class Dependente {
    private UUID idDependente;
    private String nome;
    private Date dataNascimento;

    public Dependente() {
    }

    public Dependente(UUID idDependente, String nome, Date dataNascimento) {
        this.idDependente = idDependente;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public UUID getIdDependente() {
        return idDependente;
    }

    public void setIdDependente(UUID idDependente) {
        this.idDependente = idDependente;
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
