package attendanceproject.gui.controller.calendar;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 * Create an anchor pane that can store additional data.
 */
public class AnchorPaneNode extends AnchorPane {

    // Date associated with this pane
    private LocalDate date;
    private FullCalendarView view;

    /**
     * Create a anchor pane node.Date is not assigned in the constructor.
     * @param View
     * @param children children of the anchor pane
     */
    public AnchorPaneNode(FullCalendarView View,Node... children) {
        super(children);
        this.view = View;
        
        
        // Add action handler for mouse clicked
        this.setOnMouseClicked(e -> {
            
            for (AnchorPaneNode node : this.view.getAllCalendarDays()) {
                
                
                node.setBackground(Background.EMPTY);
                
            }
               /* 
                System.out.println("This pane's date is: " + date);
                setStyle(" -fx-background-image: url(\"elipse.png\");"
                        + "  -fx-background-size: 50 50;"
                        + "-fx-background-position: center center;"
                        + " -fx-background-color: #FBBB2C;");*/
                
               BackgroundFill myBF = new BackgroundFill(Color.rgb(251, 187, 44), new CornerRadii(365),
         new Insets(0.0,0.0,0.0,0.0));// or null for the padding
        //then you set to your node or container or layout
        
            setBackground(new Background(myBF));
        
        
        
        
        } );
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
