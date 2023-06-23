/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Oficina
 */
public class ServicioLavadora {

    Lavadora lavadora = new Lavadora();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLavadora() {

        lavadora.crearElectrodomestico();
        System.out.println("Cual es la capacidad de carga en kilos (0kg a 50gk):");
        int carga = leer.nextInt();
        lavadora.setCarga(carga);

    }

    public void precioFinal() {

        Double valorCarga = 0.00;
        if (lavadora.getCarga()<30){
            valorCarga = 500.00;
            
        }
        System.out.println("El valor final del lavarropa es de: $ " + (lavadora.precioFinal()+valorCarga));
        System.out.println("Carga: " + lavadora.getCarga() + "|Color:  " + lavadora.getColor().toUpperCase() + "|Consumo: " + lavadora.getConsumoEnergetico() + "|Peso: " + lavadora.getPeso() + "|Precio: " + lavadora.getPrecio());
    }

}
