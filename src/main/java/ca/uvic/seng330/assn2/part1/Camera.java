package ca.uvic.seng330.assn2.part1;

import java.util.UUID;

public class Camera implements Device {
	
	private UUID uuid;
	private boolean recording;
	private boolean memory_full;
	
	public Camera() {
		uuid = UUID.randomUUID();
		recording = false;
		memory_full = false;
	}
	
	@Override
	public Status getStatus() {
		return new Status(uuid, recording, 2);
	}
	
	@Override
	public UUID getIdentifier() {
		return uuid;
	}
	
	public void record() {
		if (memory_full == true)
			recording = false;
		else if (recording == false)
			recording = true;
		else
			recording = false;
	}
}
