package TestClasses;

import bankAccount.Users;

public class TransferDifferentAccount {

    public static void main(String[] args) {

        Users u1 = new Users("David" , "Villa", "01/01/2000", "married" ,1000 , 2000);

        Users u2 = new Users("Xavi" , "Hernandes", "1998", "single" ,3000 , 2000);



        System.out.println(u1.toString());
        System.out.println(u2.toString());

    }
}
