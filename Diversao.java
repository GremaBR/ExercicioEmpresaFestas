package Empresa;

public class Diversao implements IProduto {
    String nome;
    float custo;
    String tipo;
    Boolean paraCriancas;

    public Diversao(String nome, float custo, String tipo, Boolean paraCriancas) {
        this.nome = nome;
        this.custo = custo;
        this.tipo = tipo;
        this.paraCriancas = paraCriancas;
    }

    public String getNome() {
        return this.nome;
    }

    public float getCusto() {
        return this.custo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
}