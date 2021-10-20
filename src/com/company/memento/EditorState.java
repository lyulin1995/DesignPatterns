package com.company.memento;

public class EditorState {
    private final String content;
    // Use final: once we initialize this field, we cannot accidentally change it on our program.

    public EditorState(String content) {
        // Add Constructor Parameter
        this.content = content;
    }

    public String getContent() {
        // Add a getter.
        return content;
    }
}
