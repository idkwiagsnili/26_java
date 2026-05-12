package day10;

public class App {

    public static void main(String[] args) {
        Player machine = new MachinePlayer("터미네이터");
        Player human = new HumanPlayer("황기태");

        String m = machine.turn();
        String h = human.turn();

        System.out.println(machine.getName() + ":" + m + ", " + human.getName() + ":" + h);

        if (h.equals(m)) {
            System.out.println(machine.getName() + " 승리!");
        }
        else {
            System.out.println(human.getName() + " 승리!");
        }
    }
}