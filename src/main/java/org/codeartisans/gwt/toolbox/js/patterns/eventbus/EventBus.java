package org.codeartisans.gwt.toolbox.js.patterns.eventbus;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;

public interface EventBus
{

    <H extends EventHandler> HandlerRegistration addHandler(GwtEvent.Type<H> type, H handler);

    void fireEvent(GwtEvent<?> event);

    <H extends EventHandler> H getHandler(GwtEvent.Type<H> type, int index);

    int getHandlerCount(GwtEvent.Type<?> type);

    boolean isEventHandled(GwtEvent.Type<?> e);

}
