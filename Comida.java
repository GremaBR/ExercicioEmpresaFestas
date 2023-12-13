package Empresa;

public class Comida implements IProduto{
    String nome;
    float custo;
    double peso;
    double calorias;

    public Comida(String nome, float custo, double peso, double calorias){
        this.nome = nome;
        this.custo = custo;
        this.peso = peso;
        this.calorias = calorias;
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