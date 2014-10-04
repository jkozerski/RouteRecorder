package com.gmail.januszkozerski.routerecorder;

public abstract class RecorderSettings {
	static public int maxRecordedTime;    // max length of single file [time in minutes]
	static public int maxAvaliableSpace;  // max space available for files [GB]
	static public String filesLocation;   // location of stored files [path]
	static public boolean useGPS;         // use GPS sensor (for displaying speed)
	static public boolean useMic;         // use microphone
    static public boolean useFrontCamera; // save video from front camera(interior of the car)
}
