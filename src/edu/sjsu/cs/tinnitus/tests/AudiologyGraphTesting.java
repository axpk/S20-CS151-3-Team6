package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.view.frames.AudiologyGraph;

import javax.swing.*;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

public class AudiologyGraphTesting {

	@Test
    public void testAudiologyGraph() {
        double[] db = {40, 20, 12, 32, 50 , 20, 80, 9};
        ArrayList<Point> pointList = new ArrayList<>();
        pointList.add(new Point(1000, 25));
        pointList.add(new Point(2000, 50));
        pointList.add(new Point(3000, 80));
        pointList.add(new Point(4000, 100));
        pointList.add(new Point(5000, 30));
        pointList.add(new Point(6000, 10));
        pointList.add(new Point(7000, 30));
        pointList.add(new Point(8000, 36));


        ArrayList<Point> pointList2 = new ArrayList<>();
        pointList2.add(new Point(1200, 25));
        pointList2.add(new Point(2200, 50));
        pointList2.add(new Point(2300, 70));
        pointList2.add(new Point(3400, 110));
        pointList2.add(new Point(4500, 43));
        pointList2.add(new Point(5600, 51));
        pointList2.add(new Point(6700, 60));
        pointList2.add(new Point(7800, 66));


        AudiologyGraph agv = new AudiologyGraph();
        agv.setLeftEar(pointList);
        agv.setRightEar(pointList2);

        JFrame frame = new JFrame();
        frame.add(agv);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.doLayout();
        frame.validate();
        frame.repaint();
        frame.setVisible(true);
    }
}