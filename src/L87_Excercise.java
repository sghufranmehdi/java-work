class InvalidInputException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return "Cant do operations on 8 and 9 as given";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return "Cannot divide by 0";
    }
}
class MaxInputException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return "Cant exceed a and b to 100000";
    }
}

class MaxMultiplierReachException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String toString() {
        return "Cant exceed inputs by 7000";
    }
}
class CustomCalculator {
    double add(double a , double b)throws InvalidInputException,MaxInputException{
        if (a==8||b==9)
        {
            throw new InvalidInputException();
        }
        if(a>100000||b>100000)
        {
            throw new MaxInputException();
        }
        return a +b;

    }
    double sub(double a , double b) throws InvalidInputException,MaxInputException{
        if (a==8||b==9)
        {
            throw new InvalidInputException();
        }
        if(a>100000||b>100000)
        {
            throw new MaxInputException();
        }
        return a -b;

    }
    double mul(double a , double b)throws InvalidInputException,MaxInputException,MaxMultiplierReachException{
        if (a==8||b==9)
        {
            throw new InvalidInputException();
        }
        else if (a>=7000 || b>=7000)
        {
            throw new MaxMultiplierReachException();
        }
        else if(a>100000||b>100000)
        {
            throw new MaxInputException();
        }
        return a *b;

    }
    double div(double a , double b)throws CannotDivideByZeroException, InvalidInputException,MaxInputException{
        if(b==0)
        {
            throw new CannotDivideByZeroException();
        }
        if (a==8||b==9)
        {
            throw new InvalidInputException();
        }
        if(a>100000||b>100000)
        {
            throw new MaxInputException();
        }


        return a /b;

    }

}
public class L87_Excercise {
    public static void main(String[] args) throws InvalidInputException ,CannotDivideByZeroException, MaxInputException,MaxMultiplierReachException{
              /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

        CustomCalculator c = new CustomCalculator();
        //c.add(10000008,34567899);
        //c.div(8,9);
        c.mul(70000,700001);


    }
}
