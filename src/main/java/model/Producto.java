package model;

import model.data.Marca;

public class Producto {

    private String nombre, id;
    private Marca marca;

    public Producto(String nombre, String id, Marca marca){
        this.nombre = nombre;
        this.id = id;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
