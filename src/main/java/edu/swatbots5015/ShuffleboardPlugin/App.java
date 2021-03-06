package edu.swatbots5015.ShuffleboardPlugin;

import java.util.List;

import com.google.common.collect.ImmutableList;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;

@Description(group = "SwatBots 5015", name = "SwatPlugin", summary = "A group of widgets for Shuffleboard", version = "1.0.0")
public class App extends Plugin {
	@Override
	@SuppressWarnings("all")
	public List<ComponentType> getComponents() {

		return ImmutableList.of(WidgetType.forAnnotatedWidget(TemperatureGauge.class),
			WidgetType.forAnnotatedWidget(BatteryGauge.class));
	}
}
