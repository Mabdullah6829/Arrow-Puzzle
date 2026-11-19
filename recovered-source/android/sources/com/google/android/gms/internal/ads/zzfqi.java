package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqi implements zzfqg {

    /* JADX INFO: renamed from: a */
    public final Context f16291a;

    /* JADX INFO: renamed from: p */
    public final int f16306p;

    /* JADX INFO: renamed from: b */
    public long f16292b = 0;

    /* JADX INFO: renamed from: c */
    public long f16293c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f16294d = false;

    /* JADX INFO: renamed from: q */
    public int f16307q = 2;

    /* JADX INFO: renamed from: r */
    public int f16308r = 2;

    /* JADX INFO: renamed from: e */
    public int f16295e = 0;

    /* JADX INFO: renamed from: f */
    public String f16296f = "";

    /* JADX INFO: renamed from: g */
    public String f16297g = "";

    /* JADX INFO: renamed from: h */
    public String f16298h = "";

    /* JADX INFO: renamed from: i */
    public String f16299i = "";

    /* JADX INFO: renamed from: j */
    public zzfqv f16300j = zzfqv.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* JADX INFO: renamed from: k */
    public String f16301k = "";

    /* JADX INFO: renamed from: l */
    public String f16302l = "";

    /* JADX INFO: renamed from: m */
    public String f16303m = "";

    /* JADX INFO: renamed from: n */
    public boolean f16304n = false;

    /* JADX INFO: renamed from: o */
    public boolean f16305o = false;

    public zzfqi(Context context, int i2) {
        this.f16291a = context;
        this.f16306p = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: L */
    public final zzfqg mo6563L(boolean z) {
        synchronized (this) {
            this.f16294d = z;
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6573a() {
        Configuration configuration;
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzu zzuVar = zztVar.f3706f;
        Context context = this.f16291a;
        this.f16295e = zzuVar.mo3245g(context);
        Resources resources = context.getResources();
        int i2 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i2 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f16308r = i2;
        zztVar.f3711k.getClass();
        this.f16292b = SystemClock.elapsedRealtime();
        this.f16305o = true;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6574b() {
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        this.f16293c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: e */
    public final synchronized zzfqj mo6564e() {
        try {
            if (this.f16304n) {
                return null;
            }
            this.f16304n = true;
            if (!this.f16305o) {
                m6573a();
            }
            if (this.f16293c < 0) {
                m6574b();
            }
            return new zzfqj(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: g */
    public final zzfqg mo6565g(String str) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8414Y9)).booleanValue()) {
                this.f16303m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: h */
    public final zzfqg mo6566h(Throwable th) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8414Y9)).booleanValue()) {
                String strM3035d = com.google.android.gms.ads.internal.util.client.zzf.m3035d(zzcaf.m5289f(th), "SHA-256");
                if (strM3035d == null) {
                    strM3035d = "";
                }
                this.f16302l = strM3035d;
                this.f16301k = (String) ((zzgua) zzgug.m7143a(new zzgtb('\n')).m7146d(zzcaf.m5289f(th))).iterator().next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: i */
    public final zzfqg mo6567i(zzfkx zzfkxVar) {
        synchronized (this) {
            try {
                String str = zzfkxVar.f16002b.f15973b;
                if (!TextUtils.isEmpty(str)) {
                    this.f16296f = str;
                }
                Iterator it = zzfkxVar.f16001a.iterator();
                while (it.hasNext()) {
                    String str2 = ((zzfkn) it.next()).f15919b0;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f16297g = str2;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: j */
    public final zzfqg mo6568j(com.google.android.gms.ads.internal.client.zze zzeVar) {
        synchronized (this) {
            try {
                IBinder iBinder = zzeVar.f3110w;
                if (iBinder != null) {
                    zzdcs zzdcsVar = (zzdcs) iBinder;
                    String str = zzdcsVar.f12049v;
                    if (!TextUtils.isEmpty(str)) {
                        this.f16296f = str;
                    }
                    String str2 = zzdcsVar.f12047t;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f16297g = str2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: m */
    public final zzfqg mo6569m(zzfqv zzfqvVar) {
        synchronized (this) {
            this.f16300j = zzfqvVar;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: n */
    public final zzfqg mo6570n(int i2) {
        synchronized (this) {
            this.f16307q = i2;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: p0 */
    public final zzfqg mo6571p0(String str) {
        synchronized (this) {
            this.f16298h = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    /* JADX INFO: renamed from: y */
    public final zzfqg mo6572y(String str) {
        synchronized (this) {
            this.f16299i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zza() {
        m6573a();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final synchronized boolean zzb() {
        return this.f16305o;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzc() {
        m6574b();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.f16298h);
    }
}
