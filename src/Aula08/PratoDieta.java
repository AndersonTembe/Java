package Aula08;

public class PratoDieta extends Prato {
    private double maxCalorias;

    public PratoDieta(String nome, double d) {
        super(nome);
    }

    public double getMaxCalorias() {
        return maxCalorias;
    }

    public void setMaxCalorias(double maxCalorias) {
        this.maxCalorias = maxCalorias;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(maxCalorias);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        PratoDieta other = (PratoDieta) obj;
        if (Double.doubleToLongBits(maxCalorias) != Double.doubleToLongBits(other.maxCalorias))
            return false;
        return true;
    }

    @Override
    public String toString() {
        if (super.getDia() != null)
            return String.format("Prato %s, composto por %d Ingredientes - Dieta (%.2f Calorias), dia %s",
                    super.getNome(), super.getComposiçao().size(), maxCalorias, super.getDia());
        else
            return String.format("Prato %s, composto por %d Ingredientes - Dieta (%.2f Calorias)", super.getNome(),
                    super.getComposiçao().size(), maxCalorias);

    }
    
    
}
