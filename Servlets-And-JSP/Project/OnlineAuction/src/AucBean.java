package bean;

public class AucBean {
	private int itemid;
	private String itemname;
	private String yourname;
	private String email;
	private int amount;
	private String check;
	
	public AucBean() {
		
	}
	public AucBean(int itemid,String itemname,String name,String mail,int amount, String check) {
		this.itemid=itemid;
		this.itemname = itemname;
		this.yourname=  name;
		this.email = mail;
		this.amount = amount;
		this.check = check;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getName() {
		return yourname;
	}
	public void setName(String name) {
		this.yourname = name;
	}
	public String getMail() {
		return email;
	}
	public void setMail(String mail) {
		this.email = mail;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCheck() {
		return check;
	}
	public String setCheck(String check) {
		return this.check = check;
	}
	
}
