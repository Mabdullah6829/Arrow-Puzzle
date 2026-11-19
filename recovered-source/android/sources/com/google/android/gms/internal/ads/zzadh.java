package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
final class zzadh extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: s */
    public zzdw f5011s;

    /* JADX INFO: renamed from: t */
    public Handler f5012t;

    /* JADX INFO: renamed from: u */
    public Error f5013u;

    /* JADX INFO: renamed from: v */
    public RuntimeException f5014v;

    /* JADX INFO: renamed from: w */
    public zzadi f5015w;

    public zzadh() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        try {
            if (i2 == 1) {
                try {
                    try {
                        int i3 = message.arg1;
                        zzdw zzdwVar = this.f5011s;
                        if (zzdwVar == null) {
                            throw null;
                        }
                        zzdwVar.m6073a(i3);
                        SurfaceTexture surfaceTexture = this.f5011s.f13144x;
                        surfaceTexture.getClass();
                        this.f5015w = new zzadi(this, surfaceTexture, i3 != 0);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    } catch (zzdx e) {
                        zzeh.m6214f("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                        this.f5014v = new IllegalStateException(e);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e2) {
                    zzeh.m6214f("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.f5013u = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    zzeh.m6214f("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.f5014v = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i2 == 2) {
                try {
                    zzdw zzdwVar2 = this.f5011s;
                    if (zzdwVar2 == null) {
                        throw null;
                    }
                    zzdwVar2.m6074b();
                    return true;
                } catch (Throwable th) {
                    try {
                        zzeh.m6214f("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
