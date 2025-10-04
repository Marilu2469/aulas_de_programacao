package Veiculo;

public class Caminhao extends Veiculo {
    double capacidade;
    public Caminhao(String placa, String marca, double preco, double capacidade){
        super(placa, marca, preco);
        this.capacidade = capacidade;

    }
    @Override
    public void mostrar_dados(){
        super.mostrar_dados();
        System.out.println("A capacidade de carga em toneladas é: " + this.capacidade);

    }
    public void mostrar_dados_caminhao(){
        super.mostrar_dados();
        System.out.println("A capacidade de carga em toneladas é: " + this.capacidade);
    }
}