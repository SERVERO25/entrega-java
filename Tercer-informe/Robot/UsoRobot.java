public class UsoRobot {

    public static void main(String[] args) {

        //crear un robot con el construct
        Robot Robot1 = new Robot();
        System.out.println("el color del robot1 es:" + Robot1.obtenercolor());
        System.out.println("el peso del robot1 es:" + Robot1.obtenercolor());

        //crear el robot con parametros por defecto
        Robot Robot2 = new Robot();
        System.out.println("el color del robot2 es:" + Robot2.obtenercolor());
        System.out.println("el peso del robot2 es:" + Robot2.obtenercolor());

        //uso setters
        Robot1.asignarcolor("blanco");
        Robot2.asignarpeso(5.2);

        //uso getters
        System.out.println("actulizacion robot1:");
        System.out.println("color:" + Robot1.obtenercolor());

        System.out.println("actulizacion robot2:");
        System.out.println("color:" + Robot2.obtenercolor());

        //metodos de comportamiento
        Robot1.adelante();
        Robot2.atras();
    }
}