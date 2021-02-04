package looseCoupling;

public class Main {
    public static void main(String[] args) {
        TeacherInterface teacherInterface=new Math();
        Teacher  teacher= new Teacher(teacherInterface);

        teacher.lessonName();
        teacher.time();
        teacher.topic();
    }
}
