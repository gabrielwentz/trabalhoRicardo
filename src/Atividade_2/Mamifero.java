package Atividade_2;

public class Mamifero extends Animal {

    private int qtdFilhos;

    public int getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }

    public void gerarFilho(){
        System.out.println("Seu mamífero está tendo um novo filho. ");
    }

}
