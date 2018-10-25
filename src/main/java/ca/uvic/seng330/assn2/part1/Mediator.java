package ca.uvic.seng330.assn2.part1;

public interface Mediator {
	//public void send(String message, User user);
	
	//void addUser(User user);
	void notify(org.json.JSONObject pMsg);
}
