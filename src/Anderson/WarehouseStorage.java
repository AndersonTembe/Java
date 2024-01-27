package Anderson;

public class WarehouseStorage extends StorageUnit {
    private static final int MAX_DURATION_IN_DAYS = 10 *365;

    public WarehouseStorage(String localizacao, int altura, int comprimento, int largura, double preco) {
        super(localizacao, largura, comprimento, altura, preco, MAX_DURATION_IN_DAYS);
    }

    @Override
    public String getType() {
        return "Warehouse Storage";
    }
}
 
