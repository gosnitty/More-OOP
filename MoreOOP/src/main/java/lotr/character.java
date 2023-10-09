package lotr;

import kick.KickStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class character {
    @Getter
    private int hp;
    @Setter@Getter
    private int power;
    private KickStrategy kickStrategy;
    
    public void kick(character c){
        kickStrategy.kick(this,c);
    }
    public boolean isAlive(){
        return getHp() > 0;
    }
    public void setHp(int hp){
        this.hp = hp > 0 ? hp : 0;
    }
    public String toString(){
        return this.getClass().getSimpleName()+"{hp="+hp+", power="+power+"}";
    }
}

