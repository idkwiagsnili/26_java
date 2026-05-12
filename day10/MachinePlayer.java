package day10;

public class MachinePlayer extends Player {

    public MachinePlayer(String name) {
        super(name);
    }
    public String turn() {
        return shape[(int)(Math.random()*3)];
    }
}