package kick;


import lotr.character;
public class Kingkick implements KickStrategy{
    
        @Override
        public void kick(character whoKick, character opponent) {
            opponent.setHp(opponent.getHp() - whoKick.getPower());
        }
    
}
