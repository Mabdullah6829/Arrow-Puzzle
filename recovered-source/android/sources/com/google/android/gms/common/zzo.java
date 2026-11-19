package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzo {

    /* JADX INFO: renamed from: g */
    public static volatile com.google.android.gms.common.internal.zzad f4687g;

    /* JADX INFO: renamed from: i */
    public static Context f4689i;

    /* JADX INFO: renamed from: a */
    public static final zzd f4681a = new zzd(zzj.m3669u0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* JADX INFO: renamed from: b */
    public static final zze f4682b = new zze(zzj.m3669u0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c */
    public static final zzf f4683c = new zzf(zzj.m3669u0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d */
    public static final zzg f4684d = new zzg(zzj.m3669u0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e */
    public static final zzh f4685e = new zzh(zzj.m3669u0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f */
    public static final zzi f4686f = new zzi(zzj.m3669u0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h */
    public static final Object f4688h = new Object();

    /* JADX INFO: renamed from: a */
    public static void m3671a() {
        com.google.android.gms.common.internal.zzad zzabVar;
        if (f4687g != null) {
            return;
        }
        Preconditions.m3544h(f4689i);
        synchronized (f4688h) {
            try {
                if (f4687g == null) {
                    IBinder iBinderM3706b = DynamiteModule.m3700c(f4689i, DynamiteModule.f4720e, "com.google.android.gms.googlecertificates").m3706b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i2 = com.google.android.gms.common.internal.zzac.f4511s;
                    if (iBinderM3706b == null) {
                        zzabVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM3706b.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zzabVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zzad ? (com.google.android.gms.common.internal.zzad) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzab(iBinderM3706b, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    f4687g = zzabVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static zzy m3672b(final String str, final zzk zzkVar, final boolean z, boolean z2) {
        try {
            m3671a();
            Preconditions.m3544h(f4689i);
            try {
                return f4687g.mo3608N0(new zzt(str, zzkVar, z, z2), new ObjectWrapper(f4689i.getPackageManager())) ? zzy.f4708d : new zzx(new Callable() { // from class: com.google.android.gms.common.zzl
                    /* JADX WARN: Code duplicated, block: B:19:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:22:0x0028 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:23:0x0024 A[SYNTHETIC] */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        MessageDigest messageDigest;
                        boolean z3 = z;
                        String str2 = str;
                        zzk zzkVar2 = zzkVar;
                        if (!z3) {
                            String str3 = zzo.m3672b(str2, zzkVar2, true, false).f4709a ? "debug cert rejected" : "not allowed";
                            for (int i2 = 0; i2 < 2; i2++) {
                                try {
                                    messageDigest = MessageDigest.getInstance("SHA-256");
                                    if (messageDigest == null) {
                                        Preconditions.m3544h(messageDigest);
                                        return str3 + ": pkg=" + str2 + ", sha256=" + Hex.m3647a(messageDigest.digest(zzkVar2.f4672u)) + ", atk=" + z3 + ", ver=12451000.false";
                                    }
                                } catch (NoSuchAlgorithmException unused) {
                                }
                            }
                            messageDigest = null;
                            Preconditions.m3544h(messageDigest);
                            return str3 + ": pkg=" + str2 + ", sha256=" + Hex.m3647a(messageDigest.digest(zzkVar2.f4672u)) + ", atk=" + z3 + ", ver=12451000.false";
                        }
                        zzd zzdVar = zzo.f4681a;
                        while (i2 < 2) {
                            messageDigest = MessageDigest.getInstance("SHA-256");
                            if (messageDigest == null) {
                                Preconditions.m3544h(messageDigest);
                                return str3 + ": pkg=" + str2 + ", sha256=" + Hex.m3647a(messageDigest.digest(zzkVar2.f4672u)) + ", atk=" + z3 + ", ver=12451000.false";
                            }
                        }
                        messageDigest = null;
                        Preconditions.m3544h(messageDigest);
                        return str3 + ": pkg=" + str2 + ", sha256=" + Hex.m3647a(messageDigest.digest(zzkVar2.f4672u)) + ", atk=" + z3 + ", ver=12451000.false";
                    }
                });
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return zzy.m3675c("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return zzy.m3675c("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}
