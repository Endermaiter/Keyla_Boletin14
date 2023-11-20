package partes;

public class Teclado {

    private float precio;
    private String marca;

    public Teclado() {

    }

    public Teclado(float precio, String marca) {
        this.precio = precio;
        this.marca = marca;
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

    @Override
    public String toString() {
        return "Teclado{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
