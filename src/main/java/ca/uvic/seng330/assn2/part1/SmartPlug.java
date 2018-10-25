package ca.uvic.seng330.assn2.part1;

import java.util.UUID;

public class SmartPlug implements Device {
	
	private UUID uuid;
	private boolean smartplug_on;
	
	public SmartPlug() {
		uuid = UUID.randomUUID();
		smartplug_on = false;
	}
	
	@Override
	public Status getStatus() {
		return new Status(uuid, smartplug_on, 1);
	}
	
	@Override
	public UUID getIdentifier() {
		return uuid;
	}
	
	public void toggle() {
		if (smartplug_on == true)
			smartplug_on = false;
		else
			smartplug_on = true;
	}
}
