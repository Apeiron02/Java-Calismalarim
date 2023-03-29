public class Student {

    String name;
    String StuNo;
    String sinif;
    Course fizik;
    Course kimya;
    Course biyo;
    double avarage;
    boolean GectiMi;

     Student(String name, String StuNo, String sinif, Course fizik, Course kimya, Course biyo){
        this.name =name;
        this.StuNo=StuNo;
        this.sinif=sinif;
        this.fizik=fizik;
        this.kimya=kimya;
        this.biyo=biyo;
        this.avarage=0.0;
        this.GectiMi=false;
    }
    void SinavNotlari(int not1,int not2,int not3){
         if (not1>=0 && not1<=100){
             this.fizik.note =not1;
         }
        if (not2>=0 && not2<=100){
            this.kimya.note =not2;
        }
        if (not3>=0 && not3<=100){
            this.biyo.note =not3;
        }
    }
    void SozluNotlari(int s1,int s2,int s3){
        if (s1>=0 && s1<=100){
            this.fizik.sozlu =s1;
        }if (s2>=0 && s2<=100){
            this.kimya.sozlu =s2;
        }if (s3>=0 && s3<=100){
            this.biyo.sozlu =s3;
        }

    }

    public void GectiMi(){
         double avr1 = (fizik.note*0.8)+(fizik.sozlu*0.2);
         double avr2 = (kimya.note*0.7)+(kimya.sozlu*0.3);
         double avr3 = (biyo.note*0.9)+(biyo.sozlu*0.1);
         this.avarage = (avr1+avr2+avr3)/3;
         if (this.avarage>55)
         {
             System.out.println("----------------");
             System.out.println("Sınıfı Geçti.");
             System.out.println("Adı:"+this.name);
             System.out.println("Fizik Notu: "+(avr1));
             System.out.println("Kimya Notu: "+(avr2));
             System.out.println("Biyoloji Notu: "+(avr3));
             System.out.println("Ortalaması:"+this.avarage);
         }
         else
         {
             System.out.println("----------------");
             System.out.println("Sınıfta kaldı.");
             System.out.println("Adı:"+this.name);
             System.out.println("Fizik Notu: "+(avr1));
             System.out.println("Kimya Notu: "+(avr2));
             System.out.println("Biyoloji Notu: "+(avr3));
             System.out.println("Ortalaması:"+this.avarage);
         }

     }


}
