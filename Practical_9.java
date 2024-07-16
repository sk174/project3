interface Studentinfo
{
int rollNo =49 ;
String name = "Shrikant";
public void displayinfo();
}
interface Studentmarks
{
int m3 = 70;
int oop = 90;
void displaymarks();
}
class Studentresult implements Studentinfo,Studentmarks
{
String result = "Pass";
public void displayresult()
{
System.out.println("Result : " +result);
}
public void displayinfo()
{
System.out.println("Roll no : " +rollNo);
System.out.println("Name : " +name);
}
public void displaymarks()
{
System.out.println("M3 Marks : " +m3);
System.out.println("OOP Marks : " +oop);
}
}
class Practical_9
{
   public static void main(String args[])
{
 Studentresult s1 = new Studentresult();
 s1.displayinfo();
 s1.displaymarks();
 s1.displayresult();
}}