package Aula04;

public class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue(){
        return price*quantity;
    }
    public String getName(){
        return name;
    }

    public double getprice(){
        return price;
    }
    public int getquantity(){
        return quantity;
        
    }

    public String toString(){
        return this.name + "preço: " + this.price + "quantidade: " + this.quantity;
    }
    
}
