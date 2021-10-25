package com.company.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();
    // you can replace this list with a fixed size array.

    public void push (String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    // nest classes
    public class ListIterator implements Iterator {
        // ListerIterator iterates list of urls.
        private BrowseHistory history;
        private int index;

        // we need a reference to history object we're going to iterate over.
        // constructor: create a field of parameter history
        public ListIterator(BrowseHistory history) {
            this.history = history;  // initialize
        }

        @Override
        public boolean hasNext() {
            // Since the ListerIterator class is part of the BrowseHistory class,
            // it can visit any field even if it is private.
            return (index < history.urls.size());
        }

        @Override
        public Object current() {
            // get the item of the current index.
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
