
interface LightAction{
	void activate();
}
public class SmartHomeLightingAutomation{
	public static void main(String[] args){
		LightAction motion=()->System.out.println("Lights ON with medium brightness");
		LightAction night=()->System.out.println("Lights ON with low brightness");
		LightAction voice=()->System.out.println("Lights ON with full brightness");
		motion.activate();
		night.activate();
		voice.activate();
	}
}
