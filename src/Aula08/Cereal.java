package Aula08;

public class Cereal extends Alimento implements AlimentoVegetariano{
    private String nome;

    public Cereal(String string, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        //TODO Auto-generated constructor stub
    }
    

    @Override
    public boolean isvegetariano() {
        return true;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cereal other = (Cereal) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Cereal [nome=" + nome + "]";
    }

    
    
     
    
}
