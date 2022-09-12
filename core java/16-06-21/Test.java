class P
{
public void m1()
{
System.out.println("this is the parent class");
}
}
class C extends P
{
public void m2()
{
System.out.println("this is the child class");
}
}
class Test
{
public static void main(String args[])
{
C c = new P();
c.m2();
}
}