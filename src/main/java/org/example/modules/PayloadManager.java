package org.example.modules;

import com.google.gson.Gson;
import org.example.pojos.Booking;
import org.example.pojos.BookingResponse;
import org.example.pojos.Bookingdates;

public class PayloadManager {

    public static String createPayloadBookingAsString()
    {
        Booking booking = new Booking();
        booking.setFirstname("Raja");
        booking.setLastname("Ram");
        booking.setDepositpaid(true);
        booking.setTotalprice(865);
        booking.setAdditionalneeds("Lunch");

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-09-08");
        bookingdates.setCheckout("2023-09-23");
        booking.setBookingdates(bookingdates);

        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        return jsonStringBooking;
    }

    public static BookingResponse bookingResponseAsjava(String responseString)
    {
        Gson gson = new Gson();
        BookingResponse bookingResponse = gson.fromJson(responseString, BookingResponse.class);
        return bookingResponse;
    }
}
