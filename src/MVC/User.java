package MVC;

public abstract class User {
    private String furstName;
    private String secondName;
    private String lastName;

    public User(String furstName, String secondName, String lastName) {
        this.furstName = furstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFurstName() {
        return furstName;
    }

    public void setFurstName(String furstName) {
        this.furstName = furstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "furstName='" + furstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
