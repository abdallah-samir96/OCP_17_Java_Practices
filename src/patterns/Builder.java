package patterns;

public class Builder {
    private String name;
    private String email;


    public Builder name(String name) {
        this.name = name;
        return this;
    }
    public Builder email(String email) {
        this.email = email;
        return this;
    }
    public Builder build() {
        return this;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
