package org.proydesa.clases;


public class Oviparo extends Animales {
    
    //Campos
    private int mesesFertiles;

    //Constructor
    public Oviparo(int mesesFertiles, String especie, String nombre, String tipo, int edad) {
        super(especie, nombre, tipo, edad);
        this.mesesFertiles = mesesFertiles;
    }

    //Getters y setters
    public int getMesesFertiles() {
        return mesesFertiles;
    }

    public void setMesesFertiles(int mesesFertiles) {
        this.mesesFertiles = mesesFertiles;
    }

    
    
    
    
    
    
    //Overrides
    @Override
    public void serAcuatico() {
        
        if (this.especie.equalsIgnoreCase("peces") ||this.especie.equalsIgnoreCase("anfibios")) {
            
            System.out.println("Si es un ser acuatico");
            
            
        } else {
            
            System.out.println("No puede nadar");
        
        }
       
    }
    
    
    
}
