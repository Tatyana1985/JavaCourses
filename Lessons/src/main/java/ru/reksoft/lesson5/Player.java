package ru.reksoft.lesson5;

public class Player extends Person{
    Boolean active;
    Integer goals;
    PlayerType playerType;

    public Player(String firstName, String secondName, String lastName, Integer age, Boolean active,
                  Integer goals, PlayerType playerType) {
        super(firstName, secondName, lastName, age);
        this.active = active;
        this.goals = goals;
        this.playerType = playerType;
    }

    public Integer getGoals() {
        return goals;
    }

    public void goalPlus() {
        ++goals;
    }
}
