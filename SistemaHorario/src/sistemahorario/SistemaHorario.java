package sistemahorario;

import java.util.Scanner;

public class SistemaHorario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        Horario H = new Horario();
        System.out.println("Ingrese el ID de la Materia");
        
        H.Imprimir();
    }
    
}
