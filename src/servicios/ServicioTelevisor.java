/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Oficina
 */
public class ServicioTelevisor {
        Televisor televisor = new Televisor();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearTelevisor() {

        televisor.crearElectrodomestico();
        System.out.println("Cual es el tamaño en pulgadas?");
        int pulgadas = leer.nextInt();
        televisor.setResolucion(pulgadas);
        System.out.println("Tiene TDA (Si/No)?");
        String tdatiene = leer.next();
        if (tdatiene.equalsIgnoreCase("si")){
            televisor.setTda(Boolean.TRUE);
        }else{
            televisor.setTda(Boolean.FALSE);
        }
        

    }

    public void precioFinal() {

        Double valorResolucion = 0.00;
        if (televisor.getResolucion()<40){
            valorResolucion = televisor.getPrecio()*1.30;
        }
        Double valorTda = 0.00; 
        if (televisor.getTda()){
            valorTda = 500.00;
        }
        System.out.println("El valor final del lavarropa es de: $ " + (televisor.precioFinal()+valorTda+valorResolucion));
        System.out.println("TDA: " + televisor.getTda()+ "|Color:  " + televisor.getColor().toUpperCase() + "|Consumo: " + televisor.getConsumoEnergetico() + "|Peso: " + televisor.getPeso() + "|Precio: " + televisor.getPrecio() + "|Pulgadas: " + televisor.getResolucion());
    }

}
