package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcq implements zzcp {

    /* JADX INFO: renamed from: b */
    public zzcl f11134b;

    /* JADX INFO: renamed from: c */
    public zzcl f11135c;

    /* JADX INFO: renamed from: d */
    public zzcl f11136d;

    /* JADX INFO: renamed from: e */
    public zzcl f11137e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f11138f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f11139g;

    /* JADX INFO: renamed from: h */
    public boolean f11140h;

    public zzcq() {
        ByteBuffer byteBuffer = zzcp.f10655a;
        this.f11138f = byteBuffer;
        this.f11139g = byteBuffer;
        zzcl zzclVar = zzcl.f10386e;
        this.f11136d = zzclVar;
        this.f11137e = zzclVar;
        this.f11134b = zzclVar;
        this.f11135c = zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: a */
    public final void mo5714a() {
        this.f11140h = true;
        mo5783j();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: b */
    public ByteBuffer mo5715b() {
        ByteBuffer byteBuffer = this.f11139g;
        this.f11139g = zzcp.f10655a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: c */
    public boolean mo5716c() {
        return this.f11140h && this.f11139g == zzcp.f10655a;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: f */
    public final zzcl mo5719f(zzcl zzclVar) {
        this.f11136d = zzclVar;
        this.f11137e = mo5782i(zzclVar);
        return zzc() ? this.f11137e : zzcl.f10386e;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    /* JADX INFO: renamed from: g */
    public final void mo5720g(zzcn zzcnVar) {
        this.f11139g = zzcp.f10655a;
        this.f11140h = false;
        this.f11134b = this.f11136d;
        this.f11135c = this.f11137e;
        mo5784k();
    }

    /* JADX INFO: renamed from: h */
    public final ByteBuffer m5781h(int i2) {
        if (this.f11138f.capacity() < i2) {
            this.f11138f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f11138f.clear();
        }
        ByteBuffer byteBuffer = this.f11138f;
        this.f11139g = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: renamed from: i */
    public zzcl mo5782i(zzcl zzclVar) {
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public void mo5783j() {
    }

    /* JADX INFO: renamed from: l */
    public void mo5785l() {
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public boolean zzc() {
        return this.f11137e != zzcl.f10386e;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzh() {
        zzcn zzcnVar = zzcn.f10579d;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzj() {
        ByteBuffer byteBuffer = zzcp.f10655a;
        this.f11139g = byteBuffer;
        this.f11140h = false;
        this.f11138f = byteBuffer;
        zzcl zzclVar = zzcl.f10386e;
        this.f11136d = zzclVar;
        this.f11137e = zzclVar;
        this.f11134b = zzclVar;
        this.f11135c = zzclVar;
        mo5785l();
    }

    /* JADX INFO: renamed from: k */
    public void mo5784k() {
    }
}
