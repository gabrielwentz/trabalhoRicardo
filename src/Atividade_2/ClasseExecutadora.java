package Atividade_2;

import java.util.Scanner;

public class ClasseExecutadora {

    public static void main(String[] args) {
        int leitura, leitura1, leitura2;

        Animal animal = new Animal();
        Aves aves = new Aves();
        Mamifero mamifero = new Mamifero();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Pardal pardal = new Pardal();
        Gaviao gaviao = new Gaviao();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("MENU : Crie seu Animal.");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mamífero. ");
            System.out.println("2 - Ave. ");
            System.out.println("3 - Sair do Menu.");

            leitura = scanner.nextInt();

            if (leitura == 1) {

                System.out.println("Você escolheu Mamífero. ");
                System.out.println("Qual Mamífero você deseja criar?");
                System.out.println("1 - Cachorro. ");
                System.out.println("2 - Gato. ");
                leitura1 = scanner.nextInt();

                if (leitura1 == 1) {

                    System.out.println("Você escolheu cachorro.");
                    System.out.println("Digite o nome do seu Cachorro: ");
                    String nomeCachorro = scanner.next();
                     animal.setNomeAnimal(nomeCachorro);
                    System.out.println("Digite a quantidade de filhos: ");
                    int qtdFilhosC = scanner.nextInt();
                    mamifero.setQtdFilhos(qtdFilhosC);
                    cachorro.latir();
                    mamifero.gerarFilho();

                } else if (leitura1 == 2) {

                    System.out.println("Você escolheu gato.");
                    System.out.println("Digite o nome do seu Gato: ");
                    String nomeGato = scanner.next();
                    animal.setNomeAnimal(nomeGato);
                    System.out.println("Digite a quantidade de filhos: ");
                    int qtdFilhosG = scanner.nextInt();
                    mamifero.setQtdFilhos(qtdFilhosG);
                    gato.miar();
                    mamifero.gerarFilho();

                } else {

                    System.out.println("Opção Inválida.");
                }

            } else if (leitura == 2) {
                System.out.println("Você escolheu Ave.");
                System.out.println("Qual Ave você deseja criar?");
                System.out.println("1 - Pardal. ");
                System.out.println("2 - Gavião. ");
                leitura2 = scanner.nextInt();
                if (leitura2 == 1) {

                    System.out.println("Você escolheu Pardal.");
                    System.out.println("Digite o nome do seu Pardal: ");
                    String nomePardal = scanner.next();
                    animal.setNomeAnimal(nomePardal);
                    System.out.println("Digite quantas asas seu Pardal terá: ");
                    int qtdAsasP = scanner.nextInt();
                    aves.setQtdAsas(qtdAsasP);
                    pardal.cantar();
                    aves.voar();

                } else if (leitura2 == 2) {

                    System.out.println("Você escolheu Gavião.");
                    System.out.println("Digite o nome do seu Gavião: ");
                    String nomeGaviao = scanner.next();
                    animal.setNomeAnimal(nomeGaviao);
                    System.out.println("Digite quantas asas seu Gavião terá: ");
                    int qtdAsasGaviao = scanner.nextInt();
                    aves.setQtdAsas(qtdAsasGaviao);
                    gaviao.corinthians();
                    aves.voar();

                }

            } else if (leitura == 3) {
                System.out.println("Você saiu do menu.");
            } else {
                System.out.println("Opção Inválida. ");
            }


        } while (leitura != 3);
        scanner.close();

        }
    }



