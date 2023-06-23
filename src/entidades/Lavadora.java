/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Oficina
 */
public class Lavadora extends Electrodomesticos {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void comprobarConsumoEnergetico(char letra) {

        System.out.println("Que consumo energetico desea?");
        letra = leer.next().charAt(0);

        if (String.valueOf(letra).equalsIgnoreCase("a") || String.valueOf(letra).equalsIgnoreCase("b") || String.valueOf(letra).equalsIgnoreCase("c") || String.valueOf(letra).equalsIgnoreCase("d") || String.valueOf(letra).equalsIgnoreCase("e") || String.valueOf(letra).equalsIgnoreCase("f")) {
            this.setConsumoEnergetico(letra);
        } else {
            letra = "f".charAt(0);
            this.setConsumoEnergetico(letra);
        }
    }

    @Override
    public void comprobarColor(String color) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Que color desea?");
        color = leer.next();

        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.setColor(color);
        } else {
            color = "blanco";
            this.setColor(color);
        }
    }

    @Override
    public void crearElectrodomestico() {
        this.setPrecio(1000.00);
        this.comprobarColor(color);
        this.comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("Ingrese el peso de la lavadora (0kg a 80kg):");
        int peso = leer.nextInt();
        this.setPeso(peso);

    }

    @Override
    public double precioFinal() {
        Double valorEner = 0.00;
        switch (String.valueOf(this.consumoEnergetico).toLowerCase()) {
            case "a":
                valorEner = 1000.00;
                break;
            case "b":
                valorEner = 800.00;
                break;
            case "c":
                valorEner = 600.00;
                break;
            case "d":
                valorEner = 500.00;
                break;
            case "e":
                valorEner = 300.00;
                break;
            case "f":
                valorEner = 100.00;
                break;
        }
        Double valorPeso = 0.00;
        if (this.peso < 19) {
            valorPeso = 100.00;
        } else {
            if (this.peso < 49) {
                valorPeso = 500.00;
            } else {
                if (this.peso < 79) {
                    valorPeso = 800.00;
                } else {
                    valorPeso = 1000.00;
                }
            }
        }
        return valorPeso + valorEner + this.getPrecio();
    }
    

}
