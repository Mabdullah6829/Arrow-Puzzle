package com.google.android.gms.internal.ads;

import java.io.IOException;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class zzat extends IOException {

    /* JADX INFO: renamed from: s */
    public final boolean f6865s;

    /* JADX INFO: renamed from: t */
    public final int f6866t;

    public zzat(String str, Throwable th, boolean z, int i2) {
        super(str, th);
        this.f6865s = z;
        this.f6866t = i2;
    }

    /* JADX INFO: renamed from: a */
    public static zzat m4383a(RuntimeException runtimeException, String str) {
        return new zzat(str, runtimeException, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static zzat m4384b(String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        int length = strConcat.length();
        boolean z = this.f6865s;
        int length2 = String.valueOf(z).length() + length + 20;
        int i2 = this.f6866t;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + length2 + 11 + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z);
        sb.append(", dataType=");
        return AbstractC0271e0.m402j(sb, "}", i2);
    }
}
