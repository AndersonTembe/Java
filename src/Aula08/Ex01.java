package Aula08;

public class Ex01 {
    public static void main(String[] args) {
        aluguerViatura viatura = new aluguerViatura("Mercedes-Amg", "10-10", "tembe@.pt");
        Motociclo m = new Motociclo(null, null, null, 0);
        automovelLigeiro al = new automovelLigeiro(null, null, null, 0);

        pesadoMercadorias pesado = new pesadoMercadorias(null, null, null, 0);
        viatura.addveiculo(pesado);
        viatura.addveiculo(pesado);
        System.out.println(m);
        System.out.println(al);
    }
    
}
