package Aula06;

import Aula05.DateYMD;

public class Pessoa {
    private String name;
    private int cc;
    private DateYMD dataNasc;


    public Pessoa(String name, int cc, DateYMD dataNasc) {
        this.name = name;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }


    public String getName() {
        return name;
    }


    public int getCc() {
        return cc;
    }


    public DateYMD getDataNasc() {
        return dataNasc;
    }
    
    public String toString(){
        return name + "cc: " + cc +  "Data de nascimento: " + dataNasc;
    }

    


 


    
}
