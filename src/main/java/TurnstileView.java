// entity view
class TurnstileView {
    public void getInfo(RegisterSys sys) {
        System.out.println("Denied trips: " + sys.deniedNum);
        System.out.println("Allowed trips: " + sys.allowedNum);
    }

    public void getInfoByTypes(RegisterSys sys) {
        System.out.println("PUPILS card total: " + sys.rootCardPupil.getAmount());
        System.out.println("Allowed trips(PUPILS): " + sys.rootCardPupil.getAllowedNum());
        System.out.println("Denied trips(PUPILS): " + sys.rootCardPupil.getDeniedNum());

        System.out.println("STUDENT card total: " + sys.rootCardStudent.getAmount());
        System.out.println("Allowed trips(STUDENT): " + sys.rootCardStudent.getAllowedNum());
        System.out.println("Denied trips(STUDENT): " + sys.rootCardStudent.getDeniedNum());

        System.out.println("REGULAR card total: " + sys.rootCardRegular.getAmount());
        System.out.println("Allowed trips(REGULAR): " + sys.rootCardRegular.getAllowedNum());
        System.out.println("Denied trips(REGULAR): " + sys.rootCardRegular.getDeniedNum());
    }


    public void deny() {
        System.out.println("Access is denied!");
    }

    public void allow() {
        System.out.println("Access is allowed!");
    }
}