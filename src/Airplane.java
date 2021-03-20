public class Airplane implements Comparable<Airplane> {
    private int fligthNum;
    private String airlineCode;
    private String airlineName;

    public Airplane(int fligthNum, String airlineCode, String airlineName) {
        this.fligthNum = fligthNum;
        this.airlineCode = airlineCode;
        this.airlineName = airlineName;
    }

    public int getFligthNum() {
        return fligthNum;
    }

    public void setFligthNum(int fligthNum) {
        this.fligthNum = fligthNum;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }


    @Override
    public String toString() {
        return "Flight Number #" + fligthNum + " with " + airlineName;
    }

    @Override
    public int compareTo(Airplane o) {
        // TODO Auto-generated method stub
        return 0;
    }
}