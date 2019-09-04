public class atividade2{
	public static void main(String[] args) {
		
        String txt1="O rato roeu a roupa";
        String txt2=" Do rei de roma";
        String txt3=txt1+txt2;
        System.out.println(Converter(txt3));
    }




    private static String Converter(String s){
        String f="";
        int d;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
              d= s.charAt(i)- (int)'a';
              f = f+" " + d;
            } 
        }
        return f;
    }
    
}

