package variant_1;

public class Robot_1 {

    public String name;
    public int jumping;
    public int running;
    public boolean isInGame = true;

    public Robot_1(String name, int jumping, int running) {
        this.name = name;
        this.jumping = jumping;
        this.running = running;
    }

    public int run(int length){
        return running - length;
    }

    public int jump(int height) {
        return running - height;
    }

}
