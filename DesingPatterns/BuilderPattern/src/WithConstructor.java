// the approach with constructor overloading
public class WithConstructor {

    String stdId;
    Double mathMark;
    Double scienceMark;
    Double itMark;
    Double sportMark;

    public WithConstructor(String stdId) {
        this.stdId = stdId;
    }

    public WithConstructor(String stdId, Double mathMark) {
        this.stdId = stdId;
        this.mathMark = mathMark;
    }

    public WithConstructor(String stdId, Double mathMark, Double scienceMark) {
        this.stdId = stdId;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;

    }

    public WithConstructor(String stdId, Double mathMark, Double scienceMark, Double itMark) {
        this.stdId = stdId;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.itMark = itMark;

    }

    public WithConstructor(String stdId, Double mathMark, Double scienceMark, Double itMark, Double sportMark) {
        this.stdId = stdId;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.itMark = itMark;
        this.sportMark = sportMark;
    }
}
