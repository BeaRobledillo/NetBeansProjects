package jerarquia_dinosaurios;

public class Pterodactilo extends Dinosaurio {

    private float envergadura;
    private float dbGrito;

    public Pterodactilo() {
    }

    public Pterodactilo(float envergadura, float dbGrito, String nombre, float altura, int numExtremidades, String dieta) {
        super(nombre, altura, numExtremidades, dieta);
        this.envergadura = envergadura;
        this.dbGrito = dbGrito;
    }

    public float getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(float envergadura) {
        this.envergadura = envergadura;
    }

    public float getDbGrito() {
        return dbGrito;
    }

    public void setDbGrito(float dbGrito) {
        this.dbGrito = dbGrito;
    }

    @Override
    public String toString() {
        return super.toString() + "Pterodactilo{" + "envergadura=" + envergadura + ", dbGrito=" + dbGrito + '}';
    }

    public void soyPterodactilo() {
        System.out.println("Soy un Pterodactilo y en mi nombre no se pronuncia la letra P");
    }

}
