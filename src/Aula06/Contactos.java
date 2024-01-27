package Aula06;
public class Contactos{
    private int id;
    private String email;
    private int phone;
    public Contactos(int id, String email, int phone) {
        this.id = id;
        this.email = email;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    
    public String toString(){

        return this.email+"->"+this.phone;
    }

    



    
}
