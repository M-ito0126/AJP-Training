import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class UserinfoAdd {
    //インスタンス生成数をカウントする変数
    public static int cnt = 0;
    public class UserBean implements Serializable {
        //シリアライズUID
        private static final long serialVersionUID = 1L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //インスタンスフィールド
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
            //外部クラスUserinfoの変数cntでUserBeanのコンストラクタが生成されるたびにカウントする
            UserinfoAdd.this.cnt ++;
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
        public void setAffiliation(String affiliation) {
            this.affiliation = affiliation;
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
        public String getAfflication() {
            return this.affiliation;
        }
        String br = System.getProperty("line.separator");
        public String toString() {
            return "ユーザーID：{" + this.id + "}" + br + "ユーザー名：{" + this.name + "}" + br + "パスワード：{" + this.pass + "}"
                                   + br + "生年月日：{" + sdf.format(this.birthday) + "}" + br + "年齢：{" + this.age + "}";
        }
    }
    public static void main(String []args) {
        UserBean ub = new UserinfoAdd().new UserBean("Osaka");
        ub.setProperties(02, "伊藤", "abi2", 21);
        try {
            ub.setBirthday("1998年10月24日");
        }
        catch(ParseException e) {
            e.printStackTrace();
        }
        System.out.println(ub.toString());
        System.out.println("所属地：{" + ub.affiliation + "}");
        System.out.println("カウント数：{" + UserinfoAdd.cnt + "}");
    }
}