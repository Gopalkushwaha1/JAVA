import java.util.Scanner;

class BookingSystem {
    int availableSeats;

    BookingSystem(int totalSeats) {
        this.availableSeats = totalSeats;
    }

    public synchronized void bookTickets(String user, int seatsRequested) {
        System.out.println(user + " is trying to book " + seatsRequested + " seat(s)...");

        if (seatsRequested <= availableSeats) {
            System.out.println("Seats available! Booking for " + user);
            availableSeats -= seatsRequested;

            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Booking confirmed for " + user + ". Seats left: " + availableSeats);
        } else {
            System.out.println("Booking failed for " + user + ". Only " + availableSeats + " seat(s) left.");
        }
    }
}

class User extends Thread {
    BookingSystem system;
    int seatsToBook;
    String userName;

    User(BookingSystem system, String userName, int seatsToBook) {
        this.system = system;
        this.userName = userName;
        this.seatsToBook = seatsToBook;
    }

    public void run() {
        system.bookTickets(userName, seatsToBook);
    }
}

public class TicketBookingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of available seats: ");
        int totalSeats = sc.nextInt();

        BookingSystem booking = new BookingSystem(totalSeats);

        System.out.print("Enter number of users trying to book: ");
        int userCount = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        User[] users = new User[userCount];

        for (int i = 0; i < userCount; i++) {
            System.out.println("\nEnter details for User " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Seats to book: ");
            int seats = sc.nextInt();
            sc.nextLine(); // Consume newline

            users[i] = new User(booking, name, seats);
        }

        // Start all user threads
        for (User user : users) {
            user.start();
        }

        // Wait for all threads to finish
        for (User user : users) {
            try {
                user.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n All booking attempts completed.");
        sc.close();
    }
}
