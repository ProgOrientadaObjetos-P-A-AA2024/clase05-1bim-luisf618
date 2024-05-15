/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import paquete01.LibretaCalificacion;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        double[] calificacionesEstudiante = {10, 9, 8, 10};
        String nombreEstudiante = "Rene Elizalde";

        LibretaCalificacion libreta = new LibretaCalificacion(nombreEstudiante,
                calificacionesEstudiante);

        libreta.establecerPromedio();
        libreta.establecerPromedioCualitativo();
        System.out.printf("\n%s\n", libreta);
    }
}
