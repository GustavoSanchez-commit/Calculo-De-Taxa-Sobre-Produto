package pack;

public class Teste {
    public static void main(String[] args) {
        Produto venda1 = new Produto(2, "Produto", 99.90);
        
        System.out.println(String.format("Pre�o original: %.2f", venda1.calcularPreco()));
        System.out.println(String.format("Total recebido ap�s taxas: %.2f", venda1.calcularTotalComTaxaa()));
        System.out.println(String.format("Taxa descontada: %.2f", venda1.taxaDescontada()));
    }
}
