import java.io.Serializable;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Userinfo {
    public class UserBean implements Serializable {
        //シリアライズUID
        private static final long serialVersionUID = 1L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        private int id;
        private String name;
        private String pass;
        private Date birthday;
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
        //改行コード
        String br = System.getProperty("line.separator");
        public String toString() {
            return "ユーザーID：{" + id + "}" + br + "ユーザー名：{" + name + "}" + br+ "パスワード：{" + pass + "}" + br 
                                   + "生年月日：{" + (sdf.format(birthday)) + "}" + br + "年齢：{" + age + "}";
        }
    }
    public static void main(String []args) {
        UserBean ub = new Userinfo().new UserBean();
        ub.setProperties(02, "伊藤", "abi2", 21);
        try {
            ub.setBirthday("1998年10月24日");
        }
        catch(ParseException e) {
            e.printStackTrace();
        }
        System.out.print(ub.toString());
    }
}