public class File
{
public static final int full_time=1;
public static final int part_time=2;
public static final int rate=20;
public static void main(String args[])
{
int emphrs=0;
int empwage=0;
double check=Math.floor(Math.random()*10 % 3);
System.out.println("Welcome to Employee Wage");
if(check==full_time)
{
emphrs=8;
}
else if(check==part_time)
{
emphrs=4;
}
else
{
emphrs=0;
}
empwage=emphrs * rate;
System.out.println("Employee wage is "+empwage);
}
}
