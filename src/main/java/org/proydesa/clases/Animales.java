
package org.proydesa.clases;


//public abstract class nombreClase
public abstract class Animales {
    
    //Campos o atributos
    protected  String especie;
    protected  String nombre;
    protected  String tipo;
    protected  int edad;

    //Constructor
    public Animales(String especie, String nombre, String tipo, int edad) {
        this.especie = especie;
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    //Getters y setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodos
    
    public abstract void serAcuatico();
    
    
    //Overrides
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animales{");
        sb.append("especie=").append(especie);
        sb.append(", nombre=").append(nombre);
        sb.append(", tipo=").append(tipo);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
}
