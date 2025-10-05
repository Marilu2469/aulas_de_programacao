package Conta;
import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Conta> contas = new ArrayList<>();

        while (true) {
            try{
                System.out.println("Digite 1 para criar uma conta corrente");
                System.out.println("Digite 2 para criar uma conta poupança");
                System.out.println("Digite 3 para criar uma conta investimento");
                System.out.println("Digite 0 para sair!!!");
                int opcao = input.nextInt();
                input.nextLine();

                if (opcao == 0) {
                    System.out.println("Obrigado por utilizar o nosso programa🥰!!!");
                    break;
                } else {
                    System.out.println("Digite o número da conta");
                    String numero = input.nextLine();
                    System.out.println("Digite o nome do titular da conta");
                    String titular = input.nextLine();
                    System.out.println("Digite o saldo da conta");
                    double saldo = input.nextDouble();
                    input.nextLine();

                    if(opcao==1){
                        System.out.println("Digite o limite de cheque da conta: ");
                        double limite_cheque = input.nextDouble();
                        input.nextLine();

                        Conta_corrente conta_corrente = new Conta_corrente(numero, titular, saldo, limite_cheque);
                        System.out.println("Conta registada com sucesso!!!");
                        contas.add(conta_corrente);
                    } else if(opcao==2){
                        System.out.println("Digite a taxa de rendimento da conta: ");
                        double taxa_rendimento = input.nextDouble();
                        input.nextLine();

                        Conta_poupanca conta_poupanca = new Conta_poupanca(numero, titular, saldo, taxa_rendimento);
                        System.out.println("Conta registada com sucesso!!!");
                        contas.add(conta_poupanca);
                    } else if(opcao==3){
                        System.out.println("Digite a taxa de administração da conta: ");
                        double taxa_administracao = input.nextDouble();
                        input.nextLine();

                        Conta_investimento conta_investimento = new Conta_investimento(numero, titular, saldo, taxa_administracao);
                        System.out.println("Conta registada com sucesso!!!");
                        contas.add(conta_investimento);
                    } else {
                        System.out.println("Escolha uma opção válida!!!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número!!!");
                input.nextLine();
            }
        }

        System.out.println("Deseja ver todas as contas registradas? ");
        System.out.println("Digite 1 para sim, e qualquer outra coisa para não");
        int opcao = input.nextInt();
        input.nextLine();

        if (opcao==1) {
            System.out.println("Deseja ver a forma simples ou detalhada?");
            System.out.println("Digite 1 para sim, e qualquer outra coisa para não");
            opcao = input.nextInt();
            input.nextLine();

            if (opcao==1) {
                for (Conta conta : contas) {
                    if (conta instanceof Conta_corrente) {
                        ((Conta_corrente) conta).mostrar_dados_corrente(true);
                    }
                    else if (conta instanceof Conta_poupanca) {
                        ((Conta_poupanca) conta).mostrar_dados_poupanca(true);
                    }
                    else if (conta instanceof Conta_investimento) {
                        System.out.println("Digite a projeção mensal em percentual: ");
                        double projecao_mensal = input.nextDouble();
                        input.nextLine();

                        ((Conta_investimento) conta).mostrar_dados_investimento(true, projecao_mensal);
                    }
                    System.out.println("\n");
                }
            } else {
                for (Conta conta : contas) {
                    conta.mostrar_dados();
                    System.out.println("\n");
                }
            }
        }
        input.close();

        System.out.println("Programa finalizado com sucesso!!!");
    }
}





