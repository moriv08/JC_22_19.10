package variant_2;

public class Cat implements Obstacleable {

    public String name;
    public int jumping;
    public int running;
    public boolean isInGame = true;

    public Cat(String name, int jumping, int running) {
        this.name = name;
        this.jumping = jumping;
        this.running = running;
    }

    public int run(int length){
        String result = name;
        result += (running > length) ? "" : " не ";
        System.out.println(result + " пробежал марафон длиной " + length + " метров");
        return running - length;
    }

    public int jump(int height) {
        String result = name;
        result += (running > height) ? "" : " не ";
        System.out.println(result + " перепрыгнул через стену высотой " + height + " метров");
        return running - height;
    }

    public boolean getInGame(){
        return isInGame;
    }

    public void setInGame(boolean b){
        isInGame = b;
    }
}
