package org.codeartisans.gwt.toolbox.js.exceptions;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;

/**
 * @author Paul Merlin <p.merlin@nosphere.org>
 */
public final class ThrowableView
        extends Composite
{

    private final FlowPanel div = new FlowPanel();

    public ThrowableView( Throwable fault )
    {
        Label msg = new Label( fault.getMessage() );
        HTML stacktrace = new HTML( "<pre>"
                + ThrowableDecorator.decorate( fault ).getStackTrace()
                + "</pre>" );
        div.add( msg );
        div.add( stacktrace );
        initWidget( div );
    }

}
