public class Application {

    public static void main(String[] args) {

        SubMarks2 subMarks2 = new SubMarks2("sub1");
        System.out.println(subMarks2);

        // with builder pattern
        SubMarks.SubMarkBuildder builder = new SubMarks.SubMarkBuildder("Stu1", 999.00);
        SubMarks subMarks = builder.addScienceMark(90.0).addItMark(95.00).build();

        System.out.println(subMarks);
    }

}
