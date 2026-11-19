package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import p003C.AbstractC0110a;
import p003C.AbstractC0116g;
import p003C.AbstractC0120k;
import p003C.C0113d;
import p011H.AbstractC0243G;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final AbstractC0120k zzb;
    private static final AbstractC0116g zzc;
    private static final AbstractC0116g zzd;
    private static final AbstractC0116g zze;
    private static final AbstractC0116g zzf;
    private static final AbstractC0116g zzg;

    static {
        String[] strArr = {"_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"};
        int i2 = AbstractC0120k.f179u;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(strArr, 0, objArr, 6, 9);
        zzb = AbstractC0120k.m204n(15, objArr);
        C0113d c0113d = AbstractC0116g.f168t;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC0243G.m368f(7, objArr2);
        zzc = AbstractC0116g.m191m(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        AbstractC0243G.m368f(3, objArr3);
        zzd = AbstractC0116g.m191m(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        AbstractC0243G.m368f(2, objArr4);
        zze = AbstractC0116g.m191m(2, objArr4);
        AbstractC0243G.m371i(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String[] strArr2 = zzjo.zza;
        int length = strArr2.length;
        AbstractC0243G.m368f(length, strArr2);
        int i3 = 0 + length;
        if (objArrCopyOf.length < i3) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC0110a.m184b(objArrCopyOf.length, i3));
        }
        System.arraycopy(strArr2, 0, objArrCopyOf, 0, length);
        int i4 = length + 0;
        String[] strArr3 = zzjo.zzb;
        int length2 = strArr3.length;
        AbstractC0243G.m368f(length2, strArr3);
        int i5 = i4 + length2;
        if (objArrCopyOf.length < i5) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC0110a.m184b(objArrCopyOf.length, i5));
        }
        System.arraycopy(strArr3, 0, objArrCopyOf, i4, length2);
        zzf = AbstractC0116g.m191m(i4 + length2, objArrCopyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        AbstractC0243G.m368f(2, objArr5);
        zzg = AbstractC0116g.m191m(2, objArr5);
    }

    public static boolean zza(String str) {
        return !zzd.contains(str);
    }

    public static boolean zzb(String str, Bundle bundle) {
        if (zzc.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC0116g abstractC0116g = zze;
        int size = abstractC0116g.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC0116g.get(i2));
            i2++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzc(String str) {
        return !zzb.contains(str);
    }

    public static boolean zzd(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (zzf.contains(str2)) {
            return false;
        }
        AbstractC0116g abstractC0116g = zzg;
        int size = abstractC0116g.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zMatches = str2.matches((String) abstractC0116g.get(i2));
            i2++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    public static boolean zze(String str, String str2, Bundle bundle) {
        byte b;
        if (!Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2)) {
            return true;
        }
        if (!zza(str) || bundle == null) {
            return false;
        }
        AbstractC0116g abstractC0116g = zze;
        int size = abstractC0116g.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zContainsKey = bundle.containsKey((String) abstractC0116g.get(i2));
            i2++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("fdl")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("fcm")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }
}
