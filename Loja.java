package Empresa;
import java.util.ArrayList;

public class Loja {
    float custoEstoque = 0;
    ArrayList <IProduto> produtos = new ArrayList <IProduto>();
    ArrayList <IKitProduto> kitsProdutos = new ArrayList <IKitProduto>();

    public void adicionarBebida(String nome, float custo, double teorAlcoolico, String marca, double volume) {
        Bebida bebida = new Bebida(nome, custo, teorAlcoolico, marca, volume);
        produtos.add(bebida);
    }

    public void adicionarComida(String nome, float custo, double peso, double calorias) {
        Comida comida = new Comida(nome, custo, peso, calorias);
        produtos.add(comida);
    }

    public void adicionarDiversao(String nome, float custo, String tipo, Boolean paraCriancas) {
        Diversao diversao = new Diversao(nome, custo, tipo, paraCriancas);
        produtos.add(diversao);
    }

    public void adicionarKitFesta(String nomeBebida, float custoBebida, double teorAlcoolicoBebida, String marcaBebida, double volumeBebida, String nomeComida, float custoComida, double pesoComida, double caloriasComida, String nomeDiversao, float custoDiversao, String tipoDiversao, Boolean paraCriancasDiversao) {
        KitFesta kitFesta = new KitFesta();
        kitFesta.inserirBebida(nomeBebida, custoBebida, teorAlcoolicoBebida, marcaBebida, volumeBebida);
        kitFesta.inserirComida(nomeComida, custoComida, pesoComida, caloriasComida);
        kitFesta.inserirDiversao(nomeDiversao, custoDiversao,  tipoDiversao, paraCriancasDiversao);
        kitsProdutos.add(kitFesta);
    }

    float getCustoEstoque(){
        float custoEstoque = 0;

        for(IProduto produto : produtos) {
            custoEstoque += produto.getCusto();
        }

        for(IKitProduto kitProduto : kitsProdutos) {
            custoEstoque += kitProduto.getCusto();
        }
        return custoEstoque;
    }

}
