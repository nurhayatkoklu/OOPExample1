package bankAccount;

public class Account {

    public static int deposit (int accountAmount , int amountToAdd) {
        return amountToAdd+accountAmount;

    }

    public static int withDraw (int accountAmount , int withdrawAmount) {
        return accountAmount-withdrawAmount;

    }

    public static String transferOtherUser (Users sendingUser, Users receivingUser, int transferAmount) {
        String donus="";
        if (transferAmount > sendingUser.amountAccount1) {donus="Sender is poor lol :)"; }
        if (transferAmount < sendingUser.amountAccount1)
        {
            transferAmount-=transferAmount*0.02;
            sendingUser.amountAccount1-=transferAmount;
            receivingUser.amountAccount1+=transferAmount;
            donus="Transaction is completed successfully";
        }
        return donus;
    }
    public static String transferToOwnAccount (Users One, int transferAmount) {
        String donus="";
        if (transferAmount > One.amountAccount1) {donus="You need more money dude :)"; }
        if (transferAmount < One.amountAccount1)
        {
            One.amountAccount1-=transferAmount;
            One.accountNumber2+=transferAmount;
            donus="Transaction is completed successfully";
        }
        return donus;


    }




}












