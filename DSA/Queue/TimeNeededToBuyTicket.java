public class TimeNeededToBuyTicket {

    public static int timeRequiredToBuy(int arr[], int k) {
        int time = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(i <= k) {
                time += Math.min(arr[i], arr[k]);
            }
            else {
                time += Math.min(arr[i], arr[k] - 1);
            }
        }
        return time;
    }

    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;
        System.out.println("Output: " + timeRequiredToBuy(tickets, k));
    }
}
