
package Restaurant;

import Restaurant.Dish;
import Values.UserTypes;
import java.util.Scanner;
public class Restaurante {
   
    public static void main(String []args){
        User student = new User(UserTypes.STUDENT,"192197","Keiner");
//        student.sell();
        Scanner read = new Scanner (System.in);
        System.out.println("Que acción va a realizar, ingrese un número: ");
        System.out.println("1. Comprar   2.Vender    3.Salir" );
        int action = read.nextInt();
        if(action == 1){
            student.buy();
        }
        if(action == 2){
            student.sell();
        }
        if(action == 3){
            
        }
    }
}
