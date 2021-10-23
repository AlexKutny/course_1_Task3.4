import java.util.ArrayList;

// extracted system to control the system
class RegisterSys {
    public static int count = 0;
    public int deniedNum = 0, allowedNum = 0;
    public ArrayList<Card> register = new ArrayList<>();
    public RootCard rootCardPupil = new RootCard();
    public RootCard rootCardStudent = new RootCard();
    public RootCard rootCardRegular = new RootCard();

    TurnstileView view = new TurnstileView();

    public boolean validateTrip(Card card) {
        if (card.getType() == CardType.REGULAR) {
            if (card.getBalance() > 0) {
                rootCardRegular.incrementAllowedNum();

                card.decrementBalance();
                view.allow();
                allowedNum++;

            } else {
                rootCardRegular.incrementDeniedNum();

                view.deny();
                deniedNum++;
                return false;
            }
        } else {
            if (card.getValidity().getValue() > 0
                    && card.getTripsNumber() > 0) {
                if (card.getType() == CardType.PUPIL)
                    rootCardPupil.incrementAllowedNum();
                else rootCardStudent.incrementAllowedNum();

                card.decrementTripsNumber();
                view.allow();
                allowedNum++;
            } else {
                if (card.getType() == CardType.PUPIL)
                    rootCardPupil.incrementDeniedNum();
                else rootCardStudent.incrementDeniedNum();

                view.deny();
                deniedNum++;
                return false;
            }
        }

        return true;
    }

    public void addToRegister(Card card) {
        if (card.getType() == CardType.PUPIL)
            rootCardPupil.incrementAmount();
        else if (card.getType() == CardType.STUDENT)
            rootCardStudent.incrementAmount();
        else
            rootCardRegular.incrementAmount();

        register.add(card);
    }
}
