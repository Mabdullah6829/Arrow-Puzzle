package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyy extends zzabm implements zzabi {

    /* JADX INFO: renamed from: d */
    public final Object[] f23119d;

    /* JADX INFO: renamed from: e */
    public final StringBuilder f23120e;

    /* JADX INFO: renamed from: f */
    public int f23121f;

    public zzyy(zzaaf zzaafVar, Object[] objArr, StringBuilder sb) {
        super(zzaafVar);
        this.f23121f = 0;
        this.f23119d = objArr;
        this.f23120e = sb;
    }

    /* JADX INFO: renamed from: b */
    public static void m10736b(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(zzzh.m10746a(obj));
        sb.append("]");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:64:0x0090  */
    /* JADX INFO: renamed from: a */
    public final void m10737a(Object obj, zzyz zzyzVar, zzza zzzaVar) {
        String simpleName;
        zzza zzzaVar2;
        boolean zIsValidCodePoint;
        zzzb zzzbVar = zzyzVar.f23126t;
        String string = zzyzVar.f23128v;
        int iOrdinal = zzzbVar.ordinal();
        StringBuilder sb = this.f23120e;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                m10736b(sb, obj, string);
                return;
            }
        }
        int iOrdinal2 = zzyzVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (zzzaVar.m10740a()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5) {
                        if (zzzaVar.m10740a()) {
                            zzzaVar2 = zzzaVar;
                        } else {
                            int i2 = zzzaVar.f23133a;
                            int i3 = i2 & 128;
                            if (i3 == 0) {
                                zzzaVar2 = zzza.f23132e;
                            } else if (i3 == i2 && zzzaVar.f23134b == -1 && zzzaVar.f23135c == -1) {
                                zzzaVar2 = zzzaVar;
                            } else {
                                zzzaVar2 = new zzza(i3, -1, -1);
                            }
                        }
                        if (zzzaVar2.equals(zzzaVar)) {
                            Number number = (Number) obj;
                            Locale locale = zzzh.f23146a;
                            boolean zM10742c = zzzaVar.m10742c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                zzzh.m10747b(sb, jLongValue, zM10742c);
                                return;
                            }
                            if (number instanceof Integer) {
                                zzzh.m10747b(sb, jLongValue & 4294967295L, zM10742c);
                                return;
                            }
                            if (number instanceof Byte) {
                                zzzh.m10747b(sb, jLongValue & 255, zM10742c);
                                return;
                            }
                            if (number instanceof Short) {
                                zzzh.m10747b(sb, jLongValue & 65535, zM10742c);
                                return;
                            } else {
                                if (!(number instanceof BigInteger)) {
                                    throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                }
                                String string2 = ((BigInteger) number).toString(16);
                                if (zM10742c) {
                                    string2 = string2.toUpperCase(zzzh.f23146a);
                                }
                                sb.append(string2);
                                return;
                            }
                        }
                    }
                } else if (zzzaVar.m10740a()) {
                    sb.append(obj);
                    return;
                }
            } else if (zzzaVar.m10740a()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = zzzh.f23146a;
                int i4 = zzzaVar.f23133a;
                int i5 = i4 & 162;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, zzzh.f23146a);
                try {
                    formattable.formatTo(formatter, i5, zzzaVar.f23134b, zzzaVar.f23135c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(zzzh.m10748c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (zzzaVar.m10740a()) {
                sb.append(zzzh.m10746a(obj));
                return;
            }
        }
        if (!zzzaVar.m10740a()) {
            int i6 = zzyzVar.f23125s;
            if (zzzaVar.m10742c()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            zzzaVar.m10743d(sb2);
            sb2.append((char) i6);
            string = sb2.toString();
        }
        sb.append(String.format(zzzh.f23146a, string, obj));
    }
}
