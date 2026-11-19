package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import p011H.AbstractC0243G;
import p068j0.InterfaceC6418a;

/* JADX INFO: loaded from: classes2.dex */
public enum DataCollectionState implements NumberedEnum {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private static final /* synthetic */ InterfaceC6418a $ENTRIES = AbstractC0243G.m373k(values());
    private final int number;

    DataCollectionState(int i2) {
        this.number = i2;
    }

    public static InterfaceC6418a getEntries() {
        return $ENTRIES;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.number;
    }
}
