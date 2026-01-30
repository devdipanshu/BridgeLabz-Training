public class PasswordValidator {

    public boolean isValid(String password) {
        if(password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasDigit = false;

        for(int i = 0;i<password.length();i++) {
            char c = password.charAt(i);
            if(Character.isUpperCase(c)) hasUpper = true;
            if(Character.isDigit(c)) hasDigit = true;
        }

        return hasUpper && hasDigit;
    }
}
