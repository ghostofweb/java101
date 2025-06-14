public class PremiumUser extends User {
    private String creditCard;
    public PremiumUser(String userName, String email,String creditCard) {
        super(userName, email);
        this.creditCard = creditCard;
    }
    // we have to have values for the constructor

    public String getCreditCard() {
        return creditCard;
    }

    // for some methods we need different behaviour for the function
    @Override
    public String getMessage(){
        return "Nice bro you rich fr fr ";
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return STR."PremiumUser{creditCard='\{creditCard}'}";
    }
}
