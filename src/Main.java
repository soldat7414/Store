import controllers.ClientController;
import models.Client;
import services.ClientService;
import views.ClientView;

public class Main {
    public static void main(String[] args) {

        Client model = new Client();
        ClientView view = new ClientView(model);
        ClientService service = new ClientService(model);
        ClientController controller = new ClientController(service, view);

        controller.runApp();
    }
}
