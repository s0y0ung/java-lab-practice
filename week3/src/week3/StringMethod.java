package week3;

public class StringMethod {
	static String addString(String s1, int index, String s2) {
		String temp=s1.substring(0,index+1);
		String string=temp.concat(s2);
		string=string.concat(s1.substring(index+1));
		return string;
		
	}
	
	static String reverse(String s) {
		String string="";
		for(int i=s.length()-1; i>=0; i--) {
			string=string.concat(s.substring(i,i+1));
		}
		return string;
	}
	
	static String removeString (String s1, String s2) {
		String s=s1.replaceAll(s2,"");
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
