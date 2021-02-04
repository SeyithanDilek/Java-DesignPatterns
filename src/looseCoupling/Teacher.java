package looseCoupling;

public class Teacher {
    private TeacherInterface teacherInterface;

    public Teacher(TeacherInterface teacherInterface) {
        this.teacherInterface = teacherInterface;
    }

    public void lessonName(){
        teacherInterface.lessonName();
    };
    public void topic(){
        teacherInterface.topic();
    };
    public void time(){
        teacherInterface.time();
    };


}
