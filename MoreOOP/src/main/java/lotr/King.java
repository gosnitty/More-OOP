package lotr;

import java.util.Random;
import kick.Kingkick;

public class King extends character{

    public King() {
        super(
        new Random().nextInt(15 - 5) + 5,
        new Random().nextInt(15 - 5) + 5,
        new Kingkick()
        );
    }
}
