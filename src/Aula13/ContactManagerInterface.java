package Aula13;

public interface ContactManagerInterface {
    public void addContact(Contact contact);
    public void removeContact(Contact contact);
    public void upgradeContact(Contact contact);
    public Contact searchContact(String nome);
    public void listContact();
    public void listContactOrderedByname();
    public void listContactOrderedByEmail();
    public void listContactOrderedByNumber();
    public void listContactOrderedByBirthday();
    
}
