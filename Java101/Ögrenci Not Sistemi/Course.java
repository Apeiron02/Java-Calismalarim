public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

    public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note= 0;
        int sozlu= 0;


    }
    public void EkleTeacher(Teacher teacher){
        if(teacher.bolum.equals(this.prefix)){
            this.teacher=teacher;
        }
        else{
            System.out.println("Ders ve Hoca uyuşmadı.");
        }

    }
    public void PrintTeacher(){
        this.teacher.print();
    }































}
