package practs_koshynskyi.pract13_koshynskyi;

public class SynchronizedInventory implements  Inventory {
    private int amount;

    @Override
    public synchronized void reserve(int amount) {
        this.amount = this.amount - amount;

    }

    @Override
    public synchronized int available() {
        return amount;
    }
    public SynchronizedInventory(int amount) {
        this.amount = amount;
    }
}

