package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzale {

    /* JADX INFO: renamed from: a */
    public final int f5796a;

    /* JADX INFO: renamed from: b */
    public int f5797b;

    /* JADX INFO: renamed from: c */
    public int f5798c;

    /* JADX INFO: renamed from: d */
    public long f5799d;

    /* JADX INFO: renamed from: e */
    public final boolean f5800e;

    /* JADX INFO: renamed from: f */
    public final zzeu f5801f;

    /* JADX INFO: renamed from: g */
    public final zzeu f5802g;

    /* JADX INFO: renamed from: h */
    public int f5803h;

    /* JADX INFO: renamed from: i */
    public int f5804i;

    public zzale(zzeu zzeuVar, zzeu zzeuVar2, boolean z) throws zzat {
        this.f5802g = zzeuVar;
        this.f5801f = zzeuVar2;
        this.f5800e = z;
        zzeuVar2.m6363E(12);
        this.f5796a = zzeuVar2.m6382h();
        zzeuVar.m6363E(12);
        this.f5804i = zzeuVar.m6382h();
        zzage.m4111a("first_chunk must be 1", zzeuVar.m6376b() == 1);
        this.f5797b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4190a() {
        int i2 = this.f5797b + 1;
        this.f5797b = i2;
        if (i2 == this.f5796a) {
            return false;
        }
        boolean z = this.f5800e;
        zzeu zzeuVar = this.f5801f;
        this.f5799d = z ? zzeuVar.m6384j() : zzeuVar.m6374P();
        if (this.f5797b == this.f5803h) {
            zzeu zzeuVar2 = this.f5802g;
            this.f5798c = zzeuVar2.m6382h();
            zzeuVar2.m6365G(4);
            int i3 = this.f5804i - 1;
            this.f5804i = i3;
            this.f5803h = i3 > 0 ? (-1) + zzeuVar2.m6382h() : -1;
        }
        return true;
    }
}
