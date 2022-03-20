package applicationReggylertTool;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.util.ArrayList;

public class test111 extends Application {
    @Override
    public void start(Stage stage) {

        //Create a pane
        Pane pane = new Pane();

        // Array List to store objects
        ArrayList<Shape> faceItems = new ArrayList<>();

        //Create head
        Circle head = new Circle();
        double centerCircleX = 450;
        head.setCenterX(centerCircleX);
        double centerCircleY = 150;
        head.setCenterY(centerCircleY);
        double radius = 50;
        head.setRadius(radius);
        head.setStroke(Color.BLACK);
        head.setFill(null);
        faceItems.add(head);

        // line torso
        Line lineTorso = new Line();
        lineTorso.setStartX(centerCircleX);
        lineTorso.setStartY(centerCircleY + radius);
        lineTorso.setEndX(centerCircleX);
        double lineTorsoEndY = centerCircleY + 200;
        lineTorso.setEndY(lineTorsoEndY);
        faceItems.add(lineTorso);

        // line leg right
        Line lineLegRight = new Line();
        lineLegRight.setStartX(centerCircleX);
        lineLegRight.setStartY(lineTorsoEndY);
        lineLegRight.setEndX(centerCircleX + 50);
        lineLegRight.setEndY(lineTorsoEndY + 100);
        faceItems.add(lineLegRight);

        // line leg left
        Line lineLegLeft = new Line();
        lineLegLeft.setStartX(centerCircleX);
        lineLegLeft.setStartY(lineTorsoEndY);
        lineLegLeft.setEndX(centerCircleX - 50);
        lineLegLeft.setEndY(lineTorsoEndY + 100);
        faceItems.add(lineLegLeft);

        // line arm right
        Line lineArmRight = new Line();
        lineArmRight.setStartX(centerCircleX);
        lineArmRight.setStartY(lineTorsoEndY - 100);
        lineArmRight.setEndX(centerCircleX + 60);
        lineArmRight.setEndY(lineTorsoEndY - 50);
        faceItems.add(lineArmRight);

        // line arm right
        Line lineArmLeft = new Line();
        lineArmLeft.setStartX(centerCircleX);
        lineArmLeft.setStartY(lineTorsoEndY - 100);
        lineArmLeft.setEndX(centerCircleX - 60);
        lineArmLeft.setEndY(lineTorsoEndY - 50);
        faceItems.add(lineArmLeft);

        // Line 1 above head
        Line line1 = new Line();
        line1.setStartX(centerCircleX);
        double line1Y = centerCircleY - radius;
        line1.setStartY(line1Y);
        line1.setEndX(centerCircleX);
        double line1End = line1Y - 50;
        line1.setEndY(line1End);
        faceItems.add(line1);

        // Line 2 top line
        Line line2 = new Line();
        line2.setStartX(centerCircleX);
        line2.setStartY(line1End);
        line2.setEndX(centerCircleX - 300);
        line2.setEndY(line1End);
        faceItems.add(line2);

        // Line 3 down big
        Line line3 = new Line();
        line3.setStartX(centerCircleX - 300);
        line3.setStartY(650);
        line3.setEndX(centerCircleX - 300);
        line3.setEndY(line1End);
        faceItems.add(line3);

        // Arch bottom
        Arc bottomArch = new Arc();
        bottomArch.setCenterX(centerCircleX - 300);
        bottomArch.setCenterY(665);
        bottomArch.setRadiusX(80);
        bottomArch.setRadiusY(15);
        bottomArch.setStartAngle(360);
        bottomArch.setLength(180);
        bottomArch.setFill(null);
        bottomArch.setStroke(Color.BLACK);
        faceItems.add(bottomArch);

        //Create a pane
        pane.getChildren().addAll(faceItems);

        //Create a scene and place iy in the stage
        Scene scene = new Scene(pane, 600, 750);
        stage.setTitle("Hang Man");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
