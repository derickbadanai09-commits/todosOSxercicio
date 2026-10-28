package hoteles;

public class alojamiento {
    protected String nombre;
    private double precioPorNoche;
   protected String ciudad;

    public alojamiento(String ciudad, String nombre, double precioPorNoche) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.precioPorNoche = precioPorNoche;
    }

    public alojamiento() {
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
    public double calcuarPrecio (int noches){
        return noches * this.precioPorNoche ;
    }
    public String toString(){
        return this.nombre + " en " + this.ciudad;
    }
    }