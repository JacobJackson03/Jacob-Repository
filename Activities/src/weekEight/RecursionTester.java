package weekEight;

public class RecursionTester {public int calcFactorial(int number)
{
    //Base Case
    if (number == 1)
    {
        return 1;
    }
    else
    {
        //Recursive Case
        return number * calcFactorial(number - 1);
    }

}


    public void countDown(int number)
    {
        if (number == 0) // Base Case
        {
            System.out.println("Go!");
        }
        else
        {
            System.out.println(number);
            countDown(number - 1); //Recursive Case
        }
    }

    public void printBackwards(char letter)
    {
        //Base Case
        if (letter == 'a')
        {
            System.out.println(letter);
        }
        else
        {
            System.out.println(letter);
            //Recursive Case
            // Using prefix operators
            printBackwards(--letter);
        }
    }


    public int findGCDRecursively(int n1, int n2) {
        //Base Case
        if (n2 != 0) {
            //Recursive Case
            return findGCDRecursively(n2, n1 % n2);
        } else {
            return n1;
        }
    }
}
}
