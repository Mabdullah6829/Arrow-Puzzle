package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabl extends zzabp {

    /* JADX INFO: renamed from: b */
    public static final zzabl f21917b = new zzabl();

    private zzabl() {
    }

    @Override // com.google.android.gms.internal.measurement.zzabp
    /* JADX INFO: renamed from: c */
    public final int mo9327c(zzyy zzyyVar, int i2, String str, int i3, int i4, int i5) {
        int i6;
        zzza zzzaVar;
        int i7;
        zzza zzzaVar2;
        zzabh zzabgVar;
        zzabh zzabkVar;
        char cCharAt = str.charAt(i5);
        int i8 = cCharAt & ' ';
        int i9 = 1;
        boolean z = i8 == 0;
        zzza zzzaVar3 = zzza.f23132e;
        int i10 = 128;
        char c = ' ';
        int i11 = i4;
        if (i11 != i5 || z) {
            int i12 = true != z ? 0 : 128;
            while (true) {
                if (i11 != i5) {
                    int i13 = i11 + 1;
                    i6 = i9;
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 >= c && cCharAt2 <= '0') {
                        int i14 = ((int) ((zzza.f23131d >>> ((cCharAt2 - ' ') * 3)) & 7)) - 1;
                        if (i14 >= 0) {
                            int i15 = i6 << i14;
                            if ((i12 & i15) != 0) {
                                throw zzabo.m9331b(i11, "repeated flag", str);
                            }
                            i12 |= i15;
                            i11 = i13;
                            i9 = i6;
                            c = ' ';
                        } else {
                            if (cCharAt2 != '.') {
                                throw zzabo.m9331b(i11, "invalid flag", str);
                            }
                            zzzaVar2 = new zzza(i12, -1, zzza.m10739e(i13, i5, str));
                        }
                    } else {
                        if (cCharAt2 > '9') {
                            throw zzabo.m9331b(i11, "invalid flag", str);
                        }
                        int i16 = cCharAt2 - '0';
                        while (true) {
                            if (i7 == i5) {
                                i7 = i13;
                                zzzaVar2 = new zzza(i12, i16, -1);
                            } else {
                                int i17 = i7 + 1;
                                char cCharAt3 = str.charAt(i7);
                                if (cCharAt3 == '.') {
                                    i7 = i13;
                                    zzzaVar = new zzza(i12, i16, zzza.m10739e(i17, i5, str));
                                    break;
                                }
                                char c2 = (char) (cCharAt3 - '0');
                                if (c2 >= '\n') {
                                    i7 = i13;
                                    throw zzabo.m9331b(i7, "invalid width character", str);
                                }
                                i16 = (i16 * 10) + c2;
                                if (i16 > 999999) {
                                    i7 = i13;
                                    throw zzabo.m9330a(i11, i5, "width too large", str);
                                }
                                i7 = i13;
                                i7 = i17;
                                i10 = 128;
                            }
                        }
                    }
                    zzzaVar = zzzaVar2;
                    break;
                }
                i6 = i9;
                zzzaVar = new zzza(i12, -1, -1);
                break;
            }
        }
        zzzaVar = zzza.f23132e;
        i6 = 1;
        zzyz zzyzVar = zzyz.f23123x[(cCharAt | ' ') - 97];
        if (i8 == 0 && (zzyzVar == null || (zzyzVar.f23127u & i10) == 0)) {
            zzyzVar = null;
        }
        int i18 = i5 + 1;
        if (zzyzVar != null) {
            zzzaVar.getClass();
            if (!zzzaVar.m10741b(zzyzVar.f23127u, zzyzVar.f23126t.f23142s)) {
                throw zzabo.m9330a(i3, i18, "invalid format specifier", str);
            }
            if (i2 < 10) {
                Map map = zzabj.f21915d;
                if (zzzaVar.m10740a()) {
                    zzabh[] zzabhVarArr = (zzabj[]) zzabj.f21915d.get(zzyzVar);
                    zzabr.m9334a(zzabhVarArr, "default parameter");
                    zzabgVar = zzabhVarArr[i2];
                }
            }
            zzabkVar = new zzabj(i2, zzyzVar, zzzaVar);
            zzabgVar = zzabkVar;
        } else if (cCharAt == 't' || cCharAt == 'T') {
            if (!zzzaVar.m10741b(160, false)) {
                throw zzabo.m9330a(i3, i18, "invalid format specification", str);
            }
            int i19 = i5 + 2;
            if (i19 > str.length()) {
                throw zzabo.m9331b(i3, "truncated format specifier", str);
            }
            zzabf zzabfVar = (zzabf) zzabf.f21909t.get(Character.valueOf(str.charAt(i18)));
            if (zzabfVar == null) {
                throw zzabo.m9331b(i18, "illegal date/time conversion", str);
            }
            zzabgVar = new zzabg(zzzaVar, i2, zzabfVar);
            i18 = i19;
        } else {
            if (cCharAt != 'h' && cCharAt != 'H') {
                throw zzabo.m9330a(i3, i18, "invalid format specification", str);
            }
            if (!zzzaVar.m10741b(160, false)) {
                throw zzabo.m9330a(i3, i18, "invalid format specification", str);
            }
            zzabkVar = new zzabk(zzzaVar, i2);
            zzabgVar = zzabkVar;
        }
        int i20 = zzabgVar.f21913a;
        if (i20 < 32) {
            zzyyVar.f21919b |= i6 << i20;
        }
        zzyyVar.f21920c = Math.max(zzyyVar.f21920c, i20);
        zzaaf zzaafVar = zzyyVar.f21918a;
        zzabn zzabnVar = zzaafVar.f21857a;
        StringBuilder sb = zzyyVar.f23120e;
        zzabnVar.mo9329b(sb, zzaafVar.f21858b, zzyyVar.f23121f, i3);
        Object[] objArr = zzyyVar.f23119d;
        int i21 = zzabgVar.f21913a;
        if (i21 < objArr.length) {
            Object obj = objArr[i21];
            if (obj != null) {
                zzabgVar.mo9326a(zzyyVar, obj);
            } else {
                sb.append("null");
            }
        } else {
            sb.append("[ERROR: MISSING LOG ARGUMENT]");
        }
        zzyyVar.f23121f = i18;
        return i18;
    }
}
