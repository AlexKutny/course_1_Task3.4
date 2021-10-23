//  class for keeping records of cards
class RootCard {
    private int amount = 0, deniedNum, allowedNum;

    public void incrementAllowedNum(){
        this.allowedNum++;
    }
    public void incrementDeniedNum(){
        this.deniedNum++;
    }
    public void incrementAmount(){
        this.amount++;
    }

    public int getAmount() {
        return amount;
    }

    public int getDeniedNum() {
        return deniedNum;
    }

    public int getAllowedNum() {
        return allowedNum;
    }
}

//  card entity class // model
class Card {
    // ratio for balance/tripsNumber = 1 //
    private int balance;
    private int tripsNumber;
    private int id;
    private CardType type;
    private CardValidity validity;


    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public CardValidity getValidity() {
        return validity;
    }

    public void setValidity(CardValidity validity) {
        this.validity = validity;
    }

    // not used //  the method is needed to count down the days
    public void decrementValidity() {
        validity.decrementValue();
    }

    public int getTripsNumber() {
        return tripsNumber;
    }

    public void setTripsNumber(int tripsNumber) {
        this.tripsNumber = tripsNumber;
    }

    public void decrementTripsNumber() {
        tripsNumber--;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void decrementBalance() {
        this.balance--;
    }

    public Card() {
    }
}