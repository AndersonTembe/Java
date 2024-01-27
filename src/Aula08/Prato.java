package Aula08;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private diaSemana dia;
    private List<Alimento> composiçao = new ArrayList<Alimento>();
    public Prato(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public diaSemana getDia() {
        return dia;
    }
    public void setDia(diaSemana dia) {
        this.dia = dia;
    }
    public List<Alimento> getComposiçao() {
        return composiçao;
    }
    public void setComposiçao(List<Alimento> composiçao) {
        this.composiçao = composiçao;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((dia == null) ? 0 : dia.hashCode());
        result = prime * result + ((composiçao == null) ? 0 : composiçao.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prato other = (Prato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (dia != other.dia)
            return false;
        if (composiçao == null) {
            if (other.composiçao != null)
                return false;
        } else if (!composiçao.equals(other.composiçao))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Prato [nome=" + nome + ", dia=" + dia + ", composiçao=" + composiçao + "]";
    }
    public boolean addIngrediente(Alimento c) {
        return false;
    }
    
    
    

    
    
    
}
