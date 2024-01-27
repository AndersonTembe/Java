package Aula08;

public class pesadoMercadorias extends Veiculo {
    private double peso;
    private double cargaMaxima;
    private int numQuadro;

    public pesadoMercadorias(String matricula, String marca, String modelo, int potencia) {
        super(matricula, marca, modelo, potencia);
        //TODO Auto-generated constructor stub
    }

    public double getPeso() {
        return peso;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public int getNumQuadro() {
        return numQuadro;
    }

    @Override
    public String toString() {
        return "Pesado de Mercadorias" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca() + "\n    Modelo: " +this.getModelo();
    }
    
    
    
}
