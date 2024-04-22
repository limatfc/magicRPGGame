package br.com.fiap.game.model;

public class PersonagemMagico {

    private String name;
    private int energyLevel;
     private String magicPower;
     private HabilidadeEspecial habilidadeEspecial;

    public PersonagemMagico(String name, int energyLevel, String magicPower, HabilidadeEspecial habilidadeEspecial){
    this.name = name;
    this.energyLevel = energyLevel;
    this.magicPower = magicPower;
    this.habilidadeEspecial = habilidadeEspecial;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void setMagicPower(String magicPower) {
        this.magicPower = magicPower;
    }

    public void setHabilidadeEspecial(HabilidadeEspecial habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getName() {
        return name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public String getMagicPower() {
        return magicPower;
    }

    public HabilidadeEspecial getHabilidadeEspecial() {
        return habilidadeEspecial;
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
