package com.company.state;

public interface Tool {
    // Use interface since we are not providing any common code to our tools.
    // Methods here are considered to be public.
    void mouseDown();
    void mouseUp();
}
