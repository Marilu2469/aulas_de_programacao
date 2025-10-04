package Veiculo;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();
        while(true){
            try{
                System.out.println("Digite 1 para registrar um carro: ");
                System.out.println("Digite 2 para registrar uma moto: ");
                System.out.println("Digite 3 para registrar um caminhão: ");
                System.out.println("Digite 4 para sair!!!");

                int opcao = input.nextInt();
                input.nextLine();

                if(opcao == 4){
                    System.out.println("Programa encerrado!!!");
                    break;
                } else {
                    System.out.println("Digite o número da placa: ");
                    String placa = input.nextLine();
                    System.out.println("Digite a marca do veículo:");
                    String marca = input.nextLine();
                    System.out.println("Digite o preço do veículo: ");
                    double preco = input.nextDouble();

                    if (opcao == 1){
                        System.out.println("Digite o número de portas do veículo: ");
                        int num_portas = input.nextInt();
                        Carro carro = new Carro(placa, marca, preco, num_portas);
                        System.out.println("Carro registrado com sucesso!!!");
                        veiculos.add(carro);

                    } else if(opcao == 2){
                        System.out.println("Digite o número de cilindradas do veículo: ");
                        int num_cil = input.nextInt();
                        Moto moto = new Moto(placa, marca, preco, num_cil);
                        System.out.println("Moto registrada com sucesso!!!");
                        veiculos.add(moto);

                    } else if(opcao == 3){
                        System.out.println("Digite a capacidade de carga em toneladas: ");
                        double cap = input.nextDouble();
                        Caminhao caminhao = new Caminhao(placa, marca, preco, cap);
                        System.out.println("Caminhão registrado com sucesso!!!");
                        veiculos.add(caminhao);

                    } else {
                        System.out.println("Essa é uma opção inválida!!!");
                    }
                }

            }catch(InputMismatchException e){
                System.out.println("Digite um número!!!");
                input.nextLine();
            }
        }

        System.out.println("Deseja ver a lista de veículos registrados?");
        System.out.println("Digite \"s\" para sim e qualquer outra coisa para não.");
        String sim = input.nextLine();

        if (sim.equalsIgnoreCase("s")) {
            System.out.println("Lista de veículos registrados");
            for (Veiculo veiculo : veiculos) {
                try {
                    if (veiculo instanceof Carro) {
                        System.out.println("Digite 1 para sim, e qualquer outra coisa pra não.");
                        System.out.println("Deseja ver o numero de portas?");
                        int desconto = input.nextInt();
                        input.nextLine();

                        if (desconto == 1) {
                            ((Carro) veiculo).mostrar_dados_carro();
                        }

                    } else if (veiculo instanceof Moto) {
                        System.out.println("Digite 1 para sim, e qualquer outra coisa pra não.");
                        System.out.println("Deseja ver o numero de cilindradas?");
                        int desconto = input.nextInt();
                        input.nextLine();

                        if (desconto == 1) {
                            ((Moto) veiculo).mostrar_dados_moto();
                        }

                    } else if (veiculo instanceof Caminhao) {
                        System.out.println("Digite 1 para sim, e qualquer outra coisa pra não.");
                        System.out.println("Deseja ver a capacidade?");
                        int desconto = input.nextInt();
                        input.nextLine();

                        if (desconto == 1) {
                            ((Caminhao) veiculo).mostrar_dados_caminhao();
                        }
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Digite um número!!!");
                    input.nextLine();
                }
            }
        }
            System.out.println("Obrigado por utilizar o nosso programa!!!");
        input.close();
    }
}