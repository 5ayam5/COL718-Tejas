package pipeline.outoforder;

import generic.Event;
import generic.EventQueue;
import generic.SimulationElement;
import generic.RequestType;

public class TLBFlushEvent extends Event {
	ReorderBufferEntry reorderBufferEntry;
	public TLBFlushEvent(EventQueue eventQ,
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
