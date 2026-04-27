package bab7;

public abstract class Employee {
    private String name;
    private String noKTP;
    private String tanggalLahir;

    public Employee(String name, String noKTP, String tanggalLahir){
        this.name = name;
        this.noKTP = noKTP;
        this.tanggalLahir = tanggalLahir;
    }

    public String getName(){ return name; }
    public String getNoKTP(){ return noKTP; }
    public String getTanggalLahir(){ return tanggalLahir; }

    public int getBulanLahir(){
        return Integer.parseInt(tanggalLahir.substring(5,7));
    }

    public abstract double earnings();
}