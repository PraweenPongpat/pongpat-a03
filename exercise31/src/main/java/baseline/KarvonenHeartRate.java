package baseline;

public class KarvonenHeartRate {
    //declare attributes
    private final int age;
    private final int restingHR;

    //constructor, these input are ensured to be integer already
    public KarvonenHeartRate(int age, int restingHR) {
        this.age = age;
        this.restingHR = restingHR;
    }
    public int getAge(){
        return age;
    }
    public int getRestingHR(){
        return restingHR;
    }

    //method used to display tabular format
    public void displayTable() {
        //print proper headers of the table's format, intensity -> | -> rate and --...--|-------
        System.out.println("\nIntensity    | Rate");
        System.out.println("-------------|--------");
        //start loop ranging from 55 to 95
        for(int i = 55; i<=95; i=i+5){
            //display each line with displayLine in the proper format
            System.out.println(displayLine(i));
        }
    }

    public String displayLine (int intensity){
        //put together format <xx%    | Rate>
        //  where xx is intensity
        //  Rate is from calcRate method
        return String.format("%d%%          | %d bpm",intensity,calcRate(intensity/100.00));
    }

    //perform calculation to get Rate, upon intensity
    private int calcRate(double intensity){
        //calculate Rate using : (((220 − age) − restingHR) × intensity) + restingHR
        //round that number to integers
        //return that value
        return (int)Math.round((((220-getAge())-getRestingHR())*intensity)+getRestingHR());
    }
}
