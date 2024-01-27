package Aula05;
import java.time.OffsetDateTime;
public class DateYMD {
    private int dia;
    private int mes;
    private int ano;    

    public DateYMD(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public String ToString(){
        return String.format("%04d" + "%02d" + "%02d", ano,mes,dia);

    }

    public static boolean ValidMonth(int mes){
        if(mes >= 1 && mes <= 12){
            return true;

        }else{
            return false;
        }
    }
    public static int monthDays(int mes, int ano){
        switch (mes) {
            case 4:
            case 6: 
            case 9:
            case 11:
                return 30;
            case 2:
                if(LeapYear(ano)){
                    return 29;
                }else{
                    return 28;
                }
        
            default:
                return 31;
        }

    }

    public static boolean LeapYear(int ano){
        if(ano%4==0 && ano%100!=0 || ano%400==0){
            return true;

        }else{
            return false;
        }

    }

    public boolean validDay(int dia, int mes, int ano) {
        if(dia > 0 && dia <= monthDays(mes, ano)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean valid(int dia, int mes, int ano){
        if(ValidMonth(mes) && validDay(dia, mes, ano) && ano >= 0){
            return true;
        }else{
            return false;
        }
    }
    public void increment(){
        dia += 1;
        if(!validDay(dia, mes, ano)){
            mes += 1;
            dia = 1;
        }
        if(!ValidMonth(mes)){
            ano += 1;
            mes = 1;

        }
      

    }

    public void decrement(){
        dia -= 1;
        if(!validDay(dia, mes, ano)){
            mes -= 1;
            dia = monthDays(mes, ano);
        }

        if(!ValidMonth(mes)){
            ano -= 1;
            mes = 12;

        }
    }

    public static DateYMD today(){
        OffsetDateTime data = OffsetDateTime.now();
        int d = data.getDayOfMonth();
        int m = data.getMonthValue();
        int a = data.getYear();

        return new DateYMD(d, m, a);
    }

    @Override
    public String toString() {
        return "DateYMD  dia=" + dia + ", mes=" + mes + ", ano=" + ano + "";
    }
    


    









   




    

}
