package Aula06;

import Aula05.DateYMD;

public class Professor extends Pessoa {
    private String categoria;
    private String departamento;

    public Professor(String name, int cc, DateYMD dataNasc, String categoria, String departamento) {
        super(name, cc, dataNasc);
        this.categoria = categoria;
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String toString(){
        return this.categoria + this.departamento;
    }






    
}
