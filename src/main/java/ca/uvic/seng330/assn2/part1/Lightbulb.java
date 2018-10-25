package ca.uvic.seng330.assn2.part1;

import java.util.UUID;

public class Lightbulb implements Device {
	
	private UUID uuid;
	private boolean lightbulb_on;
	
	public Lightbulb() {
		uuid = UUID.randomUUID();
		lightbulb_on = false;
	}
	
	@Override
	public Status getStatus() {
		return new Status(uuid, lightbulb_on, 0);
	}
	
	@Override
	public UUID getIdentifier() {
		return uuid;
	}
	
	public void toggle() {
		if (lightbulb_on == true)
			lightbulb_on = false;
		else
			lightbulb_on = true;
	}
}
