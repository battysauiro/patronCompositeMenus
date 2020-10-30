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
public abstract class ComponenteMenu {
    
    public void add(ComponenteMenu menucomponente){
        throw new UnsupportedOperationException();
    }
    public void remove(ComponenteMenu menucomponente){
        throw new UnsupportedOperationException();
    }
    
    public ComponenteMenu getHijo(int i){
        throw new UnsupportedOperationException();
    }
    
    public String getNombre(){
        throw new UnsupportedOperationException();
    }
    
    public String getDescripcion(){
        throw new UnsupportedOperationException();
    }
 
    public double getPrecio(){
        throw new UnsupportedOperationException();
    }
    public boolean esHijo(){
        throw new UnsupportedOperationException();
    }
    
    public void print(){
        throw new UnsupportedOperationException();
    }
    
    public boolean isVegetariano(){
        throw new UnsupportedOperationException();
    }
    
    public double costoTotal(){
        throw new UnsupportedOperationException();
    }
}
