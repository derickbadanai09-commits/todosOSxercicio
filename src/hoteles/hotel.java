package hoteles;

public class hotel extends alojamiento {
    private int estrellas;
    private boolean desayunoIncluido;

    public hotel(String ciudad, String nombre, double precioPorNoche, boolean desayunoIncluido) {
        super(ciudad, nombre, precioPorNoche);
        this.desayunoIncluido = desayunoIncluido;
    }

    public hotel(boolean desayunoIncluido, int estrellas) {
        this.desayunoIncluido = desayunoIncluido;
        this.estrellas = estrellas;
    }

    public hotel(boolean desayunoIncluido) {
        this.desayunoIncluido = false;
    }

    public hotel() {
    }

    public boolean isDesayunoIncluido() {
        return desayunoIncluido;
    }

    public void setDesayunoIncluido(boolean desayunoIncluido) {
        this.desayunoIncluido = desayunoIncluido;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    public String toString(){
        return this.nombre + " en " + this.ciudad + " ( hotel de " + this.estrellas + " estrellas )";
    }
}