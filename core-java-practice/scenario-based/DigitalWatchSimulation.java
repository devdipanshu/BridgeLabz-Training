public class DigitalWatchSimulation {

	public static void simulateWatch() {
		for(int hour = 0;hour<24;hour++) {
			if(hour == 13) {
				System.out.println("it 13:00, now its time to power cut");
				break;
			}
			for(int minute = 0;minute<60;minute++) {
				if(hour<10 && minute<10) {
					System.out.println("0"+hour+":0"+minute);
				}
				else if(hour<10) {
					System.out.println("0"+hour+":"+minute);
				}
				else if(minute<10) {
					System.out.println(hour+":0"+minute);
				}
				else {
					System.out.println(hour+":"+minute);
				}
			}
		}
	}
	public static void main(String[] args) {
		simulateWatch();
	}
}
