package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhx implements zzhr {

    /* JADX INFO: renamed from: a */
    public final Context f19342a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f19343b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final zzic f19344c;

    /* JADX INFO: renamed from: d */
    public zzie f19345d;

    /* JADX INFO: renamed from: e */
    public zzhi f19346e;

    /* JADX INFO: renamed from: f */
    public zzho f19347f;

    /* JADX INFO: renamed from: g */
    public zzhr f19348g;

    /* JADX INFO: renamed from: h */
    public zzir f19349h;

    /* JADX INFO: renamed from: i */
    public zzhp f19350i;

    /* JADX INFO: renamed from: j */
    public zzin f19351j;

    /* JADX INFO: renamed from: k */
    public zzhr f19352k;

    public zzhx(Context context, zzic zzicVar) {
        this.f19342a = context.getApplicationContext();
        this.f19344c = zzicVar;
    }

    /* JADX INFO: renamed from: h */
    public static final void m7986h(zzhr zzhrVar, zzip zzipVar) {
        if (zzhrVar != null) {
            zzhrVar.mo5493a(zzipVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: a */
    public final void mo5493a(zzip zzipVar) {
        zzipVar.getClass();
        this.f19344c.mo5493a(zzipVar);
        this.f19343b.add(zzipVar);
        m7986h(this.f19345d, zzipVar);
        m7986h(this.f19346e, zzipVar);
        m7986h(this.f19347f, zzipVar);
        m7986h(this.f19348g, zzipVar);
        m7986h(this.f19349h, zzipVar);
        m7986h(this.f19350i, zzipVar);
        m7986h(this.f19351j, zzipVar);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) {
        zzhr zzhrVar = this.f19352k;
        zzhrVar.getClass();
        return zzhrVar.mo4082b(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) {
        zzgtr.m7133f(this.f19352k == null);
        Uri uri = zzhvVar.f19195a;
        String scheme = uri.getScheme();
        String str = zzfm.f16091a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f19342a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f19345d == null) {
                    zzie zzieVar = new zzie();
                    this.f19345d = zzieVar;
                    m7987f(zzieVar);
                }
                this.f19352k = this.f19345d;
            } else {
                if (this.f19346e == null) {
                    zzhi zzhiVar = new zzhi(context);
                    this.f19346e = zzhiVar;
                    m7987f(zzhiVar);
                }
                this.f19352k = this.f19346e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f19346e == null) {
                zzhi zzhiVar2 = new zzhi(context);
                this.f19346e = zzhiVar2;
                m7987f(zzhiVar2);
            }
            this.f19352k = this.f19346e;
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            if (this.f19347f == null) {
                zzho zzhoVar = new zzho(context);
                this.f19347f = zzhoVar;
                m7987f(zzhoVar);
            }
            this.f19352k = this.f19347f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            zzic zzicVar = this.f19344c;
            if (zEquals) {
                if (this.f19348g == null) {
                    try {
                        zzhr zzhrVar = (zzhr) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f19348g = zzhrVar;
                        m7987f(zzhrVar);
                    } catch (ClassNotFoundException unused) {
                        zzeh.m6211c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f19348g == null) {
                        this.f19348g = zzicVar;
                    }
                }
                this.f19352k = this.f19348g;
            } else if ("udp".equals(scheme)) {
                if (this.f19349h == null) {
                    zzir zzirVar = new zzir(0);
                    this.f19349h = zzirVar;
                    m7987f(zzirVar);
                }
                this.f19352k = this.f19349h;
            } else if (Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(scheme)) {
                if (this.f19350i == null) {
                    zzhp zzhpVar = new zzhp();
                    this.f19350i = zzhpVar;
                    m7987f(zzhpVar);
                }
                this.f19352k = this.f19350i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f19351j == null) {
                    zzin zzinVar = new zzin(context);
                    this.f19351j = zzinVar;
                    m7987f(zzinVar);
                }
                this.f19352k = this.f19351j;
            } else {
                this.f19352k = zzicVar;
            }
        }
        return this.f19352k.mo5494c(zzhvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        zzhr zzhrVar = this.f19352k;
        if (zzhrVar != null) {
            try {
                zzhrVar.mo5495d();
            } finally {
                this.f19352k = null;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7987f(zzhr zzhrVar) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f19343b;
            if (i2 >= arrayList.size()) {
                return;
            }
            zzhrVar.mo5493a((zzip) arrayList.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        zzhr zzhrVar = this.f19352k;
        if (zzhrVar == null) {
            return null;
        }
        return zzhrVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        zzhr zzhrVar = this.f19352k;
        return zzhrVar == null ? Collections.EMPTY_MAP : zzhrVar.zzj();
    }
}
