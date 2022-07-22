import java. util. *;

public class MarkContainer {

    Stack<MarkProcess.ProgressMemento>  markHistory = new Stack<>();

    public void saveProgress(MarkProcess markProcess){
        markHistory.push(markProcess.saveProgress());
    }

    public void undoProgress(MarkProcess markProcess){
        if(!markHistory.isEmpty())
            markProcess.undoProgress(markHistory.pop());
        else
            System.out.println("Sorry Can't undo!");
    }
}