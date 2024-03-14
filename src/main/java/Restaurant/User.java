
package Restaurant;
import Values.UserTypes;

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
        
    }
    public void sell() {
        if(this.type != UserTypes.ADMINISTRATIVE){
            System.out.println("Usted no está autorizado para vender!!!");
        }
    }
}
