/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoherencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejecutora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Prestamo> prestamos = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese el tipo de préstamo que desea crear:");
            System.out.println("1. Préstamo Automóvil");
            System.out.println("2. Préstamo Educativo");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("Ingrese el nombre del beneficiario:");
                String nombreBeneficiario = scanner.nextLine();
                System.out.println("Ingrese el apellido del beneficiario:");
                String apellidoBeneficiario = scanner.nextLine();
                System.out.println("Ingrese el username del beneficiario:");
                String usernameBeneficiario = scanner.nextLine();
                Persona beneficiario = new Persona(nombreBeneficiario, apellidoBeneficiario, usernameBeneficiario);

                System.out.println("Ingrese el tiempo de préstamo en meses:");
                int tiempoPrestamoMeses = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese la ciudad del préstamo:");
                String ciudadPrestamo = scanner.nextLine();

                System.out.println("Ingrese el tipo de automóvil:");
                String tipoAutomovil = scanner.nextLine();

                System.out.println("Ingrese la marca del automóvil:");
                String marcaAutomovil = scanner.nextLine();

                System.out.println("Ingrese el nombre del garante1:");
                String nombreGarante1 = scanner.nextLine();
                System.out.println("Ingrese el apellido del garante1:");
                String apellidoGarante1 = scanner.nextLine();
                System.out.println("Ingrese el username del garante1:");
                String usernameGarante1 = scanner.nextLine();
                Persona garante1 = new Persona(nombreGarante1, apellidoGarante1, usernameGarante1);

                System.out.println("Ingrese el valor del automóvil:");
                double valorAutomovil = scanner.nextDouble();
                PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil(beneficiario, tiempoPrestamoMeses, ciudadPrestamo, tipoAutomovil, marcaAutomovil, garante1, valorAutomovil);
                prestamos.add(prestamoAutomovil);
            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre del beneficiario:");
                String nombreBeneficiario = scanner.nextLine();
                System.out.println("Ingrese el apellido del beneficiario:");
                String apellidoBeneficiario = scanner.nextLine();
                System.out.println("Ingrese el username del beneficiario:");
                String usernameBeneficiario = scanner.nextLine();
                Persona beneficiario = new Persona(nombreBeneficiario, apellidoBeneficiario, usernameBeneficiario);

                System.out.println("Ingrese el tiempo de préstamo en meses:");
                int tiempoPrestamoMeses = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese la ciudad del préstamo:");
                String ciudadPrestamo = scanner.nextLine();

                System.out.println("Ingrese el nivel de estudio:");
                String nivelEstudio = scanner.nextLine();

                System.out.println("Ingrese el nombre del centro educativo:");
                String nombreCentroEducativo = scanner.nextLine();
                System.out.println("Ingrese las siglas del centro educativo:");
                String siglasCentroEducativo = scanner.nextLine();
                InstitucionEducativa centroEducativo = new InstitucionEducativa(nombreCentroEducativo, siglasCentroEducativo);

                System.out.println("Ingrese el valor de la carrera:");
                double valorCarrera = scanner.nextDouble();

                PrestamoEducativo prestamoEducativo = new PrestamoEducativo(beneficiario, tiempoPrestamoMeses, ciudadPrestamo, nivelEstudio, centroEducativo, valorCarrera);
                prestamos.add(prestamoEducativo);
            } else if (opcion == 3) {
                break;
            }
        }

        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
    
}
