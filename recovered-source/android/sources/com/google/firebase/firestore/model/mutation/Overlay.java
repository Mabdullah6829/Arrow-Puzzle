package com.google.firebase.firestore.model.mutation;

import com.google.auto.value.AutoValue;
import com.google.firebase.firestore.model.DocumentKey;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class Overlay {
    public static Overlay create(int i2, Mutation mutation) {
        return new AutoValue_Overlay(i2, mutation);
    }

    public DocumentKey getKey() {
        return getMutation().getKey();
    }

    public abstract int getLargestBatchId();

    public abstract Mutation getMutation();
}
