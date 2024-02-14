package pages;

public class Program {
	
public void psvm() {
	
	String str = "Selvamanikandan", nstr = "";
	char ch;
	
	for(int i=0;i<str.length();i++) {
		
		ch = str.charAt(i);
		nstr = ch+nstr;
		
	}
	
	System.out.println(nstr);
		
	
	StringBuilder ip = new StringBuilder();
	ip.append(str);
	ip.reverse();



		

}
	

}
