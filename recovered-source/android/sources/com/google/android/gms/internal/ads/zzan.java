package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan {

    /* JADX INFO: renamed from: B */
    public static final zzan f6067B = new zzan(new zzam());

    /* JADX INFO: renamed from: A */
    public final zzgwt f6068A;

    /* JADX INFO: renamed from: a */
    public final CharSequence f6069a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f6070b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f6071c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f6072d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f6073e;

    /* JADX INFO: renamed from: f */
    public final byte[] f6074f;

    /* JADX INFO: renamed from: g */
    public final Integer f6075g;

    /* JADX INFO: renamed from: h */
    public final Integer f6076h;

    /* JADX INFO: renamed from: i */
    public final Integer f6077i;

    /* JADX INFO: renamed from: j */
    public final Integer f6078j;

    /* JADX INFO: renamed from: k */
    public final Boolean f6079k;

    /* JADX INFO: renamed from: l */
    public final Integer f6080l;

    /* JADX INFO: renamed from: m */
    public final Integer f6081m;

    /* JADX INFO: renamed from: n */
    public final Integer f6082n;

    /* JADX INFO: renamed from: o */
    public final Integer f6083o;

    /* JADX INFO: renamed from: p */
    public final Integer f6084p;

    /* JADX INFO: renamed from: q */
    public final Integer f6085q;

    /* JADX INFO: renamed from: r */
    public final Integer f6086r;

    /* JADX INFO: renamed from: s */
    public final CharSequence f6087s;

    /* JADX INFO: renamed from: t */
    public final CharSequence f6088t;

    /* JADX INFO: renamed from: u */
    public final CharSequence f6089u;

    /* JADX INFO: renamed from: v */
    public final Integer f6090v;

    /* JADX INFO: renamed from: w */
    public final Integer f6091w;

    /* JADX INFO: renamed from: x */
    public final CharSequence f6092x;

    /* JADX INFO: renamed from: y */
    public final CharSequence f6093y;

    /* JADX INFO: renamed from: z */
    public final Integer f6094z;

    static {
        String str = zzfm.f16091a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
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
        Integer.toString(1000, 36);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    public zzan(zzam zzamVar) {
        Boolean boolValueOf = zzamVar.f5909k;
        Integer numValueOf = zzamVar.f5923y;
        Integer numValueOf2 = zzamVar.f5908j;
        int i2 = 1;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf2 = -1;
            } else if (numValueOf2 == null || numValueOf2.intValue() == -1) {
                if (numValueOf != null) {
                    switch (numValueOf.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 20:
                        default:
                            i2 = 0;
                            break;
                        case 21:
                            i2 = 2;
                            break;
                        case 22:
                            i2 = 3;
                            break;
                        case 23:
                            i2 = 4;
                            break;
                        case 24:
                            i2 = 5;
                            break;
                        case 25:
                            i2 = 6;
                            break;
                    }
                } else {
                    i2 = 0;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        } else if (numValueOf2 != null) {
            boolean z = numValueOf2.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf == null) {
                switch (numValueOf2.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i3 = 21;
                        break;
                    case 3:
                        i3 = 22;
                        break;
                    case 4:
                        i3 = 23;
                        break;
                    case 5:
                        i3 = 24;
                        break;
                    case 6:
                        i3 = 25;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else {
            numValueOf2 = null;
        }
        this.f6069a = zzamVar.f5899a;
        this.f6070b = zzamVar.f5900b;
        this.f6071c = zzamVar.f5901c;
        this.f6072d = zzamVar.f5902d;
        this.f6073e = zzamVar.f5903e;
        this.f6074f = zzamVar.f5904f;
        this.f6075g = zzamVar.f5905g;
        this.f6076h = zzamVar.f5906h;
        this.f6077i = zzamVar.f5907i;
        this.f6078j = numValueOf2;
        this.f6079k = boolValueOf;
        Integer num = zzamVar.f5910l;
        this.f6080l = num;
        this.f6081m = num;
        this.f6082n = zzamVar.f5911m;
        this.f6083o = zzamVar.f5912n;
        this.f6084p = zzamVar.f5913o;
        this.f6085q = zzamVar.f5914p;
        this.f6086r = zzamVar.f5915q;
        this.f6087s = zzamVar.f5916r;
        this.f6088t = zzamVar.f5917s;
        this.f6089u = zzamVar.f5918t;
        this.f6090v = zzamVar.f5919u;
        this.f6091w = zzamVar.f5920v;
        this.f6092x = zzamVar.f5921w;
        this.f6093y = zzamVar.f5922x;
        this.f6094z = numValueOf;
        this.f6068A = zzamVar.f5924z;
    }

    /* JADX INFO: renamed from: a */
    public final zzam m4233a() {
        zzam zzamVar = new zzam();
        zzamVar.f5899a = this.f6069a;
        zzamVar.f5900b = this.f6070b;
        zzamVar.f5901c = this.f6071c;
        zzamVar.f5902d = this.f6072d;
        zzamVar.f5903e = this.f6073e;
        zzamVar.f5904f = this.f6074f;
        zzamVar.f5905g = this.f6075g;
        zzamVar.f5906h = this.f6076h;
        zzamVar.f5907i = this.f6077i;
        zzamVar.f5908j = this.f6078j;
        zzamVar.f5909k = this.f6079k;
        zzamVar.f5910l = this.f6081m;
        zzamVar.f5911m = this.f6082n;
        zzamVar.f5912n = this.f6083o;
        zzamVar.f5913o = this.f6084p;
        zzamVar.f5914p = this.f6085q;
        zzamVar.f5915q = this.f6086r;
        zzamVar.f5916r = this.f6087s;
        zzamVar.f5917s = this.f6088t;
        zzamVar.f5918t = this.f6089u;
        zzamVar.f5919u = this.f6090v;
        zzamVar.f5920v = this.f6091w;
        zzamVar.f5921w = this.f6092x;
        zzamVar.f5922x = this.f6093y;
        zzamVar.f5923y = this.f6094z;
        zzamVar.f5924z = this.f6068A;
        return zzamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzan.class == obj.getClass()) {
            zzan zzanVar = (zzan) obj;
            if (TextUtils.equals(this.f6069a, zzanVar.f6069a) && TextUtils.equals(this.f6070b, zzanVar.f6070b) && TextUtils.equals(this.f6071c, zzanVar.f6071c) && TextUtils.equals(this.f6072d, zzanVar.f6072d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.f6073e, zzanVar.f6073e) && Arrays.equals(this.f6074f, zzanVar.f6074f) && Objects.equals(this.f6075g, zzanVar.f6075g) && Objects.equals(this.f6076h, zzanVar.f6076h) && Objects.equals(this.f6077i, zzanVar.f6077i) && Objects.equals(this.f6078j, zzanVar.f6078j) && Objects.equals(this.f6079k, zzanVar.f6079k) && Objects.equals(this.f6081m, zzanVar.f6081m) && Objects.equals(this.f6082n, zzanVar.f6082n) && Objects.equals(this.f6083o, zzanVar.f6083o) && Objects.equals(this.f6084p, zzanVar.f6084p) && Objects.equals(this.f6085q, zzanVar.f6085q) && Objects.equals(this.f6086r, zzanVar.f6086r) && TextUtils.equals(this.f6087s, zzanVar.f6087s) && TextUtils.equals(this.f6088t, zzanVar.f6088t) && TextUtils.equals(this.f6089u, zzanVar.f6089u) && Objects.equals(this.f6090v, zzanVar.f6090v) && Objects.equals(this.f6091w, zzanVar.f6091w) && TextUtils.equals(this.f6092x, zzanVar.f6092x) && TextUtils.equals(null, null) && TextUtils.equals(this.f6093y, zzanVar.f6093y) && Objects.equals(this.f6094z, zzanVar.f6094z) && Objects.equals(this.f6068A, zzanVar.f6068A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6069a, this.f6070b, this.f6071c, this.f6072d, null, null, this.f6073e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f6074f)), this.f6075g, null, this.f6076h, this.f6077i, this.f6078j, this.f6079k, null, this.f6081m, this.f6082n, this.f6083o, this.f6084p, this.f6085q, this.f6086r, this.f6087s, this.f6088t, this.f6089u, this.f6090v, this.f6091w, this.f6092x, null, this.f6093y, this.f6094z, Boolean.TRUE, this.f6068A);
    }
}
