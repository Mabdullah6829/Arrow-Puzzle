package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import androidx.webkit.ProxyConfig;
import androidx.work.WorkRequest;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.util.ExponentialBackoff;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpp extends zzjf {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"firebase_", "google_", "ga_"};
    private static final String[] zzc = {"_err"};
    private SecureRandom zzd;
    private final AtomicLong zze;
    private int zzf;
    private MeasurementManagerFutures zzg;
    private Boolean zzh;
    private Integer zzi;

    public zzpp(zzic zzicVar) {
        super(zzicVar);
        this.zzi = null;
        this.zze = new AtomicLong(0L);
    }

    public static MessageDigest zzQ() {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    @VisibleForTesting
    public static long zzR(byte[] bArr) {
        Preconditions.m3544h(bArr);
        int length = bArr.length;
        int i2 = 0;
        Preconditions.m3546j(length > 0);
        long j2 = 0;
        for (int i3 = length - 1; i3 >= 0 && i3 >= bArr.length - 8; i3--) {
            j2 += (((long) bArr[i3]) & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public static boolean zzS(Context context, boolean z) {
        Preconditions.m3544h(context);
        return zzT(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean zzT(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final boolean zzaA(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    private final Object zzaB(int i2, Object obj, boolean z, boolean z2, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzE(obj.toString(), i2, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleZzae = zzae((Bundle) parcelable, null);
                if (!bundleZzae.isEmpty()) {
                    arrayList.add(bundleZzae);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final int zzaC(String str) {
        if ("_ldl".equals(str)) {
            this.zzu.zzc();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.zzu.zzc();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.zzu.zzc();
            return 100;
        }
        this.zzu.zzc();
        return 36;
    }

    private static boolean zzaD(String str, String[] strArr) {
        Preconditions.m3544h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzaE(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(ProxyConfig.MATCH_ALL_SCHEMES) || Arrays.asList(str.split(",")).contains(str2);
    }

    public static boolean zzac(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzai(String str) {
        return !zzc[0].equals(str);
    }

    public static ArrayList zzav(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.zza);
            bundle.putString("origin", zzahVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzahVar.zzd);
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzahVar.zzc.zzb);
            Object objZza = zzahVar.zzc.zza();
            Preconditions.m3544h(objZza);
            zzjh.zza(bundle, objZza);
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzahVar.zze);
            String str = zzahVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzbh zzbhVar = zzahVar.zzg;
            if (zzbhVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzbhVar.zza);
                zzbf zzbfVar = zzbhVar.zzb;
                if (zzbfVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzbfVar.zzf());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzahVar.zzh);
            zzbh zzbhVar2 = zzahVar.zzi;
            if (zzbhVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzbhVar2.zza);
                zzbf zzbfVar2 = zzbhVar2.zzb;
                if (zzbfVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzbfVar2.zzf());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzahVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzahVar.zzj);
            zzbh zzbhVar3 = zzahVar.zzk;
            if (zzbhVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzbhVar3.zza);
                zzbf zzbfVar3 = zzbhVar3.zzb;
                if (zzbfVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzbfVar3.zzf());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean zzax(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.m3544h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @WorkerThread
    public static void zzay(zzlu zzluVar, Bundle bundle, boolean z) {
        if (bundle != null && zzluVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzluVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzluVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzluVar.zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzluVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzh(String str) {
        Preconditions.m3541e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final boolean zzA(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i2) {
                this.zzu.zzaW().zzh().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final void zzB(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int iZzt;
        int iZzF;
        list = list;
        if (bundle == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        int i2 = true != zzicVar.zzc().zzu.zzk().zzaj(231100000, true) ? 0 : 35;
        int i3 = 0;
        boolean z2 = false;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                iZzt = !z ? zzt(str4) : 0;
                if (iZzt == 0) {
                    iZzt = zzu(str4);
                }
            } else {
                iZzt = 0;
            }
            if (iZzt != 0) {
                zzL(bundle, iZzt, str4, iZzt == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (zzz(bundle.get(str4))) {
                    zzicVar.zzaW().zzh().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iZzF = 22;
                } else {
                    iZzF = zzF(str, str2, str4, bundle.get(str4), bundle, list, z, false);
                }
                if (iZzF != 0 && !"_ev".equals(str4)) {
                    zzL(bundle, iZzF, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzh(str4) && !zzaD(str4, zzjn.zzd)) {
                    i3++;
                    if (!zzaj(231100000, true)) {
                        zzicVar.zzaW().zzd().zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                        zzaA(bundle, 23);
                        bundle.remove(str4);
                    } else if (i3 > i2) {
                        if (!z2) {
                            zzicVar.zzaW().zzd().zzc(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 55), "Item can't contain more than ", i2, " item-scoped custom params"), zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                        }
                        zzaA(bundle, 28);
                        bundle.remove(str4);
                        z2 = true;
                    }
                }
            }
        }
    }

    public final boolean zzC(String str) {
        if (TextUtils.isEmpty(str)) {
            this.zzu.zzaW().zzd().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        Preconditions.m3544h(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.zzu.zzaW().zzd().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzgu.zzl(str));
        return false;
    }

    public final boolean zzD(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (zIsEmpty || zIsEmpty2) {
            return false;
        }
        Preconditions.m3544h(str);
        return !str.equals(str2);
    }

    public final String zzE(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    @WorkerThread
    public final int zzF(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i2;
        int size;
        zzg();
        if (!zzz(obj)) {
            i2 = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!zzaD(str3, zzjn.zzc)) {
                return 20;
            }
            zznl zznlVarZzt = this.zzu.zzt();
            zznlVarZzt.zzg();
            zznlVarZzt.zzb();
            if (zznlVarZzt.zzK() && zznlVarZzt.zzu.zzk().zzak() < 200900) {
                return 25;
            }
            zzic zzicVar = this.zzu;
            zzicVar.zzc();
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i2 = 0;
            }
            if (size > 200) {
                zzicVar.zzaW().zzh().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                zzicVar.zzc();
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i2 = 17;
            } else {
                i2 = 0;
            }
        }
        if (!zzA("param", str3, (zzac(str2) || zzac(str3)) ? this.zzu.zzc().zzf(null, false) : this.zzu.zzc().zze(null, false), obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                zzB(str, str2, str3, (Bundle) obj, list, z);
                return i2;
            }
            if (obj instanceof Parcelable[]) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        this.zzu.zzaW().zzh().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                        return 4;
                    }
                    zzB(str, str2, str3, (Bundle) parcelable, list, z);
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj2 = arrayList2.get(i3);
                    if (!(obj2 instanceof Bundle)) {
                        this.zzu.zzaW().zzh().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                        return 4;
                    }
                    zzB(str, str2, str3, (Bundle) obj2, list, z);
                }
            }
        }
        return i2;
    }

    public final Object zzG(String str, Object obj) {
        if ("_ev".equals(str)) {
            return zzaB(this.zzu.zzc().zzf(null, false), obj, true, true, null);
        }
        return zzaB(zzac(str) ? this.zzu.zzc().zzf(null, false) : this.zzu.zzc().zze(null, false), obj, false, true, null);
    }

    public final Bundle zzH(String str, String str2, Bundle bundle, List list, boolean z) {
        int iZzt;
        boolean zZzaD = zzaD(str2, zzjm.zzg);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        zzic zzicVar = this.zzu;
        int iZzc = zzicVar.zzc().zzc();
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str3)) {
                iZzt = !z ? zzt(str3) : 0;
                if (iZzt == 0) {
                    iZzt = zzu(str3);
                }
            } else {
                iZzt = 0;
            }
            if (iZzt != 0) {
                zzL(bundle2, iZzt, str3, iZzt == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iZzF = zzF(str, str2, str3, bundle.get(str3), bundle2, list, z, zZzaD);
                if (iZzF == 17) {
                    zzL(bundle2, 17, str3, Boolean.FALSE);
                } else if (iZzF != 0 && !"_ev".equals(str3)) {
                    zzL(bundle2, iZzF, iZzF == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzh(str3) && (i2 = i2 + 1) > iZzc) {
                    if (!z2) {
                        zzicVar.zzaW().zzd().zzc(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(iZzc).length() + 37), "Event can't contain more than ", iZzc, " params"), zzicVar.zzl().zza(str2), zzicVar.zzl().zze(bundle));
                    }
                    zzaA(bundle2, 5);
                    bundle2.remove(str3);
                    z2 = true;
                }
            }
        }
        return bundle2;
    }

    public final void zzI(zzgv zzgvVar, int i2) {
        Bundle bundle = zzgvVar.zze;
        int i3 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (zzh(str) && (i3 = i3 + 1) > i2) {
                if (!z) {
                    String strM2448o = AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 37), "Event can't contain more than ", i2, " params");
                    zzic zzicVar = this.zzu;
                    zzicVar.zzaW().zzd().zzc(strM2448o, zzicVar.zzl().zza(zzgvVar.zza), zzicVar.zzl().zze(bundle));
                    zzaA(bundle, 5);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void zzJ(Parcelable[] parcelableArr, int i2) {
        Preconditions.m3544h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i3 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (zzh(str) && !zzaD(str, zzjn.zzd) && (i3 = i3 + 1) > i2) {
                    if (!z) {
                        zzic zzicVar = this.zzu;
                        zzicVar.zzaW().zzd().zzc(AbstractC1456a.m2448o(new StringBuilder(String.valueOf(i2).length() + 60), "Param can't contain more than ", i2, " item-scoped custom parameters"), zzicVar.zzl().zzb(str), zzicVar.zzl().zze(bundle));
                    }
                    zzaA(bundle, 28);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void zzK(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzu.zzk().zzO(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzL(Bundle bundle, int i2, String str, Object obj) {
        if (zzaA(bundle, i2)) {
            this.zzu.zzc();
            bundle.putString("_ev", zzE(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int zzM(String str, Object obj) {
        return "_ldl".equals(str) ? zzA("user property referrer", str, zzaC(str), obj) : zzA("user property", str, zzaC(str), obj) ? 0 : 7;
    }

    public final Object zzN(String str, Object obj) {
        return "_ldl".equals(str) ? zzaB(zzaC(str), obj, true, false, null) : zzaB(zzaC(str), obj, false, false, null);
    }

    public final void zzO(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzh().zzc("Not putting event parameter. Invalid value type. name, type", zzicVar.zzl().zzb(str), simpleName);
        }
    }

    public final void zzP(zzpo zzpoVar, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        zzaA(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        zzpoVar.zza(str, "_err", bundle);
    }

    @WorkerThread
    public final boolean zzU() {
        zzg();
        return zzX() == 1;
    }

    public final MeasurementManagerFutures zzV() {
        if (this.zzg == null) {
            this.zzg = MeasurementManagerFutures.from(this.zzu.zzaZ());
        }
        return this.zzg;
    }

    public final int zzW() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    @WorkerThread
    public final long zzX() {
        long j2;
        zzg();
        if (!zzZ(this.zzu.zzv().zzj())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j2 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j2 = 8;
        } else {
            zzic zzicVar = this.zzu;
            int iZzW = zzW();
            zzicVar.zzc();
            j2 = iZzW < ((Integer) zzfy.zzak.zzb(null)).intValue() ? 16L : 0L;
        }
        if (!zzab("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0 && !zzY()) {
            j2 = 64;
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    @WorkerThread
    public final boolean zzY() {
        Object e;
        Integer num;
        if (this.zzh == null) {
            MeasurementManagerFutures measurementManagerFuturesZzV = zzV();
            boolean z = false;
            if (measurementManagerFuturesZzV == null) {
                return false;
            }
            try {
                num = (Integer) measurementManagerFuturesZzV.getMeasurementApiStatusAsync().get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z = true;
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        this.zzu.zzaW().zze().zzb("Measurement manager api exception", e);
                        this.zzh = Boolean.FALSE;
                    } catch (CancellationException e3) {
                        e = e3;
                        this.zzu.zzaW().zze().zzb("Measurement manager api exception", e);
                        this.zzh = Boolean.FALSE;
                    } catch (ExecutionException e4) {
                        e = e4;
                        this.zzu.zzaW().zze().zzb("Measurement manager api exception", e);
                        this.zzh = Boolean.FALSE;
                    } catch (TimeoutException e5) {
                        e = e5;
                        this.zzu.zzaW().zze().zzb("Measurement manager api exception", e);
                        this.zzh = Boolean.FALSE;
                    }
                }
                this.zzh = Boolean.valueOf(z);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                e = e6;
                num = null;
            }
            this.zzu.zzaW().zzk().zzb("Measurement manager api status result", num);
        }
        return this.zzh.booleanValue();
    }

    public final boolean zzZ(String str) {
        return zzaE((String) zzfy.zzaq.zzb(null), str);
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        return true;
    }

    public final boolean zzaa(String str) {
        return zzaE((String) zzfy.zzbg.zzb(null), str) || zzaE((String) zzfy.zzbh.zzb(null), str) || zzaE((String) zzfy.zzbi.zzb(null), str);
    }

    @WorkerThread
    public final boolean zzab(String str) {
        zzg();
        zzic zzicVar = this.zzu;
        if (Wrappers.m3665a(zzicVar.zzaZ()).f4662a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzicVar.zzaW().zzj().zzb("Permission not granted", str);
        return false;
    }

    public final boolean zzad(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        zzic zzicVar = this.zzu;
        String strZzA = zzicVar.zzc().zzA();
        zzicVar.zzaV();
        return strZzA.equals(str);
    }

    public final Bundle zzae(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objZzG = zzG(str2, bundle.get(str2));
                if (objZzG == null) {
                    zzic zzicVar = this.zzu;
                    zzicVar.zzaW().zzh().zzb("Param value can't be null", zzicVar.zzl().zzb(str2));
                } else {
                    zzO(bundle2, str2, objZzG);
                }
            }
        }
        return bundle2;
    }

    public final zzbh zzaf(String str, String str2, Bundle bundle, String str3, long j2, long j3, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzp(str2) != 0) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzb().zzb("Invalid conditional property event name", zzicVar.zzl().zzc(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleZzH = zzH(str, str2, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleZzH = zzae(bundleZzH, str);
        }
        Preconditions.m3544h(bundleZzH);
        return new zzbh(str2, new zzbf(bundleZzH), str3, j2, j3);
    }

    @VisibleForTesting
    public final boolean zzag(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM3663b = Wrappers.m3665a(context).m3663b(64, str);
            if (packageInfoM3663b == null || (signatureArr = packageInfoM3663b.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.zzu.zzaW().zzb().zzb("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.zzu.zzaW().zzb().zzb("Error obtaining certificate", e2);
            return true;
        }
    }

    public final byte[] zzah(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final boolean zzaj(int i2, boolean z) {
        Boolean boolZzJ = this.zzu.zzt().zzJ();
        if (zzak() < i2 / 1000) {
            return (boolZzJ == null || boolZzJ.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int zzak() {
        if (this.zzi == null) {
            zzic zzicVar = this.zzu;
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f4157b;
            Context contextZzaZ = zzicVar.zzaZ();
            googleApiAvailabilityLight.getClass();
            this.zzi = Integer.valueOf(GoogleApiAvailabilityLight.m3401a(contextZzaZ) / 1000);
        }
        return this.zzi.intValue();
    }

    public final int zzal(int i2) {
        return GoogleApiAvailabilityLight.f4157b.m3403c(this.zzu.zzaZ(), 12451000);
    }

    public final long zzam(long j2, long j3) {
        return ((j3 * ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS) + j2) / 86400000;
    }

    @WorkerThread
    public final void zzan(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            this.zzu.zzaW().zze().zzb("Params already contained engagement", Long.valueOf(j3));
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void zzao(com.google.android.gms.internal.measurement.zzcs zzcsVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zze().zzb("Error returning string value to wrapper", e);
        }
    }

    public final void zzap(com.google.android.gms.internal.measurement.zzcs zzcsVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zze().zzb("Error returning long value to wrapper", e);
        }
    }

    public final void zzaq(com.google.android.gms.internal.measurement.zzcs zzcsVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zze().zzb("Error returning int value to wrapper", e);
        }
    }

    public final void zzar(com.google.android.gms.internal.measurement.zzcs zzcsVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zze().zzb("Error returning byte array to wrapper", e);
        }
    }

    public final void zzas(com.google.android.gms.internal.measurement.zzcs zzcsVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zze().zzb("Error returning boolean value to wrapper", e);
        }
    }

    public final void zzat(com.google.android.gms.internal.measurement.zzcs zzcsVar, Bundle bundle) {
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zze().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public final void zzau(com.google.android.gms.internal.measurement.zzcs zzcsVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcsVar.zzb(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zze().zzb("Error returning bundle list to wrapper", e);
        }
    }

    public final URL zzaw(long j2, String str, String str2, long j3, String str3) {
        try {
            Preconditions.m3541e(str2);
            Preconditions.m3541e(str);
            String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + zzak()) + "&rdid=" + str2 + "&bundleid=" + str + "&retry=" + j3;
            if (str.equals(this.zzu.zzc().zzB())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e) {
            e = e;
            this.zzu.zzaW().zzb().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            this.zzu.zzaW().zzb().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final String zzaz() {
        byte[] bArr = new byte[16];
        zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @WorkerThread
    public final void zzbb() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                AbstractC1456a.m2459z(this.zzu, "Utils falling back to Random for random id");
            }
        }
        this.zze.set(jNextLong);
    }

    public final long zzd() {
        long andIncrement;
        long j2;
        AtomicLong atomicLong = this.zze;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.zze;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.zzu.zzba().currentTimeMillis()).nextLong();
            int i2 = this.zzf + 1;
            this.zzf = i2;
            j2 = jNextLong + ((long) i2);
        }
        return j2;
    }

    @WorkerThread
    public final SecureRandom zzf() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new SecureRandom();
        }
        return this.zzd;
    }

    public final Bundle zzi(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            for (String str : uri.getQueryParameterNames()) {
                if (str.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str, queryParameter19);
                    }
                }
            }
            zzic zzicVar = this.zzu;
            if (zzicVar.zzc().zzp(null, zzfy.zzba)) {
                String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                int iZzf = zzicVar.zzc().zzf(null, false);
                if (string.length() > iZzf) {
                    string = zzE(string, iZzf - 3, true);
                }
                if (!TextUtils.isEmpty(string)) {
                    bundle.putString("deep_link_url", string);
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            this.zzu.zzaW().zze().zzb("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    public final boolean zzj(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public final boolean zzk(String str, String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaW().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.zzu.zzaW().zzd().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaW().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzl(String str, String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaW().zzd().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.zzu.zzaW().zzd().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaW().zzd().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzm(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = zzb;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(strArr3[i2])) {
                this.zzu.zzaW().zzd().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzaD(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzaD(str2, strArr2)) {
            return true;
        }
        this.zzu.zzaW().zzd().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zzn(String str, int i2, String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzd().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        this.zzu.zzaW().zzd().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
        return false;
    }

    public final int zzp(String str) {
        if (!zzl(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        zzic zzicVar = this.zzu;
        if (!zzm(NotificationCompat.CATEGORY_EVENT, zzjm.zza, zzicVar.zzc().zzp(null, zzfy.zzbf) ? zzjm.zzc : zzjm.zzb, str)) {
            return 13;
        }
        zzicVar.zzc();
        return !zzn(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
    }

    public final boolean zzq(String str) {
        return this.zzu.zzc().zzp(null, zzfy.zzbf) ? zzaD(str, zzjm.zze) : zzaD(str, zzjm.zzd);
    }

    public final int zzs(String str) {
        if (!zzl("user property", str)) {
            return 6;
        }
        if (!zzm("user property", zzjo.zza, null, str)) {
            return 15;
        }
        this.zzu.zzc();
        return !zzn("user property", 24, str) ? 6 : 0;
    }

    public final int zzt(String str) {
        if (!zzk("event param", str)) {
            return 3;
        }
        if (!zzm("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzc();
        return !zzn("event param", 40, str) ? 3 : 0;
    }

    public final int zzu(String str) {
        if (!zzl("event param", str)) {
            return 3;
        }
        if (!zzm("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzc();
        return !zzn("event param", 40, str) ? 3 : 0;
    }

    public final boolean zzz(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }
}
