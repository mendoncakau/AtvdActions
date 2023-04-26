public class Main {
    public static void main(String[] args) {


        Higiene sabonete = new Higiene("Dove", 2.99, 3, "Lavanda");
        System.out.println(sabonete.toString());
        System.out.println("Calcular preço -> R$: " + sabonete.calcularPreco());
        System.out.println("Calcular preço(parâmetro) -> R$: " + sabonete.calcularPreco(10));
        System.out.println("Preço com os 'pontos' pelo uso do cartão da loja -> R$: " + sabonete.pontosComCartao());
        System.out.println();
        Pessoal produto = new Pessoal("Marca X", 8.99, 2, "Cuidado com os cabelos");
        produto.setQuantidade(3);
        System.out.println(produto.toString());
        System.out.println("Preço com os 'pontos' pelo uso do cartão da loja -> R$:" + produto.pontosComCartao());
        System.out.println();
        Limpeza limpeza = new Limpeza("Minuano", 10.99, 10, "Desinfetante", "Banheiro");
        System.out.println(limpeza.toString());
        System.out.println("Preço com os 'pontos' pelo uso do cartão da loja -> R$: " + limpeza.pontosComCartao());

    }
}
