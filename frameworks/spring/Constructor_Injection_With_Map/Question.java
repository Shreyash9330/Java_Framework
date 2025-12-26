package mypack;

import java.util.Map;

public class Question {
	private int qid;
	private String qname;
	private Map<String,String> ans;
	public Question(int qid, String qname, Map<String, String> ans) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.ans = ans;
	}
	
	void show()
	{
		System.out.println(qid+"  "+qname);
		System.out.println("Ans : ");
		for(Map.Entry m:ans.entrySet())
		{
			System.out.println(m.getKey()+"  Posted by,"+m.getValue());
		}
				
	}
	}
	

