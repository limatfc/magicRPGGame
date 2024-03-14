import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ViewPersonagem {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        PersonagemMagico novoPersonagem = null;
        HabilidadeEspecial novahabilidadeEspecial;
    int userOption;

    do {
        System.out.println("Escolha uma opcao :\n1 Cadastrar novo personagem \n2.Exibir personagem \n3.Atacar \n4.Sair");
        userOption = sc.nextInt();
        if (userOption == 1){
            System.out.println("Digite o nome do personagem:");
            String name  = sc.next() + sc.nextLine();
            System.out.println("Digite o poder do personagem:");
            String magicPower = sc.next() + sc.nextLine();
            System.out.println("Digite o nivel de energia do personagem:");
            int energyLevel = sc.nextInt();

            System.out.println("Digite a habilidade especial do personagem:");
            String specialAbilityName = sc.next() + sc.nextLine();
            System.out.println("Digite o custo de energia para um personagem ao ser usada:");
            int custoEnergia = sc.nextInt();
            System.out.println("A habilidade está habilitada (true/false):");
            Boolean habilitada = sc.nextBoolean();

            novahabilidadeEspecial = new HabilidadeEspecial(specialAbilityName, custoEnergia, habilitada);
            novoPersonagem = new PersonagemMagico(name, energyLevel, magicPower, novahabilidadeEspecial);

        } else if (userOption == 2){
            if (novoPersonagem != null) {
                System.out.println("Nome:" + novoPersonagem.name + "\nPoder: " + novoPersonagem.magicPower + "\nEnergia: " + novoPersonagem.energyLevel);
                System.out.println("Noma habilidade:" + novoPersonagem.habilidadeEspecial.nome + "\nCusto: " + novoPersonagem.habilidadeEspecial.custoEnergia + "\nHabilidade disponivel: " + novoPersonagem.habilidadeEspecial.habilitada);
            } else {
                System.out.println("Ops, voce tem que cadastrar um item primeiro");
            }
        }  else if (userOption == 3){
            if (novoPersonagem != null) {
                System.out.println("Digite o nome do ataque:");
                String ataque = sc.next() + sc.nextLine();
                novoPersonagem.atacar(ataque);
            } else {
                System.out.println("Ops, voce tem que cadastrar um personagem primeiro");
            }
        }else if (userOption == 4){
            System.out.println("Obrigada por brincar conosco");
        } else {
            System.out.println("Ops, opcao invalida.");
        }
    }while (userOption != 4);
        sc.close();
    }
}