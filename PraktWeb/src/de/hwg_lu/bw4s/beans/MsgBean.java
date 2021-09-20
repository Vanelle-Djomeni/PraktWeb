package de.hwg_lu.bw4s.beans;

public class MsgBean {

	String infoMsg;
	String actionMsg;
	public MsgBean() {
		this.setDefault();
	}
	public void setDefault(){
		infoMsg   = "Willkommen zum Fanshop";
		actionMsg = "Was darf's denn sein?";
	}
	public String getInfoMsg() {
		return infoMsg;
	}
	public void setInfoMsg(String infoMsg) {
		this.infoMsg = infoMsg;
	}
	public String getActionMsg() {
		return actionMsg;
	}
	public void setActionMsg(String actionMsg) {
		this.actionMsg = actionMsg;
	}
	
	
	
}
