package pl.sda.observerObservable.zad5;

public enum DatabaseType {
    DB_REQUESTS("requests.txt"), DB_ORDERS("orders.txt"), DB_USERS("users.txt");

    private String dbName;

    DatabaseType(String dbName) {
        this.dbName = dbName;
    }

    public String getDbName() {
        return dbName;
    }
}