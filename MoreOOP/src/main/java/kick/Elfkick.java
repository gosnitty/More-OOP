package kick;


import lotr.character;

public class Elfkick  implements KickStrategy{
    public void kick(character whoKick, character opponent) {
        if (whoKick.getHp() < opponent.getHp()) {
            opponent.setHp(1);
        } else {
            opponent.setHp(0);
        }
    }
}
