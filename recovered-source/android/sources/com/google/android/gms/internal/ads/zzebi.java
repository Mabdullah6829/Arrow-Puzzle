package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebi extends zzbqz {

    /* JADX INFO: renamed from: t */
    public final zzebl f13497t;

    /* JADX INFO: renamed from: u */
    public final zzebg f13498u;

    /* JADX INFO: renamed from: v */
    public final HashMap f13499v = new HashMap();

    public zzebi(zzebl zzeblVar, zzebg zzebgVar) {
        this.f13497t = zzeblVar;
        this.f13498u = zzebgVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX INFO: renamed from: k4 */
    public static com.google.android.gms.ads.internal.client.zzm m6146k4(HashMap map) {
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.m2978a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zznVar.f3235a = bundle;
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zznVar.f3236b = arrayList;
                        break;
                    case "isTestDevice":
                        zznVar.f3237c = jsonReader.nextBoolean();
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.f3238d = 0;
                            break;
                        } else {
                            zznVar.f3238d = 1;
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.f3242h = 0;
                            break;
                        } else {
                            zznVar.f3242h = 1;
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!RequestConfiguration.f2971c.contains(strNextString)) {
                            break;
                        } else {
                            zznVar.f3243i = strNextString;
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        zznVar.f3245k = jsonReader.nextInt();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zzmVarM2978a = zznVar.m2978a();
        Bundle bundle2 = zzmVarM2978a.f3210E;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zzmVarM2978a.f3229u;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zzmVarM2978a.f3227s, zzmVarM2978a.f3228t, bundle3, zzmVarM2978a.f3230v, zzmVarM2978a.f3231w, zzmVarM2978a.f3232x, zzmVarM2978a.f3233y, zzmVarM2978a.f3234z, zzmVarM2978a.f3206A, zzmVarM2978a.f3207B, zzmVarM2978a.f3208C, zzmVarM2978a.f3209D, bundle2, zzmVarM2978a.f3211F, zzmVarM2978a.f3212G, zzmVarM2978a.f3213H, zzmVarM2978a.f3214I, zzmVarM2978a.f3215J, zzmVarM2978a.f3216K, zzmVarM2978a.f3217L, zzmVarM2978a.f3218M, zzmVarM2978a.f3219N, zzmVarM2978a.f3220O, zzmVarM2978a.f3221P, zzmVarM2978a.f3222Q, zzmVarM2978a.f3223R, zzmVarM2978a.f3224S, zzmVarM2978a.f3225T);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    /* JADX INFO: renamed from: b */
    public final void mo5120b() {
        this.f13499v.clear();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbra
    /* JADX INFO: renamed from: y */
    public final void mo5119y(String str) {
        byte b;
        zzbio zzbioVar = zzbix.f8719qb;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            HashMap mapM3216o = com.google.android.gms.ads.internal.util.zzs.m3216o(uri);
            String str2 = (String) mapM3216o.get("action");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            byte b2 = -1;
            String str3 = "initialize";
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b = 1;
            } else {
                b = -1;
            }
            HashMap map = this.f13499v;
            zzebg zzebgVar = this.f13498u;
            if (b == 0) {
                map.clear();
                zzebgVar.getClass();
                zzebgVar.m6145b(new zzebf(str3));
                return;
            }
            if (b == 1) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzebc) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str4 = (String) mapM3216o.get("obj_id");
            try {
                Objects.requireNonNull(str4);
                long j2 = Long.parseLong(str4);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            b2 = 2;
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            b2 = 5;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            b2 = 4;
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            b2 = 0;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            b2 = 1;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            b2 = 6;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            b2 = 3;
                        }
                        break;
                }
                String str5 = "interstitial";
                String str6 = "creation";
                String str7 = "rewarded";
                zzebl zzeblVar = this.f13497t;
                switch (b2) {
                    case 0:
                        if (map.size() < ((Integer) zzbivVar2.m5030a(zzbix.f8736rb)).intValue()) {
                            Long lValueOf = Long.valueOf(j2);
                            if (!map.containsKey(lValueOf)) {
                                String str8 = (String) mapM3216o.get("ad_unit");
                                if (!TextUtils.isEmpty(str8)) {
                                    zzcpr zzcprVar = (zzcpr) zzeblVar.zzc();
                                    zzcprVar.m5764c(j2);
                                    zzcprVar.m5763b(str8);
                                    zzcps zzcpsVar = (zzcps) zzcprVar.m5762a();
                                    long jLongValue = zzcpsVar.f11034a.longValue();
                                    zzcpu zzcpuVar = zzcpsVar.f11037d;
                                    map.put(lValueOf, new zzebn(jLongValue, zzcpuVar.f11041a, new zzebg(zzcpuVar.f11042b), zzcpsVar.f11036c, zzcpsVar.f11035b));
                                    zzebgVar.getClass();
                                    zzebf zzebfVar = new zzebf(str6);
                                    zzebfVar.f13489a = Long.valueOf(j2);
                                    zzebfVar.f13491c = "nativeObjectCreated";
                                    zzebgVar.m6145b(zzebfVar);
                                    StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 39 + str8.length());
                                    AbstractC1456a.m2456w(sb, "Created H5 interstitial #", j2, " with ad unit ");
                                    sb.append(str8);
                                    com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not create H5 ad, missing ad unit id");
                                    zzebgVar.m6144a(j2);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Could not create H5 ad, object ID already exists");
                                zzebgVar.m6144a(j2);
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not create H5 ad, too many existing objects");
                            zzebgVar.m6144a(j2);
                        }
                        break;
                    case 1:
                        zzebc zzebcVar = (zzebc) map.get(Long.valueOf(j2));
                        if (zzebcVar != null) {
                            zzebcVar.mo6142a(m6146k4(mapM3216o));
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Could not load H5 ad, object ID does not exist");
                            zzebgVar.getClass();
                            zzebf zzebfVar2 = new zzebf(str5);
                            zzebfVar2.f13489a = Long.valueOf(j2);
                            zzebfVar2.f13491c = "onNativeAdObjectNotAvailable";
                            zzebgVar.m6145b(zzebfVar2);
                        }
                        break;
                    case 2:
                        zzebc zzebcVar2 = (zzebc) map.get(Long.valueOf(j2));
                        if (zzebcVar2 != null) {
                            zzebcVar2.zzb();
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Could not show H5 ad, object ID does not exist");
                            zzebgVar.getClass();
                            zzebf zzebfVar3 = new zzebf(str5);
                            zzebfVar3.f13489a = Long.valueOf(j2);
                            zzebfVar3.f13491c = "onNativeAdObjectNotAvailable";
                            zzebgVar.m6145b(zzebfVar3);
                        }
                        break;
                    case 3:
                        if (map.size() < ((Integer) zzbivVar2.m5030a(zzbix.f8736rb)).intValue()) {
                            Long lValueOf2 = Long.valueOf(j2);
                            if (!map.containsKey(lValueOf2)) {
                                String str9 = (String) mapM3216o.get("ad_unit");
                                if (!TextUtils.isEmpty(str9)) {
                                    zzcpr zzcprVar2 = (zzcpr) zzeblVar.zzc();
                                    zzcprVar2.m5764c(j2);
                                    zzcprVar2.m5763b(str9);
                                    zzcps zzcpsVar2 = (zzcps) zzcprVar2.m5762a();
                                    long jLongValue2 = zzcpsVar2.f11034a.longValue();
                                    zzcpu zzcpuVar2 = zzcpsVar2.f11037d;
                                    map.put(lValueOf2, new zzebr(jLongValue2, zzcpuVar2.f11041a, new zzebg(zzcpuVar2.f11042b), zzcpsVar2.f11036c, zzcpsVar2.f11035b));
                                    zzebgVar.getClass();
                                    zzebf zzebfVar4 = new zzebf(str6);
                                    zzebfVar4.f13489a = Long.valueOf(j2);
                                    zzebfVar4.f13491c = "nativeObjectCreated";
                                    zzebgVar.m6145b(zzebfVar4);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 35 + str9.length());
                                    AbstractC1456a.m2456w(sb2, "Created H5 rewarded #", j2, " with ad unit ");
                                    sb2.append(str9);
                                    com.google.android.gms.ads.internal.util.zze.m3150k(sb2.toString());
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not create H5 ad, missing ad unit id");
                                    zzebgVar.m6144a(j2);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Could not create H5 ad, object ID already exists");
                                zzebgVar.m6144a(j2);
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not create H5 ad, too many existing objects");
                            zzebgVar.m6144a(j2);
                        }
                        break;
                    case 4:
                        zzebc zzebcVar3 = (zzebc) map.get(Long.valueOf(j2));
                        if (zzebcVar3 != null) {
                            zzebcVar3.mo6142a(m6146k4(mapM3216o));
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Could not load H5 ad, object ID does not exist");
                            zzebgVar.getClass();
                            zzebf zzebfVar5 = new zzebf(str7);
                            zzebfVar5.f13489a = Long.valueOf(j2);
                            zzebfVar5.f13491c = "onNativeAdObjectNotAvailable";
                            zzebgVar.m6145b(zzebfVar5);
                        }
                        break;
                    case 5:
                        zzebc zzebcVar4 = (zzebc) map.get(Long.valueOf(j2));
                        if (zzebcVar4 != null) {
                            zzebcVar4.zzb();
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Could not show H5 ad, object ID does not exist");
                            zzebgVar.getClass();
                            zzebf zzebfVar6 = new zzebf(str7);
                            zzebfVar6.f13489a = Long.valueOf(j2);
                            zzebfVar6.f13491c = "onNativeAdObjectNotAvailable";
                            zzebgVar.m6145b(zzebfVar6);
                        }
                        break;
                    case 6:
                        Long lValueOf3 = Long.valueOf(j2);
                        zzebc zzebcVar5 = (zzebc) map.get(lValueOf3);
                        if (zzebcVar5 != null) {
                            zzebcVar5.zzc();
                            map.remove(lValueOf3);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(j2);
                            com.google.android.gms.ads.internal.util.zze.m3150k(sb3.toString());
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Could not dispose H5 ad, object ID does not exist");
                        }
                        break;
                    default:
                        com.google.android.gms.ads.internal.util.client.zzo.m3068a("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str4)));
            }
        }
    }
}
