package looseCoupling;

public class Math implements TeacherInterface {
    @Override
    public void lessonName() {
        System.out.println("Lesson is Math");
    }

    @Override
    public void topic() {
        System.out.println("Derivative");
    }

    @Override
    public void time() {
        System.out.println("11.00 AM");
    }
}
