class Myexception extends Exception
{
 private int detail();
 Myexception(int a)
 {
  detail=a;
 }
 public stringtostring()
 {
  return "Myexception("+detail");
 }
}
class Exceptiondemo
{
 static void compute(int a) throws Myexception
 {
  System.out.println("called compute("+a+")");
  if a>10
   throw New Myexception(a);
   System.out.println("Normal exit");
 }
 public static void main()
{
 try
 {
  compute(1);
  compute(20);
 }
catch(Myexception e)
{
System.out.print("Caught"+e);
}
}
}