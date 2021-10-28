public class Insured extends Products{

    private String companyName;
    private int sum;

    public Insured(String date, String time, int id, String companyName, int sum) {
        super(date, time, id);

        this.companyName = companyName;
        this.sum = sum;
    }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String value) { companyName = value; }

    public int getSum() { return sum; }
    public void setSum(int value) { sum = value; }


    public String toString()
    {
        return super.toString() +
                " companyName = " + companyName +
                " sum = " + sum;
    }

}
