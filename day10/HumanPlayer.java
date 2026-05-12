package day10;

import java.util.Scanner;

public class HumanPlayer extends Player {

    private Scanner scan = new Scanner(System.in);

    public HumanPlayer(String name) {
        super(name);
    }

    public String turn() {
        System.out.print(getName() + "님, 뭘 내시겠습니까?");
        return scan.next();
    }
}