public class ToNumbers {
    public int parseToInt(String s, int i) {

        if (checkRightNumbers(divideString(s, 0)) && checkRightNumbers(divideString(s, 1)))
            //if both of numbers are romans - ok
            return romanToArabic(divideString(s, i));
        // or if both of numbers are arabian - ok
        else return Integer.parseInt(divideString(s, i));
        //in other cases (when date's format is String, or one of both is roman and other arabian, or other)
        // will NumberFormatExeption, because parseInt will not work
    }

    public boolean checkRightNumbers(String s) {
        // this check for answer the question: are both numbers romanian?
        for (RomanNumbers num : RomanNumbers.values()) {
            if (num.name().equals(s)) {
                return true;
            }
        }
        return false;
    }

    public int romanToArabic(String s) {
        // this circle can help us find enum's value, that equals entrance string
        RomanNumbers number = null;
        for (RomanNumbers num : RomanNumbers.values()) {
            if (num.name().equals(s)) {
                number = num;
            }
        }
        switch (number) {
            case I:
                return 1;
            case II:
                return 2;
            case III:
                return 3;
            case IV:
                return 4;
            case V:
                return 5;
            case VI:
                return 6;
            case VII:
                return 7;
            case VIII:
                return 8;
            case IX:
                return 9;
            case X:
                return 10;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
    }

    public String divideString(String s, int i) {
        //return result regular expression. String divided by parts, between which there is + or - or / or *
        return s.split("[+\\-*/]")[i];
    }
}
