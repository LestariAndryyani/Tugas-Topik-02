package no2;

class GameCharacter{
    private String name;
    private int lifePoint = 100;
    private int attackHitPoint; //pukulan
    private int attackKickPoint; //tendangan

    GameCharacter(String name, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    String getName(){
        return name;
    }

    int getLifePoint(){
        return lifePoint;
    }

    void hit(GameCharacter gameCharacter){
        gameCharacter.lifePoint = gameCharacter.lifePoint - this.attackHitPoint;
    }

    void kick(GameCharacter gameCharacter){
        gameCharacter.lifePoint = gameCharacter.lifePoint - this.attackKickPoint;
    }

    public void bandingkan(GameCharacter gameCharacter){
        int hasil = Integer.compare(this.lifePoint, gameCharacter.getLifePoint());
        if(hasil>0) {
            System.out.println(this.name + " MENANG ");
        }else if (hasil<0) {
            System.out.println(gameCharacter.getName() + " KALAH ");
        }else{
            System.out.println(" IMBANG ");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter1 = new GameCharacter("Raiden", 10, 20);
        GameCharacter gameCharacter2 = new GameCharacter("Sub-Zero", 5, 25);
        gameCharacter1.kick(gameCharacter2);
        gameCharacter2.kick(gameCharacter1);

        for(int obj=0;obj<3;obj++){
            gameCharacter2.hit(gameCharacter1);
        }

        for(int obj=0;obj<4;obj++){
            gameCharacter1.kick(gameCharacter2);
        }

        System.out.println(gameCharacter1.getLifePoint());
        System.out.println(gameCharacter2.getLifePoint());
        gameCharacter1.bandingkan(gameCharacter2);

    }
}
