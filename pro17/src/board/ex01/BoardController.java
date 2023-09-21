package board.ex01;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	BoardService boardService;
	ArticleVO articleVO;
    	
	public void init(ServletConfig config) throws ServletException {
		boardService =new BoardService();
		articleVO = new ArticleVO();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nextPage = "";
		request.setCharacterEncoding("UTF-8");  
		response.setContentType("text/html;charset=utf-8");
		String action = request.getPathInfo();
		try {
			if (action==null || action.equals("/listArticles.do")) {
				List<ArticleVO> list = boardService.listArticles();
				request.setAttribute("articles", list);
				nextPage = "/boardpage/listArticles.jsp";
			} 
				
			
			
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
