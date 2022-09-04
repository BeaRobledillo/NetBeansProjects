package animalesvoladores;

public class AnimalesVoladores {

    public static void main(String[] args) {
        Object[] objects = {new Tigre(), new Dinosaurio(), new Mosca(), new CerdoVolador()};
        for (Object object : objects) {
            if (object instanceof Volable) {
                System.out.println(((Volable) object).comoVolar());
            }
            if (object instanceof Animal) {
                System.out.println(((Animal) object).comoSuena());
            }
        }

    }
}
