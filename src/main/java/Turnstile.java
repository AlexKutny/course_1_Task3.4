// controller
class Turnstile {
    RegisterSys system = new RegisterSys();


    //  creating card for student and pupil type
    public Card createCard(CardType type, CardValidity validity, int tripsNumber) {
        if (type == CardType.REGULAR)
            throw new IllegalArgumentException();

        Card card = new Card();
        card.setType(type);
        card.setId(system.getCount());
        system.incrementCount();
        card.setValidity(validity);
        card.setTripsNumber(tripsNumber);

        system.addToRegister(card);
        return card;
    }

    //  creating card for regular type
    public Card createCard(CardType type, int credits) {
        if (type != CardType.REGULAR)
            throw new IllegalArgumentException();

        Card card = new Card();
        card.setType(type);
        card.setId(system.getCount());
        system.incrementCount();
        card.setTripsNumber(credits);
        card.setBalance(credits);

        system.addToRegister(card);
        return card;
    }

    // simulation of working process
    public void execute() {
        Turnstile turnstile = new Turnstile();
        TurnstileView view = new TurnstileView();

        Card c1 = turnstile.createCard(CardType.REGULAR, 2);
        Card c2 = turnstile.createCard(CardType.REGULAR, 4);
        Card c3 = turnstile.createCard(CardType.REGULAR, 3);
        Card c4 = turnstile.createCard(CardType.STUDENT, new CardValidity(Duration.DECADE), 10);
        Card c5 = turnstile.createCard(CardType.STUDENT, new CardValidity(Duration.MONTH), 5);
        Card c6 = turnstile.createCard(CardType.PUPIL, new CardValidity(Duration.DECADE), 10);

        turnstile.system.validateTrip(c1);
        turnstile.system.validateTrip(c1);
        turnstile.system.validateTrip(c1);
        turnstile.system.validateTrip(c3);
        turnstile.system.validateTrip(c4);
        turnstile.system.validateTrip(c5);
        turnstile.system.validateTrip(c5);
        turnstile.system.validateTrip(c5);
        turnstile.system.validateTrip(c5);
        turnstile.system.validateTrip(c5);
        turnstile.system.validateTrip(c5);
        turnstile.system.validateTrip(c6);

        view.getInfo(turnstile.system);
        view.getInfoByTypes(turnstile.system);
    }

}