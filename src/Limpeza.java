public class Limpeza extends Higiene {
    private String tipo;
    private String ambiente;

    public Limpeza(String marca, double preco, int quantidade, String tipo, String ambiente) {
        super(marca, preco, quantidade);
        this.tipo = tipo;
        this.ambiente = ambiente;
    }

    public Limpeza(String marca, double preco, String tipo) {
        super(marca, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Produto de Limpeza, da marca: " + getMarca() + ", preço: R$" + getPreco() + ", quantidade: " + getQuantidade() + ", tipo: " + getTipo() + ". É usado em:" + getAmbiente();
    }

    public double pontosComCartao(){
        double preco = getPreco() * getQuantidade() - (getPreco() / 3);
        return Math.round(preco * 100.0) / 100.0;
    }


    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
}
