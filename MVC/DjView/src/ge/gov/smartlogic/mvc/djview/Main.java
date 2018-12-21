package ge.gov.smartlogic.mvc.djview;

import ge.gov.smartlogic.mvc.djview.domain.BeatController;
import ge.gov.smartlogic.mvc.djview.domain.BeatModel;
import ge.gov.smartlogic.mvc.djview.domain.BeatModelInterface;
import ge.gov.smartlogic.mvc.djview.domain.ControllerInterface;
import ge.gov.smartlogic.mvc.djview.domain.HeartController;
import ge.gov.smartlogic.mvc.djview.domain.HeartModel;
import ge.gov.smartlogic.mvc.djview.domain.HeartModelInterface;

public class Main {

    public static void main(String[] args) {
        //beatModelTestDrive();
        heartModelTestDrive();
    }

    private static void heartModelTestDrive() {
        HeartModelInterface heartModel = new HeartModel();
        ControllerInterface controller = new HeartController(heartModel);
    }

    private static void beatModelTestDrive() {
        BeatModelInterface modelInterface = new BeatModel();
        ControllerInterface controllerInterface = new BeatController(modelInterface);
    }
}
