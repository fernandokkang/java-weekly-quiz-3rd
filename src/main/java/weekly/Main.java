package weekly;

import weekly.controller.ManagementController;
import weekly.service.ManagementService;
import weekly.service.ManagementServiceImpl;
import weekly.view.InputView;
import weekly.view.OutputView;

public class Main {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        ManagementService managementService = new ManagementServiceImpl();

        ManagementController managementController
                = new ManagementController(inputView, outputView, managementService);

        managementController.run();
    }
}