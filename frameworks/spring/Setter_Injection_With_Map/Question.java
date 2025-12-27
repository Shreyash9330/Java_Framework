package mypack;

import java.util.Map;

public class Question {
	private int qid;
	private String qname;
	private Map<String ,String> ans;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public Map<String, String> getAns() {
		return ans;
	}
	public void setAns(Map<String, String> ans) {
		this.ans = ans;
	}
	
	void show()
	{
		System.out.println(qid+" "+qname);
		System.out.println("Answers :");
		
		for(Map.Entry m : ans.entrySet())
		{
			System.out.println(m.getKey()+" Postedby...,"+m.getValue());
		}
	}
}
