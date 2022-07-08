package TestClasses;

import bankAccount.Users;

public class TransferDifferentAccount {

    public static void main(String[] args) {

        Users u1 = new Users("David" , "Villa", "01/01/2000", "married" ,1000 , 2000);

        Users u2 = new Users("Xavi" , "Hernandes", "1998", "single" ,3000 , 2000);

       // u1.transfer(u1,u2);

        System.out.println(u1.toString());
        System.out.println(u2.toString());

//        u1.amountAccount1==804
//        u2.amountAccount1==3196

    /*
       Do you want to add add your relative?
        Yes
       What is your relative name?
        Emily
       Date of birth relative?
        05/05/2002
       Do you want to transfer between your accounts or different user
        different
       Enter amount of money you want to enter
        200
    */





    /*
        name: David
        password: Villa
        dateOfBirth: You can get a credit card
        marriageStatus: Transaction done successfully
        accountNumber: 59773663
        amount in account 1 : 804
        accountNumber2: 70810832
        amount in account 2 : 2000
        relativeName: Emily
        relativeAge: 05/05/2002

        name: Xavi
        password: Hernandes
        dateOfBirth: You can get a credit card
        marriageStatus:
        accountNumber: 91077930
        amount in account 1 : 3196
        accountNumber2: 60171682
        amount in account 2 : 2000
        relativeName: null
        relativeAge: null

     */
    }
}
