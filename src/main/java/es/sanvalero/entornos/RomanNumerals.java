package es.sanvalero.entornos;

public class RomanNumerals {
    public static String convert (int number) {
        String romanOnes = "";
        String romanNumber = "";
        String romanTens = "";
        String romanHundreds = "";

        if (number <= 0 || number > 3000) {
            romanNumber = "Invalid number";
        } else if (number < 10) {
            romanOnes = onesConversion(number);
            romanNumber = romanOnes;
        } else if (number < 100) {
            romanOnes = onesConversion(Integer.parseInt(String.valueOf(String.valueOf(number).charAt(1))));
            romanTens = tensConversion(Integer.parseInt(String.valueOf(String.valueOf(number).charAt(0))));
            romanNumber = romanTens + romanOnes;
        } else if (number < 1000) {
            romanOnes = onesConversion(Integer.parseInt(String.valueOf(String.valueOf(number).charAt(2))));
            romanTens = tensConversion(Integer.parseInt(String.valueOf(String.valueOf(number).charAt(1))));
            romanHundreds = hundredsConversion(Integer.parseInt(String.valueOf(String.valueOf(number).charAt(0))));
            romanNumber = romanHundreds + romanTens + romanOnes;
        }
        return romanNumber;
    }

    private static String onesConversion(int ones) {
        String romanOnes = "";
        if (ones == 1) {
            romanOnes = "I";
        } else if (ones == 2) {
            romanOnes = "II";
        } else if (ones == 3) {
            romanOnes = "III";
        } else if (ones == 4) {
            romanOnes = "IV";
        } else if (ones == 5) {
            romanOnes = "V";
        } else if (ones == 6) {
            romanOnes = "VI";
        } else if (ones == 7) {
            romanOnes = "VII";
        } else if (ones == 8) {
            romanOnes = "VIII";
        } else if (ones == 9) {
            romanOnes = "IX";
        }
        return romanOnes;
    }
    private static String tensConversion(int tens) {
        String romanTens = "";
        if (tens == 1) {
            romanTens = "X";
        } else if (tens == 2) {
            romanTens = "XX";
        } else if (tens == 3) {
            romanTens = "XXX";
        } else if (tens == 4) {
            romanTens = "XL";
        } else if (tens == 5) {
            romanTens = "L";
        } else if (tens == 6) {
            romanTens = "LX";
        } else if (tens == 7) {
            romanTens = "LXX";
        } else if (tens == 8) {
            romanTens = "LXXX";
        } else if (tens == 9) {
            romanTens = "XC";
        }
        return romanTens;
    }
    private static String hundredsConversion(int hundreds) {
        String romanHundreds = "";
        if (hundreds == 1) {
            romanHundreds = "C";
        } else if (hundreds == 2) {
            romanHundreds = "CC";
        } else if (hundreds == 3) {
            romanHundreds = "CCC";
        } else if (hundreds == 4) {
            romanHundreds = "CD";
        } else if (hundreds == 5) {
            romanHundreds = "D";
        } else if (hundreds == 6) {
            romanHundreds = "DC";
        }

        return romanHundreds;
    }
}