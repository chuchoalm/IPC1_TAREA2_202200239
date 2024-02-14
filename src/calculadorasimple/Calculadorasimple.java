/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasimple;

import java.util.Scanner;

/**
 *
 * @author chuch
 */
public class Calculadorasimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Basica");
        System.out.print("ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        System.out.print("ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0.0;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("error: no se puede dividir por cero");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida ingrese una operación válida (+, -, *, /).");
                return;
        }

        System.out.println("resultado: " + resultado);

        scanner.close();
    }
    }
    

