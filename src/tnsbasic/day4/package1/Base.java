package tnsbasic.day4.package1;

public class Base {
    int varDefault=10;
    public int varPublic=20;
    private int varPrivate=30;
    protected int varProtected=40;
void methodDefault()
{
    System.out.println("Default access base class");
    System.out.println("Default variable"+varDefault);
}
public void methodPublic(){
    System.out.println("Public access base class");
    System.out.println("public variable"+varPublic);
}
    protected void methodProtected()
    {
        System.out.println("Protected access base class");
        System.out.println("Protected Variable"+varProtected);
    }
    private void methodPrivate(){
        System.out.println("private access base class");
        System.out.println("private variable"+varPrivate);
    }
}
