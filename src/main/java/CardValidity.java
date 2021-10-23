// entity for operating of card validity
class CardValidity {
    CardValidity(Duration d) {
        value = d.getValue();
    }

    private int value;

    public void decrementValue() {
        this.value--;
    }

    public int getValue() {
        return value;
    }


}

enum Duration {
    MONTH(30), DECADE(10);
    private int value;

    Duration(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }
}