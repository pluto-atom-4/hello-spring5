package internal.example.spring.springboot.bean;

public class WelcomeBean {

    final private String message;

    public WelcomeBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
