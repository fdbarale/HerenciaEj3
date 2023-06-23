/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaej3;
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
        System.out.println("Va comprar una lavadora: ");
        ServicioLavadora lavadora = new ServicioLavadora();
       lavadora.crearLavadora();
       lavadora.precioFinal();
        System.out.println("Va comprar un televisor: ");
       ServicioTelevisor televisor = new ServicioTelevisor();
       televisor.crearTelevisor();
       televisor.precioFinal();
    }
    
}
