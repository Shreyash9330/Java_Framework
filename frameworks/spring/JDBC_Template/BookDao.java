package mypack;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BookDao {

		private JdbcTemplate jdbcTemplate;

		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

		
		public int insertRec(Book b)
		{
			String q="insert into bookinfo values("+b.getBid()+",'"+b.getBname()+"',"+b.getBprice()+" )";
			return jdbcTemplate.update(q);
		}
		
		public int UpdateRec(Book b)
		{
			String q = "update bookinfo set bname='"+b.getBname()+"',bprice="+b.getBprice()+" Where bid = "+b.getBid()+" ";
			return jdbcTemplate.update(q);
		}
		
		public int deleteRec(Book b)
		{
			String q = "delete from bookinfo where bid= "+b.getBid()+" ";
			return jdbcTemplate.update(q);
		}
		
		public void show()
		{
			List<Book> li = new ArrayList<Book>();
			
			jdbcTemplate.query("select * from bookinfo",new RowMapper<Object>()
			{
				@Override
				public Object mapRow(ResultSet rs, int rows) throws SQLException {
					Book b=new Book();
					b.setBid(rs.getInt(1));
					b.setBname(rs.getString(2));
					b.setBprice(rs.getInt(3));
					li.add(b);
					return b;
				}
				
			});
			
			System.out.println("Book Id\tBook Name\tPrice \n");
			for(Book b1:li)
			{
				System.out.println(b1);
			}
		}
		
}
