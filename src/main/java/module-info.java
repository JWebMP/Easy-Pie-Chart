import com.jwebmp.plugins.easypiechart.implementations.EasyPieChartInclusionModule;

module com.jwebmp.plugins.easypiechart {
	exports com.jwebmp.plugins.easypiechart;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.jwebmp.plugins.easingeffects;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.easypiechart.EasyPieChartPageConfigurator;
	provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with EasyPieChartInclusionModule;
	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.easypiechart.implementations.EasyPieChartExclusionsModule;

	opens com.jwebmp.plugins.easypiechart to tools.jackson.databind, com.google.guice, com.jwebmp.core;
}
