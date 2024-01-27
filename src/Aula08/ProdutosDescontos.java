package Aula08;

public class ProdutosDescontos extends ProdutoGenerico{
    private double desconto;
    public ProdutosDescontos(String nome, int quantidade, double preco) {
        super(nome, quantidade, preco);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getvalorDesconto(){
        return getPreco() - getPreco() * desconto/100; 
    }






    


    
    

    
}
