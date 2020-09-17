public class AddAmount
{
    int amount = 50;
    public AddAmount(){
        amount = amount + 0;
    }
    public AddAmount(int x){
        amount = amount + x;
    }
    static int numTransaction = 0;
    {
        numTransaction += 1;
    }
    public static void main(String[] args){
        AddAmount object1 = new AddAmount();
        AddAmount object2 = new AddAmount(50);

        System.out.println("The amount in saving box after 1st object is created: " + object1.amount);
        System.out.println("The amount in saving box after 2nd object is created: " + object2.amount);

        System.out.println("Total number of transaction in saving box are: " + AddAmount.numTransaction);
    }
}
