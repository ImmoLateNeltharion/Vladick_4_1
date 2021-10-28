class Products {
    private String date;
    private String time;
    private int id;

    public Products(String date, String time, int id)
    {
        this.date = date;
        this.time = time;
        this.id = id;
    }

    public int getId() { return id; }
    public void setId(int value) { id = value; }

    public String getDate() { return date; }
    public void setDate(String value) { date = value; }

    public String getTime() { return time; }
    public void setTime(String value) { time = value; }

    public String toString()
    {
        return "id = " + id + " date = " + date + " time = " + time;
    }
}
