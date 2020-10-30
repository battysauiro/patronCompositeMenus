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
public class ElementoMenu extends ComponenteMenu{
    private String nombre;
    private String descripcion;
    private boolean vegetariano;
    private double precio;
    
    public ElementoMenu(String nombre,String descripcion,boolean vegetariano,double precio){
    
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.vegetariano=vegetariano;
        this.precio=precio;
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
    public double getPrecio(){
        return precio;
    }
    
    @Override
    public boolean isVegetariano(){
        return vegetariano;
    }
    
    @Override
    public void print(){
        System.out.print(" "+getNombre());
        if(isVegetariano()){
            System.out.print("(v)");
        }
        System.out.println(", "+getPrecio());
        System.out.println("    -- "+getDescripcion());
    }
    
    @Override
    public boolean esHijo(){
        return true;
    }
}
