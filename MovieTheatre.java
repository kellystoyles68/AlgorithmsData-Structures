
//packages and imports
package com.keyin;
import java.util.ArrayList;
import java.util.List;


public class MovieTheatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    // initialize seats
    public MovieTheatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        for (char row = 'A'; row < 'A' + numRows; row++) {
            for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                Seat seat = new Seat(row + String.format("%02d", seatNumber));
                seats.add(seat);
            }
        }
    }

    //get theatre name
    public String getTheatreName() {
        return theatreName;
    }


    //reserve seat
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("There is no seat available" + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }

    //

    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }


        //reserve  seat
        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                System.out.println("Seat " + seatNumber + " is already reserved");
                return false;
            }
        }


        //cancel the seat
        public boolean cancel() {
            if (reserved) {
                reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                System.out.println("Seat " + seatNumber + " is not reserved");
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
