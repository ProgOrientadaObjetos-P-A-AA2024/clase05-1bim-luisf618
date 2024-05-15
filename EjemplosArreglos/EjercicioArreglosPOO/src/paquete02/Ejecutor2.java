/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.LibretaCalificacion;

/**
 *
 * @author utpl
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        double[] notas = {10, 9, 8, 10};
        String nombreEstudiante = "Rene Elizalde";

        LibretaCalificacion libreta = new LibretaCalificacion(nombreEstudiante,
                notas);

        libreta.establecerPromedio();
        // Se llama al metodo establecerPromedio para poder dar valor a la
        // variable promedio, ya que no tiene valor hasta que sea llamado
        libreta.establecerPromedioCualitativo();
        // Se llama al metodo establecerPromedioCualitativo para poder ejecutar
        // lo que se encuentra dentro de el, porque mediante este se da valores
        // a la variable promedioCualitativo
        System.out.printf("\n%s\n", libreta);
    }

}
