public class SubMarks2 {

    String stdId;
    Double mathMark;
    Double scienceMark;
    Double itMark;
    Double sportMark;

    public SubMarks2(String stdId, Double mathMark, Double scienceMark, Double itMark, Double sportMark) {

        this.stdId = stdId;
        this.mathMark = mathMark;
        this.scienceMark = scienceMark;
        this.itMark = itMark;
        this.sportMark = sportMark;
    }

    public SubMarks2(String stdId, Double mathMark, Double scienceMark, Double itMark) {
        this(stdId, mathMark, scienceMark, itMark, null);
    }

    public SubMarks2(String stdId, Double mathMark, Double scienceMark) {
        this(stdId, mathMark, scienceMark, null);
    }

    public SubMarks2(String stdId, Double mathMark) {
        this(stdId, mathMark, null);
    }

    public SubMarks2(String stdId) {
        this(stdId, null);
    }

    @Override
    public String toString() {
        return "tele: " + stdId + " Email: " + mathMark + " Basic salary: " + scienceMark + " Motor car allowance: " + itMark + " Bonus: " + sportMark;
    }
}
