package toys_raffle;

import java.util.PriorityQueue;

public class Raffle {
    PriorityQueue<RaffleItem> items = new PriorityQueue<RaffleItem>();
    
    public void add(Toy toy, Integer count) {
        for(int i = 0; i < count; i++) {
            this.items.add(new RaffleItem(toy, count));
        }
    }

    public RaffleItem get(){
        return this.items.poll();
    }
}
