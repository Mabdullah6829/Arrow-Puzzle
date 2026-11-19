package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import p011H.AbstractC0243G;
import p068j0.InterfaceC6418a;

/* JADX INFO: loaded from: classes2.dex */
public enum EventType implements NumberedEnum {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private static final /* synthetic */ InterfaceC6418a $ENTRIES = AbstractC0243G.m373k(values());
    private final int number;

    EventType(int i2) {
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
