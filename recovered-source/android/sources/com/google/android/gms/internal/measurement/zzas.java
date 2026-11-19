package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzas implements Iterable, zzao {

    /* JADX INFO: renamed from: s */
    public final String f22251s;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f22251s = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: a */
    public final Boolean mo9579a() {
        return Boolean.valueOf(!this.f22251s.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: b */
    public final Iterator mo9580b() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: d */
    public final Double mo9581d() {
        String str = this.f22251s;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.f22251s.equals(((zzas) obj).f22251s);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22251s.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: k */
    public final zzao mo9584k(String str, zzg zzgVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        byte b;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean zIsEmpty;
        zzg zzgVar2;
        int iM10010h;
        String str5 = "hasOwnProperty";
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str5 = str5;
                str3 = "charAt";
                str4 = "toString";
                b = str.equals(str5) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str3 = "charAt";
                str4 = "toString";
                if (str.equals(str4)) {
                    b = 14;
                    str5 = str5;
                } else {
                    str5 = str5;
                }
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b = 12;
                    str4 = "toString";
                }
                str4 = "toString";
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    str5 = str5;
                    str4 = "toString";
                    b = 0;
                } else {
                    str4 = "toString";
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str5 = str5;
                    str3 = "charAt";
                    str4 = "toString";
                    b = 1;
                } else {
                    str3 = "charAt";
                    str4 = "toString";
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 13;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    b = 7;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b = 11;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 4;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 15;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 3568674:
                if (str.equals(str2)) {
                    b = 16;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 5;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 8;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 9;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 10;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 6;
                    str3 = "charAt";
                    str4 = "toString";
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str5 = str5;
                    str3 = "charAt";
                    str4 = "toString";
                    b = 3;
                } else {
                    str3 = "charAt";
                    str4 = "toString";
                }
                break;
            default:
                str3 = "charAt";
                str4 = "toString";
                break;
        }
        String strZzc = "undefined";
        byte b2 = b;
        String str6 = this.f22251s;
        switch (b2) {
            case 0:
                zzh.m10005c(1, str3, arrayList);
                int iM10010h2 = !arrayList.isEmpty() ? (int) zzh.m10010h(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue()) : 0;
                return (iM10010h2 < 0 || iM10010h2 >= str6.length()) ? zzao.f22244r : new zzas(String.valueOf(str6.charAt(iM10010h2)));
            case 1:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str6);
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        sb.append(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(i6)).zzc());
                    }
                    return new zzas(sb.toString());
                }
                return this;
            case 2:
                zzh.m10003a(str5, 1, arrayList);
                zzao zzaoVarM9808b = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0));
                boolean zEquals = "length".equals(zzaoVarM9808b.zzc());
                zzaf zzafVar = zzao.f22242p;
                if (zEquals) {
                    return zzafVar;
                }
                double dDoubleValue = zzaoVarM9808b.mo9581d().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i2 = (int) dDoubleValue) < 0 || i2 >= str6.length()) ? zzao.f22243q : zzafVar;
            case 3:
                zzh.m10005c(2, "indexOf", arrayList);
                return new zzah(Double.valueOf(str6.indexOf(arrayList.size() > 0 ? zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).zzc() : "undefined", (int) zzh.m10010h(arrayList.size() < 2 ? 0.0d : zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue()))));
            case 4:
                zzh.m10005c(2, "lastIndexOf", arrayList);
                String strZzc2 = arrayList.size() > 0 ? zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).zzc() : "undefined";
                double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue();
                return new zzah(Double.valueOf(str6.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.m10010h(dDoubleValue2)))));
            case 5:
                zzh.m10005c(1, "match", arrayList);
                Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).zzc()).matcher(str6);
                return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.f22238l;
            case 6:
                zzh.m10005c(2, "replace", arrayList);
                boolean zIsEmpty2 = arrayList.isEmpty();
                zzao zzaoVarMo9793c = zzao.f22237k;
                if (!zIsEmpty2) {
                    strZzc = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    if (arrayList.size() > 1) {
                        zzaoVarMo9793c = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1));
                    }
                }
                String str7 = strZzc;
                int iIndexOf = str6.indexOf(str7);
                if (iIndexOf >= 0) {
                    if (zzaoVarMo9793c instanceof zzai) {
                        i3 = 0;
                        zzaoVarMo9793c = ((zzai) zzaoVarMo9793c).mo9793c(zzgVar, Arrays.asList(new zzas(str7), new zzah(Double.valueOf(iIndexOf)), this));
                    } else {
                        i3 = 0;
                    }
                    String strSubstring = str6.substring(i3, iIndexOf);
                    String strZzc3 = zzaoVarMo9793c.zzc();
                    String strSubstring2 = str6.substring(str7.length() + iIndexOf);
                    return new zzas(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc3).length() + String.valueOf(strSubstring2).length()), strSubstring, strZzc3, strSubstring2));
                }
                return this;
            case 7:
                zzh.m10005c(1, FirebaseAnalytics.Event.SEARCH, arrayList);
                Matcher matcher2 = Pattern.compile(arrayList.isEmpty() ? "undefined" : zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).zzc()).matcher(str6);
                return matcher2.find() ? new zzah(Double.valueOf(matcher2.start())) : new zzah(Double.valueOf(-1.0d));
            case 8:
                zzh.m10005c(2, "slice", arrayList);
                double dM10010h = zzh.m10010h(!arrayList.isEmpty() ? zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).mo9581d().doubleValue() : 0.0d);
                double dMax = dM10010h < 0.0d ? Math.max(((double) str6.length()) + dM10010h, 0.0d) : Math.min(dM10010h, str6.length());
                double dM10010h2 = zzh.m10010h(arrayList.size() > 1 ? zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue() : str6.length());
                int i7 = (int) dMax;
                return new zzas(str6.substring(i7, Math.max(0, ((int) (dM10010h2 < 0.0d ? Math.max(((double) str6.length()) + dM10010h2, 0.0d) : Math.min(dM10010h2, str6.length()))) - i7) + i7));
            case 9:
                zzh.m10005c(2, "split", arrayList);
                if (str6.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String strZzc4 = zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    long jM10009g = arrayList.size() > 1 ? ((long) zzh.m10009g(zzgVar.f22494b.m9808b(zzgVar, (zzao) arrayList.get(1)).mo9581d().doubleValue())) & 4294967295L : 2147483647L;
                    if (jM10009g == 0) {
                        return new zzae();
                    }
                    String[] strArrSplit = str6.split(Pattern.quote(strZzc4), ((int) jM10009g) + 1);
                    int length = strArrSplit.length;
                    if (!strZzc4.isEmpty() || length <= 0) {
                        i4 = length;
                        i5 = 0;
                    } else {
                        zIsEmpty = strArrSplit[0].isEmpty();
                        i4 = length - 1;
                        if (!strArrSplit[i4].isEmpty()) {
                            i5 = zIsEmpty;
                            i4 = length;
                            i5 = zIsEmpty;
                        }
                    }
                    i5 = zIsEmpty;
                    if (length > jM10009g) {
                        i4--;
                    }
                    while (i5 < i4) {
                        arrayList2.add(new zzas(strArrSplit[i5]));
                        i5++;
                    }
                }
                return new zzae(arrayList2);
            case 10:
                zzh.m10005c(2, "substring", arrayList);
                if (arrayList.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iM10010h = 0;
                } else {
                    zzgVar2 = zzgVar;
                    iM10010h = (int) zzh.m10010h(zzgVar2.f22494b.m9808b(zzgVar2, (zzao) arrayList.get(0)).mo9581d().doubleValue());
                }
                int iM10010h3 = arrayList.size() > 1 ? (int) zzh.m10010h(zzgVar2.f22494b.m9808b(zzgVar2, (zzao) arrayList.get(1)).mo9581d().doubleValue()) : str6.length();
                int iMin = Math.min(Math.max(iM10010h, 0), str6.length());
                int iMin2 = Math.min(Math.max(iM10010h3, 0), str6.length());
                return new zzas(str6.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                zzh.m10003a("toLocaleUpperCase", 0, arrayList);
                return new zzas(str6.toUpperCase());
            case 12:
                zzh.m10003a("toLocaleLowerCase", 0, arrayList);
                return new zzas(str6.toLowerCase());
            case 13:
                zzh.m10003a("toLowerCase", 0, arrayList);
                return new zzas(str6.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.m10003a(str4, 0, arrayList);
                return this;
            case 15:
                zzh.m10003a("toUpperCase", 0, arrayList);
                return new zzas(str6.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.m10003a("toUpperCase", 0, arrayList);
                return new zzas(str6.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: r */
    public final zzao mo9588r() {
        return new zzas(this.f22251s);
    }

    public final String toString() {
        String str = this.f22251s;
        return AbstractC1456a.m2450q(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.f22251s;
    }
}
