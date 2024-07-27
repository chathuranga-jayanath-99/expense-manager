public abstract class MoneyAccount {
    private float currentValue;

    public float getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(float currentValue) {
        this.currentValue = currentValue;
    }

    public void credit(float amount) {
        this.currentValue += amount;
    }

    public void debit(float amount) {
        this.currentValue -= amount;
    }
}
