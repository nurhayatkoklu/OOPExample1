package TestClasses;

import bankAccount.Account;
import bankAccount.Users;

public class TransferOwnAccount {


    public static void main(String[] args) {

        Users u1 = new Users("Steven" , "Gerard",
                "01/01/2000", "married" ,
                1000 , 2000);


        u1.transfer(u1, u1);

       Account ownAccount=new Account();
        ownAccount.transferToOwnAccount(u1,100);

        System.out.println(u1.toString());

    }
}
