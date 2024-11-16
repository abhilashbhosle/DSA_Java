// leetcode 467

public class NumberComplement {

    public static void main(String[] args) {
        int num = 5;
        String compliment = "";
        while (num > 0) {
            int s=(((num&1)^1));
			compliment=s+compliment;
            num >>= 1;
        }
        System.out.println(Integer.parseInt(compliment, 2)); 
    }
}
