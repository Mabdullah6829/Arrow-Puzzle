package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.core.view.PointerIconCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zzkf implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaer, zzrx, zzzr, zzwl, zzby, zzex {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzlj f20189s;

    public /* synthetic */ zzkf(zzlj zzljVar) {
        this.f20189s = zzljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    /* JADX INFO: renamed from: a */
    public final void mo4048a(final long j2, final Object obj) {
        zzlj zzljVar = this.f20189s;
        zzpt zzptVar = zzljVar.f20264r;
        final zznp zznpVarM8818w = zzptVar.m8818w();
        zzptVar.m8814r(zznpVarM8818w, 26, new zzeb(zznpVarM8818w, obj, j2) { // from class: com.google.android.gms.internal.ads.zzof

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f20530a;

            {
                this.f20530a = obj;
            }

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj2) {
                ((zznr) obj2).mo5547j();
            }
        });
        if (zzljVar.f20232N == obj) {
            zzeg zzegVar = zzljVar.f20259m;
            zzegVar.m6197c(26, new zzeb() { // from class: com.google.android.gms.internal.ads.zzke
                @Override // com.google.android.gms.internal.ads.zzeb
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6141b(Object obj2) {
                }
            });
            zzegVar.m6198d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    /* JADX INFO: renamed from: b */
    public final void mo4049b(final zzv zzvVar, final zzje zzjeVar) {
        zzpt zzptVar = this.f20189s.f20264r;
        final zznp zznpVarM8818w = zzptVar.m8818w();
        zzptVar.m8814r(zznpVarM8818w, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzeb(zznpVarM8818w, zzvVar, zzjeVar) { // from class: com.google.android.gms.internal.ads.zzoa

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zzv f20527a;

            {
                this.f20527a = zzvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zznr) obj).mo5549m(this.f20527a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    /* JADX INFO: renamed from: c */
    public final void mo4050c(zzjb zzjbVar) {
        this.f20189s.f20223E.m8622a(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    /* JADX INFO: renamed from: d */
    public final void mo4051d(final zzbv zzbvVar) {
        zzeb zzebVar = new zzeb() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zzaz) obj).mo4644J(zzbvVar);
            }
        };
        zzeg zzegVar = this.f20189s.f20259m;
        zzegVar.m6197c(25, zzebVar);
        zzegVar.m6198d();
    }

    @Override // com.google.android.gms.internal.ads.zzex
    /* JADX INFO: renamed from: e */
    public final void mo6409e(zzfe zzfeVar) {
        this.f20189s.m8630d(new zzjm(2, zzfeVar, PointerIconCompat.TYPE_HELP));
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    /* JADX INFO: renamed from: f */
    public final void mo4052f(final zzjd zzjdVar) {
        zzpt zzptVar = this.f20189s.f20264r;
        final zznp zznpVarM8817v = zzptVar.m8817v(zzptVar.f20558d.f20553e);
        zzptVar.m8814r(zznpVarM8817v, PointerIconCompat.TYPE_GRAB, new zzeb(zznpVarM8817v, zzjdVar) { // from class: com.google.android.gms.internal.ads.zzoe

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ zzjd f20529a;

            {
                this.f20529a = zzjdVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zznr) obj).mo8809o(this.f20529a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    /* JADX INFO: renamed from: g */
    public final void mo4053g(final int i2, final long j2) {
        zzpt zzptVar = this.f20189s.f20264r;
        final zznp zznpVarM8817v = zzptVar.m8817v(zzptVar.f20558d.f20553e);
        zzptVar.m8814r(zznpVarM8817v, PointerIconCompat.TYPE_ZOOM_IN, new zzeb(zznpVarM8817v, i2, j2) { // from class: com.google.android.gms.internal.ads.zzob

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f20528a;

            {
                this.f20528a = i2;
            }

            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zznr) obj).mo5543b(this.f20528a);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzlj zzljVar = this.f20189s;
        zzljVar.getClass();
        Surface surface = new Surface(surfaceTexture);
        zzljVar.m8637u(surface);
        zzljVar.f20233O = surface;
        zzljVar.m8638v(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzlj zzljVar = this.f20189s;
        zzljVar.m8637u(null);
        zzljVar.m8638v(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.f20189s.m8638v(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        this.f20189s.m8638v(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f20189s.m8638v(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzb() {
        zzpt zzptVar = this.f20189s.f20264r;
        zzptVar.m8814r(zzptVar.m8818w(), PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new zzny());
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzc() {
        zzpt zzptVar = this.f20189s.f20264r;
        zzptVar.m8814r(zzptVar.m8818w(), PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new zznz());
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzh() {
        zzpt zzptVar = this.f20189s.f20264r;
        zzptVar.m8814r(zzptVar.m8818w(), PointerIconCompat.TYPE_ZOOM_OUT, new zzoc());
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzj() {
        zzpt zzptVar = this.f20189s.f20264r;
        zzptVar.m8814r(zzptVar.m8817v(zzptVar.f20558d.f20553e), PointerIconCompat.TYPE_GRABBING, new zzog());
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzk() {
        zzpt zzptVar = this.f20189s.f20264r;
        zzptVar.m8814r(zzptVar.m8818w(), 1030, new zzoh());
    }
}
