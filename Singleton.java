/* Singleton lazy initialization						
 */

import java.util.*;

public class Singleton {
	private static Singleton instance = null;

	private Singleton () {
		//constructor needs to be private
	}

	public static Singleton getInstance() {
		if(instance == null) instance = new Singleton();
		return instance;
	} 
	
}