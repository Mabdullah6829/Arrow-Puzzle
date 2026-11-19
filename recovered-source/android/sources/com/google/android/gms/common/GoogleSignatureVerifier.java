package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzai;
import com.google.android.gms.internal.common.zzal;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignatureVerifier {

    /* JADX INFO: renamed from: c */
    public static GoogleSignatureVerifier f4165c;

    /* JADX INFO: renamed from: a */
    public final Context f4166a;

    /* JADX INFO: renamed from: b */
    public volatile String f4167b;

    public GoogleSignatureVerifier(Context context) {
        this.f4166a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static GoogleSignatureVerifier m3405a(Context context) {
        Preconditions.m3544h(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (f4165c == null) {
                zzd zzdVar = zzo.f4681a;
                synchronized (zzo.class) {
                    if (zzo.f4689i == null) {
                        zzo.f4689i = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f4165c = new GoogleSignatureVerifier(context);
            }
        }
        return f4165c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final boolean m3406c(PackageInfo packageInfo, boolean z) {
        zzah zzahVarM9098q;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                zzah zzahVar = z ? zzn.f4680c : zzn.f4679b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        zzal zzalVar = zzah.f21578t;
                        Object[] objArr = {byteArray};
                        zzai.m9102a(1, objArr);
                        zzahVarM9098q = zzah.m9100s(1, objArr);
                    } else {
                        zzahVarM9098q = zzah.m9098q();
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        zzahVarM9098q = zzah.m9098q();
                    } else {
                        zzal zzalVar2 = zzah.f21578t;
                        com.google.android.gms.internal.common.zzad zzadVar = new com.google.android.gms.internal.common.zzad();
                        for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                            zzadVar.m9093a(signature.toByteArray());
                        }
                        zzahVarM9098q = zzadVar.m9094b();
                    }
                }
                if (zzahVarM9098q.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                zzah zzahVarMo9096m = zzahVarM9098q.mo9096m();
                int size = zzahVarMo9096m.size();
                int i3 = 0;
                while (i3 < size) {
                    byte[] bArr = (byte[]) zzahVarMo9096m.get(i3);
                    zzal zzalVarM9101t = zzahVar.listIterator(0);
                    do {
                        int i4 = i3 + 1;
                        if (!zzalVarM9101t.hasNext()) {
                            i3 = i4;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) zzalVarM9101t.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? m3407d(packageInfo, zzn.f4678a) : m3407d(packageInfo, zzn.f4678a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static zzj m3407d(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < zzjVarArr.length; i2++) {
                if (zzjVarArr[i2].equals(zzkVar)) {
                    return zzjVarArr[i2];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX INFO: renamed from: b */
    public final boolean m3408b(int i2) {
        zzy zzyVarM3674b;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.f4166a.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            zzyVarM3674b = zzy.m3674b("no pkgs");
        } else {
            zzyVarM3674b = null;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    Preconditions.m3544h(zzyVarM3674b);
                    break;
                }
                String str = packagesForUid[i3];
                if (str == null) {
                    zzyVarM3674b = zzy.m3674b("null pkg");
                } else if (str.equals(this.f4167b)) {
                    zzyVarM3674b = zzy.f4708d;
                } else {
                    zzd zzdVar = zzo.f4681a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            zzo.m3671a();
                            boolean zMo3610c = zzo.f4687g.mo3610c();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zMo3610c) {
                                zzv zzvVar = new zzv();
                                zzvVar.f4706a = str;
                                boolean zM3404a = GooglePlayServicesUtilLight.m3404a(this.f4166a);
                                String str2 = zzvVar.f4706a;
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    Preconditions.m3544h(zzo.f4689i);
                                    try {
                                        zzo.m3671a();
                                        Preconditions.m3544h(zzo.f4689i);
                                        try {
                                            zzr zzrVarMo3609W2 = zzo.f4687g.mo3609W2(new zzp(str2, zM3404a, false, new ObjectWrapper(zzo.f4689i), false, true, false));
                                            if (zzrVarMo3609W2.f4697s) {
                                                zzc.m3667a(zzrVarMo3609W2.f4700v);
                                                zzyVarM3674b = new zzy(true, null, null);
                                            } else {
                                                String str3 = zzrVarMo3609W2.f4698t;
                                                PackageManager.NameNotFoundException nameNotFoundException = zzz.m3676a(zzrVarMo3609W2.f4699u) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str3 == null) {
                                                    str3 = "error checking package certificate";
                                                }
                                                zzc.m3667a(zzrVarMo3609W2.f4700v);
                                                zzz.m3676a(zzrVarMo3609W2.f4699u);
                                                zzyVarM3674b = new zzy(false, str3, nameNotFoundException);
                                            }
                                        } catch (RemoteException e) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                            zzyVarM3674b = zzy.m3675c("module call", e);
                                        }
                                    } catch (DynamiteModule.LoadingException e2) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        zzyVarM3674b = zzy.m3675c("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = this.f4166a.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                    boolean zM3404a2 = GooglePlayServicesUtilLight.m3404a(this.f4166a);
                                    if (packageInfo == null) {
                                        zzyVarM3674b = zzy.m3674b("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            zzyVarM3674b = zzy.m3674b("single cert required");
                                        } else {
                                            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                                            String str4 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                zzy zzyVarM3672b = zzo.m3672b(str4, zzkVar, zM3404a2, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (!zzyVarM3672b.f4709a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                                    zzyVarM3674b = zzyVarM3672b;
                                                } else {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        zzy zzyVarM3672b2 = zzo.m3672b(str4, zzkVar, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (zzyVarM3672b2.f4709a) {
                                                            zzyVarM3674b = zzy.m3674b("debuggable release cert app rejected");
                                                        } else {
                                                            zzyVarM3674b = zzyVarM3672b;
                                                        }
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th3;
                                            }
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    zzyVarM3674b = zzy.m3675c("no pkg ".concat(str), e3);
                                }
                            }
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } catch (RemoteException | DynamiteModule.LoadingException e4) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                    if (zzyVarM3674b.f4709a) {
                        this.f4167b = str;
                    }
                }
                if (zzyVarM3674b.f4709a) {
                    break;
                }
                i3++;
            }
        }
        if (!zzyVarM3674b.f4709a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = zzyVarM3674b.f4711c;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", zzyVarM3674b.mo3673a(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", zzyVarM3674b.mo3673a());
            }
        }
        return zzyVarM3674b.f4709a;
    }
}
