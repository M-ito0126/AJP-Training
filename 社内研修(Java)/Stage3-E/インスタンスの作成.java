import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Userinfo {
    //インスタンス生成数をカウントする変数
    public static int cnt = 0;
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
        //所属地
        private String affiliation;
        //コンストラクタ
        public UserBean() {
        }
        //setter
        public void setId(int id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setPass(String pass) {
            this.pass = pass;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setBirthday(String birthday) throws ParseException {
            this.birthday = sdf.parse(birthday);
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
        public String getBirthday() {
            return sdf.format(this.birthday);
        }
        public int getAge() {
            return this.age;
        }
        //改行コードの取得
        String br = System.getProperty("line.separator");
        @Override
        //toStringメソッドの戻り値に出力したいBeansクラスの各変数と文字列を返す
        public String toString() {
            return "ユーザーID：{" + this.id + "}" + br + "ユーザー名：{" + this.name + "}" + br + "パスワード：{" + this.pass + "}"
                   + br + "生年月日：{" + getBirthday() + "}" + br + "年齢：{" + this.age + "}";
        }
    }
    public static void main(String []args) {
        //外部クラスUserinfoのインスタンスを生成し、内部クラスUserBeanのインスタンスを生成
        UserBean ub = new Userinfo().new UserBean();
        //UserBeanにユーザID、ユーザ名、パスワード、生年月日、年齢をセット
        ub.setId(02);
        ub.setName("伊藤");
        ub.setPass("abi2");
        try {
            ub.setBirthday("1998年10月24日");
        }
        catch(ParseException e) {
            //スタックトレース（例外内容）を出力
            e.printStackTrace();
        }
        ub.setAge(21);
        System.out.println(ub);
    }
}