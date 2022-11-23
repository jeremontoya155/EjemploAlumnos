
package org.proydesa.clases;


public class Mamiferos extends Animales{
    
    //Campos atributos
    private int cantidadHijos;

    public Mamiferos(int cantidadHijos, String especie, String nombre, String tipo, int edad) {
        super(especie, nombre, tipo, edad);
        this.cantidadHijos = cantidadHijos;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    
    //Metodos
    public void hibernar(){
    
        System.out.println("En este momento "+this.nombre+" se encuentra hibernando");
    }
    
    
    //Overrides
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Mamiferos{");
        sb.append("cantidadHijos=").append(cantidadHijos);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    

    @Override
    public void serAcuatico() {
        if (this.especie.equalsIgnoreCase("peces")) {
            
            System.out.println("Si podemos nadar");
            if (this.nombre.equalsIgnoreCase("ballena")) {
                System.out.println("Y soporta respiracion bastante bajo agua");
            }
            else{
                System.out.println("No soporta respiracion mucho bajo agua");
                }
            
            
        } else {
            
            System.out.println("No puede nadar");
        
        }
        
    }
    
    
    
}
