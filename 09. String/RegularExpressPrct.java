public class RegularExpressPrct {
    public static void main(String[] args) {
        /* Find if a number is binary or not. */

        int binary = 1010110;

        // String str = binary + "";
        // System.out.println(str.matches("[10]*"));
        /* or */

        String str = String.valueOf(binary);

        /* Find if a number is HEXA or not. */

        String hexa = "23AF";
        // System.out.println(hexa.matches("[0-9A-z]+"));

        /* Find if it's a valid date or not. */

        String date = "01/12/2023";

        System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

    }
}
