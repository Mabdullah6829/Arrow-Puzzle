package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import java.util.Map;
import p003C.AbstractC0116g;
import p003C.AbstractC0119j;
import p003C.AbstractC0120k;
import p003C.C0113d;
import p003C.C0118i;
import p003C.C0134y;
import p011H.AbstractC0243G;

/* JADX INFO: loaded from: classes2.dex */
public final class zzof {
    static final AbstractC0116g zza;
    public static final /* synthetic */ int zzb = 0;

    static {
        C0113d c0113d = AbstractC0116g.f168t;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        AbstractC0243G.m368f(24, objArr);
        zza = AbstractC0116g.m191m(24, objArr);
    }

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @VisibleForTesting
    public static final boolean zzc(zzabw zzabwVar, AbstractC0119j abstractC0119j, AbstractC0119j abstractC0119j2, AbstractC0120k abstractC0120k, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        int i7;
        int i8;
        AbstractC0120k abstractC0120k2;
        String str4;
        zzoe zzoeVar;
        char c;
        int iZze = zze(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true);
        if (iZze > 0) {
            i8 = i4;
            if (i8 == 1) {
                i7 = i3;
                if (i7 != 1) {
                    i8 = 1;
                } else {
                    i7 = 1;
                    i8 = 1;
                }
            } else {
                i7 = i3;
            }
            cArr[iZze] = '2';
        } else {
            i7 = i3;
            i8 = i4;
        }
        if (zzi(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i6, str, str2, str3, z, z2, true) == zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            int i9 = i6;
            if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                abstractC0120k2 = abstractC0120k;
                str4 = str;
                if (i9 == 1) {
                    if (abstractC0120k2.contains(str4)) {
                        if (iZze > 0 && cArr[iZze] != '2') {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    i9 = 1;
                }
            } else {
                abstractC0120k2 = abstractC0120k;
                str4 = str;
            }
            if (abstractC0119j.containsKey(zzabwVar) && (zzoeVar = (zzoe) abstractC0119j.get(zzabwVar)) != null) {
                int iOrdinal = zzoeVar.ordinal();
                zzabx zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    zzabx zzabxVar2 = zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return zzi(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i9, str, str2, str3, z, z2, true) == zzabxVar ? zzh(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i9, str, str2, str3, z, z2, true) : zzg(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i9, str, str2, str3, z, z2, true);
                        }
                        if (iOrdinal == 3) {
                            return zzi(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k2, cArr, i2, i7, i8, i5, i9, str4, str2, str3, z, z2, true) == zzabxVar2 ? zzg(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i9, str, str2, str3, z, z2, true) : zzh(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i9, str, str2, str3, z, z2, true);
                        }
                        c = '0';
                    } else if (zzi(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i9, str, str2, str3, z, z2, true) != zzabxVar2) {
                        return zzh(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i9, str, str2, str3, z, z2, true);
                    }
                } else if (zzi(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i9, str, str2, str3, z, z2, true) != zzabxVar) {
                    return zzg(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i7, i8, i5, i9, str, str2, str3, z, z2, true);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iZze <= 0 || cArr[iZze] == '2') {
            return false;
        }
        cArr[iZze] = c;
        return false;
    }

