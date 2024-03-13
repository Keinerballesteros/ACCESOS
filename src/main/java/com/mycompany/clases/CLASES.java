

package com.mycompany.clases;
import External.PermisionClass2;

public class CLASES {

    public static void main(String[] args) {
        PermisionClass permission = new PermisionClass("Hola Mundo");
        System.out.println((permission.sayHello()));
        
        PermisionClass2 permission2 = new PermisionClass2("Estoy en otro paquete");
        System.out.println(permission2);
    }
}
