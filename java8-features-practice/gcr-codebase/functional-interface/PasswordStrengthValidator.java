interface SecurityUtils{
	static boolean checkPassword(String p){
		if(p.length()<8){
			return false;
		}
		boolean d=false;
		boolean u=false;
		for(int i=0;i<p.length();i++){
			char c=p.charAt(i);
			if(c>='0'&&c<='9'){
				d=true;
			}
			if(c>='A'&&c<='Z'){
				u=true;
			}
		}
		return d&&u;
	}
}
public class PasswordStrengthValidator{
	public static void main(String[] args){
		String[] passwords={"Pass1234","weak","StrongPass1"};
		for(int i=0;i<passwords.length;i++){
			if(SecurityUtils.checkPassword(passwords[i])){
				System.out.println("Strong "+passwords[i]);
			}else{
				System.out.println("Weak "+passwords[i]);
			}
		}
	}
}
