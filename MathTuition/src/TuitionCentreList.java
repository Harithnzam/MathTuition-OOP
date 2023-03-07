
import java.util.ArrayList;

public class TuitionCentreList {


    private ArrayList<TuitionCentre> centers = new ArrayList<TuitionCentre>();


    public TuitionCentreList() {

    }

    public TuitionCentreList(ArrayList<TuitionCentre> centers) {
        this.centers = centers;
    }

    //methods
    public void setCenters(ArrayList<TuitionCentre> centers) {
        this.centers = centers;
    }

    public void setCenters(TuitionCentre center){
        this.centers.add(center);
    }

    public void getCenters(){
        String names[] = new String[centers.size()];

        for (int i = 0; i < centers.size(); i++){
            System.out.println(centers.get(i).getName());
        }
    }

}
