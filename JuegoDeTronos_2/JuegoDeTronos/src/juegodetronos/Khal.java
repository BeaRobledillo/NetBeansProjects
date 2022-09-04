package juegodetronos;

public class Khal extends Dothrakis{

    protected String JineteSangre;
    protected int AniosColeta;

    public Khal(String JineteSangre, int AniosColeta, int Caballos, String familia, String nombre, String titulo) {
        super(Caballos, familia, nombre, titulo);
        this.JineteSangre = JineteSangre;
        this.AniosColeta = AniosColeta;
    }

    
    
    public String getJineteSangre() {
        return JineteSangre;
    }

    public void setJineteSangre(String JineteSangre) {
        this.JineteSangre = JineteSangre;
    }

    public int getAniosColeta() {
        return AniosColeta;
    }

    public void setAniosColeta(int AniosColeta) {
        this.AniosColeta = AniosColeta;
    }

    @Override
    public String toString() {
        return "Khal{" + super.toString() + "JineteSangre=" + JineteSangre + ", AniosColeta=" + AniosColeta + '}';
    }
    
    @Override
    public String actuar() {
        return "aplastar enemigos, verles destrozados y oir el lamento de sus mujeres";
    }
    
}
