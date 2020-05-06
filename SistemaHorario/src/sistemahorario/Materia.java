
package sistemahorario;

/**
 *
 * @author Walbert
 */
public class Materia 
{
    int Id_Materia;
    String Nom_Materia,HoraI, HoraF;
    char Grupo;
    
    public Materia()
    {
        Id_Materia = 0;
        Nom_Materia = "";
        Grupo = ' ';
        HoraI = " ";
        HoraF = " ";
    }
    
    Materia Siguiente;
    
}
