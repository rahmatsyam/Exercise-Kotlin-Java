class OddNumber
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

    //The input provided by user is stored in num
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    /* If number is divisible by 1 then it's an odd number
     * else even number*/
    if ( num % 2 == 1 )
        System.out.println("Entered number is odd");
     else
        System.out.println("Entered number is not odd");
  }
}