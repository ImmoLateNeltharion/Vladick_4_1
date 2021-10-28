public class Express extends Products{
    private String courier;
    private String deliveryDate;

    public Express(String date, String time, int id, String courier, String deliveryDate) {
        super(date, time, id);

        this.courier = courier;
        this.deliveryDate = deliveryDate;
    }
    public String getCourier() { return courier; }
    public void setCourier(String value) { courier = value; }

    public String getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(String value) { deliveryDate = value; }

    public String toString()
    {
        return super.toString() +
                " courier = " + courier +
                " deliveryDate = " + deliveryDate;
    }
}
