public class Agencia {

    private int numAgencia;
    private String gerente;

    public Agencia(int numAgencia, String gerente){
        this.numAgencia = numAgencia;
        this.gerente = gerente;
    }

    public String toString(){
        String dadosAgencia = String.format("Ag.: %d\nGerente: %s\n",
                this.numAgencia, this.gerente);

        return dadosAgencia;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }


}