package behavioural.memento;

//Stores inner state of editor
public class EditorMemento {

    private String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
