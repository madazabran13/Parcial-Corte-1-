
import java.util.Scanner;
import org.omg.CORBA.UnionMemberHelper;


/**
 *
 * @author Miguel Andrés
 */
public class Restaurante {
    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        Mesero mesero1 = new Mesero();
        Boolean op = false;
        System.out.print("**Registro de Mesero**\n");
        
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("Mesero %d\n",i+1);
            System.out.print("Nombre: \n");
            String nombre = res.nextLine();
            System.out.print("Apellido: \n");
            String apellido = res.nextLine();
            System.out.print("Identificacion: \n");
            int documento = res.nextInt();
            System.out.print("Años de experiencia: \n");
            int aexperiencia = res.nextInt();

            mesero1.setNombre(nombre);
            mesero1.setApellido(apellido);
            mesero1.setDocumento(0);
            mesero1.setEdad(0);
            mesero1.setAexperiencia(aexperiencia);
            
            do{
                System.out.print("Edad: \n");
                int edad = res.nextInt();
                if(edad>=18 || aexperiencia>=3){
                    System.out.print("Mayor de edad\n\n");
                }else{
                        System.out.println("Para registrarse tiene que ser mayor de edad\n");
                }
                return false;
            }while(true);f
            
        }
    }
}
