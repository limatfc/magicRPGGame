package br.com.fiap.game.model;

public class Item {
    String name;

    String description;

    Boolean rare;

    int powerLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRare(Boolean rare) {
        this.rare = rare;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }



    public String getDescription() {
        return description;
    }

    public Boolean getRare() {
        return rare;
    }

    public int getPowerLevel() {
        return powerLevel;
    }
}
