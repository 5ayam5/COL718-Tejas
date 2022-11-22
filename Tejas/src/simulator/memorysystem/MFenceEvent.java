package memorysystem;

import generic.Event;
import generic.EventQueue;
import generic.SimulationElement;
import generic.RequestType;
import pipeline.outoforder.ReorderBufferEntry;

public class MFenceEvent extends Event {
	ReorderBufferEntry reorderBufferEntry;

	public MFenceEvent(EventQueue eventQ,
			long eventTime,
			SimulationElement requestingElement,
			SimulationElement processingElement,
			RequestType requestType, ReorderBufferEntry reorderBufferEntry) {
		super(eventQ, eventTime, requestingElement, processingElement, requestType, -1);
		this.reorderBufferEntry = reorderBufferEntry;
	}

	public ReorderBufferEntry getROBEntry() {
		return this.reorderBufferEntry;
	}
}
