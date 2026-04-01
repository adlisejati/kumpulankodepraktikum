package bab4;

public class Student {
    private String name; 
    private int mark; 

    public void setName(String n) { 
        name = n; 
    } 

    public String getName() { 
        return name; 
    } 

    public void setMark(int m) { 
        if (m >= 0 && m <= 100) { 
            mark = m; 
        } else {
            System.out.println("Nilai tidak valid!");
        }
    } 

    public int getMark() { 
        return mark; 
    } 
}