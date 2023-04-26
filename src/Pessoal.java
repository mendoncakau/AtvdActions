public class Pessoal extends Higiene {
    private String tipoCuidado;

    public Pessoal(String marca, double preco, int quantidade, String tipoCuidado) {
        super(marca, preco, quantidade);
        this.tipoCuidado = tipoCuidado;
    }

    public Pessoal(String marca, double preco, String tipoCuidado) {
        super(marca, preco);
        this.tipoCuidado = tipoCuidado;
    }

    public String getTipoCuidado() {
        return tipoCuidado;
    }


    public String toString() {
            return "Produto de Higiene Pessoal, da marca: " + getMarca() + ", com o preço: R$" + getPreco() + ", quantidade: " + getQuantidade() + ", Com o tipo de cuidado para: " + getTipoCuidado();
        }

    public double pontosComCartao(){
        double preco = getPreco() * getQuantidade() - (getPreco() / 4);
        return Math.round(preco * 100.0) / 100.0;
    }
}
