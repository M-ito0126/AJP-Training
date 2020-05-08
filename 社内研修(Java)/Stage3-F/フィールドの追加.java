import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UserinfoAdd {
    public static class UserBean implements Serializable {
        //シリアルバージョンUID
        private static final long serialVersionUID = 1L;
        //Beansクラスのインスタンスをカウントする変数
        private static int cnt;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        private int id;
        private String name;
        private String pass;
        private Date birthday;
        private int age;
        private String affiliation;
        //コンストラクタ
        public UserBean() {
        }
        public UserBean(String affiliation) {
            this.affiliation = affiliation;
            UserBean.cnt ++;
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
        String br = System.getProperty("line.separator");
        public String toString() {
            return "ユーザーID：{" + this.getId() + "}" + br + "ユーザー名：{" + this.getName() + "}" + br + "パスワード：{" + this.getPass() + "}"
                                   + br + "生年月日：{" + (sdf.format(this.getBirthday())) + "}" + br + "年齢：{" + this.getAge() + "}";
        }
    }
    public static void main(String []args) {
        UserinfoAdd ui = new UserinfoAdd();
        UserinfoAdd.UserBean ub = new UserBean("Osaka");
        ub.setProperties(02, "伊藤", "abi2", 21);
        try {
            ub.setBirthday("1998年10月24日");
        }
        catch(ParseException e) {
            e.printStackTrace();
        }
        System.out.println(ub.toString());
        System.out.println("所属地：{" + ub.affiliation + "}");
        System.out.println("カウント数：{" + UserBean.cnt + "}");
    }
}