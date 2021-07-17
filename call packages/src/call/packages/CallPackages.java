/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package call.packages;

/**
 *
 * @author Muneeb Riaz
 */
public class CallPackages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        GoldCustomer cus1=new GoldCustomer("muneeb");
       System.out.println(cus1.balance);
        cus1.Recordcall(2,14);
        cus1.Recordcall(2,16 );
        cus1.Recordcall(2, 50);
        cus1.Recordcall(2, 10);
        System.out.println(cus1.balance);
        cus1.Recordpayment(200);
       System.out.println(cus1.balance);
    }
    
}

class Customer
{
    protected String name;
    protected double balance;
    protected double credit;
    Customer(){}
    Customer(String nam)
    {
        name= nam;
        balance = 0;
    }
    public void Recordpayment(double amountpaid)
    {
        if (balance<=amountpaid)
        {
            credit = amountpaid-balance;
            System.out.println("Your credit is:"+credit);
            
        }
        if (balance>amountpaid)
        {
            balance = balance- amountpaid;
            System.out.println("YOur current balance is:"+balance);
        }
    }
    public void Recordcall(int x,double y)
    {
        if (x==1)
        {
            double z = 0.5 *y;
            balance=balance+z;
        }
        if (x==2)
        {
            double z = 1*y;
            balance= balance+z;
        }
    }
    
}
class GoldCustomer extends Customer
{
    private int timecunsumption;
   
    public void Recordcall(int x,int y)
    {
        if (x==1)
        {
            double z = 0.5 *y;
            balance=balance+z;
        }
        if (x==2)
        {   
                int i;
                
                for( i=1;(i+timecunsumption)<=60&&i<=y;i++)
                {
                    double z = 2;
                    balance=balance+z;
                }
                 timecunsumption = timecunsumption+y;
                 //a =timecunsumption;
                if(y!=i)
                {
                    
                    double z = 0.5*(y-i);
                    balance=balance+z;
                }
            
        }
    }
     GoldCustomer(String nam)
    {
        name= nam;
        balance = 0;
    }
}
    
    

