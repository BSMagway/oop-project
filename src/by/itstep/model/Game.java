package by.itstep.model;

public abstract class Game {

    private String name;

    abstract void start(User user);

    public Game(String name) {
        this.name = name;
    }

    void end() {
        System.out.println(name + " end");
    }

    public String getName() {
        return name;
    }

}
