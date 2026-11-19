package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazq extends zzazo {

    /* JADX INFO: renamed from: a */
    public String f7208a;

    /* JADX INFO: renamed from: b */
    public final long f7209b;

    /* JADX INFO: renamed from: c */
    public final String f7210c;

    /* JADX INFO: renamed from: d */
    public final String f7211d;

    /* JADX INFO: renamed from: e */
    public final String f7212e;

    public zzazq() {
        this.f7208a = "E";
        this.f7209b = -1L;
        this.f7210c = "E";
        this.f7211d = "E";
        this.f7212e = "E";
    }

    @Override // com.google.android.gms.internal.ads.zzazo
    /* JADX INFO: renamed from: a */
    public final HashMap mo4676a() {
        HashMap map = new HashMap();
        map.put(0, this.f7208a);
        map.put(4, this.f7212e);
        map.put(3, this.f7211d);
        map.put(2, this.f7210c);
        map.put(1, Long.valueOf(this.f7209b));
        return map;
    }

    public zzazq(String str) {
        this.f7208a = "E";
        this.f7209b = -1L;
        this.f7210c = "E";
        this.f7211d = "E";
        this.f7212e = "E";
        HashMap mapM4675b = zzazo.m4675b(str);
        if (mapM4675b != null) {
            this.f7208a = mapM4675b.get(0) == null ? "E" : (String) mapM4675b.get(0);
            this.f7209b = mapM4675b.get(1) != null ? ((Long) mapM4675b.get(1)).longValue() : -1L;
            this.f7210c = mapM4675b.get(2) == null ? "E" : (String) mapM4675b.get(2);
            this.f7211d = mapM4675b.get(3) == null ? "E" : (String) mapM4675b.get(3);
            this.f7212e = mapM4675b.get(4) != null ? (String) mapM4675b.get(4) : "E";
        }
    }
}
