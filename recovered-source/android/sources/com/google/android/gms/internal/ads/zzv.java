package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv {

    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ int f21030Q = 0;

    /* JADX INFO: renamed from: A */
    public final int f21031A;

    /* JADX INFO: renamed from: B */
    public final float f21032B;

    /* JADX INFO: renamed from: C */
    public final byte[] f21033C;

    /* JADX INFO: renamed from: D */
    public final int f21034D;

    /* JADX INFO: renamed from: E */
    public final zzi f21035E;

    /* JADX INFO: renamed from: F */
    public final int f21036F;

    /* JADX INFO: renamed from: G */
    public final int f21037G;

    /* JADX INFO: renamed from: H */
    public final int f21038H;

    /* JADX INFO: renamed from: I */
    public final int f21039I;

    /* JADX INFO: renamed from: J */
    public final int f21040J;

    /* JADX INFO: renamed from: K */
    public final int f21041K;

    /* JADX INFO: renamed from: L */
    public final int f21042L;

    /* JADX INFO: renamed from: M */
    public final int f21043M;

    /* JADX INFO: renamed from: N */
    public final int f21044N;

    /* JADX INFO: renamed from: O */
    public final int f21045O;

    /* JADX INFO: renamed from: P */
    public int f21046P;

    /* JADX INFO: renamed from: a */
    public final String f21047a;

    /* JADX INFO: renamed from: b */
    public final String f21048b;

    /* JADX INFO: renamed from: c */
    public final zzgwt f21049c;

    /* JADX INFO: renamed from: d */
    public final String f21050d;

    /* JADX INFO: renamed from: e */
    public final int f21051e;

    /* JADX INFO: renamed from: f */
    public final int f21052f;

    /* JADX INFO: renamed from: g */
    public final int f21053g;

    /* JADX INFO: renamed from: h */
    public final int f21054h;

    /* JADX INFO: renamed from: i */
    public final int f21055i;

    /* JADX INFO: renamed from: j */
    public final int f21056j;

    /* JADX INFO: renamed from: k */
    public final String f21057k;

    /* JADX INFO: renamed from: l */
    public final zzap f21058l;

    /* JADX INFO: renamed from: m */
    public final String f21059m;

    /* JADX INFO: renamed from: n */
    public final String f21060n;

    /* JADX INFO: renamed from: o */
    public final String f21061o;

    /* JADX INFO: renamed from: p */
    public final int f21062p;

    /* JADX INFO: renamed from: q */
    public final int f21063q;

    /* JADX INFO: renamed from: r */
    public final List f21064r;

    /* JADX INFO: renamed from: s */
    public final zzq f21065s;

    /* JADX INFO: renamed from: t */
    public final long f21066t;

    /* JADX INFO: renamed from: u */
    public final boolean f21067u;

    /* JADX INFO: renamed from: v */
    public final int f21068v;

    /* JADX INFO: renamed from: w */
    public final int f21069w;

    /* JADX INFO: renamed from: x */
    public final int f21070x;

    /* JADX INFO: renamed from: y */
    public final int f21071y;

    /* JADX INFO: renamed from: z */
    public final float f21072z;

    static {
        new zzv(new zzt());
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
        Integer.toString(37, 36);
        Integer.toString(38, 36);
    }

    public zzv(zzt zztVar) {
        boolean z;
        String str;
        this.f21047a = zztVar.f20789a;
        String strM6515q = zzfm.m6515q(zztVar.f20792d);
        this.f21050d = strM6515q;
        if (zztVar.f20791c.isEmpty() && zztVar.f20790b != null) {
            this.f21049c = zzgwt.m7216n(new zzx(strM6515q, zztVar.f20790b));
            this.f21048b = zztVar.f20790b;
        } else if (zztVar.f20791c.isEmpty() || zztVar.f20790b != null) {
            if (!zztVar.f20791c.isEmpty() || zztVar.f20790b != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= zztVar.f20791c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((zzx) zztVar.f20791c.get(i2)).f21248b.equals(zztVar.f20790b)) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                z = true;
                break;
            }
            zzgtr.m7133f(z);
            this.f21049c = zztVar.f20791c;
            this.f21048b = zztVar.f20790b;
        } else {
            zzgwt zzgwtVar = zztVar.f20791c;
            this.f21049c = zzgwtVar;
            Iterator it = zzgwtVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzx) zzgwtVar.get(0)).f21248b;
                    break;
                }
                zzx zzxVar = (zzx) it.next();
                if (TextUtils.equals(zzxVar.f21247a, strM6515q)) {
                    str = zzxVar.f21248b;
                    break;
                }
            }
            this.f21048b = str;
        }
        this.f21051e = zztVar.f20793e;
        zzgtr.m7134g("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", zztVar.f20795g == 0 || (zztVar.f20794f & 32768) != 0);
        this.f21052f = zztVar.f20794f;
        this.f21053g = zztVar.f20795g;
        int i3 = zztVar.f20796h;
        this.f21054h = i3;
        int i4 = zztVar.f20797i;
        this.f21055i = i4;
        this.f21056j = i4 != -1 ? i4 : i3;
        this.f21057k = zztVar.f20798j;
        this.f21058l = zztVar.f20799k;
        this.f21059m = zztVar.f20800l;
        this.f21060n = zztVar.f20801m;
        this.f21061o = zztVar.f20802n;
        this.f21062p = zztVar.f20803o;
        this.f21063q = zztVar.f20804p;
        List list = zztVar.f20805q;
        this.f21064r = list == null ? Collections.EMPTY_LIST : list;
        zzq zzqVar = zztVar.f20806r;
        this.f21065s = zzqVar;
        this.f21066t = zztVar.f20807s;
        this.f21067u = zztVar.f20808t;
        this.f21068v = zztVar.f20809u;
        this.f21069w = zztVar.f20810v;
        this.f21070x = zztVar.f20811w;
        this.f21071y = zztVar.f20812x;
        this.f21072z = zztVar.f20813y;
        int i5 = zztVar.f20814z;
        this.f21031A = i5 == -1 ? 0 : i5;
        float f2 = zztVar.f20775A;
        this.f21032B = f2 == -1.0f ? 1.0f : f2;
        this.f21033C = zztVar.f20776B;
        this.f21034D = zztVar.f20777C;
        this.f21035E = zztVar.f20778D;
        this.f21036F = zztVar.f20779E;
        int i6 = zztVar.f20780F;
        this.f21037G = i6;
        int i7 = zztVar.f20781G;
        this.f21038H = i7;
        if (i6 != -1 && i7 != -1 && Integer.bitCount(i7) != i6) {
            throw new IllegalStateException(zzgui.m7149b("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i6), Integer.valueOf(i7)));
        }
        this.f21039I = zztVar.f20782H;
        this.f21040J = zztVar.f20783I;
        int i8 = zztVar.f20784J;
        this.f21041K = i8 == -1 ? 0 : i8;
        int i9 = zztVar.f20785K;
        this.f21042L = i9 != -1 ? i9 : 0;
        this.f21043M = zztVar.f20786L;
        this.f21044N = zztVar.f20787M;
        int i10 = zztVar.f20788N;
        if (i10 != 0 || zzqVar == null) {
            this.f21045O = i10;
        } else {
            this.f21045O = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m8926c(zzv zzvVar) {
        String str;
        String str2;
        String string;
        int i2;
        int i3;
        StringBuilder sbM408p = AbstractC0271e0.m408p("id=");
        sbM408p.append(zzvVar.f21047a);
        sbM408p.append(", mimeType=");
        sbM408p.append(zzvVar.f21061o);
        String str3 = zzvVar.f21060n;
        if (str3 != null) {
            sbM408p.append(", container=");
            sbM408p.append(str3);
        }
        String str4 = zzvVar.f21059m;
        if (str4 != null) {
            sbM408p.append(", primaryGroupId=");
            sbM408p.append(str4);
        }
        int i4 = zzvVar.f21056j;
        if (i4 != -1) {
            sbM408p.append(", bitrate=");
            sbM408p.append(i4);
        }
        String str5 = zzvVar.f21057k;
        if (str5 != null) {
            sbM408p.append(", codecs=");
            sbM408p.append(str5);
        }
        zzq zzqVar = zzvVar.f21065s;
        if (zzqVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i5 = 0; i5 < zzqVar.f20590v; i5++) {
                UUID uuid = zzqVar.f20587s[i5].f20536t;
                if (uuid.equals(zzg.f16875b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zzg.f16876c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzg.f16878e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzg.f16877d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzg.f16874a)) {
                    linkedHashSet.add("universal");
                } else {
                    String string2 = uuid.toString();
                    StringBuilder sb = new StringBuilder(string2.length() + 10);
                    sb.append("unknown (");
                    sb.append(string2);
                    sb.append(")");
                    linkedHashSet.add(sb.toString());
                }
            }
            sbM408p.append(", drm=[");
            zzgtl.m7126a(sbM408p, linkedHashSet.iterator(), ",");
            sbM408p.append(']');
        }
        int i6 = zzvVar.f21068v;
        if (i6 != -1 && (i3 = zzvVar.f21069w) != -1) {
            AbstractC1456a.m2455v(sbM408p, ", res=", i6, "x", i3);
        }
        int i7 = zzvVar.f21070x;
        if (i7 != -1 && (i2 = zzvVar.f21071y) != -1) {
            AbstractC1456a.m2455v(sbM408p, ", decRes=", i7, "x", i2);
        }
        float f2 = zzvVar.f21032B;
        int i8 = zzhad.f18422a;
        double d = f2;
        if (Math.copySign((-1.0d) + d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbM408p.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str6 = zzfm.f16091a;
            sbM408p.append(String.format(Locale.US, "%.3f", objArr));
        }
        zzi zziVar = zzvVar.f21035E;
        if (zziVar != null) {
            int i9 = zziVar.f19552f;
            int i10 = zziVar.f19551e;
            if ((i10 != -1 && i9 != -1) || zziVar.m8033d()) {
                sbM408p.append(", color=");
                if (zziVar.m8033d()) {
                    String strM8030e = zzi.m8030e(zziVar.f19547a);
                    String strM8032g = zzi.m8032g(zziVar.f19548b);
                    String strM8031f = zzi.m8031f(zziVar.f19549c);
                    String str7 = zzfm.f16091a;
                    Locale locale = Locale.US;
                    str2 = strM8030e + "/" + strM8032g + "/" + strM8031f;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i10 == -1 || i9 == -1) {
                    string = "NA/NA";
                } else {
                    StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2434a(i10, 1) + String.valueOf(i9).length());
                    sb2.append(i10);
                    sb2.append("/");
                    sb2.append(i9);
                    string = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder(string.length() + str2.length() + 1);
                sb3.append(str2);
                sb3.append("/");
                sb3.append(string);
                sbM408p.append(sb3.toString());
            }
        }
        float f3 = zzvVar.f21072z;
        if (f3 != -1.0f) {
            sbM408p.append(", fps=");
            sbM408p.append(f3);
        }
        int i11 = zzvVar.f21036F;
        if (i11 != -1) {
            sbM408p.append(", maxSubLayers=");
            sbM408p.append(i11);
        }
        int i12 = zzvVar.f21037G;
        if (i12 != -1) {
            sbM408p.append(", channels=");
            sbM408p.append(i12);
        }
        int i13 = zzvVar.f21038H;
        if (i13 != -1) {
            sbM408p.append(", channel_mask=");
            sbM408p.append(i13);
        }
        int i14 = zzvVar.f21039I;
        if (i14 != -1) {
            sbM408p.append(", sample_rate=");
            sbM408p.append(i14);
        }
        String str8 = zzvVar.f21050d;
        if (str8 != null) {
            sbM408p.append(", language=");
            sbM408p.append(str8);
        }
        zzgwt zzgwtVar = zzvVar.f21049c;
        if (!zzgwtVar.isEmpty()) {
            sbM408p.append(", labels=[");
            zzgtl.m7126a(sbM408p, zzgxt.m7251b(zzgwtVar, new zzgti() { // from class: com.google.android.gms.internal.ads.zzu
                @Override // com.google.android.gms.internal.ads.zzgti
                public final /* synthetic */ Object apply(Object obj) {
                    zzx zzxVar = (zzx) obj;
                    int i15 = zzv.f21030Q;
                    String str9 = zzxVar.f21247a;
                    String str10 = zzxVar.f21248b;
                    return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str9).length() + 2 + String.valueOf(str10).length()), str9, ": ", str10);
                }
            }).iterator(), ",");
            sbM408p.append("]");
        }
        int i15 = zzvVar.f21051e;
        if (i15 != 0) {
            sbM408p.append(", selectionFlags=[");
            String str9 = zzfm.f16091a;
            ArrayList arrayList = new ArrayList();
            if ((i15 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i15 & 2) != 0) {
                arrayList.add("forced");
            }
            zzgtl.m7126a(sbM408p, arrayList.iterator(), ",");
            sbM408p.append("]");
        }
        int i16 = zzvVar.f21052f;
        if (i16 != 0) {
            sbM408p.append(", roleFlags=[");
            int i17 = i16 & 32768;
            String str10 = zzfm.f16091a;
            ArrayList arrayList2 = new ArrayList();
            if ((i16 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i16 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i16 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i16 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i16 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i16 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i16 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i16 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i16 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i16 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i16 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i16 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i16 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i16 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i16 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i17 != 0) {
                arrayList2.add("auxiliary");
            }
            zzgtl.m7126a(sbM408p, arrayList2.iterator(), ",");
            sbM408p.append("]");
        }
        if ((i16 & 32768) != 0) {
            sbM408p.append(", auxiliaryTrackType=");
            int i18 = zzvVar.f21053g;
            String str11 = zzfm.f16091a;
            if (i18 == 0) {
                str = "undefined";
            } else if (i18 == 1) {
                str = "original";
            } else if (i18 == 2) {
                str = "depth-linear";
            } else if (i18 == 3) {
                str = "depth-inverse";
            } else {
                if (i18 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbM408p.append(str);
        }
        return sbM408p.toString();
    }

    /* JADX INFO: renamed from: a */
    public final zzt m8927a() {
        return new zzt(this);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8928b(zzv zzvVar) {
        List list = this.f21064r;
        int size = list.size();
        List list2 = zzvVar.f21064r;
        if (size != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null || zzv.class != obj.getClass()) {
            return false;
        }
        zzv zzvVar = (zzv) obj;
        int i3 = this.f21046P;
        return (i3 == 0 || (i2 = zzvVar.f21046P) == 0 || i3 == i2) && this.f21051e == zzvVar.f21051e && this.f21052f == zzvVar.f21052f && this.f21053g == zzvVar.f21053g && this.f21054h == zzvVar.f21054h && this.f21055i == zzvVar.f21055i && this.f21062p == zzvVar.f21062p && this.f21066t == zzvVar.f21066t && this.f21068v == zzvVar.f21068v && this.f21069w == zzvVar.f21069w && this.f21070x == zzvVar.f21070x && this.f21071y == zzvVar.f21071y && this.f21031A == zzvVar.f21031A && this.f21034D == zzvVar.f21034D && this.f21036F == zzvVar.f21036F && this.f21037G == zzvVar.f21037G && this.f21038H == zzvVar.f21038H && this.f21039I == zzvVar.f21039I && this.f21040J == zzvVar.f21040J && this.f21041K == zzvVar.f21041K && this.f21042L == zzvVar.f21042L && this.f21043M == zzvVar.f21043M && this.f21045O == zzvVar.f21045O && Float.compare(this.f21072z, zzvVar.f21072z) == 0 && Float.compare(this.f21032B, zzvVar.f21032B) == 0 && Objects.equals(this.f21047a, zzvVar.f21047a) && Objects.equals(this.f21048b, zzvVar.f21048b) && this.f21049c.equals(zzvVar.f21049c) && Objects.equals(this.f21057k, zzvVar.f21057k) && Objects.equals(this.f21059m, zzvVar.f21059m) && Objects.equals(this.f21060n, zzvVar.f21060n) && Objects.equals(this.f21061o, zzvVar.f21061o) && Objects.equals(this.f21050d, zzvVar.f21050d) && Arrays.equals(this.f21033C, zzvVar.f21033C) && Objects.equals(this.f21058l, zzvVar.f21058l) && Objects.equals(this.f21035E, zzvVar.f21035E) && Objects.equals(this.f21065s, zzvVar.f21065s) && m8928b(zzvVar);
    }

    public final int hashCode() {
        int i2 = this.f21046P;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f21047a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f21048b;
        int iHashCode2 = this.f21049c.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f21050d;
        int iHashCode3 = ((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f21051e) * 31) + this.f21052f) * 31) + this.f21053g) * 31) + this.f21054h) * 31) + this.f21055i) * 31;
        String str4 = this.f21057k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzap zzapVar = this.f21058l;
        int iHashCode5 = iHashCode4 + (zzapVar == null ? 0 : zzapVar.hashCode());
        String str5 = this.f21059m;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21060n;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f21061o;
        int iFloatToIntBits = ((((((((((((((((((((((((Float.floatToIntBits(this.f21032B) + ((((Float.floatToIntBits(this.f21072z) + ((((((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.f21062p) * 31) + ((int) this.f21066t)) * 31) + this.f21068v) * 31) + this.f21069w) * 31) + this.f21070x) * 31) + this.f21071y) * 31)) * 31) + this.f21031A) * 31)) * 31) + this.f21034D) * 31) + this.f21036F) * 31) + this.f21037G) * 31) + this.f21038H) * 31) + this.f21039I) * 31) + this.f21040J) * 31) + this.f21041K) * 31) + this.f21042L) * 31) + this.f21043M) * 31) - 1) * 31) - 1) * 31) + this.f21045O;
        this.f21046P = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f21035E);
        String str = this.f21047a;
        int length = String.valueOf(str).length();
        String str2 = this.f21048b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f21060n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f21061o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f21057k;
        int length5 = String.valueOf(str5).length();
        int i2 = this.f21056j;
        int length6 = String.valueOf(i2).length();
        String str6 = this.f21050d;
        int length7 = String.valueOf(str6).length();
        int i3 = this.f21068v;
        int length8 = String.valueOf(i3).length();
        int i4 = this.f21069w;
        int length9 = String.valueOf(i4).length();
        float f2 = this.f21072z;
        int length10 = String.valueOf(f2).length();
        int length11 = strValueOf.length();
        int i5 = this.f21037G;
        int length12 = String.valueOf(i5).length();
        int i6 = this.f21038H;
        int length13 = String.valueOf(i6).length();
        int i7 = this.f21039I;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + length13 + 2 + String.valueOf(i7).length() + 2);
        AbstractC0271e0.m413u(sb, "Format(", str, ", ", str2);
        AbstractC0271e0.m413u(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(i5);
        AbstractC1456a.m2455v(sb, ", ", i6, ", ", i7);
        sb.append("])");
        return sb.toString();
    }
}
