package DSA.String.Easy;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String s = "maam";

        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Find first non-repeating
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                System.out.println("First Non-Repeating Character: " + s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
