package Programs;

import java.util.Scanner;

public class TelephoneBill {
    int prv, pre, call;
    String name;
    double amt, total;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, previous readings and present readings");
        name = sc.nextLine();
        prv = sc.nextInt();
        pre = sc.nextInt();
        call = pre-prv;
    }
    void cal()
    {
        if(call<=100)
            amt=0;
        else if(call>100 && call<=200)
            amt = call*0.90;
        else if(call>200 && call<=400)
            amt = (100*0.90) + (call - 200)*0.80;
        else if(call>400)
            amt = (100*0.90) + (200*0.80) + (call-400)*0.70;
        total = amt+180;
    }
    void display()
    {
        System.out.println("Name of the customer\t\tCalls made\t\t\tAmount to be paid");
        System.out.println(name+"\t\t\t\t\t"+call+"\t\t\t\t\t\t\t"+total);
    }
    public static void main(String[] args)
    {
        TelephoneBill obj = new TelephoneBill();
        obj.input();
        obj.cal();
        obj.display();
    }
}
