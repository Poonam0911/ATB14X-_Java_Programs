package IsElseTask24;

import java.util.Scanner;

public class WebsiteDomain {
    public static void main(String[] args) {
        System.out.println("  Determine the Type of Website Based on Domain (.com, .org, .edu, etc.) ");
        Scanner sc = new Scanner(System.in);
        String domain = sc.next();
        if(domain.contains(".com"))
        {
            System.out.println("The website type is: Commercial website");
        }
        else if (domain.contains(".org"))
        {
            System.out.println("The website type is: Non-profit organization");
        }
      else if (domain.contains(".edu"))
       {
        System.out.println("The website type is: Educational institution");
       }
      else if (domain.contains(".gov"))
      {
          System.out.println("The website type is: Government website");
      }
      else if (domain.contains(".net"))
       {
           System.out.println("The website type is: Network-related website");
        }
      else if (domain.contains(".info"))
      {
          System.out.println("The website type is: Informational website");
      }

      else
            System.out.println("The website type is: Unknown or other types of websites");
    }
}
