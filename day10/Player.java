package day10;

public abstract class Player {
    protected String shape[] = {"가위", "바위", "보"};
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public String turn();
}