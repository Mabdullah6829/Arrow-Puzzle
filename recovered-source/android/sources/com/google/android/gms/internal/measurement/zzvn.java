package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import p003C.AbstractC0109D;
import p003C.AbstractC0120k;
import p003C.C0107B;
import p003C.C0118i;
import p003C.C0134y;
import p003C.C0135z;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzvn implements zzws {

    /* JADX INFO: renamed from: s */
    public final zzws f22991s;

    /* JADX INFO: renamed from: t */
    public final UUID f22992t;

    /* JADX INFO: renamed from: u */
    public final String f22993u;

    /* JADX INFO: renamed from: v */
    public final String f22994v;

    /* JADX INFO: renamed from: w */
    public Thread f22995w;

    public zzvn(String str, zzws zzwsVar, zzwq zzwqVar) {
        str.getClass();
        this.f22994v = str;
        this.f22991s = zzwsVar;
        zzvn zzvnVar = (zzvn) zzwsVar;
        this.f22992t = zzvnVar.f22992t;
        this.f22993u = zzvnVar.f22993u;
        this.f22995w = Thread.currentThread();
    }

    /* JADX INFO: renamed from: c */
    public static String m10673c(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    /* JADX INFO: renamed from: a */
    public final String mo10674a() {
        return this.f22994v;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzwq zzwqVarM10686c = zzvy.m10686c();
        zzws zzwsVar = zzwqVarM10686c.f23052b;
        String str = this.f22994v;
        if (zzwsVar == null) {
            throw new zzvv(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str).length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == zzwsVar) {
            zzvy.m10685b(zzwqVarM10686c, zzwsVar.zzb());
            this.f22995w = null;
            return;
        }
        String strMo10674a = zzwsVar.mo10674a();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(strMo10674a).length() + 1);
        AbstractC0271e0.m413u(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", strMo10674a);
        sb.append(".");
        throw new zzvw(sb.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    /* JADX INFO: renamed from: d */
    public final String mo10675d() {
        return this.f22993u;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:76:0x020f  */
    public final String toString() {
        int i2;
        int i3;
        zzwo zzwoVar;
        Iterator it;
        zzwm zzwmVar;
        int i4;
        AtomicReference atomicReference = zzvy.f23008a;
        zzws zzwsVarZzb = this;
        int i5 = 0;
        int length = 0;
        while (zzwsVarZzb != null) {
            i5++;
            length += zzwsVarZzb.mo10674a().length();
            zzwsVarZzb = zzwsVarZzb.zzb();
            if (zzwsVarZzb != null) {
                length += 4;
            }
        }
        if (i5 > 250) {
            String[] strArr = new String[i5];
            zzws zzwsVarZzb2 = this;
            for (int i6 = i5 - 1; i6 >= 0; i6--) {
                strArr[i6] = zzwsVarZzb2.mo10674a();
                zzwsVarZzb2 = zzwsVarZzb2.zzb();
            }
            C0118i c0118i = new C0118i(4);
            int i7 = 1;
            AbstractC0109D it2 = (i5 != 0 ? i5 != 1 ? AbstractC0120k.m204n(i5, (Object[]) strArr.clone()) : new C0107B(strArr[0]) : C0135z.f209B).iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                c0118i.m200d(it2.next(), Integer.valueOf(i8));
                i8++;
            }
            C0134y c0134yM198a = c0118i.m198a(true);
            int i9 = c0134yM198a.f207x;
            int i10 = i5 >> 2;
            if (i9 > i10) {
                zzwoVar = null;
            } else {
                int i11 = i5 + 1;
                int[] iArr = new int[i11];
                for (int i12 = 0; i12 < i5; i12++) {
                    iArr[i12] = ((Integer) c0134yM198a.get(strArr[i12])).intValue();
                }
                iArr[i5] = i9;
                zzwp zzwpVar = new zzwp(iArr);
                int i13 = 0;
                while (true) {
                    int i14 = -1;
                    if (i13 >= i11) {
                        break;
                    }
                    zzwpVar.f23050f += i7;
                    int i15 = iArr[i13];
                    while (true) {
                        zzwn zzwnVar = null;
                        while (true) {
                            if (zzwpVar.f23050f <= 0) {
                                i4 = i7;
                                break;
                            }
                            if (zzwpVar.f23049e == 0) {
                                break;
                            }
                            i4 = i7;
                            int i16 = ((zzwn) zzwpVar.f23047c.f23041d.get(Integer.valueOf(iArr[zzwpVar.f23048d]))).f23038a;
                            int i17 = zzwpVar.f23049e;
                            if (iArr[i16 + i17] == i15) {
                                if (zzwnVar != null) {
                                    zzwnVar.f23040c = zzwpVar.f23047c;
                                }
                                zzwpVar.f23049e = i17 + 1;
                                zzwpVar.m10696a();
                                break;
                            }
                            zzwn zzwnVar2 = (zzwn) zzwpVar.f23047c.f23041d.get(Integer.valueOf(iArr[zzwpVar.f23048d]));
                            int i18 = zzwnVar2.f23038a;
                            int i19 = i14;
                            zzwn zzwnVar3 = new zzwn(i18, (zzwpVar.f23049e + i18) - 1);
                            zzwpVar.f23047c.f23041d.put(Integer.valueOf(iArr[zzwpVar.f23048d]), zzwnVar3);
                            int i20 = zzwnVar3.f23039b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i20]);
                            HashMap map = zzwnVar3.f23041d;
                            map.put(numValueOf, zzwnVar2);
                            zzwnVar2.f23038a = i20;
                            if (zzwnVar != null) {
                                zzwnVar.f23040c = zzwnVar3;
                            }
                            map.put(Integer.valueOf(i15), new zzwn(i13, BasicMeasure.EXACTLY));
                            zzwpVar.f23050f--;
                            zzwpVar.m10697b();
                            zzwnVar = zzwnVar3;
                            i7 = i4;
                            i14 = i19;
                        }
                        HashMap map2 = zzwpVar.f23047c.f23041d;
                        i4 = i7;
                        Integer numValueOf2 = Integer.valueOf(i15);
                        if (map2.containsKey(numValueOf2)) {
                            if (zzwnVar != null) {
                                zzwnVar.f23040c = zzwpVar.f23047c;
                            }
                            zzwpVar.f23048d = i13;
                            zzwpVar.f23049e++;
                            zzwpVar.m10696a();
                            break;
                        }
                        zzwpVar.f23047c.f23041d.put(numValueOf2, new zzwn(i13, BasicMeasure.EXACTLY));
                        if (zzwnVar != null) {
                            zzwnVar.f23040c = zzwpVar.f23047c;
                        }
                        zzwpVar.f23050f += i14;
                        zzwpVar.m10697b();
                        i7 = i4;
                    }
                    i13++;
                    i7 = i4;
                }
                int i21 = i7;
                ArrayDeque arrayDeque = new ArrayDeque();
                zzwn zzwnVar4 = zzwpVar.f23046b;
                zzwm zzwmVar2 = new zzwm(zzwnVar4, 0, -1, -1);
                arrayDeque.push(zzwmVar2);
                while (!arrayDeque.isEmpty()) {
                    zzwm zzwmVar3 = (zzwm) arrayDeque.pop();
                    Iterator it3 = zzwmVar3.f23037d.f23041d.values().iterator();
                    while (it3.hasNext()) {
                        zzwn zzwnVar5 = (zzwn) it3.next();
                        int i22 = zzwmVar3.f23035b;
                        int i23 = zzwmVar3.f23036c;
                        int i24 = zzwnVar5.f23038a;
                        zzwn zzwnVar6 = zzwnVar4;
                        int i25 = zzwnVar5.f23039b;
                        if (zzwpVar.m10699d(i22, i23, i24, i25)) {
                            it = it3;
                        } else {
                            if (zzwnVar5.f23041d.isEmpty()) {
                                int i26 = zzwnVar5.f23038a;
                                it = it3;
                                if (zzwpVar.m10699d(i22, i23, i26, (i26 + i23) - i22)) {
                                }
                                if (zzwmVar2.f23034a < zzwmVar.f23034a) {
                                    zzwmVar2 = zzwmVar;
                                }
                                arrayDeque.push(zzwmVar);
                                zzwnVar4 = zzwnVar6;
                                it3 = it;
                                i21 = 1;
                            } else {
                                it = it3;
                            }
                            zzwmVar = new zzwm(zzwnVar5, i21, zzwnVar5.f23038a, i25);
                            if (zzwmVar2.f23034a < zzwmVar.f23034a) {
                                zzwmVar2 = zzwmVar;
                            }
                            arrayDeque.push(zzwmVar);
                            zzwnVar4 = zzwnVar6;
                            it3 = it;
                            i21 = 1;
                        }
                        zzwmVar = new zzwm(zzwnVar5, zzwmVar3.f23034a + i21, i22, i23);
                        if (zzwmVar2.f23034a < zzwmVar.f23034a) {
                            zzwmVar2 = zzwmVar;
                        }
                        arrayDeque.push(zzwmVar);
                        zzwnVar4 = zzwnVar6;
                        it3 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int iMin = Math.min(iArr.length, zzwmVar2.f23036c + 1);
                int i27 = 0;
                loop9: while (true) {
                    i2 = zzwmVar2.f23035b;
                    i3 = iMin - i2;
                    zzwnVar4 = (zzwn) zzwnVar4.f23041d.get(Integer.valueOf(iArr[(i27 % i3) + i2]));
                    if (zzwnVar4 == null) {
                        break;
                    }
                    for (int i28 = zzwnVar4.f23038a; i28 < zzwnVar4.f23039b + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i3) + i2] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i3;
                zzwo zzwoVar2 = new zzwo(i2, iMin, i29);
                if (i3 * i29 < i10) {
                    zzwoVar = null;
                } else {
                    zzwoVar = zzwoVar2;
                }
            }
            String strConcat = "";
            if (zzwoVar != null) {
                int i30 = zzwoVar.f23042a;
                String strConcat2 = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = zzwoVar.f23043b;
                int i32 = zzwoVar.f23044c;
                int i33 = ((i31 - i30) * i32) + i30;
                strConcat = i33 < i5 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i5)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i32 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        zzws zzwsVarZzb3 = this;
        while (zzwsVarZzb3 != null) {
            String strMo10674a = zzwsVarZzb3.mo10674a();
            length -= strMo10674a.length();
            strMo10674a.getChars(0, strMo10674a.length(), cArr, length);
            zzwsVarZzb3 = zzwsVarZzb3.zzb();
            if (zzwsVarZzb3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final Thread zza() {
        return this.f22995w;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzb() {
        return this.f22991s;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final UUID zzc() {
        return this.f22992t;
    }

    public zzvn(String str, UUID uuid, String str2, zzwq zzwqVar) {
        str.getClass();
        this.f22994v = str;
        this.f22991s = null;
        this.f22992t = uuid;
        this.f22993u = str2;
        zzwqVar.getClass();
        this.f22995w = Thread.currentThread();
    }
}
