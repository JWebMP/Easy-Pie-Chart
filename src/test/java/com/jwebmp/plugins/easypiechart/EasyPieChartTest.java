package com.jwebmp.plugins.easypiechart;

import com.jwebmp.core.htmlbuilder.css.colours.ColourCSSImpl;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class EasyPieChartTest
{

	public EasyPieChartTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		EasyPieChart epc = new EasyPieChart();
		System.out.println(epc.toString(true));
	}

	@Test
	public void testJs()
	{
		EasyPieChart epc = new EasyPieChart();
		System.out.println(epc.renderJavascript());
	}

	@Test
	public void testJsOptions()
	{
		EasyPieChart epc = new EasyPieChart();
		epc.getOptions()
		   .setBarColor(new ColourCSSImpl("#45ffee"));
		epc.getOptions()
		   .setLineWidth(2);
		epc.getOptions()
		   .getAnimate()
		   .setDuration(500);
		epc.getOptions()
		   .setLineCap(LineCapShap.Round);
		epc.getOptions()
		   .setEasing(JQEasingEffects.swing);
		System.out.println(epc.renderJavascript());
	}
}
