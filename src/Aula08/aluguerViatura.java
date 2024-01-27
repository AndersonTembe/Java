package Aula08;

import java.util.ArrayList;
import java.util.List;

public class aluguerViatura {
    private String nome;
    private String codigoPostal;
    private String email;
    private List<Veiculo> Veiculos = new ArrayList<>();
    public aluguerViatura(String nome, String codigoPostal, String email) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public String getEmail() {
        return email;
    }
    public List<Veiculo> getVeiculosList(){
        return Veiculos;
    }

    public Veiculo getVeiculo(String Matricula){
        for(Veiculo veiculo : Veiculos){
            if(veiculo.getMatricula() == Matricula){
                return veiculo;
            }

        }
        return null;
    }

    public void addveiculo(Veiculo veiculo){
        this.Veiculos.add(veiculo);

    }

    
    
    
}
