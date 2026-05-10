package com.jwebmp.plugins.easypiechart.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import java.util.HashSet;
import java.util.Set;

public class EasyPieChartExclusionsModule
		implements IGuiceScanModuleExclusions<EasyPieChartExclusionsModule>
{
	@Override
	public Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.easypiechart");
		return strings;
	}
}
