package com.jwebmp.plugins.easypiechart;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Page configurator for Easy Pie Chart — lightweight animated pie charts.
 */
@PluginInformation(pluginName = "Easy Pie Chart",
		pluginDescription = "Lightweight plugin to render simple, animated and retina optimized pie charts for single values.",
		pluginUniqueName = "easy-pie-chart",
		pluginVersion = "2.1.7",
		pluginCategories = "charting, pie, easy pie, ui, web ui",
		pluginSubtitle = "Lightweight plugin to render simple, animated and retina optimized pie charts",
		pluginSourceUrl = "https://github.com/rendro/easy-pie-chart",
		pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
		pluginGitUrl = "https://github.com/JWebMP/JWebMP",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://github.com/rendro/easy-pie-chart",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/easy-pie-chart",
		pluginLastUpdatedDate = "2026/05/09",
		pluginGroupId = "com.jwebmp.plugins",
		pluginArtifactId = "easy-pie-chart",
		pluginModuleName = "com.jwebmp.plugins.easypiechart",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "easy-pie-chart", version = "^2.1.7")
@NgScript("node_modules/easy-pie-chart/dist/easypiechart.min.js")
@SuppressWarnings("unused")
public class EasyPieChartPageConfigurator
		implements IPageConfigurator<EasyPieChartPageConfigurator>
{
	@Override
	public IPage<?> configure(IPage<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
