import Veiculos.Caminhao;
import Veiculos.Van;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Frota frota = new Frota(); // cria frota
        Scanner scanner = new Scanner(System.in); // inicia o scanner
        int opcao;

        // veiculos iniciais
        frota.registrarVeiculo(new Caminhao("ABC1234", 8000));
        frota.registrarVeiculo(new Van("XYZ5678", 1000));

        do {
            System.out.println("\n------- Menu -------");
            System.out.println("1. Adicionar veículo");
            System.out.println("2. Listar veículos");
            System.out.println("3. Remover veículo");
            System.out.println("4. Calcular custo total de viagem (100km)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // tira o \n bugado

            switch (opcao) {
                case 1: // adicionar veiculos
                    System.out.print("Digite o tipo de veículo (caminhao/van): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Digite a placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Digite a capacidade de carga: ");
                    double carga = scanner.nextDouble();
                    scanner.nextLine();// tira o \n bugado

                    if (tipo.equalsIgnoreCase("caminhao")) {
                        frota.registrarVeiculo(new Caminhao(placa, carga));
                    } else if (tipo.equalsIgnoreCase("van")) {
                        frota.registrarVeiculo(new Van(placa, carga));
                    } else {
                        System.out.println("Tipo de veículo inválido.");
                    }
                    break;

                case 2: // lista os veiculos
                    frota.exibirVeiculos();
                    break;

                case 3: // remove os veiculos
                    System.out.print("Digite a placa do veículo a remover: ");
                    String placaRemover = scanner.nextLine();
                    frota.removerVeiculo(placaRemover);
                    break;

                case 4: // calcula o custo total para a viagem de 100km
                    double custo = frota.calcularCustoTotalViagem(100);
                    System.out.printf("Custo total da viagem de 100km: R$ %.2f\n", custo);
                    break;

                case 0: // sai
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção errada, tente novamente.");
            }

        } while (opcao != 0);

        scanner.close(); // bgl pra fechar o scanner pq o vscode é bicha
    }
}
