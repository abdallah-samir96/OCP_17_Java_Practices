package patterns.creational.builder;

public class UserDetails {

    private final String name;
    private final String username;
    private final String password;
    private final String email;
    private final String mobile;


    private UserDetails(Builder builder) {
        this.email = builder.email;
        this.name = builder.name;
        this.username = builder.username;
        this.password = builder.password ;
        this.mobile = builder.mobile;
    }


    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public static class Builder{

        private  String name;
        private  String username;
        private  String password;
        private  String email;
        private  String mobile;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder username(String username) {
            this.username = username;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public UserDetails build(){
            return new UserDetails(this);
        }

    }
}
