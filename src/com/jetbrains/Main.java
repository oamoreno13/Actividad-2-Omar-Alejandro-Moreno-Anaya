package com.jetbrains;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] calificaciones = new float[5];
        float suma_calificaciones=0,promedio_calificaciones=0;
        int total_calificaciones=0;


        Alumno nombreAlumno = new Alumno();

        nombreAlumno.nombreAlumno("Omar Alejandro Moreno Anaya");

        System.out.println("Digite calificaciones de alumno: "+ nombreAlumno.getNombre());
        for(int i=0;i<5;i++){
            System.out.print("Calificación "+(i+1)+": ");
            calificaciones[i] = entrada.nextFloat();

            if(calificaciones[i] > 0);{
                suma_calificaciones += calificaciones[i];
                total_calificaciones++;
            }
        }

        //metodo para sacar promedio

        if(suma_calificaciones <= 0){
            System.out.println("Error");
        }
        else {
            promedio_calificaciones = suma_calificaciones / total_calificaciones;
        }

        System.out.println("\nNombre del estudiante: "+ nombreAlumno.getNombre());
        for(float i:calificaciones) {
            System.out.println("Calificación: "+(i));
        }
        System.out.println("Promedio: "+promedio_calificaciones);

        //metodo para identificar calificación

        if (50 >= promedio_calificaciones) {
            System.out.println("Calificación final: F");
        }
        else if (60 >= promedio_calificaciones) {
            System.out.println("Calificación final: E");
        }
        else if (70 >= promedio_calificaciones) {
            System.out.println("Calificación final: D");
        }
        else if (80 >= promedio_calificaciones) {
            System.out.println("Calificación final: C");
        }
        else if (90 >= promedio_calificaciones) {
            System.out.println("Calificación final: B");
        }
        else if (100 >= promedio_calificaciones) {
            System.out.println("Calificación final: A");
        }

        /* metodo sin scanner
        int[] calificaciones = new int[5];

        calificaciones[0] = 85;
        calificaciones[1] = 98;
        calificaciones[2] = 70;
        calificaciones[3] = 75;
        calificaciones[4] = 100;

        System.out.println("Calificación 1: "+calificaciones[0]);
        System.out.println("Calificación 2: "+calificaciones[1]);
        System.out.println("Calificación 3: "+calificaciones[2]);
        System.out.println("Calificación 4: "+calificaciones[3]);
        System.out.println("Calificación 5: "+calificaciones[4]);
         */
    }

}
