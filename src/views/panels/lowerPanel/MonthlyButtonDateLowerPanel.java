package views.panels.lowerPanel;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;

public class MonthlyButtonDateLowerPanel extends ButtonDateLowerPanel {
    public MonthlyButtonDateLowerPanel(List<LocalDate> dates) {
        super(dates,3,7);
    }
}
