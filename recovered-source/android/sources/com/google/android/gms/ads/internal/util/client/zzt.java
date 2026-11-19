package com.google.android.gms.ads.internal.util.client;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zzt {

    /* JADX INFO: renamed from: s */
    public static final zzt f3438s;

    /* JADX INFO: renamed from: t */
    public static final zzt f3439t;

    /* JADX INFO: renamed from: u */
    public static final zzt f3440u;

    /* JADX INFO: renamed from: v */
    public static final zzt f3441v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ zzt[] f3442w;

    static {
        zzt zztVar = new zzt("SUCCESS", 0);
        f3438s = zztVar;
        zzt zztVar2 = new zzt("PERMANENT_FAILURE", 1);
        f3439t = zztVar2;
        zzt zztVar3 = new zzt("RETRIABLE_FAILURE", 2);
        f3440u = zztVar3;
        zzt zztVar4 = new zzt("BUFFERED", 3);
        f3441v = zztVar4;
        f3442w = new zzt[]{zztVar, zztVar2, zztVar3, zztVar4};
    }

    public static zzt[] values() {
        return (zzt[]) f3442w.clone();
    }
}
