Class Detail
{
int salary,id;
String name,company;
public void details(String location)
{
salary=40000;
id=75557;
name="shivam";
company="capgemini"
System.out.println("Salary is " +salary);
System.out.println("id is " +id);
System.out.println("name is " +name);
System.out.println("Salary is " +company);
}
}
Class D extends Detail
{
salary=60000;
id=75558;
name="rajan";
company="ibm";
public void details(String location)
{
System.out.println("Salary is " +salary);
System.out.println("id is " +id);
System.out.println("name is " +name);
System.out.println("Salary is " +company);
}
public static void main(String args[])
{
D d = new D()
d.details(bangalore);
d.details(chennai);
}
}

