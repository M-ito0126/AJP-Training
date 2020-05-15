import java.io.Serializable;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Userinfo {
    public class UserBean implements Serializable {
        //シリアライズUID
        private static final long serialVersionUID = 1L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //ユーザID
        private int id;
        //ユーザ名
        private String name;
        //パスワード
        private String pass;
        //生年月日
        private Date birthday;
        //年齢
        private int age;
        //コンストラクタ
        public UserBean() {
        }
        //getter
        public int getId() {
            return this.id;
        }
        public String getName() {
            return this.name;
        }
        public String getPass() {
            return this.pass;
        }
        public Date getBirthday() {
            return this.birthday;
        }
        public int getAge() {
            return this.age;
        }
        //setter
        public void setProperties(int id, String name, String pass, int age) {
            this.id = id;
            this.name = name;
            this.pass = pass;
            this.age = age;
        }
        public void setBirthday(String birthday) throws ParseException {
            this.birthday = sdf.parse(birthday);
        }
        //改行コードの取得
        String br = System.getProperty("line.separator");
        @Override
        //toStringメソッドの戻り値に出力したいBeansクラスの各変数と文字列を返す
        public String toString() {
            return "ユーザーID：{" + this.id + "}" + br + "ユーザー名：{" + this.name + "}" + br+ "パスワード：{" + this.pass + "}" + br 
                                   + "生年月日：{" + (sdf.format(this.birthday)) + "}" + br + "年齢：{" + this.age + "}";
        }
    }
    public static void main(String []args) {
        //外部クラスUserinfoのインスタンスを生成し、内部クラスUserBeanのインスタンスを生成
        UserBean ub = new Userinfo().new UserBean();
        //UserBeanにユーザID、ユーザ名、パスワード、年齢をセット
        ub.setProperties(02, "伊藤", "abi2", 21);
        //UserBeanに生年月日をセット
        try {
            ub.setBirthday("1998年10月24日");
        }
        catch(ParseException e) {
            //スタックトレース（例外内容）を出力
            e.printStackTrace();
        }
        System.out.print(ub);
    }
}