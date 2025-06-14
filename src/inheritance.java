public class inheritance {
    public static void main(String[] args) {
        User user = new User("user1name","user1Email");
        PremiumUser premiumUser = new PremiumUser("user2name","user2Email","user2CreditCardDetails");

        System.out.println(premiumUser.getCreditCard());
        System.out.println(user.getEmail());
    }
}
