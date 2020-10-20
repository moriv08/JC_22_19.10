package variant_2;

public class Wall implements Obsticle {

    public int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    public void tryThis(Obstacleable participant) {
        if (participant.jump(hight) < 0){
            participant.setInGame(false);
        }
    }
}
