package methodsmadness;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MethodsMadness extends Application {

    public static void main(String[] args) {
         launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1680, 1050);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawVoid(gc, 0, 0, 1680,1050);
        for (int i = 5; i < 1000; i++){
        drawAWormhole(gc, (int) (Math.random() * i)+2,(int) (Math.random() * i)+2,(int) (Math.random() * i)+2,(int)  (Math.random() * i)+2);
        drawAWormhole(gc, 5, 5, 5, 5);
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

    

    private void drawVoid(GraphicsContext gc,double x, double y, double w, double h){
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0, 1650, 1050);
    }
    private void drawAWormhole(GraphicsContext gc,double x, double y, double w, double h){
        gc.setStroke(Color.PURPLE);
        gc.strokeRect(x,y, w, h);
    }

    
}
    
   

        // TODO code application logic here