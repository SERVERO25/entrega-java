package ej1;

//agregar dos atributos más a ala calse robot - pendiente
public class Robot {

    //atributos
    private String color;
    private double peso;

    //constructor metodo pordefecto
    public Robot() {
        peso = 0.5;
        color = "azul";
    }

    //constructor parametros
    public Robot(double peso, String color) {
        this.color = color;
        this.peso = peso;
    }

    //metodos de comportamiento
    void adelante() {
        System.out.println("el robot se mueve hacia adelante");
    }

    void atras() {
        System.out.println("el robot se mueve hacia atras");
    }

    void derecha() {
        System.out.println("el robot se mueve hacia derecha");
    }

    void izquierda() {
        System.out.println("el robot se mueve hacia izquierda");
    }

    //getters
    public double obtenerpeso() {
        return peso;
    }

    public String obtenercolor() {
        return color;
    }

    //setters
    public void asignarpeso(double peso) {
        this.peso = peso;
    }

    public void asignarcolor(String color) {
        this.color = color;
    }
}