package Envio;

public class enviosNacional extends envios {
    private double iva;

    public enviosNacional() {
    }

    public enviosNacional(String codigo, String destino, double peso, double costeBase, double iva) {
        super(codigo, destino, peso, costeBase);
        this.iva =21;

    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    public double getcostetotal(){
        return super.getCosteBase() + (super.getCosteBase() * this.iva / 100);
// tem que colocar o super na frente do getcostetotal.
    }
    public String toString(){
        return "Envio nacional: " + this.codigo + "Destino: " + this.destino;
    }


}

