package lotr;
import kick.Kingkick;
import java.util.Random;

public class Knight extends character {  
    public Knight() {
        super(
        new Random().nextInt(12 - 2) + 2,
        new Random().nextInt(12 - 2) + 2,
        new Kingkick()
        );
    }
    
}
