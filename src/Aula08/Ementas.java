package Aula08;

import java.util.ArrayList;

public class Ementas {
    private String nome;
    private String local;
    ArrayList<Prato> lista = new ArrayList<Prato>();
    public Ementas(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public ArrayList<Prato> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Prato> lista) {
        this.lista = lista;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((local == null) ? 0 : local.hashCode());
        result = prime * result + ((lista == null) ? 0 : lista.hashCode());
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
        Ementas other = (Ementas) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (lista == null) {
            if (other.lista != null)
                return false;
        } else if (!lista.equals(other.lista))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Ementas [nome=" + nome + ", local=" + local + ", lista=" + lista + "]";
    }

    public void addPrato(Prato p, diaSemana d){
        lista.add(p);
        p.setDia(d);
    }
    

    

    
}
