public class SubMarks {//concrete class

    private final String stdId; // required
    private final Double mathMark; // required
    private final Double scienceMark; 	// optional
    private final Double itMark; // optional
    private final Double sportMark; 	// optional

    public SubMarks(SubMarkBuildder builder) {// constructor

        this.stdId = builder.stdId;
        this.mathMark = builder.mathMark;
        this.scienceMark = builder.scienceMark;
        this.itMark = builder.itMark;
        this.sportMark = builder.sportMark;
    }


    public static class SubMarkBuildder {   // Builder class

        private String stdId;
        private Double mathMark;
        private Double scienceMark;
        private Double itMark;
        private Double sportMark;

        //public MonthlySalaryBuilder() {}


        public SubMarks build() {
            return new SubMarks(this);
        }

        public SubMarkBuildder(String stdId, Double mathMark) {
            this.stdId = stdId;
            this.mathMark = mathMark;
        }


        public SubMarkBuildder addScienceMark(Double scienceMark) {
            this.scienceMark = scienceMark;
            return this;
        }

        public SubMarkBuildder addItMark(Double itMark) {
            this.itMark = itMark;
            return this;
        }

        public SubMarkBuildder addSportMark(Double sportMark) {
            this.sportMark = sportMark;
            return this;
        }
    }

    @Override
    public String toString() {
        return "builder student: " + stdId + " Math: " + mathMark + " Science: " + scienceMark + " IT: " + itMark + " Sports: " + sportMark;
    }
}
