class Addition{
public static void main(String a[]){

String fno = System.getProperty("fno");
String sno = System.getProperty("sno");

int a = Integer.parseInt(fno);
int b = Integer.parseInt(sno);

int c = a+b;
System.out.println("Result:"+ c);
}
} 