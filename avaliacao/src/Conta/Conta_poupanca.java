package Conta;

public class Conta_poupanca extends Conta {
    private double taxa_rendimento;

    public Conta_poupanca(String numero, String titular, double saldo, double taxa_rendimento) {
        super(numero, titular, saldo);
        this.taxa_rendimento = taxa_rendimento;
    }

    @Override
    public void mostrar_dados(){
        super.mostrar_dados();
        System.out.println("A taxa mensal de rendimento da conta é: " + this.taxa_rendimento);
    }

    public void mostrar_dados_poupanca(boolean taxa_anual){
        super.mostrar_dados();

        if(taxa_anual){
            System.out.println("A taxa anual de rendimento da conta é: " + this.taxa_rendimento*12);
        } else {
            System.out.println("A taxa mensal de rendimento da conta é: " + this.taxa_rendimento);
        }
    }

    public double getTaxa_rendimento() {
        return taxa_rendimento;
    }

    public void setTaxa_rendimento(double taxa_rendimento) {
        this.taxa_rendimento = taxa_rendimento;
    }
}