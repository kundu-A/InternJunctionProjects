import java.util.*;
class Addition{
    public void add(int a , int b)
    {
        System.out.println("THE RESULT OF "+a+" + "+b+" IS "+"="+(a+b));
    }
    public void add(int a, double b)
    {
        System.out.println("THE RESULT OF "+a+" + "+b+" IS "+"="+(a+b));
    }
    public void add(double a, int b)
    {
        System.out.println("THE RESULT OF "+a+" + "+b+" IS "+"="+(a+b));
    }
    public void add(double a , double b)
    {
        System.out.println("THE RESULT OF "+a+" + "+b+" IS "+"="+(a+b));
    }
}
class Subtraction{
    public void sub(int a , int b)
    {
        System.out.println("THE RESULT OF "+a+" - "+b+" IS "+"="+(a-b));
    }
    public void sub(int a, double b)
    {
        System.out.println("THE RESULT OF "+a+" - "+b+" IS "+"="+(a-b));
    }
    public void sub(double a, int b)
    {
        System.out.println("THE RESULT OF "+a+" - "+b+" IS "+"="+(a-b));
    }
    public void sub(double a , double b)
    {
        System.out.println("THE RESULT OF "+a+" - "+b+" IS "+"="+(a-b));
    }
}
class Division{
    public void div(int a , int b)
    {
        System.out.println("THE RESULT OF "+a+" / "+b+" IS "+"="+(a/b));
    }
    public void div(int a, double b)
    {
        System.out.println("THE RESULT OF "+a+" / "+b+" IS "+"="+(a/b));
    }
    public void div(double a, int b)
    {
        System.out.println("THE RESULT OF "+a+" / "+b+" IS "+"="+(a/b));
    }
    public void div(double a , double b)
    {
        System.out.println("THE RESULT OF "+a+" / "+b+" IS "+"="+(a/b));
    }
}
class Multiplication{
    public void mul(int a , int b)
    {
        System.out.println("THE RESULT OF "+a+" * "+b+" IS "+"="+(a*b));
    }
    public void mul(int a, double b)
    {
        System.out.println("THE RESULT OF "+a+" * "+b+" IS "+"="+(a*b));
    }
    public void mul(double a, int b)
    {
        System.out.println("THE RESULT OF "+a+" * "+b+" IS "+"="+(a*b));
    }
    public void mul(double a,double b)
    {
        System.out.println("THE RESULT OF "+a+" * "+b+" IS "+"="+(a*b));
    }
}
class TakeInput
{
    int op=0;
    TakeInput(){}
    public TakeInput(int op)
    {
        this.op=op;
    }
    int aI=0;
    int bI=0;
    double aD=0.0;
    double bD=0.0;
    int ch1=0;
    int ch2=0;
    Scanner sc=new Scanner(System.in);
    public void input()
    {
        try {
            System.out.print("Please enter a number: (IF THE NUMBER HAVE NO DECIMAL POINT DIGIT THEN PRESS 1 AND IF THE NUMBER HAVE DECIMAL POINT DIGIT THEN PRESS 2): ");
            ch1=sc.nextInt();
            System.out.println();
            if(ch1==1)
                aI=sc.nextInt();
            else
                aD=sc.nextDouble();

            System.out.println("Enter another number: (IF THE NUMBER HAVE NO DECIMAL POINT DIGIT THEN PRESS 1 AND IF THE NUMBER HAVE DECIMAL POINT DIGIT THEN PRESS 2): ");
            ch2=sc.nextInt();
            System.out.println();
            if(ch2==1)
                bI=sc.nextInt();
            else
                bD=sc.nextDouble();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter the right option which is provided above... ");
        }
        
        //Redirect to that method.
        if(op==1){
            Addition ob=new Addition();
            if(ch1==1 && ch2==1)
                ob.add(aI,bI);
            else if(ch1==2 && ch2==2)
                ob.add(aD, bD);
            else if(ch1==1 && ch2==2)
                ob.add(aI, bD);
            else if(ch1==2 && ch2==1)
                ob.add(aD,bI);
        }
        else if(op==2){
            Subtraction ob=new Subtraction();
            if(ch1==1 && ch2==1)
                ob.sub(aI,bI);
            else if(ch1==2 && ch2==2)
                ob.sub(aD, bD);
            else if(ch1==1 && ch2==2)
                ob.sub(aI, bD);
            else if(ch1==2 && ch2==1)
                ob.sub(aD,bI);
        }
        else if(op==3){
            Multiplication ob=new Multiplication();
            if(ch1==1 && ch2==1)
                ob.mul(aI,bI);
            else if(ch1==2 && ch2==2)
                ob.mul(aD, bD);
            else if(ch1==1 && ch2==2)
                ob.mul(aI, bD);
            else if(ch1==2 && ch2==1)
                ob.mul(aD,bI);
        }
        else if(op==4){
            Division ob=new Division();
            if(ch1==1 && ch2==1)
                ob.div(aI,bI);
            else if(ch1==2 && ch2==2)
                ob.div(aD, bD);
            else if(ch1==1 && ch2==2)
                ob.div(aI, bD);
            else if(ch1==2 && ch2==1)
                ob.div(aD,bI);
        }
    }
}
public class SimpleCalculator 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Please Enter your choice: ");
        System.out.println("PRESS '1' FOR ADDITION\tPRESS '2' FOR SUBTRACTION\tPRESS '3' FOR MULTIPLICATION\tPRESS '4' FOR DIVISION: ");
        int sch=sc.nextInt();
        switch (sch) {
            case 1:new TakeInput(sch).input();
                break;
            case 2:new TakeInput(sch).input();
                break;
            case 3:new TakeInput(sch).input();
                break;
            case 4:new TakeInput(sch).input();
                break;
            default:System.out.println("Please enter valid choice.");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Please enter the right option which is provided above... ");
        }
        finally
        {
            sc.close();
        }
    }
}