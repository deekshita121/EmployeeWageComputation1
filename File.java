public class File
{
public static final int present=1;
public static final int rate=20;
public static void main(String args[])
{
int emphrs=0;
int empwage=0;
double check=Math.floor(Math.random()*10 % 2);
System.out.println("Welcome to Employee Wage");
if(check==present)
{
emphrs=8;
}
else
{
emphrs=0;
}
empwage=emphrs * rate;
System.out.println("Employee wage is "+empwage);
}
}
