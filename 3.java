import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double newlyHiredMales;
        double newlyHiredFemales;
        double permanentPositionMales;
        double permanentPositionFemales;
        double resignedMales;
        double resignedFemales;

        double totalHiredEmployees;
        double totalPermanentPositionEmployees;
        double totalResignedEmployees;

        System.out.print("Enter the number of newly hired males: ");
        newlyHiredMales = myObj.nextInt();
        System.out.print("Enter the number of newly hired females: ");
        newlyHiredFemales = myObj.nextInt();

        System.out.print("Enter the number of permanent position males: ");
        permanentPositionMales = myObj.nextInt();
        System.out.print("Enter the number of permanent position females: ");
        permanentPositionFemales = myObj.nextInt();

        System.out.print("Enter the number of resigned males: ");
        resignedMales = myObj.nextInt();
        System.out.print("Enter the number of resigned females: ");
        resignedFemales = myObj.nextInt();

        totalHiredEmployees = newlyHiredMales + newlyHiredFemales;
        double hiredMales = (newlyHiredMales / totalHiredEmployees) * 100;
        double hiredFemales = (newlyHiredFemales / totalHiredEmployees) * 100;

        totalPermanentPositionEmployees = permanentPositionMales + permanentPositionFemales;
        double PermanentPositionMales = (permanentPositionMales / totalPermanentPositionEmployees) * 100;
        double PermanentPositionFemales = (permanentPositionFemales / totalPermanentPositionEmployees) * 100;

        totalResignedEmployees = resignedMales + resignedFemales;
        double ResignedMales = (resignedMales / totalResignedEmployees) * 100;
        double ResignedFemales = (resignedFemales / totalResignedEmployees) * 100;

        System.out.println("=== \nThank you for the Information\n===");
        System.out.println("Here is the Summary !!!");
        System.out.println("Number of hired employees = " + totalHiredEmployees);
        System.out.println("Male = " + hiredMales + "%");
        System.out.println("Female = " + hiredFemales + "%\n");

        System.out.println("Number of permanent employees = " + totalPermanentPositionEmployees);
        System.out.println("Male = " + PermanentPositionMales + "%");
        System.out.println("Female = " + PermanentPositionFemales + "%\n");

        System.out.println("Number of resigned employees = " + totalHiredEmployees);
        System.out.println("Male = " + ResignedMales + "%");
        System.out.println("Female = " + ResignedFemales + "%\n");

    }
}
