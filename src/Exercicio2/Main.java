package Exercicio2;

import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Funcionários");

        System.out.println("Funcionario 1");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Data de admissao (AAAA-MM-DD): ");
        LocalDate dataAdmissao1 = LocalDate.parse(scanner.nextLine());
        System.out.print("Salario: ");
        double salario1 = Double.parseDouble(scanner.nextLine());
        Funcionario funcionario1 = new Funcionario(nome1, dataAdmissao1, salario1);


        System.out.println("Funcionario 2");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Data de admissao (AAAA-MM-DD): ");
        LocalDate dataAdmissao2 = LocalDate.parse(scanner.nextLine());
        System.out.print("Salario: ");
        double salario2 = Double.parseDouble(scanner.nextLine());
        Funcionario funcionario2 = new Funcionario(nome2, dataAdmissao2, salario2);

        System.out.println("Funcionario 3");
        System.out.print("Nome: ");
        String nome3 = scanner.nextLine();
        System.out.print("Data de admissao (AAAA-MM-DD): ");
        LocalDate dataAdmissao3 = LocalDate.parse(scanner.nextLine());
        System.out.print("Salario: ");
        double salario3 = Double.parseDouble(scanner.nextLine());
        Funcionario funcionario3 = new Funcionario(nome3, dataAdmissao3, salario3);

        System.out.println();

        System.out.println("Funcionario 1 - ID: " + funcionario1.getIdentificador());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Data de admissao: " + funcionario1.getDataDaAdmissao());
        System.out.println("Salario: R$ " + funcionario1.getSalario());

        System.out.println();

        System.out.println("Funcionario 2 - ID: " + funcionario2.getIdentificador());
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Data de admissao: " + funcionario2.getDataDaAdmissao());
        System.out.println("Salario: R$ " + funcionario2.getSalario());

        System.out.println();

        System.out.println("Funcionario 3 - ID: " + funcionario3.getIdentificador());
        System.out.println("Nome: " + funcionario3.getNome());
        System.out.println("Data de admissao: " + funcionario3.getDataDaAdmissao());
        System.out.println("Salario: R$ " + funcionario3.getSalario());
    }
}