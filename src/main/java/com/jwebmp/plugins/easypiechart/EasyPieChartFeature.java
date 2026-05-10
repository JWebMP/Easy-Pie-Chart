package com.jwebmp.plugins.easypiechart;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Applies the JQuery to the easy pie chart feature
 *
 * @author GedMarc
 * @since 12 Jun 2017
 */
public class EasyPieChartFeature
		extends Feature<GlobalFeatures, EasyPieChartOptions, EasyPieChartFeature>
{


	/*
	 * Constructs a new EasyPieChartFeature
	 */
	public EasyPieChartFeature(ComponentHierarchyBase component)
	{
		super("EasyPieChart", component);
	}

	/**
	 * Returns all the easy pie chart options
	 *
	 * @return
	 */
	@Override
	public EasyPieChartOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			super.setOptions(new EasyPieChartOptions());
		}
		return super.getOptions();
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "easyPieChart(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}

}
