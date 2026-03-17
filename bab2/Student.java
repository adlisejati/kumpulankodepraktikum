package bab2;
public class Student {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    private static int jumlahObjek = 0;

    // constructor tanpa parameter
    public Student(){
        name = "";
        address = "";
        age = 0;
        jumlahObjek++;
    }

    // constructor dengan parameter nama, alamat, umur
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        jumlahObjek++;
    }

   
    public Student(String n, String a, int ag, double math, double english, double science){
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        jumlahObjek++;
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(double math){
        mathGrade = math;
    }

    public void setEnglish(double english){
        englishGrade = english;
    }

    public void setScience(double science){
        scienceGrade = science;
    }

    private double getAverage(){
        return (mathGrade + englishGrade + scienceGrade) / 3;
    }

    // Method boolean 
    public boolean statusAkhir(){
        if(getAverage() >= 61){
            return true;
        } else {
            return false;
        }
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());

        if(statusAkhir()){
            System.out.println("Status: Lolos");
        }else {
            System.out.println("Status: Remidi");
        }
        System.out.println();
        }
        public static void jumlahObjek(){
            System.out.println("Jumlah objek Student yang telah dibuat: " + jumlahObjek);
        }
    }