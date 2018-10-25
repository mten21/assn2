package ca.uvic.seng330.assn2.part1;

import java.util.UUID;

public class Thermostat implements Device {

	private UUID uuid;
	private int temperature;
	
	public Thermostat() {
		uuid = UUID.randomUUID();
		temperature = 0;
	}
	
	@Override
	public Status getStatus() {
		return new Status(uuid, temperature);
	}
	
	@Override
	public UUID getIdentifier() {
		return uuid;
	}
	
	public void setTemp(Temperature t) {
		this.temperature = t.getTemp();
	}
	
}
