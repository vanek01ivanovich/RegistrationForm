import controller.Controller;
import model.entity.NoteBook;
import view.View;

public class Main {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        View view = new View();
        Controller controller = new Controller(view, noteBook);

        controller.processUser();
    }
}
