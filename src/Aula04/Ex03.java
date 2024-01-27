package Aula04;

public class Ex03 {
    public static void main(String[] args) {
        circulo c1 = new circulo(0, 0);
        circulo c2 = new circulo(0, 0);
        Retangulo r1 = new Retangulo(0, 0);
        Retangulo r2 = new Retangulo(0, 0);
        Triangulo t1 = new Triangulo(0, 0, 0);


        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(t1.toString());
        System.out.println(c1.equals(c2));
        System.out.println(r1.equals(r2));
    }
    
}
