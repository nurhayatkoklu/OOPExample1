package bankAccount;

public class AddRelative {

    public String fullName;
    public String age;

    public AddRelative(String fullName, String age) {
        this.fullName = fullName;

        if (relativeAgeChecker(age)) this.age=age;
        else this.age="0";

    }
    public boolean relativeAgeChecker (String age) {
        String hehe=Users.checkAge(age);

        if (hehe.equalsIgnoreCase("You can get a credit card"))
        {
            return true;
        }

return false;

    }
}
