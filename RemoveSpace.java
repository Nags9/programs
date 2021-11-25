
public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="i am goeing to mysore";
String s2="";
for(int i=0;i<s1.length();i++) {
	if(s1.charAt(i)!=' ') {
		s2=s2+s1.charAt(i);
	
	}
}
System.out.println(s2);
	}

}
