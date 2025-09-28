/*
 * 📌 Problem Statement: Ticket Booking System

You are required to implement a simple ticket booking system.

The system starts with a given number of total tickets.

For each booking request:

If the number of requested tickets is less than or equal to the available tickets → booking is successful, and tickets are reduced.

Otherwise → booking fails, and the available tickets remain unchanged.

Print the result of each booking attempt.

📥 Input Format

The first line contains an integer T → total number of tickets available.

The second line contains an integer N → number of booking requests.

The next N lines each contain an integer B → number of tickets requested in each booking.

📤 Output Format

For each booking request, print one line:

"Booking successful, remaining tickets = X" if successful.

"Booking failed, only X tickets left" if not successful.

✅ Example Test Case 1
Input
10
3
3
4
5

Output
Booking successful, remaining tickets = 7
Booking successful, remaining tickets = 3
Booking failed, only 3 tickets left
 */


public class TicketBookingEnsure {

    public static void ticketBookingEnsure(int nums[], int totalTicket) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= totalTicket) {  
                totalTicket -= nums[i];
                System.out.println("Booking Successful, Remaining tickets: " + totalTicket);
            } else {
                System.out.println("Booking Failed, Remaining tickets: " + totalTicket);
            }
        }
    }

    public static void main(String args[]) {
        int totalTicket = 10;
        int nums[] = { 3, 4, 5 };

        ticketBookingEnsure(nums, totalTicket);
    }
}

