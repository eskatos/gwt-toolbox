package org.codeartisans.gwt.toolbox.js.utils;

/**
 * @author Paul Merlin <p.merlin@nosphere.org>
 */
public final class NativeUtils
{

    protected NativeUtils()
    {
    }

    public static native void reloadWindow() /*-{ $wnd.location.reload(); }-*/;

}
