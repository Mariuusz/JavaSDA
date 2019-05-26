package pl.sda.observerObservable.zad5;

public class Request {
    private String userName;
    private RequestType type;
    private String content;

    public Request(String userName, RequestType type, String content) {
        this.userName = userName;
        this.type = type;
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Request{" +
                "userName='" + userName + '\'' +
                ", type=" + type +
                ", content='" + content + '\'' +
                '}';
    }
}