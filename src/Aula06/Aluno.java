package Aula06;
import Aula05.DateYMD;

public class Aluno extends Pessoa {
    private final int nMec;
    private DateYMD dateinsc;
    private static int contador = 100;

    public Aluno(String name, int cc, DateYMD dataNasc, int nMec, DateYMD dateinsc) {
        super(name, cc, dataNasc);
        this.nMec = contador ++;
        this.dateinsc = dateinsc;
    }

    public Aluno(String name, int cc, DateYMD dataNasc){
        super(name,cc,dataNasc);
        this.nMec = contador ++;
        this.dateinsc = DateYMD.today();

    }

    public int getnMec() {
        return nMec;
    }

    public DateYMD getDateinsc() {
        return dateinsc;
    }

    public static int getContador() {
        return contador;
    }


    public String toString(){
        return this.getName() + "numeros mecanografico: " + this.nMec + "Data de incricao: " + this.dateinsc;
    }

    

    

    

    

    




    
}
