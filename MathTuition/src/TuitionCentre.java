
import java.util.ArrayList;

public class TuitionCentre {


    private String name;
    private Address address = new Address();
    private String headMaster;
    private ArrayList<Tutor> tutors = new ArrayList<Tutor>();
    private StudentBatch batch = new StudentBatch();


    public TuitionCentre() {

    }

    public TuitionCentre(String name, Address address, String headMaster, ArrayList<Tutor> tutors, StudentBatch batch) {
        this.name = name;
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = tutors;
        this.batch = batch;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address.toString();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddress(String unit, String street, String postcode, String state){
        this.address.setUnit(unit);
        this.address.setStreet(street);
        this.address.setPostcode(postcode);
        this.address.setState(state);
    }

    public String getHeadMaster() {
        return headMaster;
    }

    public void setHeadMaster(String headMaster) {
        this.headMaster = headMaster;
    }

    public ArrayList<Tutor> getTutors() {
        return tutors;
    }

    public void setTutors(ArrayList<Tutor> tutors) {
        this.tutors = tutors;
    }

    public void setTutors(Tutor tutor){
        this.tutors.add(tutor);
    }

    public StudentBatch getStudents() {
        return batch;
    }

    public void setStudents(StudentBatch batch) {
        this.batch = batch;
    }

    public int countTutors(){
        return tutors.size();
    }

    public int countStudents(){
        return  batch.getBatchSize();
    }

    public ArrayList<String> tutorBackgrounds(){
        ArrayList<String> backgroundSummary = new ArrayList<String>();

        for (int i = 0; i < tutors.size(); i ++){
            backgroundSummary.add(tutors.get(i).getQualification());
        }

        return backgroundSummary;
    }
}
