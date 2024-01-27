package Aula08;

public class PesadoPassageiros extends Veiculo {
    private double peso;
    private int numQuadro;
    private double maximoPassageiro;

    public PesadoPassageiros(String matricula, String marca, String modelo, int potencia) {
        super(matricula, marca, modelo, potencia);
        //TODO Auto-generated constructor stub
    }

    public double getPeso() {
        return peso;
    }

    public int getNumQuadro() {
        return numQuadro;
    }

    public double getMaximoPassageiro() {
        return maximoPassageiro;
    }

    @Override
    public String toString() {
        return "Pesado de Passageiros" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca() + "\n    Modelo: " +this.getModelo();
    }
    
    
}
