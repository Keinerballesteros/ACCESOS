
package Restaurant;

import Values.DishVariation;
import foods.DishTypes;
public class Dish {
    DishTypes type;
    int stock;
    String menu;
    int price; 
    DishVariation variation;

    public Dish(DishTypes type,int stock, String menu, int price, DishVariation variation){
        this.type = type;
        this.stock = stock;
        this.menu = menu;
        this.price = price;
        this.variation = variation;
    }
    
    }
            

            

