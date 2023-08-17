
package ev_uni02;
import java.util.Scanner; //importamos scanner para solicitar input del usuario

public class EV_UNI02 { 

    public static void main(String[] args) { //Main es como el body del HTML
       Scanner scanner = new Scanner(System.in); // Usado para leer la entrada del usuario. Cuando le pegue al scanner, irá a buscar la librería del Scaner (may)
        System.out.print("Ingrese la cantidad de alumnos: "); //Output mostrado al usuario
        int n = scanner.nextInt(); //Aquí se configura la variable "n" del tipo interger, almacenando lo que escriba el usuario, como int (seteado como un numero entero). Esto podría evitar un escenario como el 2+2 es igual a 22 xD.
        
        for (int i = 1; i <= n; i++) { //Bucle for que iniciar en 1, n veces, dependiendo de la cantidad de alumnos que ingresaran datos
            
            System.out.println("Notas del Alumno " + i); //Output con información n° del alumno
            
            System.out.print("Ingrese la primera nota: ");//Mensaje para solicitar primera nota
            double nota1 = scanner.nextDouble(); //Almacena en una variable de tipo double la nota en decimales
            
            System.out.print("Ingrese la segunda nota: ");//Mensaje para solicitar segunda nota
            double nota2 = scanner.nextDouble();//Almacena en una variable de tipo double la nota en decimales
            
            // Calculamos la nota que ya tiene acumulada
            double notaFinal = nota1 * 0.3 + nota2 * 0.3; //Se almacena en una variable de tipo double la suma de las 2 notas que promedian el 60%
            // Calculamos la nota que necesita en la última prueba
            double notaNecesaria = (4 - notaFinal) / 0.4;//Se almacena en una variable de tipo double el valor de la nota que pondera un 40%
            
            System.out.println("Para aprobar necesitas obtener la siguiente nota: " + notaNecesaria);//Mensaje al usuario informando la nota que necesita para aprobar, mínimo 4.0, concatenando la variable "notaNecesaria"
        }
        
        scanner.close();           
    }
}
