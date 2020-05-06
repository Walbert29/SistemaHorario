
package sistemahorario;

/**
 *
 * @author Walbert
 */
public class Horario 
{
    int Id_Horaio;
    
    Materia Lunes;
    Materia Miercoles;
    Materia Martes;
    Materia Jueves;
    Materia Viernes;
    Materia Sabado;
    
    int TamañoL;
    int TamañoM;
    int TamañoMi;
    int TamañoJ;
    int TamañoV;
    int TamañoS;
    
    public Horario()
    {
        Lunes = new Materia();
        Lunes.Id_Materia=000;
        
        Martes = new Materia();
        Martes.Id_Materia=111;
        
        Miercoles = new Materia();
        Miercoles.Id_Materia=222;
        
        Jueves = new Materia();
        Jueves.Id_Materia=333;
        
        Viernes = new Materia();
        Viernes.Id_Materia=444;
        
        Sabado = new Materia();
        Sabado.Id_Materia=555;
        
        TamañoL = 1;
        TamañoM = 1;
        TamañoMi = 1;
        TamañoJ = 1;
        TamañoV = 1;
        TamañoS = 1;
    }
    
    public void agregarAlFinal(int valor, int d){
        Materia nuevo = new Materia();
        Materia aux = Lunes;
        switch(d)
        {
            case 1:
                aux = Lunes;
                while(aux.Siguiente != null){
                aux = aux.Siguiente;
                }
                TamañoL++;
                break;
            case 2:
                aux = Martes;
                while(aux.Siguiente != null){
                aux = aux.Siguiente;
                }
                TamañoM++;                
                break;
            case 3:
                aux = Miercoles;
                while(aux.Siguiente != null){
                aux = aux.Siguiente;
                }
                TamañoMi++;
                break;
            case 4:
                aux = Jueves;
                while(aux.Siguiente != null){
                aux = aux.Siguiente;
                }
                TamañoJ++;
                break;
            case 5:
                aux = Viernes;
                while(aux.Siguiente != null){
                aux = aux.Siguiente;
                }
                TamañoV++;
                break;
            case 6:
                aux = Sabado;
                while(aux.Siguiente != null){
                aux = aux.Siguiente;
                }
                TamañoS++;
                break;
            default:
                System.out.println("Error");
        }
        nuevo.Id_Materia=valor;
        aux.Siguiente = nuevo;
        
        }
    
    public void Imprimir()
    {
        Materia Aux = Lunes;
        while(Aux!=null)
        {
            if(Aux.Id_Materia!=0)
            {
                System.out.println(Aux.Id_Materia);
            }
            Aux = Aux.Siguiente;
        }
    }
    
}
