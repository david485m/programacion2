/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar contraseña: ");
        String contrasena1 = scanner.nextLine();
        System.out.print("Confirmación de contraseña: ");
        String contrasena2 = scanner.nextLine();

        try {
            Contrasena.validarContrasena(contrasena1, contrasena2);
            System.out.println("¡Contraseña válida!");
        } catch (IllegalArgumentException e) {
            System.out.println("ErroRr: " + e.getMessage());
        }
    }
}
