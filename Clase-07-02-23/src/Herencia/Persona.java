package Herencia;

public class Persona {
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarMensaje(){
        System.out.println("Hola");
    }
}
class Empleado extends Persona{
    public float salario;
    public void mostrarMensaje2(){
        System.out.println("hola x2");
    }
}

