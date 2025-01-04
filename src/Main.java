import ConversorDeMoeda.ConversorDeMoeda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoeda conversor = new ConversorDeMoeda();

        System.out.println("""
        *************************************************
        No momento, dispomos destas moedas abaixo para troca:
        1. BRL - Real brasileiro
        2. USD - Dólar americano
        3. ARS - Peso argentino         
        4. CLP - Peso chileno
        5. PEN - Novo sol peruano
        6. COP - Peso colombiano
        0. Sair  
        *************************************************
        Digite a moeda de origem (ex: USD): """);
        String origem = scanner.nextLine().toUpperCase();

        // Verifica se o usuário escolheu "0" para sair
        if (origem.equals("0")) {
            System.out.println("Programa encerrado. Obrigado por usar o Conversor de Moedas!");
            scanner.close();
            return; // Encerra o programa
        }

        System.out.println("Digite a moeda de destino (ex: EUR): ");
        String para = scanner.nextLine().toUpperCase();

        System.out.println("Digite o valor a converter: ");
        double quantidade = scanner.nextDouble();

        try {
            double result = conversor.converter(origem, para, quantidade);
            System.out.printf("%.2f %s equivale a %.2f %s%n", quantidade, origem, result, para);
            System.out.println("*".repeat(30));
            System.out.println("$ Obrigado pela preferência! $");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
