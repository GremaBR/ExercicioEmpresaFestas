package Empresa;

public class Main {

    public static void main(String[] args) {

        Loja loja = new Loja();

        loja.adicionarBebida("vinho", 15, 10, "sangue de boi", 1);
        loja.adicionarComida("bolo", 4, 200, 500);
        loja.adicionarDiversao("cama elástica", 100, "infantil", true);
        loja.adicionarKitFesta("vinho", 15, 10, "sangue de boi", 1,"bolo", 4, 200, 500,"cama elástica", 100, "infantil", true);

        System.out.println("O valor do estoque é de: " + loja.getCustoEstoque());
    }

}
