package Aula08;

public class Taxi extends automovelLigeiro{
    private int numLicença;

    public Taxi(String matricula, String marca, String modelo, int potencia) {
        super(matricula, marca, modelo, potencia);
        
    }

    public int getNumLicença() {
        return numLicença;
    }

    @Override
    public String toString() {
        return "Táxi" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca() + "\n    Modelo: " +this.getModelo();
    }

    
    
    
}
