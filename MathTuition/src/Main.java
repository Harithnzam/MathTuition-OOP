
public class Main {

    public static void main(String[] args) {


        TuitionCentre perakTuition = new TuitionCentre();
        perakTuition.setName("Computer Science SDN BHD");
        perakTuition.setAddress("Pocket D", "Jalan Desa Kediaman", "32610", "Perak");
        perakTuition.setHeadMaster("Harith");


        Tutor tutor1 = new Tutor();
        tutor1.setName("Ahmad", "Hashim", "Halim");
        tutor1.setAddress("No. 50", "Bandar Baru", "32610", "Perak");
        tutor1.setIc("0123456789");
        tutor1.setQualification("Master");
        tutor1.setYearsExp(10);
        tutor1.setDateJoined(1, 1, 2023);
        tutor1.setYearsInCenter(3);
        perakTuition.setTutors(tutor1);



        Student stud1 = new Student();
        stud1.setName("Yusuf", "Bin", "Yunus");
        stud1.setIc("098765432");
        stud1.setAddress("No. 60", "Bandar Sentosa", "32610", "Perak");
        stud1.setYear(2023);
        stud1.setTutor(tutor1);
        stud1.setSchool("SMK MAHMUD", "Batu 19", "Perak");
        for (int i = 0; i < 5; i++){
            stud1.setMarks((int) (Math.random()*99+1));
        }


        System.out.println("Number of Students in " + perakTuition.getName() + ": " + perakTuition.countStudents());
        System.out.println("Number of Tutors in " + perakTuition.getName() + ": " + perakTuition.countTutors());


        System.out.println("\nMarks for " + stud1.getName() + ": " + stud1.getMarks());


        System.out.println("\nBackground of tutors from " + perakTuition.getName() + ": " + perakTuition.tutorBackgrounds());

    }

}