package Aula08;

public class Carne extends Alimento {
    private VariedadeCarne tipo;

    public Carne(VariedadeCarne frango, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        //TODO Auto-generated constructor stub
    }

    public VariedadeCarne getTipo() {
        return tipo;
    }

    public void setTipo(VariedadeCarne tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        Carne other = (Carne) obj;
        if (tipo != other.tipo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Carne [tipo=" + tipo + "]";
    }

    

    
    


    
}
