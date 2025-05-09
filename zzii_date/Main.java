package zzii_date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        /*
         * Java Dates
         * Java tidak memiliki class Date bawaan, tapi kita dapat mengimpor java.time
         * package tersebut memiliki banyak class tanggal dan waktu.
            LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
            LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
            LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
            DateTimeFormatter	Formatter for displaying and parsing date-time objects
         */

         //menampilkan tanggal saat ini
         // untuk menampilkan tanggal saat ini gunakan class LocalDate dan method now()
         LocalDate myLocalDate = LocalDate.now();
         System.out.println(myLocalDate);

        // menampilkan waktu saat ini
        // untuk menampilkan waktu saat ini gunakan class LocalTime dan method now()
        LocalTime myLocalTime = LocalTime.now();
        System.out.println(myLocalTime);

        // menampilkan tanggal dan waktu saat ini
        // gunakan class LocalDateTime dan method now()
        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.println(myLocalDateTime);

        // memformat tanggal dan waktu
        // untuk memformat tanggal dan waktu gunakan class DateTimeFormatter dan methodnya ofPattern()
        System.out.println("Sebelum di format: " + myLocalDateTime);

        DateTimeFormatter myPattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String formattedDateandTime = myLocalDateTime.format(myPattern);

        System.out.println("Setelah di format: " + formattedDateandTime);

        /*
         * Pattern untuk format tanggal
            yyyy-MM-dd	"1988-09-29"	
            dd/MM/yyyy	"29/09/1988"	
            dd-MMM-yyyy	"29-Sep-1988"	
            E, MMM dd yyyy	"Thu, Sep 29 1988"
         */
    }
    
}
