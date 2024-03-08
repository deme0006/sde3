# Software Design Assignment 3: Program

## Author: Oleksandr Dementiev

## **GitHub**: https://github.com/deme0006/sde3

The app is quite simple. It is used to display fake weather data (temperature and humidity) and was created to apply knowledge of implementing design pattern.
_The main file is WeatherStationClient.java_

## Design patterns

### Creational

#### **Abstract Factory**

TemperatureSensor and HumiditySensor are abstract products and CelsiusTemperatureSensor, FahrenheitTemperatureSensor, BasicHumiditySensor and AdvancedHumiditySensor are their concrete implementations. The WeatherSensorFactory interface declares the creation methods for their products families. BasicWeatherSensorFactory and AdvancedWeatherSensorFactory are two concrete factories that implement the WeatherSensorFactory interface and create products of the families.

#### **Singleton**

WeatherStationClient class is a Singleton, which means that only one instance of the class can be created. The getInstance() method is used to get this very instance, so we can use it to read weather data with different factories.

### Structural

#### **Proxy**

In the folder 'proxies', there are two proxy classes for TemperatureSensor and HumiditySensor. These proxy classes perform pre-processing and/or post-processing tasks before and/or after delegating work to the real instances.

### Behavioral

#### **Template Method**

WeatherStationClient class defines a template method readWeatherData which outlines the steps for reading weather data. We should also create a ConcreteWeatherStationClient to provide specific implementations for certain steps. Concrete factories BasicWeatherSensorFactory and AdvancedWeatherSensorFactory can be used to create instances, and the Template method can be used to read weather data.

#### **Iterator**

WeatherData class represents a collection of weather information. The WeatherStationClient class uses collection to store weather data. Iterator and WeatherDataIterator(concrete iterator) are used inside the WeatherStationClient, in the displayWeatherData method.
