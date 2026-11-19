package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import p011H.AbstractC0243G;
import p068j0.InterfaceC6418a;

/* JADX INFO: loaded from: classes2.dex */
public enum LogEnvironment implements NumberedEnum {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private static final /* synthetic */ InterfaceC6418a $ENTRIES = AbstractC0243G.m373k(values());
    private final int number;

    LogEnvironment(int i2) {
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
