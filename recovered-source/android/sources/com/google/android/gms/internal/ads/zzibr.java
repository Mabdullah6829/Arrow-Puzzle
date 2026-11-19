package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzibr {
    @Deprecated
    public zzibr() {
    }

    /* JADX INFO: renamed from: a */
    public String mo8053a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: b */
    public final zzibt m8054b() {
        if (this instanceof zzibt) {
            return (zzibt) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    /* JADX INFO: renamed from: d */
    public final zzibv m8055d() {
        if (this instanceof zzibv) {
            return (zzibv) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            zzicq zzicqVar = new zzicq(new zzick(sb));
            zzicqVar.f19694z = zzibw.f19625s;
            zzicm.f19670a.getClass();
            zzicm.m8072a(zzicqVar, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
