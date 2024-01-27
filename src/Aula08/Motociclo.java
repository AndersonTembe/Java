package Aula08;

public class Motociclo extends Veiculo{
    public Motociclo(String matricula, String marca, String modelo, int potencia) {
        super(matricula, marca, modelo, potencia);
        //TODO Auto-generated constructor stub
    }

    public String gettipo(){
        return gettipo();
    }

    @Override
    public String toString() {
        return "Motociclo" + "\n    Matrícula: " + this.getMatricula() + "\n    Marca: " + this.getMarca() + "\n    Modelo: " +this.getModelo();
    }
    
}
