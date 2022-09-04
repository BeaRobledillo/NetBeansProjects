package ejerciciopersona;

//clase Persona
public class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private String DNI = ""; //será invocado cuando se construya el objeto
    private char sexo = 'H'; //Sexo por defecto H --> Hombre
    private double peso;
    private double altura; //en metros

    //Te recomiendo que uses constantes para devolver estos valores
    /*Si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, 
    si devuelve un número entre 20 y 25 (incluidos), significa que la persona está por debajo de su peso ideal y la función devuelve un 0  
    y si devuelve un valor mayor que 25 significa que la persona tiene sobrepeso, la función devuelve un 1. */
    //constantes para el IMC
    // El peso de la persona esta por debajo del peso ideal
    public static final int POR_DEBAJO = -1;
    // El peso de la persona esta en su peso ideal
    public static final int PESO_IDEAL = 0;
    //El peso de la persona esta por encima del peso ideal
    public static final int POR_ENCIMA = 1;

    //Contructores:
    //Constructor x defecto
    public Persona() {
        generaDNI();
    }

    //Constructores personalizados
    //con todos los parametros  incluyendo DNI
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generaDNI(); //llamada al metodo para generar un DNI
        this.sexo = sexo;
        comprobarSexo();
    }

    //con 3  parametros (menos el peso y la altura)
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo();
        generaDNI(); //llamada al metodo para generar un DNI
    }

    //Set's de cada atributo, excepto de DNI. 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodos:
    /*calculará si la persona está en su peso ideal.
    Si esta fórmula devuelve un valor menor que 20, la función devuelve un -1,
    si devuelve un número entre 20 y 25 (incluidos), significa que la persona 
    está por debajo de su peso ideal y la función devuelve un 0  y 
    si devuelve un valor mayor que 25 significa que la persona tiene sobrepeso,
    la función devuelve un 1. */
    public int calcularIMC() {
        //La fórmula es: peso/(altura*altura)
        //Calculamos el peso de la persona
        double pesoIMC = peso / (Math.pow(altura, 2));
        //Devuelve la constante correspondiente a cada peso
        if (pesoIMC >= 20 && pesoIMC <= 25) {
            return PESO_IDEAL;
        } else if (pesoIMC < 20) {
            return POR_DEBAJO;
        } else {
            return POR_ENCIMA;
        }
    }

    /*metodo para indicar si la persona es mayor de edad, 
    devuelve un booleano.
    return true si es mayor de edad y false si es menor de edad*/
    public boolean esMayorDeEdad() {
        boolean mayor;
        mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }


    /*metodo q comprueba que el sexo introducido es correcto.
    Si no es correcto, será H(como consecuencia de la manera de establecer el valor). 
    Este método NO será accesible desde el exterior.*/
    private void comprobarSexo() {
        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexo;
        }
    }

    /*metodo q genera un número aleatorio de 8 cifras, 
    genera a partir de este número su letra correspondiente. 
    Este método será invocado cuando se construya el objeto. 
    Puedes dividir el método para que te sea más fácil. 
    NO será accesible desde el exterior.*/
    private void generaDNI() {
        final int todas = 23;

        //Generamos un número de 8 cifras con random/aleatorio
        int numeroDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int resultado = numeroDNI - (numeroDNI / todas * todas);

        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(resultado);

        //Pasamos el DNI a String y agregamos la letra
        DNI = Integer.toString(numeroDNI) + letraDNI;
    }

    //metodo para generar la letra de cada dni 
    //son 23 letras para generar la letra de cada dni
    private char generaLetraDNI(int resultado) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[resultado];
    }


    /*metodo toString devuelve toda la información del objeto.*/
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'M') {
            sexo = "Mujer";
        } else {
            sexo = "Hombre";
        }
        return "Persona{" + "nombre= " + nombre + ", edad= " + edad + ", DNI= " + DNI + ", sexo= " + sexo + ", peso= " + peso + ", altura= " + altura + '}';
    }

}
