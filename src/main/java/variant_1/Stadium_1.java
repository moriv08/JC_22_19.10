package variant_1;

public class Stadium_1 {
    int lenght;

    public Stadium_1(int lenght) {
        this.lenght = lenght;
    }

    public void running(Cat_1 cat){
        if (cat.run(lenght) < 0) {
            System.out.println(cat.name + " сошел с дистанции");
            cat.isInGame = false;
        }
        else
            System.out.println(cat.name + " пробежал марафон длиной " + lenght + " метров");

    }

    public void running(Human_1 human){
        if (human.run(lenght) < 0) {
            System.out.println(human.name + " сошел с дистанции");
            human.isInGame = false;
        }
        else
            System.out.println(human.name + " пробежал марафон длиной " + lenght + " метров");
    }

    public void running(Robot_1 robot){
        if (robot.run(lenght) < 0) {
            System.out.println(robot.name + " сошел с дистанции");
            robot.isInGame = false;
        }
        else
            System.out.println(robot.name + " пробежал марафон длиной " + lenght + " метров");
    }
}
