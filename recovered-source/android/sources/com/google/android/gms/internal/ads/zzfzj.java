package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzj {

    /* JADX INFO: renamed from: h */
    public static final HashMap f16851h = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f16852a;

    /* JADX INFO: renamed from: b */
    public final zzfzk f16853b;

    /* JADX INFO: renamed from: c */
    public final zzfxq f16854c;

    /* JADX INFO: renamed from: d */
    public final zzfxl f16855d;

    /* JADX INFO: renamed from: e */
    public final boolean f16856e;

    /* JADX INFO: renamed from: f */
    public zzfyy f16857f;

    /* JADX INFO: renamed from: g */
    public final Object f16858g = new Object();

    public zzfzj(Context context, zzfzk zzfzkVar, zzfxq zzfxqVar, zzfxl zzfxlVar, boolean z) {
        this.f16852a = context;
        this.f16853b = zzfzkVar;
        this.f16854c = zzfxqVar;
        this.f16855d = zzfxlVar;
        this.f16856e = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6818a(zzfyz zzfyzVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfyy zzfyyVar = new zzfyy(m6820c(zzfyzVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f16852a, "msa-r", zzfyzVar.m6799a(), null, new Bundle(), 2), zzfyzVar, this.f16853b, this.f16854c, this.f16856e);
                if (!zzfyyVar.m6795e()) {
                    throw new zzfzi(4000, "init failed");
                }
                int iM6797g = zzfyyVar.m6797g();
                if (iM6797g != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iM6797g).length() + 4);
                    sb.append("ci: ");
                    sb.append(iM6797g);
                    throw new zzfzi(4001, sb.toString());
                }
                synchronized (this.f16858g) {
                    zzfyy zzfyyVar2 = this.f16857f;
                    if (zzfyyVar2 != null) {
                        try {
                            zzfyyVar2.m6796f();
                        } catch (zzfzi e) {
                            this.f16854c.mo6762c(e.f16850s, -1L, e);
                        }
                        this.f16857f = zzfyyVar;
                    } else {
                        this.f16857f = zzfyyVar;
                    }
                    throw th;
                }
                this.f16854c.mo6761b(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfzi(e2, AdError.INTERNAL_ERROR_2004);
            }
        } catch (zzfzi e3) {
            this.f16854c.mo6762c(e3.f16850s, System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.f16854c.mo6762c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzfxt m6819b() {
        zzfyy zzfyyVar;
        synchronized (this.f16858g) {
            zzfyyVar = this.f16857f;
        }
        return zzfyyVar;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Class m6820c(zzfyz zzfyzVar) {
        try {
            zzbei zzbeiVar = zzfyzVar.f16824a;
            if (zzbeiVar == null) {
                throw new zzfzi(4010, "mc");
            }
            String strM4796D = zzbeiVar.m4796D();
            HashMap map = f16851h;
            Class cls = (Class) map.get(strM4796D);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f16855d.m6759a(zzfyzVar.f16825b)) {
                    throw new zzfzi(2026, "VM did not pass signature verification");
                }
                try {
                    File file = zzfyzVar.f16826c;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfyzVar.f16825b.getAbsolutePath(), file.getAbsolutePath(), null, this.f16852a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strM4796D, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzfzi(e, AdError.REMOTE_ADS_SERVICE_ERROR);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new zzfzi(e, AdError.REMOTE_ADS_SERVICE_ERROR);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new zzfzi(e, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            } catch (GeneralSecurityException e4) {
                throw new zzfzi(e4, 2026);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
