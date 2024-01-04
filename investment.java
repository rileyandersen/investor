import java.util.Scanner;

class age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double investmentValue;
        double interestRate;
        int yearsInvested;

        System.out.println("How much are you investing: ");
        investmentValue = sc.nextDouble();

        System.out.println("What is the rate of interest (as a percentage): ");
        interestRate = sc.nextDouble() / 100;

        System.out.println("How many years will you be investing this: ");
        yearsInvested = sc.nextInt();

        for (int i = 0; i < yearsInvested; i++) {
            investmentValue = investmentValue * (1 + interestRate);
        }

        System.out.println("In " + yearsInvested + " years, your investment will be worth $" + investmentValue);

    }
}