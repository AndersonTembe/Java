package Aula08;

public enum diaSemana {
    Segunda, Terça, quarta, quinta, sexta;

    static diaSemana getEnum(int i){
        diaSemana[] a = diaSemana.values();
        return a[i];
    }

}
