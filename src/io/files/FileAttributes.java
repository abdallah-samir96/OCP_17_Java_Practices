package io.files;

import java.nio.file.attribute.FileAttribute;

public class FileAttributes<T> implements FileAttribute<T> {

    private final String name;
    private final T t;

    public FileAttributes(String name, T t) {
        this.name = name;
        this.t = t;
    }

    @Override
    public String name() {

        return this.name;
    }

    @Override
    public T value() {
        return t;
    }
}
