package Atividade_2;

public class Aves extends Animal{

    private String corAsas;

    public String getCorAsas() {
        return corAsas;
    }

    public void setCorAsas(String corAsas) {
        this.corAsas = corAsas;
    }

    public void voar(){
        System.out.println("Sua ave está voando.");
    }

}
