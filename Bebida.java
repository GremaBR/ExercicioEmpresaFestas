package Empresa;

public class Bebida implements IProduto{
    String nome;
    float custo;
    double teorAlcoolico;
    String marca;
    double volume;

    public Bebida(String nome, float custo, double teorAlcoolico, String marca, double volume){
        this.nome = nome;
        this.custo = custo;
        this.teorAlcoolico = teorAlcoolico;
        this.marca = marca;
        this.volume = volume;
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