package comment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comment.service.CommentService;
import comment.vo.CommentVO;

/**
 * Servlet implementation class EditCmntServlet
 */
@WebServlet("/editCmnt")
public class EditCmntServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCmntServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String comment_id = request.getParameter("comment_id");
		String content = request.getParameter("content");
		CommentVO vo = new CommentVO();
		vo.setComment_id(Integer.parseInt(comment_id));
		vo.setContent(content);
		//System.out.println("Servlet: "+vo);
		
		CommentService service = new CommentService();
		int result = service.editComment(vo);
		System.out.println("result:"+result);
		
		if(result == 1) {
			PrintWriter out = response.getWriter();
			out.println(result);
		}
	}

}
