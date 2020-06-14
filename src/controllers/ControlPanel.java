package controllers;

import observators.observatorManagers.DateObserverManager;
import utils.CustomLocalDate;
import views.frames.Frame;
import views.frames.MainFrame;

public class ControlPanel {
    private CustomLocalDate localDate;
    private Frame mainFrame;
    private static ControlPanel CONTROL_PANEL_INSTANCE;

    private ControlPanel(){
        localDate = new CustomLocalDate();
        DateObserverManager.getInstance().registerObservator(localDate);
        mainFrame = new MainFrame(localDate);
    }

    public static ControlPanel getInstance(){
        if(CONTROL_PANEL_INSTANCE == null){
            CONTROL_PANEL_INSTANCE = new ControlPanel();
        }
        return CONTROL_PANEL_INSTANCE;
    }
}
