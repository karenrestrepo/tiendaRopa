package co.edu.uniquindio.tiendaRopa.model;

public class Prenda {
    private String tipoPrenda;
    private String referencia;
    private String tipoCliente;
    private String talla;
    private String color;
    private double precio;
    private int cantidadDisponible;

    /*Constructor*/

    public Prenda() {
    }

    public Prenda(String tipoPrenda, String referencia, String tipoCliente, String talla, String color, double precio, int cantidadDisponible) {
        this.tipoPrenda = tipoPrenda;
        this.referencia = referencia;
        this.tipoCliente = tipoCliente;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    /*Getters and Setters*/

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}

