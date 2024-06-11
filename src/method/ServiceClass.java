package method;

import java.util.Date;

public class ServiceClass {
    public TicketBooking ticketBooking1(Row[] seats, String movieName, Date date,String ticketPrice) {
        TicketBooking ticketBooking = new TicketBooking();
        ticketBooking.name = movieName;
        ticketBooking.price = ticketPrice;
        return ticketBooking;
    }
}
      /*  ticketBooking.name="pk";
        ticketBooking.price="100";

                return ticketBooking;
    }
} */
/* TicketBooking booking(Row[] row,int money,String movieName, Date time){
    TicketBooking booking1;
    return booking1;
        }

        TicketBooking booking(Row[] row,int money,String movieName, Date time){
            TicketBooking ticketBooking=new TicketBooking();

            return ticketBooking;
        }

    }
} */
