package lotr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static character createCharacter() {
        List<Class<? extends character>> characters = Arrays.asList(Hobbit.class,Elf.class,King.class,Knight.class);
        return characters.get(new Random().nextInt(characters.size())).newInstance();
    }
}

