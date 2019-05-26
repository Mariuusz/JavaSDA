package pl.sda.observerObservable.zadSmsStation;

public class MMSMessage {
    private String doKogo;
    private String co;
    private boolean powiadomienie;

    public MMSMessage(String doKogo, String co, boolean powiadomienie) {
        this.doKogo = doKogo;
        this.co = co;
        this.powiadomienie = powiadomienie;
    }

    public String getDoKogo() {
        return doKogo;
    }

    public void setDoKogo(String doKogo) {
        this.doKogo = doKogo;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public boolean isPowiadomienie() {
        return powiadomienie;
    }

    public void setPowiadomienie(boolean powiadomienie) {
        this.powiadomienie = powiadomienie;
    }
}
