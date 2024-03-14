public class PersonagemMagico {

    String name;
    int energyLevel;
    String magicPower;
    HabilidadeEspecial habilidadeEspecial;

    public PersonagemMagico(String name, int energyLevel, String magicPower, HabilidadeEspecial habilidadeEspecial){
    this.name = name;
    this.energyLevel = energyLevel;
    this.magicPower = magicPower;
    this.habilidadeEspecial = habilidadeEspecial;
    }

    public PersonagemMagico(String name){
    this.name = name;
}

    public PersonagemMagico(){}

    public void atacar(String ataque) {
        if (energyLevel >= 10) {
            System.out.println(name + " realizou um ataque: " + ataque + "!");
            energyLevel -= 10;
        } else {
            System.out.println(name + " está sem energia para atacar.");
        }
    }

}
