package Exercise6;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void execute() {

        api.login();
        api.getData();
        api.logout();
    }
}