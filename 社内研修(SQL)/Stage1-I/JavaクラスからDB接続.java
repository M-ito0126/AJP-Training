import java.sql.*;

public class TaskdbConnect {
    public class ProcessClass {
        //JDBCドライバを使用してConnectionを返すメソッド
        public Connection getConnect() throws Exception{
            //データベースに接続
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/TASK_DB?useUnicode=true&characterEncoding=utf8", "root", "");
            return con;
        }
        //引数に応じて抽出条件が変わり、結果を文字列として返すメソッド
        public String getResult(String userId) {
            try {
                //JDBCドライバを使用してConnectionを返すメソッドの呼び出し
                Connection con = getConnect();
                //SQL文をデータベースに送るためのステートメントオブジェクトを生成
                Statement stmt = con.createStatement();
                //クエリ
                String sql = "SELECT COUNT(*) FROM T_USER WHERE USER_NM LIKE '%田%' AND USER_ID = '" + userId + "'";
                //実行結果を格納
                ResultSet resultS = stmt.executeQuery(sql);
                //結果を一件ずつ取得する
                resultS.next();
                //取得結果を文字列として変数に代入
                String result = resultS.getString( "COUNT(*)" );
                //結果セットをクローズ
                resultS.close();
                //ステートメントをクローズ
                stmt.close();
                //接続をクローズ
                con.close();
                //文字列resultを返す
                return result;
            }
            catch(SQLException e1) {
                //エラーメッセージを返す
                return e1.toString();
            }
            catch(Exception e) {
                //エラーメッセージを返す
                return e.toString();
            }
        }
    }
    public static void main(String args[]) throws Exception {
        //内部クラスのインスタンスを生成
        ProcessClass pc = new TaskdbConnect().new ProcessClass();
        //結果を文字列として返すメソッドの呼び出し
        String strSql = pc.getResult("AISHIDA");
        System.out.println(strSql);
    }
}