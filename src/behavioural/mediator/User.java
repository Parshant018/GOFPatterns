package behavioural.mediator;

public class User {
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public void sendMessage(String msg) {
        mediator.sendMessage(msg, this);
    }

    public void receiveMessage(String msg, User sender) {
        System.out.println("msg : "+ msg + "from : "+sender.getName() + " to : "+ name);
    }
}
