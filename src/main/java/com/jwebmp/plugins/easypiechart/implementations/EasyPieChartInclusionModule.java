package com.jwebmp.plugins.easypiechart.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class EasyPieChartInclusionModule implements IGuiceScanModuleInclusions<EasyPieChartInclusionModule>
{
	@Override
	public Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.easypiechart");
		return set;
	}
}
