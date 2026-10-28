package Envio;

public class envioInternacional extends envios {
    private double tasaAduanas;
    private String paisDestino;

    public envioInternacional(String codigo, String destino, double peso, double costeBase, String paisDestino, Double tasaAduanas) {
        super(codigo, destino, peso, costeBase);
        this.paisDestino = paisDestino;
        this.tasaAduanas = tasaAduanas;
    }

    public envioInternacional() {
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public Double getTasaAduanas() {
        return tasaAduanas;
    }

    public void setTasaAduanas(Double tasaAduanas) {
        this.tasaAduanas = tasaAduanas;
    }
    public double getcostetotal(){
        return super.getCosteBase() + (super.getCosteBase() * this.tasaAduanas/ 100);
    }
    public String toString(){
        return "Envio Internacional: " + this.codigo + " Destino: " + this.destino;
    }

}
