public class CheckIfSpringSeason {
	public static String checkSeason(int day, int month) {
		if(month>3 && month<6) {
			return "Its a Spring Season";
		}
		else if(month == 3 && day>=20) {
			return "Its a Spring Season";
		}
		else if(month == 6 && day<=20) {
			return "Its a Spring Season";
		}
		else {
			return "Not a Spring Season";
		}
	}
	public static void main(String[] args) {
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		String result = checkSeason(day,month);
		System.out.println(result);
	}
}
