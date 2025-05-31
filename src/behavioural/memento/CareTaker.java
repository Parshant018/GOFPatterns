package behavioural.memento;

import java.util.Stack;

//Manage memento
public class CareTaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if(!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}
