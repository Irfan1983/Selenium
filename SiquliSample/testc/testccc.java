package testc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class testccc {

	public static void main(String[] args) throws FindFailed, InterruptedException, AWTException {
		// TODO Auto-generated method stub

		int i = 2;
		while(i==2)
		{
		Screen s=new Screen();
		Iterator<Match> it =s.findAll("E:\\SikuliImges\\Capture12345.PNG");
		//System.out.println(
		s.rightClick();
		Thread.sleep(3000);
		Screen s1=new Screen();
		Iterator<Match> it1 =s1.findAll("E:\\SikuliImges\\Capture12345.PNG");
		//System.out.println(
		s1.rightClick();
		
	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE); r.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(60000);

	}}

}
