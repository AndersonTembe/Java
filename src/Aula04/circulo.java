package Aula04;

public class circulo {
    private double raio;
    private double pi = 3.14;
    
    public circulo(double raio, double pi){
        this.raio = raio;
        this.pi = pi;
        
    }

public double getraio() {
    return raio;
}
public void setraio(double raio){
    this.raio = raio;

}
public double getpi(){
    return pi;

}
public void setpi(double pi){
    this.pi = pi;

}
public String toString(){
    return "Circulo [raio=" + raio + ", pi=" + pi + ", Area=" + Area() + ", Perimetro=" + perimetro() + "]";

}
public double Area(){
    return(Math.PI*(Math.pow(this.raio, 2)));
}
public double perimetro(){
    return(2*Math.PI*raio);

}

public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }

    circulo other = (circulo) obj;
    if (other.getraio()!=this.raio) {

            return false;
        }
    return true;

}
    
}

