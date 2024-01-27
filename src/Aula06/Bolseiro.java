package Aula06;

import Aula05.DateYMD;

public class Bolseiro extends Aluno{
    private int bolsa;

    public Bolseiro(String name, int cc, DateYMD dataNasc, int nMec, DateYMD dateinsc, int bolsa) {
        super(name, cc, dataNasc, nMec, dateinsc);
        this.bolsa = bolsa;
    }

    public Bolseiro(String name, int cc, DateYMD dataNasc, int bolsa) {
        super(name, cc, dataNasc);
        this.bolsa = bolsa;
    }

    public Bolseiro(String name, int cc, DateYMD dataNasc, int nMec, DateYMD dateinsc) {
        super(name, cc, dataNasc, nMec, dateinsc);
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public String toString(){
        return this.getName() + "numero mecanografico: " + this.getnMec() + ", Data de increiçao: " + this.getDateinsc() + ", Bolsa: " + bolsa;
    }

    

    

  

    }
