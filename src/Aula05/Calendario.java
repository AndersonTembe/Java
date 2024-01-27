package Aula05;
public class Calendario {
    private int ano;
    private int dSemana;
    private String[] monthDays = {"janeiro","Fevereiro","Março","Abril","Maio","junho","julho","Agosto","setembro","octubro","Novembro","Dezembro"};
    public Calendario(int ano, int dSemana) {
        this.ano = ano;
        this.dSemana = dSemana;
    }

    public int getYear(){
        return ano;

    }

    public int getFirstWeekendOfMonth(int mes){
        return dSemana;
    }

    public void printMonth(int mes){
        System.out.printf("%12s %-10s\n", monthDays[mes-1],ano);
        System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","SU", "MO", "TU", "WE", "TH", "FR", "SA");

        for(int i=0; i<6; i++){
            for(int c= 1; c<8; c++){
                if(i==0 && c<dSemana ||(i*7+(c-dSemana + 1))> DateYMD.monthDays(mes,ano)){
                    System.out.printf("%3s", ",");
                }else{
                    System.out.printf("%3d",(i*7 + (c-dSemana+1)));
                }
            }
            System.out.println();
        }

    }

    public void printCalendario() {
        for(int i = 0; i <= 11; i++) {
            System.out.printf("%12s %-10s\n", monthDays[i], ano);
            System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
            
            for(int l=0; l<6; l++) {		
                for(int c=1; c<8; c++) {		
                    if((l==0 && c<dSemana) || ((l*7 + (c-dSemana + 1)) > DateYMD.monthDays(i, ano))) {	
                        System.out.printf("%3s", " ");							
                    } else {
                        System.out.printf("%3d", (l*7 + (c-dSemana + 1)));		
                    }
                }
                System.out.println();		
            }	
        }
    }







  

    
}
