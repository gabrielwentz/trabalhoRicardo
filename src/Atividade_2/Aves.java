package Atividade_2;

public class Aves extends Animal{

    private int qtdAsas;

    public int getQtdAsas() {
        return qtdAsas;
    }

    public void setQtdAsas(int corAsas) {
        this.qtdAsas = corAsas;
    }

    public void voar(){
        System.out.println("Sua ave está voando e possui este número de asas: " + getQtdAsas());


    }

}
