package com.company.strategy;

public class ImageStorage {
//    private Compressor compressor;
//    private Filter filter;

    public void store(String fileName, Compressor compressor, Filter filter) {
        // JPEG, PNG, ...
        // filter: B&W, High Contrast
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
