package org.codeartisans.gwt.toolbox.js.patterns.presenter;

import com.google.gwt.event.shared.HandlerRegistration;
import java.util.List;
import org.codeartisans.gwt.toolbox.js.patterns.eventbus.EventBus;

public abstract class WidgetPresenter<V extends WidgetView> {

    protected final V view;
    protected final EventBus eventBus;
    private List<HandlerRegistration> handlerRegistrations = new java.util.ArrayList<HandlerRegistration>();

    public WidgetPresenter(V view, EventBus eventBus) {
        this.view = view;
        this.eventBus = eventBus;
    }

    /**
     * This method is called when binding the presenter. Any additional bindings
     * should be done here.
     */
    protected abstract void onBind();

    /**
     * This method is called when unbinding the presenter. Any handler
     * registrations recorded with {@link #registerHandler(HandlerRegistration)}
     * will have already been removed at this point.
     */
    protected abstract void onUnbind();

    public V getView() {
        return view;
    }

    public void bind() {
        onBind();
    }

    public void unbind() {
        for (HandlerRegistration reg : handlerRegistrations) {
            reg.removeHandler();
        }
        handlerRegistrations.clear();

        onUnbind();
    }

    protected void registerHandler(HandlerRegistration handlerRegistration) {
        handlerRegistrations.add(handlerRegistration);
    }
}
