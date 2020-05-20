package edu.sjsu.cs.tinnitus.tests;

import java.awt.Frame;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;

import edu.sjsu.cs.tinnitus.controller.ClinicController;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyGraph;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyGraphView;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyView;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;

public class OverallTest
{
	ClinicController cc;
	
	@Before
	public void initTests()
	{
		cc = new ClinicController();
	}
	
	@Test
	public void testAudiologyGraph()
	{
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

        cc.getFrame().setContentPane(agv);
        assert(cc.getFrame().getContentPane() == agv); // Checks to see if set to correct content pane.
        
        for (int i = 0; i < agv.getLeftEar().size(); i++)
        {
        	assert(agv.getLeftEar().get(i) == pointList.get(i)); // Checks whether same points on panel as added.
        }
        
        for (int i = 0; i < agv.getRightEar().size(); i++)
        {
        	assert(agv.getRightEar().get(i) == pointList2.get(i)); // Checks whether same points on panel as added.
        }
	}
	
	@Test
	public void testAudiology()
	{
		AudiologyView av = new AudiologyView();
		cc.getFrame().setContentPane(av.getPanel());
		assert(cc.getFrame().getContentPane() == av.getPanel()); // Checks to see if set to correct content pane.
	}
	
	/**
	 * Tests whether JUnit tests are working. SHOULD BE FALSE!!
	 */
	@Test
	public void testFalse()
	{
		assert(cc.getFrame().isVisible() == false);
	}
	
	/**
	 * Checks whether Clinic Controller is visible.
	 */
	@Test
	public void testClinicController()
	{
		assert(cc.getFrame().isVisible() == true);
	}
	
	/**
	 * Tests login view.
	 */
	@Test
	public void testLogIn()
	{
		LogInView liv = new LogInView();
		cc.getFrame().setContentPane(liv.getPanel());
		assert(cc.getFrame().getContentPane() == liv.getPanel());
	}
	
	/**
	 * Tests Medical History.
	 */
	@Test
	public void testMedicalHistory()
	{
		
	}
	
	@Test
	public void testMedication()
	{
		
	}
	
	@Test
	public void testNavigation()
	{
		
	}
	
	@Test
	public void testPatientList()
	{
		
	}
	
	@Test
	public void testPatient()
	{
		
	}
	
	@Test
	public void testRegister()
	{
		
	}
	
	@Test
	public void testVisits()
	{
		
	}
}
