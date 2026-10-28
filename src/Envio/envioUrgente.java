package Envio;

public class envioUrgente extends envios {
    private double recargo;


    public envioUrgente(String codigo, String destino, double peso, double costeBase, double recargo) {
        super(codigo, destino, peso, costeBase);
        this.recargo = recargo;

    }
    public envioUrgente() {
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
    public double getcostetotal(){
        return super.getCosteBase() + this.recargo;

    }
    public String toString(){
        return " Envio urgente: " + this.codigo + " con destino: " + this.destino;

    }
}
