package nasHorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 * NasHorn is javascript engine
 *  It is used to execute javascript code dynamically at JVM
 */

public class nasHornExample {

	public static void main(String[] args)  {
	      //create script Engine
		ScriptEngine ee=new ScriptEngineManager().getEngineByName("Nashorn");
		
		try {
			ee.eval("print('Hello');");
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new StringBuffer();
		
	}

}
