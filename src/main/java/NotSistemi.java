
public class NotSistemi {
/*
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut","43241231","MTH");
        Teacher t2 = new Teacher("Kemal","234234","FZK");
        Teacher t3 = new Teacher("Yusuf","342123","KMY");

        Course mat = new Course("Matematik","101","MTH");
        mat.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya","101","KMY");
        kimya.addTeacher(t3);
        mat.printTeacher();
        fizik.printTeacher();
        kimya.printTeacher();
        Student s1 = new Student("Yusuf","123","3",mat,fizik,kimya);
        s1.addBullExamNote(50,35,75);
        s1.printNote();
        s1.isPass();
        Student s2 = new Student("Hivda", "312314", "2", mat, fizik, kimya);
        s2.addBullExamNote(100,50,40);
        s2.printNote();
        s2.isPass();
    }*/

    public static void main(String[] args) {
        Teacher t1 =new Teacher("Mahmut","12432412","FZK");
        Teacher t2 = new Teacher("Ethem","33431","KMY");
        Teacher t3 = new Teacher("Yaman","123124","BYJ");

        Course fizik= new Course("Fizik","123","FZK");
        Course kimya = new Course("Kimya","213","KMY");
        Course biyo = new Course("Biyoloji","444","BYJ");

        fizik.EkleTeacher(t1);
        kimya.EkleTeacher(t2);
        biyo.EkleTeacher(t3);
        Student s1 =new Student("Yusuf","122","1",fizik,kimya,biyo);
        Student s2 = new Student("Emes","234","3",fizik,kimya,biyo);
        s1.SinavNotlari(45,60,65);
        s1.SozluNotlari(45,45,65);
        s1.GectiMi();
        s2.SinavNotlari(30,45,70);
        s2.SozluNotlari(55,60,55);
        s2.GectiMi();

    }



















}
