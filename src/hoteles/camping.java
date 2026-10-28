package hoteles;

public class camping extends alojamiento{
    private int numCaravanas;
    private int capacidadCaravanas;
    private boolean tienePiscina;

    public camping(String ciudad, String nombre, double precioPorNoche, int capacidadCaravanas, int numCaravanas, boolean tienePiscina) {
        super(ciudad, nombre, precioPorNoche);
        this.capacidadCaravanas = capacidadCaravanas;
        this.numCaravanas = numCaravanas;
        this.tienePiscina = tienePiscina;
    }

    public camping() {
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public int getNumCaravanas() {
        return numCaravanas;
    }

    public void setNumCaravanas(int numCaravanas) {
        this.numCaravanas = numCaravanas;
    }

    public int getCapacidadCaravanas() {
        return capacidadCaravanas;
    }

    public void setCapacidadCaravanas(int capacidadCaravanas) {
        this.capacidadCaravanas = capacidadCaravanas;
    }
    public int getCapacidadRestante(){
        return this.capacidadCaravanas - this.numCaravanas;
    }
    public String toString(){
        return this.nombre + " en " + this.ciudad + " (camping con capacidad para " + this.capacidadCaravanas + " caravanas)";
    }
}
