package sistemahorario;

import java.util.Scanner;

public class SistemaHorario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        Horario H = new Horario();
        int id_materia;
        int dia;
        System.out.println("Ingrese el ID de la Materia");
        id_materia= L.nextInt();
        System.out.println("Ingrese el Dia a asignar");
        dia = L.nextInt();
        
        H.agregarAlFinal(id_materia, dia);
        System.out.println("-------------------------");
        H.Imprimir();
    }
    
}
