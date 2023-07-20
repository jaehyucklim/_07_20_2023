package _tp_hw;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletExample2")
public class ServletExample2 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ServletExample2() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 응답 컨텐츠 타입과 인코딩 설정
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        
        // JSP 페이지로 이동하기 위한 RequestDispatcher 생성
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("_tp_hw/ServletExample.jsp");
        
        // 생성한 RequestDispatcher를 사용하여 JSP 페이지로 포워딩
        requestDispatcher.forward(request, response);
    }
}
