package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzidv implements zzihs {

    /* JADX INFO: renamed from: a */
    public final zzidu f19752a;

    public zzidv(zzidu zziduVar) {
        this.f19752a = zziduVar;
        zziduVar.f19751a = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m8283a(int i2, int i3) {
        this.f19752a.mo8254h(i2, i3);
    }

    /* JADX INFO: renamed from: b */
    public final void m8284b(int i2, long j2) {
        this.f19752a.mo8255i(i2, j2);
    }

    /* JADX INFO: renamed from: c */
    public final void m8285c(int i2, long j2) {
        this.f19752a.mo8256j(i2, j2);
    }

    /* JADX INFO: renamed from: d */
    public final void m8286d(float f2, int i2) {
        this.f19752a.mo8254h(i2, Float.floatToRawIntBits(f2));
    }

    /* JADX INFO: renamed from: e */
    public final void m8287e(int i2, double d) {
        this.f19752a.mo8256j(i2, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: f */
    public final void m8288f(int i2, int i3) {
        this.f19752a.mo8252f(i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public final void m8289g(int i2, long j2) {
        this.f19752a.mo8255i(i2, j2);
    }

    /* JADX INFO: renamed from: h */
    public final void m8290h(int i2, int i3) {
        this.f19752a.mo8252f(i2, i3);
    }

    /* JADX INFO: renamed from: i */
    public final void m8291i(int i2, long j2) {
        this.f19752a.mo8256j(i2, j2);
    }

    /* JADX INFO: renamed from: j */
    public final void m8292j(int i2, int i3) {
        this.f19752a.mo8254h(i2, i3);
    }

    /* JADX INFO: renamed from: k */
    public final void m8293k(int i2, boolean z) {
        this.f19752a.mo8257k(i2, z);
    }

    /* JADX INFO: renamed from: l */
    public final void m8294l(int i2, zzidl zzidlVar) {
        this.f19752a.mo8259m(i2, zzidlVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m8295m(int i2, int i3) {
        this.f19752a.mo8253g(i2, i3);
    }

    /* JADX INFO: renamed from: n */
    public final void m8296n(int i2, int i3) {
        this.f19752a.mo8253g(i2, (i3 >> 31) ^ (i3 + i3));
    }

    /* JADX INFO: renamed from: o */
    public final void m8297o(int i2, long j2) {
        this.f19752a.mo8255i(i2, (j2 >> 63) ^ (j2 + j2));
    }

    /* JADX INFO: renamed from: p */
    public final void m8298p(int i2, Object obj, zzigr zzigrVar) {
        zzicu zzicuVar = (zzicu) obj;
        zzidu zziduVar = this.f19752a;
        zziduVar.mo8251e(i2, 2);
        zziduVar.mo8267u(zzicuVar.mo8101k(zzigrVar));
        zzigrVar.mo8399g(zzicuVar, this);
    }

    /* JADX INFO: renamed from: q */
    public final void m8299q(int i2, Object obj, zzigr zzigrVar) {
        zzidu zziduVar = this.f19752a;
        zziduVar.mo8251e(i2, 3);
        zzigrVar.mo8399g((zzicu) obj, this);
        zziduVar.mo8251e(i2, 4);
    }
}
