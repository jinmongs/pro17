package board.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public BoardDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/test");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<ArticleVO> selectAllArticles() {
		List<ArticleVO> articlesList = new ArrayList<>();
		try {
//			connDB();
			con = dataFactory.getConnection();
			String query = "select * from freeboard";
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while( rs.next() ) {
				int articleNO = rs.getInt("articleNO");
			      int parentNO = rs.getInt("parentNO");
			      String title = rs.getString("title");
			      String content = rs.getString("content");
			      String id = rs.getString("id");
			      Date writeDate= rs.getDate("writeDate");
			      ArticleVO article = new ArticleVO();
			      article.setArticleNO(articleNO);
			      article.setParentNO(parentNO);
			      article.setTitle(title);
			      article.setContent(content);
			      article.setId(id);
			      article.setWriteDate(writeDate);
			      articlesList.add(article);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return articlesList;
		
	}
}
