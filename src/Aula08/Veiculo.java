package Aula08;

public class Veiculo implements KmPercoridosInterface {
    private String Matricula;
    private String Marca;
    private String modelo;
    private int potencia;
    private int kmtotal = 0;
    private int kmstemp = 0;
    
    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        if(isMatriculaValida(matricula)){
            this.Matricula = matricula;
        }
        Matricula = matricula;
        Marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Veiculo [Matricula=" + Matricula + ", Marca=" + Marca + ", modelo=" + modelo + ", potencia=" + potencia
                + "]";
    }

    @Override
    public void trajeto(int quilometros) {
        kmstemp = quilometros;
        kmtotal += quilometros;

    }

    @Override
    public int ultimoTrajeto() {
        return kmstemp;
    }

    @Override
    public int distanciaTotal() {
        return kmtotal;
    }

    public boolean isMatriculaValida(String Matricula) {
        if (Matricula.length() != 8 || Matricula.charAt(2) != '-' || Matricula.charAt(5) != '-') {
            return false;
        }

        int numeros = 0, letras = 0;
 
        for (int contador = 0; contador < Matricula.length(); contador++) {
            if (Character.isLetter(Matricula.charAt(contador))) {
                if (Matricula.charAt(contador) == (Matricula.toUpperCase().charAt(contador))) {
                    ++letras;
                    continue;
                }
            }

            if (Character.isDigit(Matricula.charAt(contador))) {
                ++numeros;
            }
 
            if (contador == 2) {
                if (numeros != 2 && letras != 2) {
                    return false;
                }
            }

            if (contador == 4) {
                if ((numeros != 2 || letras != 2) && (numeros != 4)) {
                    return false;
                }
            }
 
        }

        if (numeros == 4 && letras == 2) {
            return true;
        }
        return false;
    }


    
    

    

    
}
