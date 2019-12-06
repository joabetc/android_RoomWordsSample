package com.joabe.roomwordssample.model.entity;

import androidx.annotation.NonNull;

public class Word {
    private String word;

    public Word(@NonNull String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }
}
