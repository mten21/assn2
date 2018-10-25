package ca.uvic.seng330.assn2.part1;

import org.json.JSONException;
import org.json.JSONObject;

public class AndroidClient implements Client {
	
	static int msg_id;
	static int node_id;
	static String status;
	static String payload;
	static String created_at;
	
	public AndroidClient() {}
	
	@Override
	public void notify(org.json.JSONObject pMsg) {
		try {
			msg_id = pMsg.getInt("msg_id");
			node_id = pMsg.getInt("node_id");
			status = pMsg.getString("status");
			payload = pMsg.getString("payload");
			created_at = pMsg.getString("created_at");
			System.out.println("trying good");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("msg_id: "+msg_id+", node_id: "+node_id+", status: "+status
				+", paylod: "+payload+", created_at:"+created_at);
		
	}
}
