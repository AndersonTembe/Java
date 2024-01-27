package Anderson;

public class Client {
    private int numeroContribuinte;
    private String nome;
    private String tipo; // "empresarial" or "individual"
    
    public void Cliente(int numeroContribuinte, String nome, String tipo) {
        this.numeroContribuinte = numeroContribuinte;
        this.nome = nome;
         this.tipo = tipo;
        }
    
        public int getNumeroContribuinte() {
            return numeroContribuinte;
        }
    
        public void setNumeroContribuinte(int numeroContribuinte) {
            this.numeroContribuinte = numeroContribuinte;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return "Client [numeroContribuinte=" + numeroContribuinte + ", nome=" + nome + ", tipo=" + tipo + "]";
        }

        


}

    
