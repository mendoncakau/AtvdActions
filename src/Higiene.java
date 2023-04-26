public class Higiene {
    private String marca;
    private double preco;
    private int quantidade;

    public Higiene(String marca, double preco, int quantidade) {
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Higiene(String marca, double preco) {
        this(marca, preco, 1);
    }

    public Higiene(String marca, double preco, int quantidade, String aroma) {
        this(marca, preco, quantidade);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularPreco() {
        this.preco = this.preco * quantidade;
        return Math.round(this.preco * 100.0) / 100.0;
    }

    public double calcularPreco(int desconto){
        this.preco = this.preco - (desconto * this.preco / 100);
        return Math.round(this.preco * 100.0) / 100.0;
    }

    public double pontosComCartao(){
        this.preco = this.preco - (this.preco / 6) ;
        return Math.round(this.preco * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Produto de higiene, da marca: " + getMarca() + ", preço: R$" + getPreco() + ", quantidade: " + getQuantidade();
    }
}
