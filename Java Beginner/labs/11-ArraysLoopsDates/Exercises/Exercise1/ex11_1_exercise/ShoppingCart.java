package ex11_1_exercise;

// import statements here:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ShoppingCart {
    
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate;
        
	// Initialize the orderDate to the current date and time. Print it.
        orderDate = LocalDateTime.now();
        System.out.println("Unformatted order date: " + orderDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
        String formatDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("\nThe formatted order date: " + formatDate);
        
        // Format orderDate using Medium date time format; Print it.
        String medFormatDate = orderDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("\nThe medium formatted date: " + medFormatDate);

    }
}