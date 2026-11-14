package com.jwebmp.plugins.easypiechart.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class EasyPieChartExclusionsModule implements IGuiceScanModuleExclusions<EasyPieChartExclusionsModule>, IGuiceScanJarExclusions<EasyPieChartExclusionsModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.easypiechart"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("easy-pie-chart.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("easy-pie-chart-" + digit + "*.jar");
        return jars;
    }
}
