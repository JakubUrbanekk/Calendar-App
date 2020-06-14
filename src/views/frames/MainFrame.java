package views.frames;

import utils.CustomLocalDate;
import views.panels.Panel;
import views.panels.lowerPanel.ButtonDateLowerPanel;
import views.panels.lowerPanel.LowerPanel;
import views.panels.lowerPanel.MonthlyButtonDateLowerPanel;
import views.panels.lowerPanel.WeeklyButtonDateLowerPanel;
import views.panels.upperPanel.UpperPanel;

import java.awt.*;
import java.time.LocalDate;

public class MainFrame extends Frame {
    private ButtonDateLowerPanel weeklyButtonPanel;
    private ButtonDateLowerPanel monthyButtonPanel;
    private UpperPanel upperPanel;

    public MainFrame(CustomLocalDate localDate){
        super("Calendar");
        BorderLayout borderLayout = new BorderLayout();
        getContentPane().setLayout(borderLayout);
        weeklyButtonPanel = new WeeklyButtonDateLowerPanel(localDate.getDaysFromCurrentMonth());
        monthyButtonPanel = new MonthlyButtonDateLowerPanel(localDate.getDaysFromCurrentMonth());
        weeklyButtonPanel.setVisible(false);
        upperPanel = new UpperPanel(localDate.getCurrentDate());
        add(weeklyButtonPanel, BorderLayout.SOUTH);
        add(monthyButtonPanel, BorderLayout.SOUTH);
        add(upperPanel, BorderLayout.NORTH);
        setVisible(true);
    }
    public void switchToWeeklyLayout(){

    }

}

