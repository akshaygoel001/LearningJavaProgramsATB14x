package task_24_Oct_2025;

import java.util.Arrays;
import java.util.Scanner;

public class WebsiteDomainCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter website URL: ");
        String website = scanner.nextLine();
        String domain = website.split("\\.")[1];
        if (domain.equalsIgnoreCase("com")){
            System.out.println("The website type is: Commercial website");
        } else if (domain.equalsIgnoreCase("org")) {
            System.out.println("The website type is: Non-profit organization");
        }
        else if (domain.equalsIgnoreCase("edu")) {
            System.out.println("The website type is: Educational institution");
        }
        else if (domain.equalsIgnoreCase("gov")) {
            System.out.println("The website type is: Government institution");
        }
        else if (domain.equalsIgnoreCase("net")) {
            System.out.println("The website type is: Network-related institution");
        }
        else if (domain.equalsIgnoreCase("info")) {
            System.out.println("The website type is: Informational institution");
        }
        else if (domain.equalsIgnoreCase("xyz")) {
            System.out.println("The website type is: Unknown or other types of websites");
        }

    }
}
