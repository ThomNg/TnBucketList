import de.rhistel.logic.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printNameApp();
        runBucketListApp();
    }

    private static void printNameApp() {
        System.out.println("Welcome to my BucketList Application");
    }

    private static void runBucketListApp() {
        String[] myBucketList = new String[4];
        for (int i = 0; i < myBucketList.length; i++) {
            boolean isValidAns = false;
            while(!isValidAns){
                System.out.printf("Enter your %d wish %n", i+1);
                String ans = ConsoleReader.in.readString();
                if(!ans.isEmpty()){
                    myBucketList[i] = ans;
                    isValidAns = true;
                }else{
                    System.out.println("Your wish cant be empty, please fill it");
                }
            }
        }
        outputWishList(myBucketList);
    }

    private static void outputWishList(String[] myBucketList) {
        System.out.println("\nYour bucket list are listed as the following: ");
        for (int i = 0; i < myBucketList.length; i++) {
            System.out.printf("%d."+myBucketList[i]+ "%n",i+1);
        }
        System.out.println();
    }
}