package ca.uvic.seng330.assn2.part1;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Hub implements Device {

	private static int msg_id;
	private static int node_id;
	private static String status;
	private static String payload;
	private static String created_at;
	private List<Device> users;
	private UUID uuid;
	
	private static String message_temp;
	
	private static final Logger logger = LoggerFactory.getLogger(Hub.class);
	
	public Hub() {
		this.users = new ArrayList<Device>();
		uuid = UUID.randomUUID();
	}
	
	public static void log() {
		logger.info(message_temp);
	}
	
	public void alert(String message) {
		System.out.println("Hub receiving message: "+message);
		message_temp = message;
		log();
	}
	
	public void register(Device device) {
		this.users.add(device);
	}
	
	public void startup() {
		this.users = new ArrayList<>();
	}
	
	public void shutdown() {
		
	}

	public void notify(org.json.JSONObject pMsg) {
		try {
			msg_id = pMsg.getInt("msg_id");
			node_id = pMsg.getInt("node_id");
			status = pMsg.getString("status");
			payload = pMsg.getString("payload");
			created_at = pMsg.getString("created_at");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Notifying clients");
		
	}
	
	@Override
	public Status getStatus() {
		return new Status(uuid);
	}
	@Override
	public UUID getIdentifier() {
		return uuid;
	}
	
	/*
	@Override
	public void send(String message, User user) {
		for (User u : this.users) {
			if (u != user) {
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		if (users != null)
			register(user);	
		else {
			this.users = new ArrayList<>();
			register(user);
		}
	}*/
}
