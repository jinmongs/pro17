package board.ex01;

import java.sql.Date;

public class ArticleVO {
	private int articleNO;
	private int parentNO;
	private String title;
	private String content;
	private String imageFilName;
	private String id;
	private Date writeDate;
	
	public ArticleVO() {}
	public ArticleVO(int articleNO, int parentNO, String title, String content, String imageFilName, String id,
			Date writeDate) {
		super();
		this.articleNO = articleNO;
		this.parentNO = parentNO;
		this.title = title;
		this.content = content;
		this.imageFilName = imageFilName;
		this.id = id;
		this.writeDate = writeDate;
	}
	public int getArticleNO() {
		return articleNO;
	}
	public void setArticleNO(int articleNO) {
		this.articleNO = articleNO;
	}
	public int getParentNO() {
		return parentNO;
	}
	public void setParentNO(int parentNO) {
		this.parentNO = parentNO;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImageFilName() {
		return imageFilName;
	}
	public void setImageFilName(String imageFilName) {
		this.imageFilName = imageFilName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	
}
