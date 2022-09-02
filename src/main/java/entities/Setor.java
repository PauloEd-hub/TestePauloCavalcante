package entities;

public class Setor {
    private int codigo;
    private String descricao;

    public Setor() {
    }

    public Setor(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Setor: " +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
