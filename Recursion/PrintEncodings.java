
public class PrintEncodings {

    public static void main(String[] args) {
        String str = "123";
        print(str, "");
    }

    static void print(String ques, String es) {  // es(Encoded String)
        if (ques.length() == 0) {
            System.out.println(es);
            return;
        }
		else if(ques.length()==1){
			char ch=ques.charAt(0);
			if(ch=='0'){
				return;
			}else{
				int chv=ch-'0';
				char code=(char)('a'+chv-1);
				es=es+code;
				System.out.println(es);
			}
		}else{
			char ch=ques.charAt(0);
			String roq=ques.substring(1);
			if(ch=='0'){
				return;
			}else{
				int chv=ch-'0';
				char code=(char)('a'+chv-1);
				print(roq, es+code);
			}
			String ch12=ques.substring(0,2);
			String roq12=ques.substring(2);
			int ch12v=Integer.parseInt(ch12);
			if(ch12v<=26){
				char code=(char)('a'+ch12v-1);
				print(roq12,es+code);
			}
		}
    }
}