import java.util.ArrayList;

public class MarkProcess {

    ArrayList<MathMark> mathMarks = new ArrayList<>();

    public void addMathMark(MathMark inputTexts){
        mathMarks.add(inputTexts);

    }

    @Override
    public String toString(){
        return "Mark level is :"+mathMarks;
    }

    public ArrayList<MathMark> getProgressClone(){
        return (ArrayList)mathMarks.clone();
    }


    //save
    public ProgressMemento saveProgress(){
        return new ProgressMemento( getProgressClone());
    }

    //undo
    public void undoProgress(ProgressMemento progressMemento){
        mathMarks = progressMemento.getProgress();
    }


    static class ProgressMemento{

        ArrayList<MathMark> gameLevel = new ArrayList<>();

        public ProgressMemento( ArrayList<MathMark> mark){
            this.gameLevel = mark;
        }

        private ArrayList<MathMark> getProgress(){
            return gameLevel;
        }
    }
}