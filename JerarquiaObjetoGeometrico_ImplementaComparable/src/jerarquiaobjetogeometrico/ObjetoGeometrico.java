package jerarquiaobjetogeometrico;

import java.util.Date;

public abstract class ObjetoGeometrico {

    private String color;
    private boolean rellenado;
    private Date fechaCreacion;

    protected ObjetoGeometrico() {
    }

    protected ObjetoGeometrico(String color, boolean rellenado) {
        this.color = color;
        this.rellenado = rellenado;
        this.fechaCreacion = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRellenado() {
        return rellenado;
    }

    public void setRellenado(boolean rellenado) {
        this.rellenado = rellenado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public String toString() {
        return "ObjetoGeometrico{" + "color=" + color + ", rellenado=" + rellenado + ", fechaCreacion=" + fechaCreacion + '}';
    }

    public abstract double getArea();
    public abstract double getPerimetro();

}