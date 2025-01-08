
public class Abbrevations {

    public static void main(String[] args) {
        String str = "pep";
        findAbbrevations(str, "", 0);
    }

    static void findAbbrevations(String str, String set, int count) {
        if (str.isEmpty()) {
            System.out.println(set + (count > 0 ? count : ""));
            return;
        }
        findAbbrevations(str.substring(1), set + (count > 0 ? count : "") + str.charAt(0), 0);
        findAbbrevations(str.substring(1), set, count + 1);
    }
}
