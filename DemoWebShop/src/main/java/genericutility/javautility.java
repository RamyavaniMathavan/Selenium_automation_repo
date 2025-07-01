package genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author RamyavaniMathavan
 */

public class javautility {
	/**
	 * This method is used to capture current system date and time
	 * @return system date and time
	 */

	public String getsystemTime() {
		 return LocalDateTime.now().toString().replace(":", "-");
		
	}
	
	/**
	 * This method will return random number within 1000
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran= new Random();
		return ran.nextInt(1000);
	}
	
	
	
	
}
