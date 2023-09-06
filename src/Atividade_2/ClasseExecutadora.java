package Atividade_2;

import java.util.Scanner;

public class ClasseExecutadora {

    public static void main(String[] args) {
        int leitura;
        Animal animal = new Animal();
        Aves aves = new Aves();
        Mamifero mamifero = new Mamifero();
        Scanner scanner = new Scanner(System.in);


        System.out.println("MENU : Crie seu Animal.");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Mamífero. ");
        System.out.println("2 - Ave. ");
        System.out.println("3 - Sair do Menu.");

        leitura = scanner.nextInt();

        if (leitura == 1){
            System.out.println("Você escolheu Mamífero. ");
        } else if (leitura == 2 ) {
            System.out.println("Você escolheu Ave.");
        } else if (leitura == 3 ) {
            System.out.println("Você saiu do menu.");
        } else {
            System.out.println("Opção Inválida. ");
        }

    }
}
