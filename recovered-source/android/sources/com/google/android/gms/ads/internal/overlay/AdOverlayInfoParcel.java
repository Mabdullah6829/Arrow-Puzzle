package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzddm;
import com.google.android.gms.internal.ads.zzdlg;
import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzedk;
import com.google.android.gms.internal.ads.zzekz;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();

    /* JADX INFO: renamed from: Q */
    public static final AtomicLong f3285Q = new AtomicLong(0);

    /* JADX INFO: renamed from: R */
    public static final ConcurrentHashMap f3286R = new ConcurrentHashMap();

    /* JADX INFO: renamed from: A */
    public final zzad f3287A;

    /* JADX INFO: renamed from: B */
    public final int f3288B;

    /* JADX INFO: renamed from: C */
    public final int f3289C;

    /* JADX INFO: renamed from: D */
    public final String f3290D;

    /* JADX INFO: renamed from: E */
    public final VersionInfoParcel f3291E;

    /* JADX INFO: renamed from: F */
    public final String f3292F;

    /* JADX INFO: renamed from: G */
    public final com.google.android.gms.ads.internal.zzl f3293G;

    /* JADX INFO: renamed from: H */
    public final zzbon f3294H;

    /* JADX INFO: renamed from: I */
    public final String f3295I;

    /* JADX INFO: renamed from: J */
    public final String f3296J;

    /* JADX INFO: renamed from: K */
    public final String f3297K;

    /* JADX INFO: renamed from: L */
    public final zzddm f3298L;

    /* JADX INFO: renamed from: M */
    public final zzdlg f3299M;

    /* JADX INFO: renamed from: N */
    public final zzbzb f3300N;

    /* JADX INFO: renamed from: O */
    public final boolean f3301O;

    /* JADX INFO: renamed from: P */
    public final long f3302P;

    /* JADX INFO: renamed from: s */
    public final zzc f3303s;

    /* JADX INFO: renamed from: t */
    public final com.google.android.gms.ads.internal.client.zza f3304t;

    /* JADX INFO: renamed from: u */
    public final zzr f3305u;

    /* JADX INFO: renamed from: v */
    public final zzclb f3306v;

    /* JADX INFO: renamed from: w */
    public final zzbop f3307w;

    /* JADX INFO: renamed from: x */
    public final String f3308x;

    /* JADX INFO: renamed from: y */
    public final boolean f3309y;

    /* JADX INFO: renamed from: z */
    public final String f3310z;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbon zzbonVar, zzbop zzbopVar, zzad zzadVar, zzclx zzclxVar, boolean z, int i2, String str, VersionInfoParcel versionInfoParcel, zzdlg zzdlgVar, zzekz zzekzVar, boolean z2) {
        this.f3303s = null;
        this.f3304t = zzaVar;
        this.f3305u = zzrVar;
        this.f3306v = zzclxVar;
        this.f3294H = zzbonVar;
        this.f3307w = zzbopVar;
        this.f3308x = null;
        this.f3309y = z;
        this.f3310z = null;
        this.f3287A = zzadVar;
        this.f3288B = i2;
        this.f3289C = 3;
        this.f3290D = str;
        this.f3291E = versionInfoParcel;
        this.f3292F = null;
        this.f3293G = null;
        this.f3295I = null;
        this.f3296J = null;
        this.f3297K = null;
        this.f3298L = null;
        this.f3299M = zzdlgVar;
        this.f3300N = zzekzVar;
        this.f3301O = z2;
        this.f3302P = f3285Q.getAndIncrement();
    }

    /* JADX INFO: renamed from: H */
    public static final ObjectWrapper m2983H(Object obj) {
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8773te)).booleanValue()) {
            return null;
        }
        return new ObjectWrapper(obj);
    }

    /* JADX INFO: renamed from: w */
    public static AdOverlayInfoParcel m2984w(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (!((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8773te)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdOverlayInfoParcel.getFromIntent", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3582h(parcel, 2, this.f3303s, i2);
        com.google.android.gms.ads.internal.client.zza zzaVar = this.f3304t;
        SafeParcelWriter.m3578d(parcel, 3, m2983H(zzaVar));
        zzr zzrVar = this.f3305u;
        SafeParcelWriter.m3578d(parcel, 4, m2983H(zzrVar));
        zzclb zzclbVar = this.f3306v;
        SafeParcelWriter.m3578d(parcel, 5, m2983H(zzclbVar));
        zzbop zzbopVar = this.f3307w;
        SafeParcelWriter.m3578d(parcel, 6, m2983H(zzbopVar));
        SafeParcelWriter.m3583i(parcel, 7, this.f3308x);
        SafeParcelWriter.m3588n(parcel, 8, 4);
        parcel.writeInt(this.f3309y ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 9, this.f3310z);
        zzad zzadVar = this.f3287A;
        SafeParcelWriter.m3578d(parcel, 10, m2983H(zzadVar));
        SafeParcelWriter.m3588n(parcel, 11, 4);
        parcel.writeInt(this.f3288B);
        SafeParcelWriter.m3588n(parcel, 12, 4);
        parcel.writeInt(this.f3289C);
        SafeParcelWriter.m3583i(parcel, 13, this.f3290D);
        SafeParcelWriter.m3582h(parcel, 14, this.f3291E, i2);
        SafeParcelWriter.m3583i(parcel, 16, this.f3292F);
        SafeParcelWriter.m3582h(parcel, 17, this.f3293G, i2);
        zzbon zzbonVar = this.f3294H;
        SafeParcelWriter.m3578d(parcel, 18, m2983H(zzbonVar));
        SafeParcelWriter.m3583i(parcel, 19, this.f3295I);
        SafeParcelWriter.m3583i(parcel, 24, this.f3296J);
        SafeParcelWriter.m3583i(parcel, 25, this.f3297K);
        zzddm zzddmVar = this.f3298L;
        SafeParcelWriter.m3578d(parcel, 26, m2983H(zzddmVar));
        zzdlg zzdlgVar = this.f3299M;
        SafeParcelWriter.m3578d(parcel, 27, m2983H(zzdlgVar));
        zzbzb zzbzbVar = this.f3300N;
        SafeParcelWriter.m3578d(parcel, 28, m2983H(zzbzbVar));
        SafeParcelWriter.m3588n(parcel, 29, 4);
        parcel.writeInt(this.f3301O ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 30, 8);
        long j2 = this.f3302P;
        parcel.writeLong(j2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
        zzbio zzbioVar = zzbix.f8773te;
        zzba zzbaVar = zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            f3286R.put(Long.valueOf(j2), new zzp(zzaVar, zzrVar, zzclbVar, zzbonVar, zzbopVar, zzadVar, zzddmVar, zzdlgVar, zzbzbVar, ((ScheduledThreadPoolExecutor) zzcfy.f9949d).schedule(new zzq(j2), ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8807ve)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbon zzbonVar, zzbop zzbopVar, zzad zzadVar, zzclx zzclxVar, boolean z, int i2, String str, String str2, VersionInfoParcel versionInfoParcel, zzdlg zzdlgVar, zzekz zzekzVar) {
        this.f3303s = null;
        this.f3304t = zzaVar;
        this.f3305u = zzrVar;
        this.f3306v = zzclxVar;
        this.f3294H = zzbonVar;
        this.f3307w = zzbopVar;
        this.f3308x = str2;
        this.f3309y = z;
        this.f3310z = str;
        this.f3287A = zzadVar;
        this.f3288B = i2;
        this.f3289C = 3;
        this.f3290D = null;
        this.f3291E = versionInfoParcel;
        this.f3292F = null;
        this.f3293G = null;
        this.f3295I = null;
        this.f3296J = null;
        this.f3297K = null;
        this.f3298L = null;
        this.f3299M = zzdlgVar;
        this.f3300N = zzekzVar;
        this.f3301O = false;
        this.f3302P = f3285Q.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzdnl zzdnlVar, zzclb zzclbVar, int i2, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzddm zzddmVar, zzekz zzekzVar, String str5) {
        this.f3303s = null;
        this.f3304t = null;
        this.f3305u = zzdnlVar;
        this.f3306v = zzclbVar;
        this.f3294H = null;
        this.f3307w = null;
        this.f3309y = false;
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8692p1)).booleanValue()) {
            this.f3308x = null;
            this.f3310z = null;
        } else {
            this.f3308x = str2;
            this.f3310z = str3;
        }
        this.f3287A = null;
        this.f3288B = i2;
        this.f3289C = 1;
        this.f3290D = null;
        this.f3291E = versionInfoParcel;
        this.f3292F = str;
        this.f3293G = zzlVar;
        this.f3295I = str5;
        this.f3296J = null;
        this.f3297K = str4;
        this.f3298L = zzddmVar;
        this.f3299M = null;
        this.f3300N = zzekzVar;
        this.f3301O = false;
        this.f3302P = f3285Q.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, zzclx zzclxVar, boolean z, int i2, VersionInfoParcel versionInfoParcel, zzdlg zzdlgVar, zzekz zzekzVar) {
        this.f3303s = null;
        this.f3304t = zzaVar;
        this.f3305u = zzrVar;
        this.f3306v = zzclxVar;
        this.f3294H = null;
        this.f3307w = null;
        this.f3308x = null;
        this.f3309y = z;
        this.f3310z = null;
        this.f3287A = zzadVar;
        this.f3288B = i2;
        this.f3289C = 2;
        this.f3290D = null;
        this.f3291E = versionInfoParcel;
        this.f3292F = null;
        this.f3293G = null;
        this.f3295I = null;
        this.f3296J = null;
        this.f3297K = null;
        this.f3298L = null;
        this.f3299M = zzdlgVar;
        this.f3300N = zzekzVar;
        this.f3301O = false;
        this.f3302P = f3285Q.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, VersionInfoParcel versionInfoParcel, String str4, com.google.android.gms.ads.internal.zzl zzlVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2, long j2) {
        this.f3303s = zzcVar;
        this.f3308x = str;
        this.f3309y = z;
        this.f3310z = str2;
        this.f3288B = i2;
        this.f3289C = i3;
        this.f3290D = str3;
        this.f3291E = versionInfoParcel;
        this.f3292F = str4;
        this.f3293G = zzlVar;
        this.f3295I = str5;
        this.f3296J = str6;
        this.f3297K = str7;
        this.f3301O = z2;
        this.f3302P = j2;
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8773te)).booleanValue()) {
            zzp zzpVar = (zzp) f3286R.remove(Long.valueOf(j2));
            if (zzpVar != null) {
                this.f3304t = zzpVar.f3368a;
                this.f3305u = zzpVar.f3369b;
                this.f3306v = zzpVar.f3370c;
                this.f3294H = zzpVar.f3371d;
                this.f3307w = zzpVar.f3372e;
                this.f3298L = zzpVar.f3374g;
                this.f3299M = zzpVar.f3375h;
                this.f3300N = zzpVar.f3376i;
                this.f3287A = zzpVar.f3373f;
                zzpVar.f3377j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f3304t = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder));
        this.f3305u = (zzr) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder2));
        this.f3306v = (zzclb) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder3));
        this.f3294H = (zzbon) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder6));
        this.f3307w = (zzbop) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder4));
        this.f3287A = (zzad) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder5));
        this.f3298L = (zzddm) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder7));
        this.f3299M = (zzdlg) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder8));
        this.f3300N = (zzbzb) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, VersionInfoParcel versionInfoParcel, zzclx zzclxVar, zzdlg zzdlgVar, String str) {
        this.f3303s = zzcVar;
        this.f3304t = zzaVar;
        this.f3305u = zzrVar;
        this.f3306v = zzclxVar;
        this.f3294H = null;
        this.f3307w = null;
        this.f3308x = null;
        this.f3309y = false;
        this.f3310z = null;
        this.f3287A = zzadVar;
        this.f3288B = -1;
        this.f3289C = 4;
        this.f3290D = null;
        this.f3291E = versionInfoParcel;
        this.f3292F = null;
        this.f3293G = null;
        this.f3295I = str;
        this.f3296J = null;
        this.f3297K = null;
        this.f3298L = null;
        this.f3299M = zzdlgVar;
        this.f3300N = null;
        this.f3301O = false;
        this.f3302P = f3285Q.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzedk zzedkVar, zzclb zzclbVar, VersionInfoParcel versionInfoParcel) {
        this.f3305u = zzedkVar;
        this.f3306v = zzclbVar;
        this.f3288B = 1;
        this.f3291E = versionInfoParcel;
        this.f3303s = null;
        this.f3304t = null;
        this.f3294H = null;
        this.f3307w = null;
        this.f3308x = null;
        this.f3309y = false;
        this.f3310z = null;
        this.f3287A = null;
        this.f3289C = 1;
        this.f3290D = null;
        this.f3292F = null;
        this.f3293G = null;
        this.f3295I = null;
        this.f3296J = null;
        this.f3297K = null;
        this.f3298L = null;
        this.f3299M = null;
        this.f3300N = null;
        this.f3301O = false;
        this.f3302P = f3285Q.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzclx zzclxVar, VersionInfoParcel versionInfoParcel, String str, String str2, zzbzb zzbzbVar) {
        this.f3303s = null;
        this.f3304t = null;
        this.f3305u = null;
        this.f3306v = zzclxVar;
        this.f3294H = null;
        this.f3307w = null;
        this.f3308x = null;
        this.f3309y = false;
        this.f3310z = null;
        this.f3287A = null;
        this.f3288B = 14;
        this.f3289C = 5;
        this.f3290D = null;
        this.f3291E = versionInfoParcel;
        this.f3292F = null;
        this.f3293G = null;
        this.f3295I = str;
        this.f3296J = str2;
        this.f3297K = null;
        this.f3298L = null;
        this.f3299M = null;
        this.f3300N = zzbzbVar;
        this.f3301O = false;
        this.f3302P = f3285Q.getAndIncrement();
    }
}
