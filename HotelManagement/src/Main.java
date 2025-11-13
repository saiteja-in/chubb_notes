import java.util.*;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		HotelManagement hm=new HotelManagement();
		
		System.out.println("Enter the name: ");
		String name=sc.next();
		boolean continueBooking = true;

        while (continueBooking) {
            hm.displayHotels();
            System.out.print("Select a hotel (1-5): ");
            int hotelChoice = sc.nextInt() - 1;
            System.out.print("Enter number of rooms to book: ");
            int rooms = sc.nextInt();
            hm.bookHotel(hotelChoice, rooms);
            System.out.print("Do you want to continue booking? (yes/no): ");
            String answer = sc.next();
            continueBooking = answer.equals("yes");
        }

//        System.out.println(name+"`s bookings");
        sc.close();
    }
}