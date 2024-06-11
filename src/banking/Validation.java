package banking;

public class Validation {
    int max_attempts = 3;

 /*   public String login(User data) {
        //  User user = new User();
        String userName = "bhagi";
        String passWord = "4310";
        int noOfAttempts = 3;
        if (!data.locked) {

            if (data.userName.equals(userName) && data.passWord.equals(passWord)) {
                System.out.println("login successful");
            } else {
                data.noOfAttempts = data.noOfAttempts + 1;
                if (data.noOfAttempts >= max_attempts) {
                    data.locked = true;
                }
                return "invalid login user" + (max_attempts);
            }
            // else{
            //      return "in";
            //    }
        }
     /*   else if (attempts > max_attempts){
            System.out.println("your account is locked");

            } */
        }
