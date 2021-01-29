import java.util.*;

public class Configuration {
	
	public static class ConfigurationData {
		private int interval;
		private int duration;
		private int departure;

		public ConfigurationData() {
		}

		public int getDeparture() {
			return departure;
		}

		public void setDeparture(int departure) {
			this.departure = departure;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public int getInterval() {
			return interval;
		}

		public void setInterval(int interval) {
			this.interval = interval;
		}
	}

	private ConfigurationData data = new ConfigurationData();

	public void load(Properties props) throws ConfigurationException {
		/*
		int value = monitorInterval(props);
		setInterval(value);

		value = duration(props);
		setDuration(value);

		value = departure(props);
		setDeparture(value);
		*/
		data = departure(props, duration(props, monitorInterval(props, data)));
	}

	private ConfigurationData departure(Properties props, ConfigurationData data) throws ConfigurationException {
		int value;
		String valueString = props.getProperty("departure");
		if (valueString == null) {
			throw new ConfigurationException("departure offset");
		}
		value = Integer.parseInt(valueString);
		if (value <= 0) {
			throw new ConfigurationException("departure > 0");
		}
		if ((value % data.getInterval()) != 0) {
			throw new ConfigurationException("departure % interval");
		}
		//return value;
		data.setDeparture(value);
		return data;
	}

	private ConfigurationData duration(Properties props, ConfigurationData data) throws ConfigurationException {
		int value;
		String valueString;
		valueString = props.getProperty("duration");
		if (valueString == null) {
			throw new ConfigurationException("duration");
		}
		value = Integer.parseInt(valueString);
		if (value <= 0) {
			throw new ConfigurationException("duration > 0");
		}
		if ((value % data.getInterval()) != 0) {
			throw new ConfigurationException("duration % interval");
		}
		//return value;
		data.setDuration(value);
		return data;
	}

	private ConfigurationData monitorInterval(Properties props, ConfigurationData data) throws ConfigurationException {
		String valueString;
		int value;

		valueString = props.getProperty("interval");
		if (valueString == null) {
			throw new ConfigurationException("monitor interval");
		}
		value = Integer.parseInt(valueString);
		if (value <= 0) {
			throw new ConfigurationException("monitor interval > 0");
		}
		//return value;
		data.setInterval(value);
		return data;
	}

	public ConfigurationData getData() {
		return data;
	}

	public void setData(ConfigurationData data) {
		this.data = data;
	}
}
