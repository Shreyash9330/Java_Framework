package mypack;

import java.util.List;

public class Question {
	
	private int qid;
	private String qname;
	private List<String> ans;
	
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
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + ", ans=" + ans + "]";
	}
	
}
