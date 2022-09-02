package program;

import entities.Dependente;
import entities.Funcionario;
import entities.Setor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Qual a quantidade de funcionários?");
        int qtdFuncionarios = sc.nextInt();
        sc.nextLine();

        SimpleDateFormat sdfFuncionario = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 1; i <= qtdFuncionarios; i++) {
            System.out.println("Funcionário n° " + i);

            System.out.print("Nome:");
            String nome = sc.nextLine();

            System.out.print("Data de Nascimento do funcionário:");
            Date dataNascimentoFunc = sdfFuncionario.parse(sc.nextLine());

            System.out.println("MATRÍCULA");
            System.out.println("Digite a matrícula do funcionário n° " + i);
            int matricula = sc.nextInt();
            sc.nextLine();

            System.out.println("SETOR: ");
            System.out.println("Digite o código do setor: ");
            int codSetor = sc.nextInt();
            sc.nextLine();

            System.out.println("Descrição do setor: ");
            String descSetor = sc.nextLine();


            System.out.println("O funcionário " + i + " têm dependentes s/n");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            List<Dependente> dependentes = new ArrayList<>();

            if (resp == 's') {

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("Quantos dependentes ele tem?");
                int qtdDependentes = sc.nextInt();
                sc.nextLine();

                for (int j = 1; j <= qtdDependentes; j++) {
                    System.out.println("Digite o nome do dependente n° " + j);
                    String nomeDependente = sc.nextLine();

                    System.out.println("Digite a data de nascimento do dependente n° " + j);
                    Date dataNascimentoDependente = sdf.parse(sc.nextLine());

                    Dependente dependente = new Dependente(nomeDependente, dataNascimentoDependente);

                    dependentes.add(dependente);

                }
            }

            System.out.println("====================================");

            Funcionario funcionario = new Funcionario(nome, matricula, new Setor(codSetor, descSetor),dataNascimentoFunc,  dependentes);

            funcionarios.add(funcionario);
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        System.out.println("Você gostaria de filtrar por setor? s/n");
        char respSetor = sc.nextLine().charAt(0);

        if (respSetor == 's') {
            System.out.println("Digite o código do setor, por favor.");
            int respCodSetor = sc.nextInt();

            final List<Funcionario> funcionariosFiltrados = funcionarios.stream().filter(funcionario -> funcionario.getSetor().getCodigo() == respCodSetor).collect(Collectors.toList());

            funcionariosFiltrados.forEach(System.out::println);
            System.out.println("Quantidades de funcionarios nesse setor: " + funcionariosFiltrados.size());

        }
        sc.close();

    }
}

