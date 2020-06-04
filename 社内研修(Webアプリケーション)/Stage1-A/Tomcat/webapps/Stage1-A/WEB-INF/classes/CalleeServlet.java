import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/CalleeServlet")

//HttpServletクラスを継承したServletTestクラスですよ
public class CalleeServlet extends HttpServlet {
    //doGet()メソッドをオーバーライドして定義しますね
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ContentTypeを設定
        response.setContentType("text/html; charset=UTF-8");
        //HTMLを出力するためのPrintWriterオブジェクトを取得
        PrintWriter out = response.getWriter();
        /*getRedColorに以下の引数をセットし、redWordに代入
            引数の詳細：(1)文字の位置と大きさ (2)文字の色 (3)文字 */
        String redWord = getRedColor("position:absolute; top:50%; left:50%; transform:translateY(-50%) translateX(-50%); -webkit- transform: translateY(-50%) translateX(-50%); font-size:70px", "red", "Stage5-A完了！");
        request.setAttribute("word", redWord);
        //result.jspに遷移するよ～
        RequestDispatcher dispatch = request.getRequestDispatcher("/jsp/result.jsp");
		dispatch.forward(request, response);
    }
    //HTMLのプログラムとして戻す
    public String getRedColor(String css, String color, String comp) {
        return "<div style=\"" + css + "\"><font color=\"" + color + "\">" + comp + "</font></div>";
    }
}