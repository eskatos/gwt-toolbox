package org.codeartisans.gwt.toolbox.js.exceptions;

public class ThrowableDecorator
{

    public static ThrowableDecorator decorate(Throwable th)
    {
        final ThrowableDecorator decorator = new ThrowableDecorator();
        decorator.wrapped = th;
        return decorator;
    }

    private Throwable wrapped;

    public String getStackTrace()
    {
        final StringBuilder sw = new StringBuilder();
        sw.append(">> Exception type: ").append(wrapped.getClass().getName()).append("\n");
        sw.append(">> Message: ").append(wrapped.getMessage()).append("\n");
        sw.append(">> Stack trace:\n");
        for (StackTraceElement eachElem : wrapped.getStackTrace()) {
            String className = eachElem.getClassName();
            String methodName = eachElem.getMethodName();
            String fileName = eachElem.getFileName();
            int lineNumber = eachElem.getLineNumber();
            sw.append("    at ").append(className).append(".").append(methodName).append(" [" + lineNumber).append(":").append(fileName).append("]\n");
        }
        return sw.toString();
    }

}
