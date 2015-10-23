
package hebert_3_javafx_intro;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Hebert_3_JavaFX_Intro extends Application {

    public static void main(String[] args) {
         launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1200, 1500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (int i = 5; i < 1000; i++){
        drawSomeRectangles(gc, (int) (Math.random() * i)+2,(int) (Math.random() * i)+2,(int) (Math.random() * i)+2,(int)  (Math.random() * i)+2);
        drawSomeRectangles(gc, 5, 5, 5, 5);
        }
//   drawShapes(gc) 
        drawTARDIS(gc,25,66,43,50);
        //drawLotsOfCircles(gc, 40);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
        
    
    
    private void drawTARDIS(GraphicsContext gc, double x, double y, double w, double h) {
        gc.setFill(Color.NAVY);
        gc.fillRect(50,32.5, 32.5, 50);

        gc.setFill(Color.WHITE);
        gc.fillRect(52,37.5, 12, 12);
        
        gc.setFill(Color.WHITE);
        gc.fillRect(68.5,37.5, 12, 12);
        
        gc.setFill(Color.GRAY);
        gc.fillRect(52.5,55, 9, 10);
        
        gc.setFill(Color.GRAY);
        gc.fillRect(52.5,69, 9, 10);
        
        gc.setFill(Color.GRAY);
        gc.fillRect(72,55, 9, 10);
        
        gc.setFill(Color.GRAY);
        gc.fillRect(72,69, 8, 10);
        
        gc.setFill(Color.NAVY);
        gc.fillRect(52.5,55, 7, 8);
        
        gc.setFill(Color.NAVY);
        gc.fillRect(52.5,69, 7, 8);
        
        gc.setFill(Color.NAVY);
        gc.fillRect(72,55, 7, 8);
        
        gc.setFill(Color.NAVY);
        gc.fillRect(72,69, 7, 8);
}

    

    
    
    private void drawSomeRectangles(GraphicsContext gc,double x, double y, double w, double h){
        gc.setStroke(Color.PURPLE);
        gc.strokeRect(x,y, w, h);
    }
   }

        // TODO code application logic here