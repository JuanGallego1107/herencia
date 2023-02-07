package Herencia;

public class mainHerencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan");
        empleado.salario = 120000;
        System.out.println(empleado.getNombre()+empleado.salario);
        empleado.mostrarMensaje();

    }
}
