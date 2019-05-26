package pl.sda.singleton.zad2;

public enum MySettings {
    INSTANCE(10, 3, 100, "+-/*");//, INSTANCE_HARD(100, 1000000, 100000, "/");

    private int numberOfRounds;
    private int range1;
    private int range2;
    private String signs;

    MySettings(int numberOfRounds, int range1, int range2, String signs) {
        this.numberOfRounds = numberOfRounds;
        this.range1 = range1;
        this.range2 = range2;
        this.signs = signs;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public int getRange1() {
        return range1;
    }

    public void setRange1(int range1) {
        this.range1 = range1;
    }

    public int getRange2() {
        return range2;
    }

    public void setRange2(int range2) {
        this.range2 = range2;
    }

    public String getSigns() {
        return signs;
    }

    public void setSigns(String signs) {
        this.signs = signs;
    }
}