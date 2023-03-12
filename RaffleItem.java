package toys_raffle;

import java.util.Random;

public class RaffleItem implements Comparable<RaffleItem> {
    Toy toy;
    Integer weight;
    Integer priority;

    public RaffleItem(Toy toy, Integer weight){
        this.toy = toy;
        this.weight = weight;
        Random r = new Random();
        this.priority = r.nextInt(weight);
    }

    public Integer getPriority() {
        return this.priority;
    }

    public int compareTo(RaffleItem item) {
        if (this.getPriority() > item.getPriority()) {
            return -1;
        } else {
            return 1;
        } 
    }

    @Override
    public String toString() {
        return this.toy.toString() + " Weight: " + this.weight + "; Priority: " + this.priority + ";";
    }
}
