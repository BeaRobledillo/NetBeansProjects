 
package jerarquiaobjetogeometrico;

public class RectanguloComparable extends Rectangulo implements Comparable<RectanguloComparable> {

    public RectanguloComparable(double ancho, double alto) {
        super(ancho, alto);
    }

    @Override
    public int compareTo(RectanguloComparable o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Area: " + getArea();
    }

}