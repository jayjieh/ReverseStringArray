package demotest;

/**
 *
 * @author Owori Juma
 */
public class ReverseStringArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "a,b$c";
        char[] charArray = str.toCharArray();
        System.out.println("Input string: " + str);
        reverseStringOnly(charArray);
        String revStr = new String(charArray);
        System.out.println("Output string: " + revStr);
    }

    public static void reverseStringOnly(char str[]) {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;
        
        while (l < r) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l])) {
                l++;
            } else if (!Character.isAlphabetic(str[r])) {
                r--;
            } 
            else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }

}
