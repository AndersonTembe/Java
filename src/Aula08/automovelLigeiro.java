package Aula08;

public class automovelLigeiro extends Veiculo {
    private int numQuadro;
    private int capBagageira;

    public automovelLigeiro(String matricula, String marca, String modelo, int potencia) {
        super(matricula, marca, modelo, potencia);
    }

    public int getNumQuadro() {
        return numQuadro;
    }

    public void setNumQuadro(int numQuadro) {
        this.numQuadro = numQuadro;
    }

    public int getCapBagageira() {
        return capBagageira;
    }

    public void setCapBagageira(int capBagageira) {
        this.capBagageira = capBagageira;
    }

    @Override
    public String toString() {
        return "Automóvel Ligeiro" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca() + "\n    Modelo: " +this.getModelo();

    }


    
}
