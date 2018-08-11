package week2.Day3.examples;

public class Student
{
int id;
String Name;
int Age;
static int counter=0;

void setName(String NewName)
{
	Name=NewName;
}
void setAge(int NewAge)
{
	Age=NewAge;
}
void setId(int NewId)
{
	id=NewId;
}

public static int counter()
{ counter=counter+1;
return counter;
}

void PrintInfo()
{
	System.out.println("Name:" +Name   +"ID:"   +id   +"Age:" +Age);
	System.out.println(" The Count is:" +counter);
}


}