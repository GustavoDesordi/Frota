import Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos; // lista q armazena objs q herdam de Veiculo

    public Frota(){
        this.veiculos = new ArrayList<>(); // inicializa a lista
    }

    public void registrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo); // add veiculos na lista
        System.out.println("Veículo registrado com sucesso!");
    }

    public void exibirVeiculos(){
        if(veiculos.isEmpty()){ // verifica se a lista ta vazia
            System.out.println("--- | Não há veículos registrados | ---");
        }
        System.out.println("| Veículos cadastrados: |");
        for(Veiculo v : veiculos){ // se tiver veiculos ele os imprime
            System.out.println(v);
        }
    }

    public double calcularCustoTotalViagem(double distancia) {
        double total = 0;
        for (Veiculo v : veiculos) {
            total += v.calcularCustoViagem(distancia); // soma os custos de cada veiculo
        }
        return total;
    }

    public boolean removerVeiculo(String placa) {
        Iterator<Veiculo> it = veiculos.iterator(); // iteração segura
        while (it.hasNext()) {
            Veiculo v = it.next();
            if (v.getPlaca().equalsIgnoreCase(placa)) { // compara as placas ignorando letra maiusc e minusc
                it.remove(); // remove da lista
                System.out.println("Veículo removido.");
                return true;
            }
        }
        System.out.println("Placa não encontrada.");
        return false;
    }
}
