package views.panels.lowerPanel;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class WeeklyButtonDateLowerPanel extends ButtonDateLowerPanel{
    public WeeklyButtonDateLowerPanel(List<LocalDate> dates) {
        super(dates,1,7);
    }
}