    public static final Map zzd(AbstractC0119j abstractC0119j, AbstractC0119j abstractC0119j2, AbstractC0120k abstractC0120k, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            return C0134y.f204y;
        }
        zzabw zzabwVar = zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzabx zzabxVar = (zzabx) abstractC0119j2.get(zzabwVar);
        zzabw zzabwVar2 = zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        zzabx zzabxVar2 = (zzabx) abstractC0119j2.get(zzabwVar2);
        zzabw zzabwVar3 = zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        zzabx zzabxVar3 = (zzabx) abstractC0119j2.get(zzabwVar3);
        zzabw zzabwVar4 = zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        zzabx zzabxVar4 = (zzabx) abstractC0119j2.get(zzabwVar4);
        C0118i c0118i = new C0118i(4);
        c0118i.m200d("Version", "2");
        c0118i.m200d("VendorConsent", true != z ? "0" : "1");
        c0118i.m200d("VendorLegitimateInterest", true != z2 ? "0" : "1");
        c0118i.m200d("gdprApplies", i4 != 1 ? "0" : "1");
        c0118i.m200d("EnableAdvertiserConsentMode", i3 != 1 ? "0" : "1");
        c0118i.m200d("PolicyVersion", String.valueOf(i5));
        c0118i.m200d("CmpSdkID", String.valueOf(i2));
        c0118i.m200d("PurposeOneTreatment", i6 != 1 ? "0" : "1");
        c0118i.m200d("PublisherCC", str);
        zzabx zzabxVar5 = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
        c0118i.m200d("PublisherRestrictions1", String.valueOf(zzabxVar != null ? zzabxVar.zza() : zzabxVar5.zza()));
        c0118i.m200d("PublisherRestrictions3", String.valueOf(zzabxVar2 != null ? zzabxVar2.zza() : zzabxVar5.zza()));
        c0118i.m200d("PublisherRestrictions4", String.valueOf(zzabxVar3 != null ? zzabxVar3.zza() : zzabxVar5.zza()));
        c0118i.m200d("PublisherRestrictions7", String.valueOf(zzabxVar4 != null ? zzabxVar4.zza() : zzabxVar5.zza()));
        String strZzf = zzf(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true);
        String strZzf2 = zzf(zzabwVar2, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true);
        String strZzf3 = zzf(zzabwVar3, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true);
        String strZzf4 = zzf(zzabwVar4, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true);
        AbstractC0243G.m369g("Purpose1", strZzf);
        AbstractC0243G.m369g("Purpose3", strZzf2);
        AbstractC0243G.m369g("Purpose4", strZzf3);
        AbstractC0243G.m369g("Purpose7", strZzf4);
        c0118i.m201e(C0134y.m211b(4, new Object[]{"Purpose1", strZzf, "Purpose3", strZzf2, "Purpose4", strZzf3, "Purpose7", strZzf4}, null).entrySet());
        Object obj = true != zzc(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true) ? "0" : "1";
        Object obj2 = true != zzc(zzabwVar2, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true) ? "0" : "1";
        Object obj3 = true != zzc(zzabwVar3, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true) ? "0" : "1";
        String str4 = true != zzc(zzabwVar4, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true) ? "0" : "1";
        c0118i.m201e(C0134y.m211b(5, new Object[]{"AuthorizePurpose1", obj, "AuthorizePurpose3", obj2, "AuthorizePurpose4", obj3, "AuthorizePurpose7", str4, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
        return c0118i.m198a(true);
    }

    private static final int zze(zzabw zzabwVar, AbstractC0119j abstractC0119j, AbstractC0119j abstractC0119j2, AbstractC0120k abstractC0120k, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzabwVar == zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(zzabw zzabwVar, AbstractC0119j abstractC0119j, AbstractC0119j abstractC0119j2, AbstractC0120k abstractC0120k, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < zzabwVar.zza()) ? "0" : String.valueOf(str2.charAt(zzabwVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzabwVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzabwVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean zzg(zzabw zzabwVar, AbstractC0119j abstractC0119j, AbstractC0119j abstractC0119j2, AbstractC0120k abstractC0120k, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int iZze = zze(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true);
        if (!z) {
            c = '4';
        } else {
            if (str2.length() >= zzabwVar.zza()) {
                char cCharAt = str2.charAt(zzabwVar.zza() - 1);
                boolean z4 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z4;
            }
            c = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c;
        }
        return false;
    }

    private static final boolean zzh(zzabw zzabwVar, AbstractC0119j abstractC0119j, AbstractC0119j abstractC0119j2, AbstractC0120k abstractC0120k, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int iZze = zze(zzabwVar, abstractC0119j, abstractC0119j2, abstractC0120k, cArr, i2, i3, i4, i5, i6, str, str2, str3, z, z2, true);
        if (!z2) {
            c = '5';
        } else {
            if (str3.length() >= zzabwVar.zza()) {
                char cCharAt = str3.charAt(zzabwVar.zza() - 1);
                boolean z4 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z4;
            }
            c = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c;
        }
        return false;
    }

    private static final zzabx zzi(zzabw zzabwVar, AbstractC0119j abstractC0119j, AbstractC0119j abstractC0119j2, AbstractC0120k abstractC0120k, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Object obj = abstractC0119j2.get(zzabwVar);
        if (obj == null) {
            obj = zzabx.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (zzabx) obj;
    }
}
