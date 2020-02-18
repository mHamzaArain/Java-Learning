# Java-Learning


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

/**
 *
 * @author tuser
 */
class CheckingAccount extends BankAccount{
    private double FEE = 100; 
    
    public CheckingAccount(String name, double amount){
        super(name, amount);
        super.owner = name;
        super.balance = amount;
    }
    
    public boolean withdraw(double amount){
        if (super.balance >= amount){
            super.balance -= amount;
            return true;
        }
        else{
            return false;
        }
    }
}

class SavingAccount extends BankAccount{
    private double rate = 0.4;
    private double saving;
    
    public SavingAccount(String name, double amount){
        super(name, amount);
        super.owner = name;
        super.balance = amount;
    }
    
    public SavingAccount(SavingAccount oldAccount, double amount){
        super(oldAccount, amount);
        super.accountNumber = oldAccount.accountNumber;
        super.balance = amount;
    }
    
    public void postInterest(){
        saving = rate * super.balance;
    }
}

class BankAccount{
    protected double balance;
    protected String owner;
    protected String accountNumber;
    public BankAccount(){}
    
    
    public BankAccount(String name, double amount){
        owner = name;
        balance = amount; 
    }
    
    public BankAccount(BankAccount oldAccount, double amount){
        accountNumber = oldAccount.accountNumber;
        balance = amount;
    }
    
    public void deposite(double amount){
        balance += amount;
    }
    
    public boolean withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            return true;
        } 
        else{
            return false;
        }
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public String getAccountNumber(){
        return this.accountNumber;
    }
    
    public void setBalance(double amount){
        this.balance = amount;
    }
    
    public void setAccountNumber(String newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
   
}

public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount BA = new BankAccount("Hamza", 2034);
        BA.deposite(3424);
        BA.getOwner();
        String a = BA.accountNumber;
        SavingAccount SA = new SavingAccount(a, 89098);
        
    }
    
}
