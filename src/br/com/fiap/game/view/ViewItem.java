package br.com.fiap.game.view;


import br.com.fiap.game.model.Item;

import java.util.Scanner;

public class ViewItem {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Item novoItem = new Item();
        int userOption;

        do {
            System.out.println("Escolha uma opcao :\n1. Cadastrar novo item \n2.Exibir item \n3. Sair");
            userOption = sc.nextInt();
            if (userOption == 1){
                System.out.println("Digite o nome do item:");
                novoItem.setName(sc.next() + sc.nextLine());
                System.out.println("Digite a descricao do item:");
                novoItem.setDescription(sc.next() + sc.nextLine());
                System.out.println("Digite o nivel de poder do item:");
                novoItem.setPowerLevel(sc.nextInt());
                System.out.println("O item é raro(true/false):");
                novoItem.setRare(sc.nextBoolean());

            } else if (userOption == 2){
                System.out.println("Nome:" + novoItem.getName() + "\nDescricao: " + novoItem.getDescription() + "\nNivel de poder: " + novoItem.getPowerLevel() + "\nRaro: " + novoItem.getRare());
            } else if (userOption == 3){
                System.out.println("Obrigada por brincar conosco");
            } else {
                System.out.println("Ops, opcao invalida.");
            }
        }while (userOption != 3);
        sc.close();
    }
}
