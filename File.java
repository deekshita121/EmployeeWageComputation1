public class File
{
public static final int full_time=1;
public static final int part_time=2;
public static final int maxdays=20;
public static final int maxhrs=100;
public static final int rate=20;
public static void main(String args[])
{
int totalemphrs=0;
int emphrs=0;
int days=0;
int empwage=0;
System.out.println("Welcome to Employee Wage");
while(emphrs<maxhrs && days<maxdays)
{
days++;
int check=(int)Math.floor(Math.random()*10 % 3);
switch(check)
{
case full_time:
emphrs=8;
break;
case part_time:
emphrs=4;
break;
default:
emphrs=0;
}
totalemphrs +=emphrs;
System.out.println("Day : "+days+" Emp hr : "+emphrs);
}
int totalempwage = totalemphrs * rate;
System.out.println("Total employee wage is "+totalempwage);
}
}
