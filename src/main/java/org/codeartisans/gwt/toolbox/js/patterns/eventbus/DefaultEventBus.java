package org.codeartisans.gwt.toolbox.js.patterns.eventbus;

import com.google.gwt.event.shared.HandlerManager;

public class DefaultEventBus extends HandlerManager implements EventBus {

    public DefaultEventBus() {
        super(null);
    }
}
