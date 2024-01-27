package Aula04;

public class Retangulo {
    private double comprimento;
    private double altura;


    public Retangulo(double comprimento, double altura){
        this.comprimento = comprimento;
        this.altura = altura;
    }

public double comprimento(){
    return comprimento;
}

public double altura(){
    return altura;

}

public void setComprimento(double comprimento){
    this.comprimento = comprimento;
}

public void setAltura(double altura){
    this.altura = altura; 

}
public double Area(){
    return (altura* comprimento);
}

public double perimetro(){
    return (2*altura + 2*comprimento);

}

public String toString(){
    return "Retangulo [comprimento=" + comprimento + ", altura=" + altura + ", Area=" + Area() + ", Perimetro=" + perimetro() + "]";
}

public boolean equals(Object obj){
    if(this == obj){
        return true;
    }
    if(obj == null){
        return false;

    }
    if(getClass() != obj.getClass()){
        return false;
    }

    Retangulo other = (Retangulo) obj;
    if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura)) {
        return false;
    }
    if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento)) {
        return false;
    }
    return true;

    

}
    
}
