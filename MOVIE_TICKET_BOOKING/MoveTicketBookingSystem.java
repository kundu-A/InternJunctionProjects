import java.util.*;
class Customer
{
    LinkedList<String> action=new LinkedList<String>();
    LinkedList<String> comedy=new LinkedList<String>();
    LinkedList<String> detective=new LinkedList<String>();
    LinkedList<String> thrillers=new LinkedList<String>();
    LinkedList<String> suspence=new LinkedList<String>();
    LinkedList<String> horror=new LinkedList<String>();
    public void addMovies()
    {
        action.add("Avenger");action.add("Attack"); action.add("Wolvarine"); action.add("Moon_Kinght"); action.add("Kalki"); 

        comedy.add("Hera Phire");comedy.add("Golmal");comedy.add("Welcome");comedy.add("Welcome_back");comedy.add("HosueFull-4");

        detective.add("Bomkeysh");detective.add("Agent_Roy");detective.add("FeluDa");

        thrillers.add("Simle");thrillers.add("Katputli");thrillers.add("Hitman");thrillers.add("Yodha");

        suspence.add("Feluda");suspence.add("chup");suspence.add("365_Days");

        horror.add("Conjuring");horror.add("Anabela");horror.add("Exorcist");
        section();
    }
    public void movieList(char ch)
    {
        switch (ch) {
            case 'A':for(int i=0;i<action.size();i++)
                        System.out.println((i+1)+" : "+action.get(i)); 
                    movieSelection(action);
                break;
            case 'C':for(int i=0;i<comedy.size();i++)
                        System.out.println((i+1)+" : "+comedy.get(i));
                    movieSelection(comedy);
                break;
            case 'D':for(int i=0;i<detective.size();i++)
                            System.out.println((i+1)+" : "+thrillers.get(i));
                    movieSelection(detective);
                break;
            case 'T':for(int i=0;i<thrillers.size();i++)
                        System.out.println((i+1)+" : "+thrillers.get(i));
                    movieSelection(thrillers);
                break;
            case 'S':for(int i=0;i<suspence.size();i++)
                        System.out.println((i+1)+" : "+suspence.get(i));
                    movieSelection(suspence);
                break;
            case 'H':for(int i=0;i<horror.size();i++)
                        System.out.println((i+1)+" : "+horror.get(i));
                    movieSelection(horror);
                break;
            default:
                break;
        }
    }
    public void movieSelection(LinkedList<String> choice)
    {
        Scanner sc=new Scanner(System.in);
        try {
            int fev=0;
        System.out.println("Select your movie: ");
        fev=sc.nextInt();
        if(fev<=choice.size()+1){
            String movieName=choice.get(fev-1);
            System.out.println("You choose: "+movieName+" movie.");
            ticketCollection();
        }
        else
            movieSelection(choice);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            sc.close();
        }
    }
    int ticketcount=0;
    public void ticketCollection()
    {
        int fc=250,sc=200,tc=150;
        Scanner scan=new Scanner(System.in);
        System.out.println("Now choose type of the theater: \nPress '1' for NORMAL\tPress '2' for IMAX 3D");
        int theater=scan.nextInt();
        if(theater==1)
            System.out.println("You select NORMAL");
        else
            System.out.println("You select IMAX 3D");
        System.out.println("What type of ticket are you looking for: ");
        System.out.println("Press '1' for FIRST CLASS(Price:"+fc+")\tPress '2' for SECOND CLASS(Price:"+sc+")\tPress '3' for THIRD CLASS(Price:"+tc+")");
        int c=scan.nextInt();
        if(c==1)
            System.out.println("You choose FIRST CLASS");
        else if(c==2)
            System.out.println("You choose SECOND CLASS");
        else
            System.out.println("You choose THIRD CLASS");
        System.out.println("We have three slot: \n1 : 10.00AM\n2 : 02.00PM\n3 : 07.00PM");
        int slot=scan.nextInt();
        if(slot==1)
            System.out.println("You choose 10.00AM slot.");
        else if(slot==2)
            System.out.println("You choose 02.00PM slot.");
        else
            System.out.println("You choose 07.00PM slot");
        System.out.println("How many ticket do you want to book? ");
        ticketcount=scan.nextInt();
        makePayment(ticketcount,c);
        scan.close();

    }
    public void makePayment(int ticketcount,int c)
    {
        Scanner scan=new Scanner(System.in);
        int total=0;
        if(c==1)
            total=ticketcount*250;
        else if(c==2)
            total=ticketcount*200;
        else
            total=ticketcount*150;
        System.out.println("So, you total amount is: "+total);
        System.out.println("Press '1' for Online\tPress '2' for Cash: ");
        String mode=scan.next();
        if(mode.equals("1")){
            System.out.println("Enter your amount: ");
            int amount=scan.nextInt();
            if(amount==total)
                System.out.println("You money is accepted.");
            else
                System.out.println("Please enter actual amount to confirm.");
        }
        else
        {
            System.out.println("Enter your amount: ");
            int amount=scan.nextInt();
            if(amount==total)
                System.out.println("You money is accepted.");
            else
                System.out.println("Please enter actual amount to confirm.");
        }
        System.out.println("You "+ticketcount+"tickets are confirmed!!");
        System.out.println("If you want to cancel then press 'C' or press anything: ");
        int can=scan.next().toUpperCase().charAt(0);
        if(can=='C')
            cancel();
        else
            System.out.println("Thank you!!\tVisit Agian!!");
        scan.close();
}
    public void section()
    {
        Scanner sc=new Scanner(System.in);
        char ch=' ';
        try{      
        System.out.println("Hey, Welcome to the Customer Desk......\nAt that time our collections are:\nComedy,Thrillers,Action,Detective,Suspence,Horror,etc");
        System.out.println("So,What type of movie are you looking for: \nPlease Select from the below list: ");
        System.out.println("Press 'A' for Action\tPress 'C' for Comedy\tPress 'T' for Thrillers\tPress 'D' for Detective\tPress 'S' for Suspence\tPress 'H' for Horror: ");
        ch=sc.next().toUpperCase().charAt(0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        switch (ch) {
            case 'A':movieList(ch);
                break;
            case 'C':movieList(ch);
                break;
            case 'T':movieList(ch);
                break;
            case 'D':movieList(ch);
                break;
            case 'S':movieList(ch);
                break;
            case 'H':movieList(ch);
                break;
            default:System.out.println("Please enter the actual one!!!");
                     section();
                break;
        }
        sc.close();
    }
    public void cancel()
    {
        Scanner sc=new Scanner(System.in);
        String confirm=null;
        if(ticketcount==0)
            System.out.println("You do not book any ticket from any show!!");
        else
        {
            System.out.println("Are you sure yo want to cancel your booking: yes/no");
            confirm=sc.next();
            if(confirm.equals("yes"))
            {
                ticketcount=0;
                System.out.println("Your tickets are successfully canceled.");
            }
            else
                System.out.println("Ok!!");
        }
        sc.close();
    }
}
public class MoveTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Customer customer=new Customer();
        System.out.println("Welcome to the  one stop solution of movies!!");
        System.out.println("press 1 for booking\tPress 2 for canceling: ");
            int ch=sc.nextInt();
        if (ch==1) {
            customer.addMovies();
        }
        else
            customer.cancel();
            sc.close();
        
    }
}
