import variant_1.*;
import variant_2.Obstacleable;
import variant_2.Obsticle;

public class Tournament {

    Object[] objObsticles;
    Object[] objTeam;

    Obsticle[] obsticles;
    Obstacleable[] team;

    public Tournament(Obsticle[] obsticles, Obstacleable[] team) {
        this.obsticles = obsticles;
        this.team = team;

        for (Obsticle obsticle : obsticles) {
            for (Obstacleable t : team) {
                if (t.getInGame())
                    obsticle.tryThis(t);
            }
        }
    }

    public Tournament(Object[] objObsticles, Object[] objTeam) {
        this.objObsticles = objObsticles;
        this.objTeam = objTeam;

        for (Object obsticle : objObsticles) {
            if (obsticle instanceof Wall_1)
                for (Object t : objTeam) {
                    if (t instanceof Cat_1)
                        ((Wall_1) obsticle).jumping((Cat_1) t);
                    else if (t instanceof Human_1)
                        ((Wall_1) obsticle).jumping((Human_1) t);
                    else if (t instanceof Robot_1)
                        ((Wall_1) obsticle).jumping((Robot_1) t);
                }
            else {
                for (Object t : objTeam) {
                if (t instanceof Cat_1)
                    ((Stadium_1) obsticle).running((Cat_1) t);
                else if (t instanceof Human_1)
                    ((Stadium_1) obsticle).running((Human_1) t);
                else if (t instanceof Robot_1)
                    ((Stadium_1) obsticle).running((Robot_1) t);
                }
            }

        }
    }
}
