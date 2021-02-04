package looseCoupling;

public class Science implements TeacherInterface {
    @Override
    public void lessonName() {
        System.out.println("Lesson is Science");
    }

    @Override
    public void topic() {
        System.out.println("Modern Physics");
    }

    @Override
    public void time() {
        System.out.println("1.00 PM");
    }
}
