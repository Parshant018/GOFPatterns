package behavioural.mediator;

public class RunMediator {
    public void run() {
        ChatRoom chatRoom = new ChatRoom();
        User aman = new User("aman", chatRoom);
        User rahul = new User("rahul", chatRoom);
        User soma = new User("Soma", chatRoom);

        chatRoom.addUser(aman);
        chatRoom.addUser(rahul);
        chatRoom.addUser(soma);

        aman.sendMessage("Hi everyone");
    }
}
