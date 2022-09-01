package entities;

import java.util.List;

public class Funcionario {

    private String nome;
    private int matricula;
    private Setor setor;
    private List<Dependente> dependentes;


    public Funcionario() {
    }

    public Funcionario(String nome, int matricula, Setor setor, List<Dependente> dependentes) {
        this.nome = nome;
        this.matricula = matricula;
        this.setor = setor;
        this.dependentes = dependentes;
    }


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
}
