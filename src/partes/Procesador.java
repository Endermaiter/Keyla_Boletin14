package partes;

public class Procesador {

    private float precio;
    private String marca;
    private float velocidad;

    public Procesador() {

    }

    public Procesador(float precio, String marca, float velocidad) {
        this.precio = precio;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
