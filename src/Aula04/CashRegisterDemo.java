package Aula04;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {

    // TODO: completar implementação da classe
    Product[] produtos = new Product[5];
    public ArrayList<Product> lista = new ArrayList<Product>();

    public void addProduct(Product product){
        System.out.println("add product" + product.getName());
        lista.add(product);


    }
    public void printtable(){
        System.out.printf("%-20s %-10s %-13, %s\n","product", "price","quantity","Total");
        for(Product p: lista ){
            String s = String.format("%-20s %-10f %-13d %f",p.getName(),p.getPrice(),p.getQuantity(),p.getTotalValue());
            System.out.println(s);
        }
    }


}

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        // TODO: Listar o conteúdo e valor total
        System.out.println(cr);

    }
}