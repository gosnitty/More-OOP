package kick;
import lotr.character;

public class Cry implements KickStrategy{

    @Override
    public void kick(character whoKick, character opponent) {
        System.out.println("😭😭😭");
    }
    
}
