package pack;

public class Produto extends Item implements Pedido {
    private int quantidade;
    private double taxaPercentual = 0.049; 
    private double taxaFixa = 2.00;         
    private double valorTaxaDescontada;     

    public Produto(int quantidade, String nome, double preco) {
        super(nome, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public double calcularPreco() {
        return getPreco() * quantidade;
    }

    @Override
    public double calcularTotalComTaxaa() {
        double valorTaxaPercentual = calcularPreco() * taxaPercentual;
        valorTaxaDescontada = valorTaxaPercentual + taxaFixa; 
        double resultado = calcularPreco() - valorTaxaDescontada;
        return resultado;
    }

    @Override
    public double taxaDescontada() {
        return valorTaxaDescontada;  
    }
}
