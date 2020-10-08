import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {


        ArrayList<Route> list = new ArrayList<Route>();


        list.add(new Route("Svendborg", "Ærøskøbing", 43, "75 min", 1));
        list.add(new Route("Fynshav", "Søby", 41, "55 min", 2));
        list.add(new Route("Faaborg", "Søby", 43, "60 min", 3));
        list.add(new Route("Svendborg", "Ærøskøbing", 43, "75 min", 1));


        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("" + list.get(i));
        }

        System.out.println("Indtast Rutenummer: ");
        Scanner scanner = new Scanner(System.in);
        int menu=scanner.nextInt();

        for (int i=0;i<list.size();i++)
        {
            if(list.get(i).getMenupunkpunkt()==menu)
            {
                System.out.println("" + list.get(i));
            }
        }
    }

}
