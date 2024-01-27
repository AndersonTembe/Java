package Aula04;

public class Triangulo {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;


    }
public double getlado1(){
    return lado1;
}
public double getlado2(){
    return lado2;
}
public double getlado3(){
    return lado3;
}

public void setlado1(double lado1){
    assert lado1 > 0;
        this.lado1 = lado1;
}
public void setlado2(double lado2){
    assert lado2 > 0;
        this.lado2 = lado2;
}
public void setlado3(double lado3){
   assert lado3 > 0;
    this.lado3 = lado3;
}

public String toString(){
    return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", Perimetro=" + Perimetro() + ", Area=" + Area() + "]";
}

public double Area(){
    return Math.sqrt(Perimetro()*(Perimetro()-lado1)*(Perimetro()-lado2)*(Perimetro()-lado3));

}

public double Perimetro(){
    return (lado1 + lado2 + lado3);

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
    Triangulo other = (Triangulo)obj;
    if(other.getlado1() != this.lado1){
        return false;
    }
    if(other.getlado2() != this.lado2){
        return true;

    }
    if(other.getlado3() != this.lado2){
        return false;
    }

    return true;


}

    
}
