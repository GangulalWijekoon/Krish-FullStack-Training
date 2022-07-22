public class Application{

    public static void main(String[] args){

        MarkContainer markContainer = new MarkContainer();

        MarkProcess markProcess = new MarkProcess();

        markProcess.addMathMark( new MathMark("Math Mark1: 100"));
        markContainer.saveProgress(markProcess);
        System.out.println(markProcess);

        markProcess.addMathMark( new MathMark("Math Mark2: 80"));
        markContainer.saveProgress(markProcess);
        System.out.println(markProcess);

        markContainer.undoProgress(markProcess);
        System.out.println(markProcess);
    }
}