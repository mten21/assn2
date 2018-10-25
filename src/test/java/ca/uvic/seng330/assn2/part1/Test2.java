package ca.uvic.seng330.assn2.part1;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class Test2 {
	
	@Test
	public void testOne() {
		Hub mediator = new Hub();
		Camera c1 = new Camera();
		SmartPlug s1 = new SmartPlug();
		Lightbulb l1 = new Lightbulb();
		Thermostat t1 = new Thermostat();
		mediator.register(c1);
		mediator.register(s1);
		mediator.register(l1);
		mediator.register(t1);
		
		mediator.alert("Test");
		
		AndroidClient a1 = new AndroidClient();
		
		JSONObject obj = new JSONObject();
		try {
			obj.put("msg_id",new Integer(1));
			obj.put("node_id",new Integer(20));
			obj.put("status","good");
			obj.put("payload","day");
			obj.put("created_at","december");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a1.notify(obj); //notifying client with JSON object, should read contents and print
		System.out.println("notified");
	}
}
