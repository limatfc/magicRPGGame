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
                novoItem.name  = sc.next() + sc.nextLine();
                System.out.println("Digite a descricao do item:");
                novoItem.description = sc.next() + sc.nextLine();
                System.out.println("Digite o nivel de poder do item:");
                novoItem.powerLevel = sc.nextInt();
                System.out.println("O item é raro(true/false):");
                novoItem.rare = sc.nextBoolean();

            } else if (userOption == 2){
                System.out.println("Nome:" + novoItem.name + "\nDescricao: " + novoItem.description + "\nNivel de poder: " + novoItem.powerLevel + "\nRaro: " + novoItem.rare);
            } else if (userOption == 3){
                System.out.println("Obrigada por brincar conosco");
            } else {
                System.out.println("Ops, opcao invalida.");
            }
        }while (userOption != 3);
        sc.close();
    }
}
