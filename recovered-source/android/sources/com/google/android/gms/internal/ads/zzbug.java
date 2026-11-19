package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbug {

    /* JADX INFO: renamed from: a */
    public final Object f9393a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f9394b = new Object();

    /* JADX INFO: renamed from: c */
    public zzbup f9395c;

    /* JADX INFO: renamed from: d */
    public zzbup f9396d;

    /* JADX INFO: renamed from: c */
    public static final boolean m5143c(Context context) {
        if (((Boolean) zzbld.f9114c.m5057c()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return com.google.android.gms.ads.internal.util.zzs.m3193K(context).f3624b.toLowerCase(Locale.ROOT).equals("ru");
    }

    /* JADX INFO: renamed from: a */
    public final zzbup m5144a(Context context, VersionInfoParcel versionInfoParcel, zzfqt zzfqtVar) {
        zzbup zzbupVar;
        String str;
        synchronized (this.f9394b) {
            try {
                if (this.f9396d == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (m5143c(context)) {
                        str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8470c);
                    } else {
                        str = (String) zzblh.f9129a.m5057c();
                    }
                    this.f9396d = new zzbup(applicationContext, versionInfoParcel, str, zzfqtVar);
                }
                zzbupVar = this.f9396d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbupVar;
    }

    /* JADX INFO: renamed from: b */
    public final zzbup m5145b(Context context, VersionInfoParcel versionInfoParcel, zzfqt zzfqtVar) {
        zzbup zzbupVar;
        String str;
        synchronized (this.f9393a) {
            try {
                if (this.f9395c == null) {
                    if (m5143c(context)) {
                        str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8470c);
                    } else if (((Boolean) zzbld.f9119h.m5057c()).booleanValue()) {
                        str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8436a);
                    } else {
                        str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8453b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f9395c = new zzbup(context, versionInfoParcel, str, zzfqtVar);
                }
                zzbupVar = this.f9395c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbupVar;
    }
}
