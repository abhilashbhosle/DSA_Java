// remove all 'a' from stream

public class Stream {

    public static void main(String args[]) {
        skip("", "bacaad");
    }

    static void skip(String filtered, String unfiltered) {
        if (unfiltered.isEmpty()) {
            System.out.println(filtered);
			return;
        }
        char c = unfiltered.charAt(0);
        if (c == 'a') {
            skip(filtered, unfiltered.substring(1));
        } else {
            skip(filtered + c, unfiltered.substring(1));
        }
    }
}
