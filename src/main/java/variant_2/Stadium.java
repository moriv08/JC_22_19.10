package variant_2;

public class Stadium implements Obsticle{

    public int length;

    public Stadium(int length) {
        this.length = length;
    }

    public void tryThis(Obstacleable participant){
        if (participant.run(length) < 0){
            participant.setInGame(false);
        }
    }
}
