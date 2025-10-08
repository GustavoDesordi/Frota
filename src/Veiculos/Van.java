package Veiculos;

public class Van extends Veiculo{
    
    public Van(String placa, double capacidadeCarga){
        super(placa, capacidadeCarga);
    }

    @Override
    public double calcularCustoViagem(double distancia){
        return (distancia*2)+50;
    }

    @Override
    public String toString() {
        return "Van - " + super.toString();
    }
}
