class Detail
{
int salary,id;
String name,company;
public void details(String location)
{
salary=40000;
id=75557;
name="shivam";
company="capgemini";
System.out.println("Salary is " +salary);
System.out.println("id is " +id);
System.out.println("name is " +name);
System.out.println("company is " +company);
System.out.println("location is " +location);
}

public static void main(String[] args)
{
Detail d = new Detail();
d.details("bangalore");

}
}



