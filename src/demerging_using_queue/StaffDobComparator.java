package demerging_using_queue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
public class StaffDobComparator implements Comparator<Staff> {
    @Override
    public int compare(Staff staff1, Staff staff2) {
        Date d1;
        try {
            d1 = new SimpleDateFormat("dd/MM/yyyy").parse(staff1.getdoB());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Date d2;
        try {
            d2 = new SimpleDateFormat("dd/MM/yyyy").parse(staff2.getdoB());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return d1.compareTo(d2);
    }
}
