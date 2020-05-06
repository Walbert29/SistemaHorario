
package sistemahorario;

/**
 *
 * @author Walbert
 */
public class Horario 
{
    int Id_Horaio;
    
    Materia Inicio;
    int Tamaño;
    
    public Horario()
    {
        Inicio = null;
        Tamaño = 0;
    }
    
    
    public void agregarAlFinal(int valor){
        Materia nuevo = new Materia();
        Materia aux = Inicio;
            while(aux.Siguiente != null){
                aux = aux.Siguiente;
            }
            aux.Siguiente = nuevo;
        Tamaño++;
        }
    
    public void Imprimir()
    {
        
    }
    
}
