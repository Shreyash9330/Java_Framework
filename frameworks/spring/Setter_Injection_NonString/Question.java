package mypack;

import java.util.List;

public class Question {
		
	private int qid;
	private String qname;
	 List<Answer> ans;
	
	
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


	public List<Answer> getAns() {
		return ans;
	}


	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}


	public void show()
	{
		System.out.println(qid +" "+qname);
		System.out.println(ans);
		for(Answer a:ans)
		{
			System.out.println(a);
		}
		
	}

	
}
