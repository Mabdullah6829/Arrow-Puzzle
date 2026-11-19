package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.J */
/* JADX INFO: loaded from: classes.dex */
public final class C6179J implements Comparable {

    /* JADX INFO: renamed from: s */
    public final int f24089s;

    /* JADX INFO: renamed from: t */
    public final EnumC6247l1 f24090t;

    /* JADX INFO: renamed from: u */
    public final boolean f24091u;

    public C6179J(InterfaceC6202V interfaceC6202V, int i2, EnumC6247l1 enumC6247l1, boolean z, boolean z2) {
        this.f24089s = i2;
        this.f24090t = enumC6247l1;
        this.f24091u = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24089s - ((C6179J) obj).f24089s;
    }
}
