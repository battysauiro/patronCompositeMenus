/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncomposite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Oscar
 */
public class Menu extends ComponenteMenu{
    ArrayList<ComponenteMenu>menuComponentes=new ArrayList();
    private String nombre;
    private String descripcion;
    
    
   public Menu(String nombre,String descripcion){
       this.nombre=nombre;
       this.descripcion=descripcion;
   }
   
    @Override
    public void add(ComponenteMenu menucomponente){
        menuComponentes.add(menucomponente);
    }
    @Override
    public void remove(ComponenteMenu menucomponente){
        menuComponentes.remove(menucomponente);
    }
    @Override
    public ComponenteMenu getHijo(int i){
        return (ComponenteMenu)menuComponentes.get(i);
    }
    @Override
    public String getNombre(){
        return nombre;
    }
    @Override
    public String getDescripcion(){
        return descripcion;
    }
    
    
    @Override
    public boolean esHijo(){
        return false;
    }
    
    @Override
    public void print(){
        System.out.println("\n"+getNombre());
        System.out.println(", "+getDescripcion());
        System.out.println("----------------------------");
        Iterator iterator =menuComponentes.iterator();
        while(iterator.hasNext()){
            ComponenteMenu menuComponentes=(ComponenteMenu)iterator.next();
            menuComponentes.print();
        }
    }
}
