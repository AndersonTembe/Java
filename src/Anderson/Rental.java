package Anderson;

public class Rental { 
    private int dataInicio;    
    private int dataFim;
    public Rental(int dataInicio, int dataFim) {
        this.dataInicio = dataInicio; 
        this.dataFim = dataFim;
    }
    public int getDataInicio() {
            return dataInicio;
    }
    public void setDataInicio(int dataInicio) {
        this.dataInicio = dataInicio;
    }
    public int getDataFim() {
        return dataFim;
    }
    public void setDataFim(int dataFim) {
        this.dataFim = dataFim;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dataInicio;
        result = prime * result + dataFim;
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
        Rental other = (Rental) obj;
        if (dataInicio != other.dataInicio)
            return false;
        if (dataFim != other.dataFim)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Rental [dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
    }

    



    
    
    

    
}
