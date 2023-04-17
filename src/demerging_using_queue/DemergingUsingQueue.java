package demerging_using_queue;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingUsingQueue {
    public static void main(String[] args) throws ParseException {
        ArrayList<Staff> staffs = new ArrayList<>();
        staffs.add(new Staff("Phat", "male", "02/01/1998"));
        staffs.add(new Staff("Huy", "male", "19/01/1993"));
        staffs.add(new Staff("Trung", "female", "01/05/1998"));
        staffs.add(new Staff("Chung", "male", "21/09/1994"));
        staffs.add(new Staff("Tam", "male", "15/09/2000"));
        staffs.add(new Staff("Tho", "female", "05/01/2002"));
        staffs.add(new Staff("An", "female", "30/02/2004"));
        staffs.add(new Staff("Ngoc", "female", "26/08/1997"));
        staffs.add(new Staff("Nhu", "female", "20/12/1996"));
        staffs.add(new Staff("Nghia", "female", "19/7/1999"));
        staffs.add(new Staff("Thanh", "male", "03/11/1994"));
        staffs.add(new Staff("Long", "male", "19/01/2002"));
        staffs.add(new Staff("PhuocAu", "male", "26/01/2000"));
        staffs.add(new Staff("Phai", "male", "19/01/2000"));

        StaffDobComparator staffDobComparator = new StaffDobComparator();
        staffs.sort(staffDobComparator);
        System.out.println("Before demerging");
        staffs.forEach(System.out::println);
        Queue<Staff> male = new LinkedList<>();
        Queue<Staff> female = new LinkedList<>();
        staffs.forEach(staff -> {
            if (staff.getGender().equals("male")){
                male.add(staff);
            }else {
                female.add(staff);
            }
        });
        ArrayList<Staff> result = new ArrayList<>();
        while (!female.isEmpty()){
            result.add(female.remove());
        }
        while (!male.isEmpty()){
            result.add(male.remove());
        }
        System.out.println("After demerging");
        result.forEach(System.out::println);
    }
}
