package pl.sda.observerObservable.zad5;

import java.util.Optional;

public class RequestParser {

    public static Optional<Request> parseRequest(String line) {
        // TODO: Scanner który ładuje nam pojedynczy request
        // TODO: typ username content bla bla bla
        // TODO: typ|username|content bla bla bla
        try {
            String[] parsedLine = line.split(" ", 3);

            // get type
            RequestType requestType = RequestType.valueOf(parsedLine[0]);

            // get username
            String userName = parsedLine[1];

            // get content
            String content = parsedLine[2];

            // create request from data above
            Request request = new Request(userName, requestType, content);

            // if everything is right
            return Optional.of(request);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wrong number of arguments.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Wrong type.");
        }
        return Optional.empty();
    }
}