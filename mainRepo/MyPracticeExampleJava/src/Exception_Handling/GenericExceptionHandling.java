package Exception_Handling;

public class GenericExceptionHandling {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2};
            arr[2] = 3 / 0;
        } catch (Exception e)    //This block handles all Exception
        {
            System.out.println("Generic exception");// this is called generic exception
            // if any catch block is given after the generic that catch block will be not work
        }
    }
}