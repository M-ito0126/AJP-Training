import java.io.Serializable;
import java.util.Date;

public class User {
    public class UserBean implements Serializable {
        private static final long serialVersionUID = 1L;
            private String id;
            private String name;
            private String pass;
            private Date birthday;
            private int age;
            
            public UserBean() {
            }
            //id
            public void setId(String id) {
                this.id = id;
            }
            public String getId() {
                return this.id;
            }
            //name
            public void setName(String name) {
                this.name = name;
            }
            public String getName() {
                return this.name;
            }
            //pass
            public void setPass(String pass) {
                this.pass = pass;
            }
            public String getPass() {
                return this.pass;
            }
            //birthday
            public void setBirthday(Date birthday) {
                this.birthday = birthday;
            }
            public Date getBirthday() {
                return this.birthday;
            }
            //age
            public void setAge(int age) {
                this.age = age;
            }
            public int getAge() {
                return this.age;
            }
    }
    
    public static void main(String []args) {
        new User().new UserBean();
    }
}