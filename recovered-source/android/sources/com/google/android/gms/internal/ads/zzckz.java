package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzckz {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10385a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f10385a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10385a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10385a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10385a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10385a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
