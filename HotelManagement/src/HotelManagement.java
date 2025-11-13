import java.util.*;
class HotelManagement {
    private List<Hotel> hotels;

    public HotelManagement() {
        hotels = new ArrayList<>();
        hotels.add(new Hotel("HotelA", 10));
        hotels.add(new Hotel("HotelB", 10));
        hotels.add(new Hotel("HotelC", 10));
        hotels.add(new Hotel("HotelD", 10));
        hotels.add(new Hotel("HotelE", 10));
    }

    public void displayHotels() {
        for (int i = 0; i < hotels.size(); i++) {
            System.out.print((i + 1) + ". ");
            hotels.get(i).displayStatus();
        }
    }

    public boolean bookHotel(int hotelIndex, int rooms) {
        Hotel selectedHotel = hotels.get(hotelIndex);
        if (selectedHotel.bookRooms(rooms)) {
            System.out.println("Successfully booked " + rooms + " rooms at " + selectedHotel.getName());
            return true;
        } else {
            System.out.println("Not enough rooms available in " + selectedHotel.getName());
            return false;
        }
    }
}