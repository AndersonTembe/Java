package Anderson;

public abstract  class StorageUnit {
    private String localizacao;
    private int largura;
    private int comprimento;
    private int altura;
    private double preco;
    private int maxduracao;

    public StorageUnit(String localizacao, int largura, int comprimento, int altura, double preco, int maxduracao) {
        this.localizacao = localizacao;
        this.largura = largura;
        this.comprimento = comprimento;
        this.altura = altura;
        this.preco = preco;
        this.maxduracao = maxduracao;
    }

    public abstract String getType();

    public double calculatePrice(int durationInDays) {
        durationInDays = Math.min(durationInDays, maxduracao);
    
        return durationInDays * preco;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getMaxduracao() {
        return maxduracao;
    }

    public void setMaxduracao(int maxduracao) {
        this.maxduracao = maxduracao;
    }

    @Override
    public String toString() {
        return "StorageUnit [localizacao=" + localizacao + ", largura=" + largura + ", comprimento=" + comprimento
                + ", altura=" + altura + ", preco=" + preco + ", maxduracao=" + maxduracao + "]";
    }

    

    

    


    
    

    
}
