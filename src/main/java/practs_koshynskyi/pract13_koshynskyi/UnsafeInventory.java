package practs_koshynskyi.pract13_koshynskyi;

public class UnsafeInventory implements Inventory {
    private int amount;

    @Override
    public void reserve(int amount) {
        this.amount = this.amount - amount;

    }

    @Override
    public int available() {
        return amount;
    }
    public UnsafeInventory(int amount) {
        this.amount = amount;
    }
}
