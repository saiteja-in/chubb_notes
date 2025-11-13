class Hotel {
    private String name;
    private int totalRooms;
    private int bookedRooms;

    public Hotel(String name, int totalRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.bookedRooms = 0;
    }

    public String getName() {
        return name;
    }

    public int getAvailableRooms() {
        return totalRooms - bookedRooms;
    }

    public boolean bookRooms(int rooms) {
        if (rooms <= getAvailableRooms()) {
            bookedRooms += rooms;
            return true;
        }
        return false;
    }

    public void displayStatus() {
        System.out.println(name + " - Available Rooms: " + getAvailableRooms());
    }
}