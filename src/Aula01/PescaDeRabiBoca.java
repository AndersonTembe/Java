package Aula01;

public class PescaDeRabiBoca {
    public static void main(String[] args) {
        recursivosimples(100);

    }
    public static void recursivosimples(int x){
        System.out.println(x);
        x--;
        if (x>0)
            recursivosimples(x);
    }
    
}
