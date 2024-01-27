package Anderson;

public class GarageStorage extends StorageUnit {
    private static final int MAX_DURATION_IN_DAYS = 5 * 365;

    public GarageStorage(String localizacao, int comprimento, int largura, int altura, double preco) {
        super(localizacao, comprimento, largura, altura, preco, MAX_DURATION_IN_DAYS);
    }

    @Override
    public String getType() {
        return "Garage Storage";
    }

    


   
    
}
