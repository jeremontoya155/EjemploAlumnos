
package org.proydesa.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.proydesa.clases.Animales;
import org.proydesa.clases.Mamiferos;
import org.proydesa.clases.Oviparo;


public class App {

    public static void main(String[] args) {
        
        app();
    }
    
    
    public static void app(){
        
       List<Animales> zoo=generarInicial();
        
       menu(zoo);
        
    }
    
    
    
    //Generar la carga de la lista previa 
    public static List<Animales> generarInicial(){
    
         Oviparo a1=new Oviparo(3,"Anfibios","Dragon de comodo","Ovipario",12);
        Oviparo a2=new Oviparo(4,"Anfibios","Sapo","Ovipario",10);
        Oviparo a3=new Oviparo(5,"Peces","Dorado","Ovipario",10);
        Oviparo a4=new Oviparo(6,"Ave","Gallo","Ovipario",8);
    
        Mamiferos a5=new Mamiferos(3,"Felino","Leon","Mamifero",7);
        Mamiferos a6=new Mamiferos(4,"Felino","Tigre","Mamifero",10);
        Mamiferos a7=new Mamiferos(8,"Peces","Ballena","Mamifero",2);
        Mamiferos a8=new Mamiferos(9,"Felino","Puma","Mamifero",9);
        
        List<Animales>  animalesZoo=new ArrayList<>();
        animalesZoo.add(a1);
        animalesZoo.add(a2);
        animalesZoo.add(a3);
        animalesZoo.add(a4);
        animalesZoo.add(a5);
        animalesZoo.add(a6);
        animalesZoo.add(a7);
        animalesZoo.add(a8);
        
        return animalesZoo;
        }
    //Creacion de la carga de numeros
    public static int cargarNumero(String texto){
        
        Scanner sn=new Scanner(System.in);
        System.out.println(texto);
        int retorno=sn.nextInt();
        return retorno;
    }
    
    //Creacion de la carga de texto
    public static String cargarTexto(String texto){
        
        Scanner sn=new Scanner(System.in);
        System.out.println(texto);
        String retorno=sn.nextLine();
        return retorno;
    }
    //Creacion de la carga de mamiferos
    public static Mamiferos cargarMamifero(){
        
        int edad=cargarNumero("Ingrese la edad del animal");
        String especie=cargarTexto("Ingrese el grupo de descendencia del animal");
        String nombre=cargarTexto("Ingrese a que animal se quiere referir");
        String tipo=cargarTexto("Ingrese el tipo de animal(Oviparo o Mamiferos)");
        int cantidadHijos=cargarNumero("Ingrese la cantidad de hijos que peude tener el animal");
        
        Mamiferos m1=new Mamiferos(edad,especie,nombre,tipo,cantidadHijos);
        
        return m1;
    }
    //Creacion de la carga de oviparo
    public static Oviparo cargarOviparo(){
        
        int edad=cargarNumero("Ingrese la edad del animal");
        String especie=cargarTexto("Ingrese el grupo de descendencia del animal");
        String nombre=cargarTexto("Ingrese a que animal se quiere referir");
        String tipo=cargarTexto("Ingrese el tipo de animal(Oviparo o Mamiferos)");
        int cantidadMesesFertiles=cargarNumero("Ingrese la cantidad de hijos que peude tener el animal");
        
        Oviparo o1=new Oviparo(edad,especie,nombre,tipo,cantidadMesesFertiles);
        
        return o1;
    }
    
    //Texto principal para el menu
    public static String textoMenu(){
        
        String texto="""
                                MENU DE OPCIONES ZOO CORDOBA
                     ----------------------------------------------------------
                                1)Cargar  mas animales
                                2)Mostrar todos los animales
                                3)Mostrar solo los de un tipo ingresado 
                                4)Mostrar solo los de una especie ingresada 
                                5)Salir 
                     ---------------------------------------------------------
                     """;
    
        return texto;
    }
    
    
    public static void menu(List<Animales> lista){
        int opcion=cargarNumero(textoMenu());
        boolean ban=true;
        while(ban){
            switch (opcion) {
                case 1:
                    opcionUno(lista);
                    break;
                    case 2:
                    opcionDos(lista);
                    break;
                    case 3:
                    opcionTres(lista);
                        
                    break;
                    case 4:
                        System.out.println("Opcion 4");
                    //opcionCuatro()
                    break;
                    case 5:
                        System.out.println("Opcion 5");
                        ban=false;
                        System.out.println("Gracias por usar el programa");
                        
                        
                    break;
                default:
                    System.out.println("Ingreso una opcion erronea");
            }
            if (opcion!=5) {
                
                opcion=cargarNumero(textoMenu());
                
            }
        }
    
    }
    
    //cargar animales a lista
    public static void opcionUno(List<Animales> lista){
    
        String tipo=cargarTexto("Que tipo quiere ingresar mamiferos o oviparos");
        
        if (tipo.equalsIgnoreCase("mamiferos")) {
            Mamiferos m1=cargarMamifero();
            lista.add(m1);
            System.out.println("Se cargo un mamifero");
        } 
        else if(tipo.equalsIgnoreCase("Oviparos")){
            Oviparo o1=cargarOviparo();
            lista.add(o1);
            System.out.println("Se cargo un oviparo");
                   
            
        }
        else {
        
            System.out.println("No se ingreso correctamente el tipo de animal ");
        }
        
        
        
        
    }
    
    public static void opcionDos(List<Animales> lista){
        
        for (Animales a : lista) {
            System.out.println("**********************************");
            System.out.println(a.toString());
        }
    }   
    
    public static void opcionTres(List<Animales> lista){
    
        String tipo=cargarTexto("Ingrese el tipo de animal(Oviparo  o Mamifero)");
        
        for (Animales a : lista) {
            
            if (a.getTipo().equalsIgnoreCase(tipo)) {
                System.out.println(a.toString());
            }
            
            
        }
        
        System.out.println("Finalizamos la muestra del tipo ingresado");
        
    }
}


/*
        Tarea->Completar el punto 4
        Mejorar la estetica 
        Agregar un ciclo while


*/