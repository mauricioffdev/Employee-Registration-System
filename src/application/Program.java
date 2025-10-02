package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors; // Import necessário para o método hasId

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        // O Scanner para a leitura de 'N' não deve ser fechado aqui.
        int N = sc.nextInt();

        // 1. Início do Loop de Registro de Funcionários
        for (int i = 0; i < N; i++) {

            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");

            // Leitura e Validação do ID
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            // A leitura 'sc.nextLine()' é necessária após 'sc.nextInt()' para consumir a quebra de linha pendente.
            sc.nextLine(); // Consome a quebra de linha pendente.

            // Loop para garantir que o ID não está repetido
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
                sc.nextLine(); // Consome a quebra de linha após a nova leitura do ID
            }

            // Leitura do Nome
            System.out.print("Name: ");
            String name = sc.nextLine(); // Usamos nextLine() pois sc.nextLine() foi usado após a leitura do ID.

            // Leitura do Salário
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            // Criação e adição do objeto Employee
            Employee emp = new Employee(id, name, salary); // Assumindo que o construtor é (id, name, salary)
            list.add(emp);
        } // FIM do Loop de Registro de Funcionários

        // 2. PARTE 2 - ATUALIZAÇÃO DO SALÁRIO:

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt(); // Use um nome de variável diferente para evitar conflito de escopo.

        // Busca do funcionário com Stream
        // Usa o 'idSalary' lido acima.
        Employee empSalary = list.stream()
                .filter(x -> x.getId() == idSalary)
                .findFirst()
                .orElse(null);

        if (empSalary == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            empSalary.increaseSalary(percentage);
        }

        // 3. PARTE 3 - LISTAGEM DE FUNCIONÁRIOS:

        System.out.println();
        System.out.println("List of employees:");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        sc.close(); // Fecha o Scanner ao final do programa.
    } // FIM do main

    // Método auxiliar para verificar se o ID já existe
    public static boolean hasId(List<Employee> list, int id) {
        // Encontra o primeiro funcionário com o ID fornecido.
        Employee emp = list.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
        return emp != null;
    }

    // NOTA: Certifique-se de que a classe 'Employee' tem um construtor com a ordem correta
    // e o método 'increaseSalary(double percentage)'.
}