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
}
