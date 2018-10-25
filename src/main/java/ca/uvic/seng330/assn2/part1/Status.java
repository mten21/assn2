package ca.uvic.seng330.assn2.part1;
import java.util.UUID;

class Status {
	String message = "";
	
	Status(UUID uuid) {
		message = uuid.toString()+"- Hub: good.";
	}
	
	Status(UUID uuid, boolean is_on, int device) {
		if (device == 0) {
			if (is_on)
				message = uuid.toString()+"-Light bulb: turned on.\n";
			else
				message = uuid.toString()+"-Light bulb: turned off.\n";
		}
		else if (device == 1) {
			if (is_on)
				message = uuid.toString()+"-SmartPlug: turned on.\n";
			else
				message = uuid.toString()+"-SmartPlug: turned off.\n";
		}
		else {
			if (is_on)
				message = uuid.toString()+"-Camera: recording.\n";
			else
				message = uuid.toString()+"-Camera: stopped recording.\n";
		}
			 
	}
	
	Status(UUID uuid, int temperature) {
		message = uuid.toString()+"-Thermostat: Temperature is " + temperature + " degrees.\n";
	}
}
