package patroncomposite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Mesero {
    ComponenteMenu todosLosMenus;
    
    public Mesero(ComponenteMenu todosLosMenus){
        this.todosLosMenus=todosLosMenus;
    }
    
    public void printMenu(){
        todosLosMenus.print();
    }
}
