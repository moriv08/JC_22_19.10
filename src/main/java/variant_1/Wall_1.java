package variant_1;

public class Wall_1 {

    public int hight;

    public Wall_1(int hight) {
        this.hight = hight;
    }

    public void jumping(Cat_1 cat){
        if (cat.jump(hight) < 0)
            cat.isInGame = false;
        else
            System.out.println(cat.name + " перепрыгнул через стену высотой " + hight + " метров");
    }

    public void jumping(Human_1 human){
        if (human.jump(hight) < 0)
            human.isInGame = false;
        else
            System.out.println(human.name + " перепрыгнул через стену высотой " + hight + " метров");
    }

    public void jumping(Robot_1 robot){
        if (robot.jump(hight) < 0)
            robot.isInGame = false;
        else
            System.out.println(robot.name + " перепрыгнул через стену высотой " + hight + " метров");
    }
}
