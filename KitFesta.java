package Empresa;

import java.util.ArrayList;

public class KitFesta implements IKitProduto {

    String nome;
    float custo = 0;
    ArrayList <IProduto> produtos = new ArrayList <IProduto>();

    public void inserirBebida(String nomeBebida, float custoBebida, double teorAlcoolicoBebida, String marcaBebida, double volumeBebida) {
        Bebida bebida = new Bebida(nomeBebida, custoBebida, teorAlcoolicoBebida, marcaBebida, volumeBebida);
        produtos.add(bebida);
    }

    public void inserirComida(String nomeComida, float custoComida, double pesoComida, double caloriasComida) {
        Comida comida = new Comida(nomeComida, custoComida, pesoComida, caloriasComida);
        produtos.add(comida);
    }

    public void inserirDiversao(String nomeDiversao, float custoDiversao, String tipoDiversao, Boolean paraCriancasDiversao) {
        Diversao diversao = new Diversao(nomeDiversao, custoDiversao, tipoDiversao, paraCriancasDiversao);
        produtos.add(diversao);
    }

    public int getNumeroProdutos() {
        return produtos.size();
    }

    public IProduto getProduto(int numero) {
            if(produtos.get(numero) != null) {
             return produtos.get(numero);
        }
        return null;
    }

    public String getNome(int numero) {
        if(produtos.get(numero) != null) {
             return produtos.get(numero).getNome();
        }
        return null;
    }

    public float getCusto() {
        custo = 0;
        for(IProduto produto : produtos) {
            custo = custo + produto.getCusto();
        }
        return custo;
    }

}
