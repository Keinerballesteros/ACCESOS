
package Restaurant;
import Values.UserTypes;
import foods.DishTypes;
import java.util.Scanner;
import Restaurant.Dish;
public class User {
    private UserTypes type;
    String id;
    String name;

    public User(UserTypes type, String id, String name) {
        this.type = type;
        this.id = id;
        this.name = name;
    }
    
    
    
    public void buy(){
        Scanner read = new Scanner (System.in);
        System.out.println("Que tipo de comida quiere comprar:");
        String dish = read.nextLine();
        if(dish == DishTypes.BREAKFAST)){
            
        }
    }
    public void sell() {
        
        if(this.type != UserTypes.ADMINISTRATIVE){
            System.out.println("Usted no está autorizado para vender!!!");
        }
        else {
           
        }
    }
    }


