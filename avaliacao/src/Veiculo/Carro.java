package Veiculo;

public class Carro extends Veiculo {
    private int num_portas;
    public Carro(String placa, String marca, double preco, int num_portas) {
        super(placa,marca,preco);
        this.num_portas = num_portas;

    }

    @Override
    public void mostrar_dados(){
        super.mostrar_dados();
        System.out.println("O número de portas do veículo é: "+this.num_portas);

    }
    public void mostrar_dados_carro(){
        super.mostrar_dados();
        System.out.println("O número de portas do veículo é: "+this.num_portas);
    }
}
