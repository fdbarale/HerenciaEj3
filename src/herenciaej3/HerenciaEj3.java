/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaej3;
import entidades.Electrodomesticos;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioLavadora;
import servicios.ServicioTelevisor;
/**
 *
 * @author Oficina
 */
public class HerenciaEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomesticos> electro = new ArrayList();
       String menu = "";
       String selEle = "";
       Double totalTv = 0.00;
       Double totalLava = 0.00;
       
       do { 
       System.out.println("Que electrodomestico desea comprar (TV o Lavadora?)");
       
       if (selEle.equalsIgnoreCase("tv")){
       System.out.println("Va comprar un televisor: ");
       ServicioTelevisor televisor = new ServicioTelevisor();
       electro.add(televisor.crearTelevisor());
       totalTv = totalTv + televisor.precioFinal();
       
       }else{
        System.out.println("Va comprar una lavadora: ");
        ServicioLavadora lavadora = new ServicioLavadora();
       electro.add(lavadora.crearLavadora());
       totalLava = totalLava + lavadora.precioFinal();
       
       }
       
           System.out.println("Desea salir de la carga? (si/no)");
       menu = leer.next();
       }while (menu.equalsIgnoreCase("si"));
       
       
       /*System.out.println("Va comprar una lavadora: ");
        ServicioLavadora lavadora = new ServicioLavadora();
       lavadora.crearLavadora();
       lavadora.precioFinal();
        System.out.println("Va comprar un televisor: ");
       ServicioTelevisor televisor = new ServicioTelevisor();
       televisor.crearTelevisor();
       televisor.precioFinal();
       */
       
    }
    
}
