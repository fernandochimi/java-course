public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else {
            int divisibleByFour = year % 4;
            int divisibleByOneHundred = year % 100;
            int divisibleByFourHundred = year % 400;

            if (divisibleByFour == 0) {
                if (divisibleByOneHundred == 0) {
                    if (divisibleByFourHundred == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
