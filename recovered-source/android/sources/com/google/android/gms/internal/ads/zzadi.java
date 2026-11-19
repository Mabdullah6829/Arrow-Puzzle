package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadi extends Surface {

    /* JADX INFO: renamed from: v */
    public static int f5016v;

    /* JADX INFO: renamed from: w */
    public static boolean f5017w;

    /* JADX INFO: renamed from: s */
    public final boolean f5018s;

    /* JADX INFO: renamed from: t */
    public final zzadh f5019t;

    /* JADX INFO: renamed from: u */
    public boolean f5020u;

    public /* synthetic */ zzadi(zzadh zzadhVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f5019t = zzadhVar;
        this.f5018s = z;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m4028a(Context context) {
        int i2;
        if (!f5017w) {
            try {
                if (zzdy.m6087a(context)) {
                    i2 = zzdy.m6089c("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i2 = 0;
                }
            } catch (zzdx e) {
                zzeh.m6213e("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e.getMessage())));
            }
            f5016v = i2;
            f5017w = true;
        }
        return f5016v != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzadh zzadhVar = this.f5019t;
        synchronized (zzadhVar) {
            try {
                if (!this.f5020u) {
                    Handler handler = zzadhVar.f5012t;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f5020u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
