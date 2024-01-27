package Recurso;

public class DigitalObject {
    private String doi;
    private SensitivityLevel sensitivityLevel;
    private User owner;

    public DigitalObject(String doi, SensitivityLevel public1, User owner) {
        this.doi = doi;
        this.owner = owner;
        this.sensitivityLevel = SensitivityLevel.PRIVATE;
    }

    

    public String getDoi() {
        return doi;
    }

    public SensitivityLevel getSensitivityLevel() {
        return sensitivityLevel;
    }

    public void setSensitivityLevel(SensitivityLevel sensitivityLevel) {
        this.sensitivityLevel = sensitivityLevel;
    }

    public User getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return doi;
    }

     


    
}
