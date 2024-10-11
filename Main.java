// Author : Mustafa Mulla
// Roll No : 26
// Title : Goa legistalive assembly
// Start date : 07/10/2024
// Modified date :  11/10/2024
// Description : Goa Legislative Assembly's various sections
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SectionDisplay legislatureSection = new LegislatureSection();
        SectionDisplay governmentSection = new GovernmentSection();
        SectionDisplay houseSection = new HouseSection();

        System.out.println("1: Legislature Section\n2: Government Section\n3: House Section");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter choice: ");
        String choice = scanner.next().trim();

         switch (choice) {
            case "1":
                legislatureSection.showSectionDetails();
                break;
            case "2":
                governmentSection.showSectionDetails();
                break;
            case "3":
                houseSection.showSectionDetails();
                break;
            default:
                System.out.println("Please select a valid input");
                break;
        }
        scanner.close();

    }
}