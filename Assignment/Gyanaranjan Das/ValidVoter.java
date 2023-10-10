package com.Basic;

import java.util.Scanner;

//create the custom exception classes
class AgeException extends Exception{
    public AgeException(String message) {
        super(message);
    }
}
class AgeCeilingException extends AgeException{
    public AgeCeilingException(String message) {
        super(message);
    }
}
class TooYoungException extends AgeCeilingException{
    public TooYoungException(String message) {
        super(message);
    }
}
class TooOledException extends AgeCeilingException{
    public TooOledException(String message) {
        super(message);
    }
}
class InvalidAgeException extends AgeException{
    public InvalidAgeException(String message) {
        super(message);
    }
}
class NegativeAgeException extends InvalidAgeException{
    public NegativeAgeException(String message) {
        super(message);
    }
}
class ZeroAgeException extends InvalidAgeException{
    public ZeroAgeException(String message) {
        super(message);
    }
}

public class ValidVoter {
    public static void main(String[] args) {
        //main logic will be written here
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age baby:");
            int age = sc.nextInt();
            vote(age);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }


    }
    //Now create the method which will be check the age of the user and according to that it will throw the exception
public static void vote(int age)throws AgeException{
        //validation for the ages
        if(age<0){
            throw new NegativeAgeException("Age cant be negative than if negative you are an Alien");
        }
        else if(age==0){
            throw new ZeroAgeException("Age cannot be Zero it is not acceptable");
        }
        else if(age<18){
            throw new TooYoungException("User is underage go and eat horlicks");
        }
        else if(age>90){
            throw new TooYoungException("User is very old this is not age of voting it is the age of rest ");
        }
        else{
            System.out.println("User is validate to vote and also able to get 1000 from the village leader ");
        }
  }
 }
