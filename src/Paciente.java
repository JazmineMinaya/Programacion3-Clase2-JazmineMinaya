public class Paciente {
    private String nombre;
    private int edad;
    private String sexo;
    private float altura;
    private float peso;

    public Paciente() {
        setNombre("");
        setEdad(0);
        setSexo("");
        setAltura(0);
        setPeso(0);
    }

    public Paciente(String nombre, int edad, String sexo, float altura, float peso) {
        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
        setAltura(altura);
        setPeso(peso);
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    //Metodo para mostrar la info de los pacientes
    public static void mostrarDatosPaciente(Paciente paciente) {
        System.out.println("\nNombre del paciente: " + paciente.getNombre());
        System.out.println("Edad del paciente: " + paciente.getEdad());
        System.out.println("Sexo del paciente: " + paciente.getSexo());
        System.out.println("Altura del paciente: " + paciente.getAltura());
        System.out.println("Peso del paciente: " + paciente.getAltura());
    }

    // Metodo para mostrar el nombre del paciente en registro
    public static void mostrarNombrePaciente(Paciente paciente) {
        System.out.println(paciente.getNombre());
    }

    // Metodo para calcular IMC
    public static float calculoIMC(Paciente paciente) {
        float resultadoIMC;

        resultadoIMC = paciente.getPeso() / (paciente.getAltura() * paciente.getAltura());

        return resultadoIMC;
    }

    // Metodo para determinar el estado de peso de un paciente
    public static void determinarPesoPaciente(Paciente paciente) {
        float masaCorporal = calculoIMC(paciente);

        if (masaCorporal <= 18.5) {
            System.out.println("\nEl paciente posee bajo peso");
        }
        else if (masaCorporal <= 24.9) {
            System.out.println("\nEl paciente posee un peso normal");
        }
        else {
            System.out.println("\nEl paciente posee sobrepeso");
        }
    }
}
