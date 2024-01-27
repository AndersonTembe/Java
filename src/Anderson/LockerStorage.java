package Anderson;

public class LockerStorage extends StorageUnit {
    private static final int MAX_DURATION_IN_DAYS = 15;

    public LockerStorage(String localizacao, int comprimento, int largura, int altura, double preco) {
        super(localizacao, comprimento, largura, altura, preco, MAX_DURATION_IN_DAYS);
    }

    @Override
    public String getType() {
        return "Locker Storage";
    }
   
}
