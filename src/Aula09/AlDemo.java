package Aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import Aula05.DateYMD;

import Aula06.Pessoa;


public class AlDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10) 
        c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++) 
        System.out.println("Elemento: " + c1.get(i));
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println(c2);

        System.out.println("<--------------------->");

        System.out.println(c2.contains("Calor"));
        System.out.println(c2.indexOf("Chuva"));
        System.out.println(c2.lastIndexOf("Vento"));

        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Ana luisa", 11111, new DateYMD(20, 01, 2000)));
        c3.add(new Pessoa("luisa Ana", 222222, new DateYMD(21, 02, 2001)));
        c3.add(new Pessoa("Mario juju", 333333, new DateYMD(22, 03, 2003)));
        c3.add(new Pessoa("juju Mario", 44444, new DateYMD(23, 04, 2004)));
        c3.add(new Pessoa("Madrid ", 55555, new DateYMD(24, 05, 2005)));

        System.out.println(c3);

        Set<DateYMD> c4 = new TreeSet<>();
        c4.add(new DateYMD(20, 04, 2003));
        c4.add(new DateYMD(21, 05, 2004));
        c4.add(new DateYMD(22, 06, 2005));
        c4.add(new DateYMD(23, 07, 2007));
        c4.add(new DateYMD(24, 04, 2008));
        




        





        



        
    }
    
}
