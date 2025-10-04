package Conta;

public class Conta_investimento extends Conta {
    double taxa_administracao;

    public Conta_investimento(String numero, String titular, double saldo, double taxa_administracao) {
        super(numero, titular, saldo);
        this.taxa_administracao = taxa_administracao;
    }

    @Override
    public void mostrar_dados() {
        super.mostrar_dados();
        System.out.println("Taxa de administracao: " + this.taxa_administracao);
    }

    public void mostrar_dados_investimento(boolean considerar_taxa, double projecao_mensal) {
        if (!considerar_taxa) {
            super.mostrar_dados();
        } else {
            double projecao = projecao_mensal - this.taxa_administracao;
            super.mostrar_dados(projecao);
        }
    }

    public double getTaxa_administracao() {
        return taxa_administracao;
    }

    public void setTaxa_administracao(double taxa_administracao) {
        this.taxa_administracao = taxa_administracao;
    }
}