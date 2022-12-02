package tnsbasic.day5;

public class MyClass {
    int srNo;
    static int cnt;
    static
    {
        System.out.println("---------within static class--------------");
    }
        MyClass()
    {
        this.srNo=1;
        cnt++;
    }
    public  void show()
    {
        System.out.println("-------within default-----");
        System.out.println("--------constructor-----");
        System.out.println("Serial No. "+srNo);
        System.out.println("Count :"+cnt);
    }
    static  void display()
    {
        System.out.println("Count :"+cnt);
    }
}
