package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzafb;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpk extends zzos {
    private long zza;
    private long zzb;

    public zzpk(zzpg zzpgVar) {
        super(zzpgVar);
    }

    public static final void zzF(com.google.android.gms.internal.measurement.zzhr zzhrVar, String str, Object obj) {
        List listM10116u = zzhrVar.m10116u();
        int i2 = 0;
        while (true) {
            if (i2 >= listM10116u.size()) {
                i2 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzhw) listM10116u.get(i2)).m10156B())) {
                break;
            } else {
                i2++;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzhvVarM10154M = com.google.android.gms.internal.measurement.zzhw.m10154M();
        zzhvVarM10154M.m10151u(str);
        zzhvVarM10154M.m10153x(((Long) obj).longValue());
        if (i2 < 0) {
            zzhrVar.m10120z(zzhvVarM10154M);
        } else {
            zzhrVar.m9552o();
            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10138R(i2, (com.google.android.gms.internal.measurement.zzhw) zzhvVarM10154M.m9555r());
        }
    }

    @WorkerThread
    public static final boolean zzG(zzbh zzbhVar, zzr zzrVar) {
        Preconditions.m3544h(zzbhVar);
        Preconditions.m3544h(zzrVar);
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    public static final Bundle zzH(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            String strM10156B = zzhwVar.m10156B();
            if (zzhwVar.m10163I()) {
                bundle.putDouble(strM10156B, zzhwVar.m10164J());
            } else if (zzhwVar.m10161G()) {
                bundle.putFloat(strM10156B, zzhwVar.m10162H());
            } else if (zzhwVar.m10157C()) {
                bundle.putString(strM10156B, zzhwVar.m10158D());
            } else if (zzhwVar.m10159E()) {
                bundle.putLong(strM10156B, zzhwVar.m10160F());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.zzhw zzI(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.m10124C()) {
            if (zzhwVar.m10156B().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    public static final String zzJ(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Map zzK(com.google.android.gms.internal.measurement.zzhs zzhsVar, String... strArr) {
        Object objZzT;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.m10124C()) {
            if (Arrays.asList(strArr).contains(zzhwVar.m10156B()) && (objZzT = zzT(zzhwVar)) != null) {
                map.put(zzhwVar.m10156B(), objZzT);
            }
        }
        return map;
    }

    public static final Map zzL(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        Object objZzT;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.m10124C()) {
            if (zzhwVar.m10156B().startsWith("gad_") && (objZzT = zzT(zzhwVar)) != null) {
                map.put(zzhwVar.m10156B(), objZzT);
            }
        }
        return map;
    }

    public static final Object zzM(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzI = zzI(zzhsVar, str);
        if (zzhwVarZzI == null) {
            return null;
        }
        return zzT(zzhwVarZzI);
    }

    public static final Object zzN(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str, Object obj) {
        Object objZzM = zzM(zzhsVar, str);
        return objZzM == null ? obj : objZzM;
    }

    private final void zzO(StringBuilder sb, int i2, List list) {
        if (list == null) {
            return;
        }
        int i3 = i2 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                zzQ(sb, i3);
                sb.append("param {\n");
                zzW(sb, i3, AppMeasurementSdk.ConditionalUserProperty.NAME, zzhwVar.m10155A() ? this.zzu.zzl().zzb(zzhwVar.m10156B()) : null);
                zzW(sb, i3, "string_value", zzhwVar.m10157C() ? zzhwVar.m10158D() : null);
                zzW(sb, i3, "int_value", zzhwVar.m10159E() ? Long.valueOf(zzhwVar.m10160F()) : null);
                zzW(sb, i3, "double_value", zzhwVar.m10163I() ? Double.valueOf(zzhwVar.m10164J()) : null);
                if (zzhwVar.m10166L() > 0) {
                    zzO(sb, i3, zzhwVar.m10165K());
                }
                zzQ(sb, i3);
                sb.append("}\n");
            }
        }
    }

    private final void zzP(StringBuilder sb, int i2, com.google.android.gms.internal.measurement.zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        zzQ(sb, i2);
        sb.append("filter {\n");
        if (zzfhVar.m9910E()) {
            zzW(sb, i2, "complement", Boolean.valueOf(zzfhVar.m9911F()));
        }
        if (zzfhVar.m9912G()) {
            zzW(sb, i2, "param_name", this.zzu.zzl().zzb(zzfhVar.m9913H()));
        }
        if (zzfhVar.m9906A()) {
            int i3 = i2 + 1;
            com.google.android.gms.internal.measurement.zzfr zzfrVarM9907B = zzfhVar.m9907B();
            if (zzfrVarM9907B != null) {
                zzQ(sb, i3);
                sb.append("string_filter {\n");
                if (zzfrVarM9907B.m9937A()) {
                    switch (zzfrVarM9907B.m9944I()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzW(sb, i3, "match_type", str);
                }
                if (zzfrVarM9907B.m9938B()) {
                    zzW(sb, i3, "expression", zzfrVarM9907B.m9939C());
                }
                if (zzfrVarM9907B.m9940D()) {
                    zzW(sb, i3, "case_sensitive", Boolean.valueOf(zzfrVarM9907B.m9941E()));
                }
                if (zzfrVarM9907B.m9943G() > 0) {
                    zzQ(sb, i2 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : zzfrVarM9907B.m9942F()) {
                        zzQ(sb, i2 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zzQ(sb, i3);
                sb.append("}\n");
            }
        }
        if (zzfhVar.m9908C()) {
            zzX(sb, i2 + 1, "number_filter", zzfhVar.m9909D());
        }
        zzQ(sb, i2);
        sb.append("}\n");
    }

    private static final void zzQ(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    private static final void zzR(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static final String zzS(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final Object zzT(com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        if (zzhwVar.m10157C()) {
            return zzhwVar.m10158D();
        }
        if (zzhwVar.m10159E()) {
            return Long.valueOf(zzhwVar.m10160F());
        }
        if (zzhwVar.m10163I()) {
            return Double.valueOf(zzhwVar.m10164J());
        }
        if (zzhwVar.m10166L() > 0) {
            return zzy(zzhwVar.m10165K());
        }
        return null;
    }

    private static final void zzU(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zzR(builder, str3, string, set);
            }
        }
    }

    private static final void zzV(StringBuilder sb, int i2, String str, com.google.android.gms.internal.measurement.zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        zzQ(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zziiVar.m10387D() != 0) {
            zzQ(sb, 4);
            sb.append("results: ");
            int i3 = 0;
            for (Long l2 : zziiVar.m10386C()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (zziiVar.m10385B() != 0) {
            zzQ(sb, 4);
            sb.append("status: ");
            int i5 = 0;
            for (Long l3 : zziiVar.m10384A()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (zziiVar.m10389F() != 0) {
            zzQ(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i7 = 0;
            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.m10388E()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(zzhqVar.m10100A() ? Integer.valueOf(zzhqVar.m10101B()) : null);
                sb.append(":");
                sb.append(zzhqVar.m10102C() ? Long.valueOf(zzhqVar.m10103D()) : null);
                i7 = i8;
            }
            sb.append("}\n");
        }
        if (zziiVar.m10391H() != 0) {
            zzQ(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i9 = 0;
            for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.m10390G()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(zzikVar.m10401A() ? Integer.valueOf(zzikVar.m10402B()) : null);
                sb.append(": [");
                Iterator it = zzikVar.m10403C().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i11 = i12;
                }
                sb.append("]");
                i9 = i10;
            }
            sb.append("}\n");
        }
        zzQ(sb, 3);
        sb.append("}\n");
    }

    private static final void zzW(StringBuilder sb, int i2, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzQ(sb, i2 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void zzX(StringBuilder sb, int i2, String str, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        String str2;
        if (zzflVar == null) {
            return;
        }
        zzQ(sb, i2);
        sb.append(str);
        sb.append(" {\n");
        if (zzflVar.m9916A()) {
            int iM9925K = zzflVar.m9925K();
            if (iM9925K == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM9925K == 2) {
                str2 = "LESS_THAN";
            } else if (iM9925K != 3) {
                str2 = iM9925K != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            zzW(sb, i2, "comparison_type", str2);
        }
        if (zzflVar.m9917B()) {
            zzW(sb, i2, "match_as_float", Boolean.valueOf(zzflVar.m9918C()));
        }
        if (zzflVar.m9919D()) {
            zzW(sb, i2, "comparison_value", zzflVar.m9920E());
        }
        if (zzflVar.m9921F()) {
            zzW(sb, i2, "min_comparison_value", zzflVar.m9922G());
        }
        if (zzflVar.m9923H()) {
            zzW(sb, i2, "max_comparison_value", zzflVar.m9924I());
        }
        zzQ(sb, i2);
        sb.append("}\n");
    }

    public static boolean zzm(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean zzn(List list, int i2) {
        if (i2 < list.size() * 64) {
            return ((1 << (i2 % 64)) & ((Long) list.get(i2 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static List zzp(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 * 64) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static zzafb zzw(zzafb zzafbVar, byte[] bArr) {
        zzadf zzadfVarM9535a = zzadf.m9535a();
        return zzadfVarM9535a != null ? zzafbVar.mo9338h(bArr, zzadfVarM9535a) : zzafbVar.mo9342n(bArr);
    }

    public static int zzx(com.google.android.gms.internal.measurement.zzic zzicVar, String str) {
        for (int i2 = 0; i2 < ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10327j2(); i2++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10330k2(i2).m10421C())) {
                return i2;
            }
        }
        return -1;
    }

    public static Bundle[] zzy(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar2 : zzhwVar.m10165K()) {
                    if (zzhwVar2.m10157C()) {
                        bundle.putString(zzhwVar2.m10156B(), zzhwVar2.m10158D());
                    } else if (zzhwVar2.m10159E()) {
                        bundle.putLong(zzhwVar2.m10156B(), zzhwVar2.m10160F());
                    } else if (zzhwVar2.m10163I()) {
                        bundle.putDouble(zzhwVar2.m10156B(), zzhwVar2.m10164J());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final zzbh zzA(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle bundleZzB = zzB(zzaaVar.f21852c, true);
        String string = (!bundleZzB.containsKey("_o") || (obj = bundleZzB.get("_o")) == null) ? "app" : obj.toString();
        String strZzb = zzjm.zzb(zzaaVar.f21850a);
        if (strZzb == null) {
            strZzb = zzaaVar.f21850a;
        }
        return new zzbh(strZzb, new zzbf(bundleZzB), string, zzaaVar.f21851b, 0L);
    }

    public final Bundle zzB(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(zzB((Map) arrayList.get(i2), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    @VisibleForTesting
    public final long zzC(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return ZonedDateTime.parse(str, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
            } catch (DateTimeParseException unused) {
                this.zzu.zzaW().zze().zzb("Unable to parse header time, time", str);
            }
        }
        return 0L;
    }

    @WorkerThread
    public final void zzD(Map map) {
        if (Build.VERSION.SDK_INT >= 26) {
            String strZzJ = zzJ(map, "Date");
            if (TextUtils.isEmpty(strZzJ)) {
                return;
            }
            long jZzC = zzC(strZzJ);
            if (jZzC > 0) {
                long jMo3639a = this.zzu.zzba().mo3639a();
                zzg();
                if (this.zzb == 0) {
                    this.zza = jMo3639a;
                    this.zzb = jZzC;
                }
            }
        }
    }

    @WorkerThread
    public final long zzE(long j2) {
        zzg();
        long j3 = this.zzb;
        if (j3 == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 - this.zza) + j2;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbc() {
        return false;
    }

    public final void zzc(com.google.android.gms.internal.measurement.zzit zzitVar, Object obj) {
        Preconditions.m3544h(obj);
        zzitVar.m9552o();
        ((com.google.android.gms.internal.measurement.zziu) zzitVar.f22030t).m10433P();
        zzitVar.m9552o();
        ((com.google.android.gms.internal.measurement.zziu) zzitVar.f22030t).m10435R();
        zzitVar.m9552o();
        ((com.google.android.gms.internal.measurement.zziu) zzitVar.f22030t).m10437T();
        if (obj instanceof String) {
            zzitVar.m9552o();
            ((com.google.android.gms.internal.measurement.zziu) zzitVar.f22030t).m10432O((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            zzitVar.m9552o();
            ((com.google.android.gms.internal.measurement.zziu) zzitVar.f22030t).m10434Q(jLongValue);
        } else {
            if (!(obj instanceof Double)) {
                this.zzu.zzaW().zzb().zzb("Ignoring invalid (type) user attribute value", obj);
                return;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            zzitVar.m9552o();
            ((com.google.android.gms.internal.measurement.zziu) zzitVar.f22030t).m10436S(dDoubleValue);
        }
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzhv zzhvVar, Object obj) {
        Preconditions.m3544h(obj);
        zzhvVar.m9552o();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f22030t).m10169P();
        zzhvVar.m9552o();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f22030t).m10171R();
        zzhvVar.m9552o();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f22030t).m10173T();
        zzhvVar.m9552o();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f22030t).m10176W();
        if (obj instanceof String) {
            zzhvVar.m10152v((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.m10153x(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            zzhvVar.m9552o();
            ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f22030t).m10172S(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.zzu.zzaW().zzb().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzhv zzhvVarM10154M = com.google.android.gms.internal.measurement.zzhw.m10154M();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzhv zzhvVarM10154M2 = com.google.android.gms.internal.measurement.zzhw.m10154M();
                    zzhvVarM10154M2.m10151u(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzhvVarM10154M2.m10153x(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzhvVarM10154M2.m10152v((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        zzhvVarM10154M2.m9552o();
                        ((com.google.android.gms.internal.measurement.zzhw) zzhvVarM10154M2.f22030t).m10172S(dDoubleValue2);
                    }
                    zzhvVarM10154M.m9552o();
                    ((com.google.android.gms.internal.measurement.zzhw) zzhvVarM10154M.f22030t).m10174U((com.google.android.gms.internal.measurement.zzhw) zzhvVarM10154M2.m9555r());
                }
                if (((com.google.android.gms.internal.measurement.zzhw) zzhvVarM10154M.f22030t).m10166L() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzhw) zzhvVarM10154M.m9555r());
                }
            }
        }
        zzhvVar.m9552o();
        ((com.google.android.gms.internal.measurement.zzhw) zzhvVar.f22030t).m10175V(arrayList);
    }

    public final zzoh zzf(String str, com.google.android.gms.internal.measurement.zzic zzicVar, com.google.android.gms.internal.measurement.zzhr zzhrVar, String str2) {
        int iIndexOf;
        zzaif.m9798a();
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzc().zzp(str, zzfy.zzaO)) {
            return null;
        }
        long jCurrentTimeMillis = zzicVar2.zzba().currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(zzicVar2.zzc().zzk(str, zzfy.zzat).split(",")));
        zzpg zzpgVar = this.zzg;
        zzou zzouVarZzf = zzpgVar.zzf();
        String strZzc = zzouVarZzf.zzg.zzh().zzc(str);
        Uri.Builder builder = new Uri.Builder();
        zzic zzicVar3 = zzouVarZzf.zzu;
        builder.scheme(zzicVar3.zzc().zzk(str, zzfy.zzam));
        if (TextUtils.isEmpty(strZzc)) {
            builder.authority(zzicVar3.zzc().zzk(str, zzfy.zzan));
        } else {
            String strZzk = zzicVar3.zzc().zzk(str, zzfy.zzan);
            StringBuilder sb = new StringBuilder(String.valueOf(strZzc).length() + 1 + String.valueOf(strZzk).length());
            sb.append(strZzc);
            sb.append(".");
            sb.append(strZzk);
            builder.authority(sb.toString());
        }
        builder.path(zzicVar3.zzc().zzk(str, zzfy.zzao));
        zzR(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10267P(), hashSet);
        zzicVar2.zzc().zzi();
        zzR(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strM10249J = ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10249J();
        zzal zzalVarZzc = zzicVar2.zzc();
        zzfx zzfxVar = zzfy.zzaR;
        if (zzalVarZzc.zzp(str, zzfxVar) && zzpgVar.zzh().zzu(str)) {
            strM10249J = "";
        }
        zzR(builder, "app_instance_id", strM10249J, hashSet);
        zzR(builder, "rdid", ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10240G(), hashSet);
        zzR(builder, "bundle_id", zzicVar.m10214v(), hashSet);
        String strM10107B = zzhrVar.m10107B();
        String strZza = zzjm.zza(strM10107B);
        if (true != TextUtils.isEmpty(strZza)) {
            strM10107B = strZza;
        }
        zzR(builder, "app_event_name", strM10107B, hashSet);
        zzR(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10285V()), hashSet);
        String strM10366w2 = ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10366w2();
        if (zzicVar2.zzc().zzp(str, zzfxVar) && zzpgVar.zzh().zzr(str) && !TextUtils.isEmpty(strM10366w2) && (iIndexOf = strM10366w2.indexOf(".")) != -1) {
            strM10366w2 = strM10366w2.substring(0, iIndexOf);
        }
        zzR(builder, "os_version", strM10366w2, hashSet);
        zzR(builder, "timestamp", String.valueOf(zzhrVar.m10109D()), hashSet);
        if (((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10246I()) {
            zzR(builder, "lat", "1", hashSet);
        }
        zzR(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10277S0()), hashSet);
        zzR(builder, "trigger_uri_source", "1", hashSet);
        zzR(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        zzR(builder, "request_uuid", str2, hashSet);
        List<com.google.android.gms.internal.measurement.zzhw> listM10116u = zzhrVar.m10116u();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : listM10116u) {
            String strM10156B = zzhwVar.m10156B();
            if (zzhwVar.m10163I()) {
                bundle.putString(strM10156B, String.valueOf(zzhwVar.m10164J()));
            } else if (zzhwVar.m10161G()) {
                bundle.putString(strM10156B, String.valueOf(zzhwVar.m10162H()));
            } else if (zzhwVar.m10157C()) {
                bundle.putString(strM10156B, zzhwVar.m10158D());
            } else if (zzhwVar.m10159E()) {
                bundle.putString(strM10156B, String.valueOf(zzhwVar.m10160F()));
            }
        }
        zzU(builder, zzicVar2.zzc().zzk(str, zzfy.zzas).split("\\|"), bundle, hashSet);
        List<com.google.android.gms.internal.measurement.zziu> listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10324i2());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.zziu zziuVar : listUnmodifiableList) {
            String strM10421C = zziuVar.m10421C();
            if (zziuVar.m10428J()) {
                bundle2.putString(strM10421C, String.valueOf(zziuVar.m10429K()));
            } else if (zziuVar.m10426H()) {
                bundle2.putString(strM10421C, String.valueOf(zziuVar.m10427I()));
            } else if (zziuVar.m10422D()) {
                bundle2.putString(strM10421C, zziuVar.m10423E());
            } else if (zziuVar.m10424F()) {
                bundle2.putString(strM10421C, String.valueOf(zziuVar.m10425G()));
            }
        }
        zzU(builder, zzicVar2.zzc().zzk(str, zzfy.zzar).split("\\|"), bundle2, hashSet);
        zzR(builder, "dma", true != ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10268P0() ? "0" : "1", hashSet);
        if (!((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10274R0().isEmpty()) {
            zzR(builder, "dma_cps", ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10274R0(), hashSet);
        }
        if (((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10292X0()) {
            com.google.android.gms.internal.measurement.zzha zzhaVarM10295Y0 = ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10295Y0();
            if (!zzhaVarM10295Y0.m10030O().isEmpty()) {
                zzR(builder, "dl_gclid", zzhaVarM10295Y0.m10030O(), hashSet);
            }
            if (!zzhaVarM10295Y0.m10032Q().isEmpty()) {
                zzR(builder, "dl_gbraid", zzhaVarM10295Y0.m10032Q(), hashSet);
            }
            if (!zzhaVarM10295Y0.m10034S().isEmpty()) {
                zzR(builder, "dl_gs", zzhaVarM10295Y0.m10034S(), hashSet);
            }
            if (zzhaVarM10295Y0.m10036U() > 0) {
                zzR(builder, "dl_ss_ts", String.valueOf(zzhaVarM10295Y0.m10036U()), hashSet);
            }
            if (!zzhaVarM10295Y0.m10038W().isEmpty()) {
                zzR(builder, "mr_gclid", zzhaVarM10295Y0.m10038W(), hashSet);
            }
            if (!zzhaVarM10295Y0.m10040Y().isEmpty()) {
                zzR(builder, "mr_gbraid", zzhaVarM10295Y0.m10040Y(), hashSet);
            }
            if (!zzhaVarM10295Y0.m10042a0().isEmpty()) {
                zzR(builder, "mr_gs", zzhaVarM10295Y0.m10042a0(), hashSet);
            }
            if (zzhaVarM10295Y0.m10044c0() > 0) {
                zzR(builder, "mr_click_ts", String.valueOf(zzhaVarM10295Y0.m10044c0()), hashSet);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public final com.google.android.gms.internal.measurement.zzhs zzh(zzbc zzbcVar) {
        com.google.android.gms.internal.measurement.zzhr zzhrVarM10121Q = com.google.android.gms.internal.measurement.zzhs.m10121Q();
        long j2 = zzbcVar.zzf;
        zzhrVarM10121Q.m9552o();
        ((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10145Y(j2);
        long j3 = zzbcVar.zze;
        zzhrVarM10121Q.m9552o();
        ((com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.f22030t).m10122A(j3);
        zzbf zzbfVar = zzbcVar.zzg;
        zzbe zzbeVar = new zzbe(zzbfVar);
        while (zzbeVar.hasNext()) {
            String next = zzbeVar.next();
            com.google.android.gms.internal.measurement.zzhv zzhvVarM10154M = com.google.android.gms.internal.measurement.zzhw.m10154M();
            zzhvVarM10154M.m10151u(next);
            Object objZza = zzbfVar.zza(next);
            Preconditions.m3544h(objZza);
            zzd(zzhvVarM10154M, objZza);
            zzhrVarM10121Q.m10120z(zzhvVarM10154M);
        }
        String str = zzbcVar.zzc;
        if (!TextUtils.isEmpty(str) && zzbfVar.zza("_o") == null) {
            com.google.android.gms.internal.measurement.zzhv zzhvVarM10154M2 = com.google.android.gms.internal.measurement.zzhw.m10154M();
            zzhvVarM10154M2.m10151u("_o");
            zzhvVarM10154M2.m10152v(str);
            zzhrVarM10121Q.m10119y((com.google.android.gms.internal.measurement.zzhw) zzhvVarM10154M2.m9555r());
        }
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVarM10121Q.m9555r();
    }

    public final String zzi(com.google.android.gms.internal.measurement.zzib zzibVar) {
        String str;
        String str2;
        String str3;
        com.google.android.gms.internal.measurement.zzhe zzheVarM10283U0;
        if (zzibVar == null) {
            return "";
        }
        StringBuilder sbM408p = AbstractC0271e0.m408p("\nbatch {\n");
        if (zzibVar.m10188F()) {
            zzW(sbM408p, 0, "upload_subdomain", zzibVar.m10189G());
        }
        if (zzibVar.m10186D()) {
            zzW(sbM408p, 0, "sgtm_join_id", zzibVar.m10187E());
        }
        for (com.google.android.gms.internal.measurement.zzid zzidVar : zzibVar.m10183A()) {
            if (zzidVar != null) {
                zzQ(sbM408p, 1);
                sbM408p.append("bundle {\n");
                if (zzidVar.m10300a0()) {
                    zzW(sbM408p, 1, "protocol_version", Integer.valueOf(zzidVar.m10304b1()));
                }
                zzic zzicVar = this.zzu;
                if (zzicVar.zzc().zzp(zzidVar.m10220A(), zzfy.zzaM) && zzidVar.m10244H0()) {
                    zzW(sbM408p, 1, "session_stitching_token", zzidVar.m10247I0());
                }
                zzW(sbM408p, 1, "platform", zzidVar.m10363v2());
                if (zzidVar.m10228C()) {
                    zzW(sbM408p, 1, "gmp_version", Long.valueOf(zzidVar.m10231D()));
                }
                if (zzidVar.m10234E()) {
                    zzW(sbM408p, 1, "uploading_gmp_version", Long.valueOf(zzidVar.m10237F()));
                }
                if (zzidVar.m10232D0()) {
                    zzW(sbM408p, 1, "dynamite_version", Long.valueOf(zzidVar.m10235E0()));
                }
                if (zzidVar.m10288W()) {
                    zzW(sbM408p, 1, "config_version", Long.valueOf(zzidVar.m10291X()));
                }
                zzW(sbM408p, 1, "gmp_app_id", zzidVar.m10267P());
                zzW(sbM408p, 1, "app_id", zzidVar.m10220A());
                zzW(sbM408p, 1, "app_version", zzidVar.m10224B());
                if (zzidVar.m10282U()) {
                    zzW(sbM408p, 1, "app_version_major", Integer.valueOf(zzidVar.m10285V()));
                }
                zzW(sbM408p, 1, "firebase_instance_id", zzidVar.m10279T());
                if (zzidVar.m10252K()) {
                    zzW(sbM408p, 1, "dev_cert_hash", Long.valueOf(zzidVar.m10255L()));
                }
                zzW(sbM408p, 1, "app_store", zzidVar.m10227B2());
                if (zzidVar.m10333l2()) {
                    zzW(sbM408p, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.m10336m2()));
                }
                if (zzidVar.m10339n2()) {
                    zzW(sbM408p, 1, "start_timestamp_millis", Long.valueOf(zzidVar.m10342o2()));
                }
                if (zzidVar.m10345p2()) {
                    zzW(sbM408p, 1, "end_timestamp_millis", Long.valueOf(zzidVar.m10348q2()));
                }
                if (zzidVar.m10351r2()) {
                    zzW(sbM408p, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.m10354s2()));
                }
                if (zzidVar.m10357t2()) {
                    zzW(sbM408p, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.m10360u2()));
                }
                zzW(sbM408p, 1, "app_instance_id", zzidVar.m10249J());
                zzW(sbM408p, 1, "resettable_device_id", zzidVar.m10240G());
                zzW(sbM408p, 1, "ds_id", zzidVar.m10297Z());
                if (zzidVar.m10243H()) {
                    zzW(sbM408p, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.m10246I()));
                }
                zzW(sbM408p, 1, "os_version", zzidVar.m10366w2());
                zzW(sbM408p, 1, "device_model", zzidVar.m10369x2());
                zzW(sbM408p, 1, "user_default_language", zzidVar.m10372y2());
                if (zzidVar.m10375z2()) {
                    zzW(sbM408p, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.m10223A2()));
                }
                if (zzidVar.m10258M()) {
                    zzW(sbM408p, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.m10261N()));
                }
                if (zzidVar.m10286V0()) {
                    zzW(sbM408p, 1, "delivery_index", Integer.valueOf(zzidVar.m10289W0()));
                }
                if (zzidVar.m10270Q()) {
                    zzW(sbM408p, 1, "service_upload", Boolean.valueOf(zzidVar.m10273R()));
                }
                zzW(sbM408p, 1, "health_monitor", zzidVar.m10264O());
                if (zzidVar.m10225B0()) {
                    zzW(sbM408p, 1, "retry_counter", Integer.valueOf(zzidVar.m10229C0()));
                }
                if (zzidVar.m10238F0()) {
                    zzW(sbM408p, 1, "consent_signals", zzidVar.m10241G0());
                }
                if (zzidVar.m10265O0()) {
                    zzW(sbM408p, 1, "is_dma_region", Boolean.valueOf(zzidVar.m10268P0()));
                }
                if (zzidVar.m10271Q0()) {
                    zzW(sbM408p, 1, "core_platform_services", zzidVar.m10274R0());
                }
                if (zzidVar.m10259M0()) {
                    zzW(sbM408p, 1, "consent_diagnostics", zzidVar.m10262N0());
                }
                if (zzidVar.m10250J0()) {
                    zzW(sbM408p, 1, "target_os_version", Long.valueOf(zzidVar.m10253K0()));
                }
                zzaif.m9798a();
                if (zzicVar.zzc().zzp(zzidVar.m10220A(), zzfy.zzaO)) {
                    zzW(sbM408p, 1, "ad_services_version", Integer.valueOf(zzidVar.m10277S0()));
                    if (zzidVar.m10280T0() && (zzheVarM10283U0 = zzidVar.m10283U0()) != null) {
                        zzQ(sbM408p, 2);
                        sbM408p.append("attribution_eligibility_status {\n");
                        zzW(sbM408p, 2, "eligible", Boolean.valueOf(zzheVarM10283U0.m10061A()));
                        zzW(sbM408p, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzheVarM10283U0.m10062B()));
                        zzW(sbM408p, 2, "pre_r", Boolean.valueOf(zzheVarM10283U0.m10063C()));
                        zzW(sbM408p, 2, "r_extensions_too_old", Boolean.valueOf(zzheVarM10283U0.m10064D()));
                        zzW(sbM408p, 2, "adservices_extension_too_old", Boolean.valueOf(zzheVarM10283U0.m10065E()));
                        zzW(sbM408p, 2, "ad_storage_not_allowed", Boolean.valueOf(zzheVarM10283U0.m10066F()));
                        zzW(sbM408p, 2, "measurement_manager_disabled", Boolean.valueOf(zzheVarM10283U0.m10067G()));
                        zzQ(sbM408p, 2);
                        sbM408p.append("}\n");
                    }
                }
                if (zzidVar.m10292X0()) {
                    com.google.android.gms.internal.measurement.zzha zzhaVarM10295Y0 = zzidVar.m10295Y0();
                    zzQ(sbM408p, 2);
                    sbM408p.append("ad_campaign_info {\n");
                    if (zzhaVarM10295Y0.m10029N()) {
                        zzW(sbM408p, 2, "deep_link_gclid", zzhaVarM10295Y0.m10030O());
                    }
                    if (zzhaVarM10295Y0.m10031P()) {
                        zzW(sbM408p, 2, "deep_link_gbraid", zzhaVarM10295Y0.m10032Q());
                    }
                    if (zzhaVarM10295Y0.m10033R()) {
                        zzW(sbM408p, 2, "deep_link_gad_source", zzhaVarM10295Y0.m10034S());
                    }
                    if (zzhaVarM10295Y0.m10045d0()) {
                        zzW(sbM408p, 2, "deep_link_url", zzhaVarM10295Y0.m10046e0());
                    }
                    if (zzhaVarM10295Y0.m10035T()) {
                        zzW(sbM408p, 2, "deep_link_session_millis", Long.valueOf(zzhaVarM10295Y0.m10036U()));
                    }
                    if (zzhaVarM10295Y0.m10037V()) {
                        zzW(sbM408p, 2, "market_referrer_gclid", zzhaVarM10295Y0.m10038W());
                    }
                    if (zzhaVarM10295Y0.m10039X()) {
                        zzW(sbM408p, 2, "market_referrer_gbraid", zzhaVarM10295Y0.m10040Y());
                    }
                    if (zzhaVarM10295Y0.m10041Z()) {
                        zzW(sbM408p, 2, "market_referrer_gad_source", zzhaVarM10295Y0.m10042a0());
                    }
                    if (zzhaVarM10295Y0.m10043b0()) {
                        zzW(sbM408p, 2, "market_referrer_click_millis", Long.valueOf(zzhaVarM10295Y0.m10044c0()));
                    }
                    zzQ(sbM408p, 2);
                    sbM408p.append("}\n");
                }
                if (zzidVar.m10303b0()) {
                    zzW(sbM408p, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.m10306c0()));
                }
                if (zzidVar.m10298Z0()) {
                    com.google.android.gms.internal.measurement.zzis zzisVarM10301a1 = zzidVar.m10301a1();
                    zzQ(sbM408p, 2);
                    sbM408p.append("sgtm_diagnostics {\n");
                    int iM10414E = zzisVarM10301a1.m10414E();
                    if (iM10414E == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iM10414E == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iM10414E != 3) {
                        str2 = iM10414E != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    zzW(sbM408p, 2, "upload_type", str2);
                    zzW(sbM408p, 2, "client_upload_eligibility", zzisVarM10301a1.m10412A().name());
                    int iM10415F = zzisVarM10301a1.m10415F();
                    if (iM10415F == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iM10415F == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iM10415F == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iM10415F != 4) {
                        str3 = iM10415F != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    zzW(sbM408p, 2, "service_upload_eligibility", str3);
                    zzQ(sbM408p, 2);
                    sbM408p.append("}\n");
                }
                if (zzidVar.m10309d0()) {
                    com.google.android.gms.internal.measurement.zzho zzhoVarM10312e0 = zzidVar.m10312e0();
                    zzQ(sbM408p, 2);
                    sbM408p.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.zzhl zzhlVar : zzhoVarM10312e0.m10097A()) {
                        zzQ(sbM408p, 3);
                        sbM408p.append("limited_data_modes {\n");
                        int iM10091B = zzhlVar.m10091B();
                        if (iM10091B == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iM10091B == 2) {
                            str = "AD_STORAGE";
                        } else if (iM10091B != 3) {
                            str = iM10091B != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        zzW(sbM408p, 3, "type", str);
                        int iM10092C = zzhlVar.m10092C();
                        zzW(sbM408p, 3, "mode", iM10092C != 1 ? iM10092C != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        zzQ(sbM408p, 3);
                        sbM408p.append("}\n");
                    }
                    zzQ(sbM408p, 2);
                    sbM408p.append("}\n");
                }
                zzaef<com.google.android.gms.internal.measurement.zziu> zzaefVarM10324i2 = zzidVar.m10324i2();
                if (zzaefVarM10324i2 != null) {
                    for (com.google.android.gms.internal.measurement.zziu zziuVar : zzaefVarM10324i2) {
                        if (zziuVar != null) {
                            zzQ(sbM408p, 2);
                            sbM408p.append("user_property {\n");
                            zzW(sbM408p, 2, "set_timestamp_millis", zziuVar.m10419A() ? Long.valueOf(zziuVar.m10420B()) : null);
                            zzW(sbM408p, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzicVar.zzl().zzc(zziuVar.m10421C()));
                            zzW(sbM408p, 2, "string_value", zziuVar.m10423E());
                            zzW(sbM408p, 2, "int_value", zziuVar.m10424F() ? Long.valueOf(zziuVar.m10425G()) : null);
                            zzW(sbM408p, 2, "double_value", zziuVar.m10428J() ? Double.valueOf(zziuVar.m10429K()) : null);
                            zzQ(sbM408p, 2);
                            sbM408p.append("}\n");
                        }
                    }
                }
                zzaef<com.google.android.gms.internal.measurement.zzhg> zzaefVarM10276S = zzidVar.m10276S();
                if (zzaefVarM10276S != null) {
                    for (com.google.android.gms.internal.measurement.zzhg zzhgVar : zzaefVarM10276S) {
                        if (zzhgVar != null) {
                            zzQ(sbM408p, 2);
                            sbM408p.append("audience_membership {\n");
                            if (zzhgVar.m10076A()) {
                                zzW(sbM408p, 2, "audience_id", Integer.valueOf(zzhgVar.m10077B()));
                            }
                            if (zzhgVar.m10081F()) {
                                zzW(sbM408p, 2, "new_audience", Boolean.valueOf(zzhgVar.m10082G()));
                            }
                            zzV(sbM408p, 2, "current_data", zzhgVar.m10078C());
                            if (zzhgVar.m10079D()) {
                                zzV(sbM408p, 2, "previous_data", zzhgVar.m10080E());
                            }
                            zzQ(sbM408p, 2);
                            sbM408p.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzhs> listM10308c2 = zzidVar.m10308c2();
                if (listM10308c2 != null) {
                    for (com.google.android.gms.internal.measurement.zzhs zzhsVar : listM10308c2) {
                        if (zzhsVar != null) {
                            zzQ(sbM408p, 2);
                            sbM408p.append("event {\n");
                            zzW(sbM408p, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzicVar.zzl().zza(zzhsVar.m10127F()));
                            if (zzhsVar.m10128G()) {
                                zzW(sbM408p, 2, "timestamp_millis", Long.valueOf(zzhsVar.m10129H()));
                            }
                            if (zzicVar.zzc().zzp(null, zzfy.zzbe) && zzhsVar.m10134M()) {
                                zzW(sbM408p, 2, "corrected_timestamp_millis", Long.valueOf(zzhsVar.m10135N()));
                            }
                            if (zzhsVar.m10130I()) {
                                zzW(sbM408p, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.m10131J()));
                            }
                            if (zzhsVar.m10132K()) {
                                zzW(sbM408p, 2, "count", Integer.valueOf(zzhsVar.m10133L()));
                            }
                            if (zzhsVar.m10125D() != 0) {
                                zzO(sbM408p, 2, zzhsVar.m10124C());
                            }
                            zzQ(sbM408p, 2);
                            sbM408p.append("}\n");
                        }
                    }
                }
                zzQ(sbM408p, 1);
                sbM408p.append("}\n");
            }
        }
        sbM408p.append("} // End-of-batch\n");
        return sbM408p.toString();
    }

    public final String zzj(com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar == null) {
            return "null";
        }
        StringBuilder sbM408p = AbstractC0271e0.m408p("\nevent_filter {\n");
        if (zzffVar.m9891A()) {
            zzW(sbM408p, 0, "filter_id", Integer.valueOf(zzffVar.m9892B()));
        }
        zzW(sbM408p, 0, "event_name", this.zzu.zzl().zza(zzffVar.m9893C()));
        String strZzS = zzS(zzffVar.m9899I(), zzffVar.m9900J(), zzffVar.m9902L());
        if (!strZzS.isEmpty()) {
            zzW(sbM408p, 0, "filter_type", strZzS);
        }
        if (zzffVar.m9897G()) {
            zzX(sbM408p, 1, "event_count_filter", zzffVar.m9898H());
        }
        if (zzffVar.m9895E() > 0) {
            sbM408p.append("  filters {\n");
            Iterator it = zzffVar.m9894D().iterator();
            while (it.hasNext()) {
                zzP(sbM408p, 2, (com.google.android.gms.internal.measurement.zzfh) it.next());
            }
        }
        zzQ(sbM408p, 1);
        sbM408p.append("}\n}\n");
        return sbM408p.toString();
    }

    public final String zzk(com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        if (zzfnVar == null) {
            return "null";
        }
        StringBuilder sbM408p = AbstractC0271e0.m408p("\nproperty_filter {\n");
        if (zzfnVar.m9927A()) {
            zzW(sbM408p, 0, "filter_id", Integer.valueOf(zzfnVar.m9928B()));
        }
        zzW(sbM408p, 0, "property_name", this.zzu.zzl().zzc(zzfnVar.m9929C()));
        String strZzS = zzS(zzfnVar.m9931E(), zzfnVar.m9932F(), zzfnVar.m9934H());
        if (!strZzS.isEmpty()) {
            zzW(sbM408p, 0, "filter_type", strZzS);
        }
        zzP(sbM408p, 1, zzfnVar.m9930D());
        sbM408p.append("}\n");
        return sbM408p.toString();
    }

    public final Parcelable zzl(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzu.zzaW().zzb().zza("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List zzq(List list, List list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzu.zzaW().zze().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.zzu.zzaW().zze().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i2);
    }

    public final boolean zzs(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(this.zzu.zzba().currentTimeMillis() - j2) > j3;
    }

    @WorkerThread
    public final long zzt(byte[] bArr) {
        Preconditions.m3544h(bArr);
        zzic zzicVar = this.zzu;
        zzicVar.zzk().zzg();
        MessageDigest messageDigestZzQ = zzpp.zzQ();
        if (messageDigestZzQ != null) {
            return zzpp.zzR(messageDigestZzQ.digest(bArr));
        }
        AbstractC1456a.m2452s(zzicVar, "Failed to get MD5");
        return 0L;
    }

    public final long zzu(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzt(str.getBytes(StandardCharsets.UTF_8));
    }

    public final byte[] zzv(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzu.zzaW().zzb().zzb("Failed to gzip content", e);
            throw e;
        }
    }

    public final Map zzz(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzz((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj2 = arrayList2.get(i2);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zzz((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zzz((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }
}
