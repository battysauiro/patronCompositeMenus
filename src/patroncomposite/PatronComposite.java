/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncomposite;

/**
 *
 * @author Oscar
 */
public class PatronComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComponenteMenu menuCasa=new Menu("Menu de la casa","desayuno");
        ComponenteMenu menuComida=new Menu("Menu de comida","comida");
        ComponenteMenu cenaMenu=new Menu("Menu de cafe","cena");
        ComponenteMenu menuPostre=new Menu("Menu de postres","postres");
        ComponenteMenu cafeMenu=new Menu("Menu cade","pan con cafe");
        ComponenteMenu todosLosMenus=new Menu("Todos los menus","todos los menus combinados");
        todosLosMenus.add(menuCasa);
        todosLosMenus.add(menuComida);
        todosLosMenus.add(cenaMenu);
        todosLosMenus.print();
        menuCasa.add(new ElementoMenu("Desayuno de la casa", "jugo, ensalada", true, 25.0));
        menuCasa.add(new ElementoMenu("Desayuno Regular", "Bisteck frito/asado, frijoles", false, 35.0));
        menuCasa.add(new ElementoMenu("Quesadillas", "Quesadillas con salsa y lechuga", true, 20.0));
        menuComida.add(new ElementoMenu("Vegetariano", "tamales de elote con flor de calabaza", true, 26.0));
        menuComida.add(new ElementoMenu("Carne asada", "Carne asada con papas", false, 35.0));
        menuComida.add(new ElementoMenu("Sopa del dia", "Sopa del dia servida con pollo", false, 10.0));
        menuPostre.add(new ElementoMenu("Pastel de manzana","Pastel de manzana cubierto de crema", true, 15.0));
        
        Mesero mesero=new Mesero(todosLosMenus);
        mesero.printMenu();
        
        
        
    }
    
}
