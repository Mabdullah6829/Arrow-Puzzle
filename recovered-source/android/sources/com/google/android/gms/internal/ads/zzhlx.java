package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
final class zzhlx extends zzibx {
    /* JADX INFO: renamed from: a */
    public static final zzibr m7550a(zzico zzicoVar) throws IOException {
        String strM8079l;
        int iM8077i = zzicoVar.m8077i();
        zzibr zzibrVarM7552c = m7552c(zzicoVar, iM8077i);
        if (zzibrVarM7552c == null) {
            return m7551b(zzicoVar, iM8077i);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int iM8074c = zzicoVar.f19682y;
            if (iM8074c == 0) {
                iM8074c = zzicoVar.m8074c();
            }
            String str = null;
            if (iM8074c == 2 || iM8074c == 4 || iM8074c == 17) {
                if (zzibrVarM7552c instanceof zzibq) {
                    int iM8074c2 = zzicoVar.f19682y;
                    if (iM8074c2 == 0) {
                        iM8074c2 = zzicoVar.m8074c();
                    }
                    if (iM8074c2 != 4) {
                        throw zzicoVar.m8073A("END_ARRAY");
                    }
                    int i2 = zzicoVar.f19673C;
                    zzicoVar.f19673C = i2 - 1;
                    int[] iArr = zzicoVar.f19675E;
                    int i3 = i2 - 2;
                    iArr[i3] = iArr[i3] + 1;
                    zzicoVar.f19682y = 0;
                } else {
                    int iM8074c3 = zzicoVar.f19682y;
                    if (iM8074c3 == 0) {
                        iM8074c3 = zzicoVar.m8074c();
                    }
                    if (iM8074c3 != 2) {
                        throw zzicoVar.m8073A("END_OBJECT");
                    }
                    int i4 = zzicoVar.f19673C;
                    int i5 = i4 - 1;
                    zzicoVar.f19673C = i5;
                    zzicoVar.f19674D[i5] = null;
                    int[] iArr2 = zzicoVar.f19675E;
                    int i6 = i4 - 2;
                    iArr2[i6] = iArr2[i6] + 1;
                    zzicoVar.f19682y = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return zzibrVarM7552c;
                }
                zzibrVarM7552c = (zzibr) arrayDeque.removeLast();
            } else {
                if (zzibrVarM7552c instanceof zzibt) {
                    int iM8074c4 = zzicoVar.f19682y;
                    if (iM8074c4 == 0) {
                        iM8074c4 = zzicoVar.m8074c();
                    }
                    if (iM8074c4 == 14) {
                        strM8079l = zzicoVar.m8080n();
                    } else if (iM8074c4 == 12) {
                        strM8079l = zzicoVar.m8079l('\'');
                    } else {
                        if (iM8074c4 != 13) {
                            throw zzicoVar.m8073A("a name");
                        }
                        strM8079l = zzicoVar.m8079l('\"');
                    }
                    str = strM8079l;
                    zzicoVar.f19682y = 0;
                    zzicoVar.f19674D[zzicoVar.f19673C - 1] = str;
                    if (!zzhlz.m7553a(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int iM8077i2 = zzicoVar.m8077i();
                zzibr zzibrVarM7552c2 = m7552c(zzicoVar, iM8077i2);
                zzibr zzibrVarM7551b = zzibrVarM7552c2 == null ? m7551b(zzicoVar, iM8077i2) : zzibrVarM7552c2;
                if (zzibrVarM7552c instanceof zzibq) {
                    ((zzibq) zzibrVarM7552c).f19621s.add(zzibrVarM7551b);
                } else {
                    zzibt zzibtVar = (zzibt) zzibrVarM7552c;
                    if (zzibtVar.f19623s.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    zzibtVar.f19623s.put(str, zzibrVarM7551b);
                }
                if (zzibrVarM7552c2 != null) {
                    arrayDeque.addLast(zzibrVarM7552c);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zzibrVarM7552c = zzibrVarM7551b;
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final zzibr m7551b(zzico zzicoVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 5) {
            String strM8075e = zzicoVar.m8075e();
            if (zzhlz.m7553a(strM8075e)) {
                return new zzibv(strM8075e);
            }
            throw new IOException("illegal characters in string");
        }
        if (i3 == 6) {
            return new zzibv(new zzhly(zzicoVar.m8075e()));
        }
        boolean z = true;
        if (i3 != 7) {
            if (i3 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(zzicp.m8086a(i2)));
            }
            int iM8074c = zzicoVar.f19682y;
            if (iM8074c == 0) {
                iM8074c = zzicoVar.m8074c();
            }
            if (iM8074c != 7) {
                throw zzicoVar.m8073A("null");
            }
            zzicoVar.f19682y = 0;
            int[] iArr = zzicoVar.f19675E;
            int i4 = zzicoVar.f19673C - 1;
            iArr[i4] = iArr[i4] + 1;
            return zzibs.f19622s;
        }
        int iM8074c2 = zzicoVar.f19682y;
        if (iM8074c2 == 0) {
            iM8074c2 = zzicoVar.m8074c();
        }
        if (iM8074c2 == 5) {
            zzicoVar.f19682y = 0;
            int[] iArr2 = zzicoVar.f19675E;
            int i5 = zzicoVar.f19673C - 1;
            iArr2[i5] = iArr2[i5] + 1;
        } else {
            if (iM8074c2 != 6) {
                throw zzicoVar.m8073A("a boolean");
            }
            zzicoVar.f19682y = 0;
            int[] iArr3 = zzicoVar.f19675E;
            int i6 = zzicoVar.f19673C - 1;
            iArr3[i6] = iArr3[i6] + 1;
            z = false;
        }
        return new zzibv(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c */
    public static final zzibr m7552c(zzico zzicoVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 0) {
            int iM8074c = zzicoVar.f19682y;
            if (iM8074c == 0) {
                iM8074c = zzicoVar.m8074c();
            }
            if (iM8074c != 3) {
                throw zzicoVar.m8073A("BEGIN_ARRAY");
            }
            zzicoVar.m8081o(1);
            zzicoVar.f19675E[zzicoVar.f19673C - 1] = 0;
            zzicoVar.f19682y = 0;
            return new zzibq();
        }
        if (i3 != 2) {
            return null;
        }
        int iM8074c2 = zzicoVar.f19682y;
        if (iM8074c2 == 0) {
            iM8074c2 = zzicoVar.m8074c();
        }
        if (iM8074c2 != 1) {
            throw zzicoVar.m8073A("BEGIN_OBJECT");
        }
        zzicoVar.m8081o(3);
        zzicoVar.f19682y = 0;
        return new zzibt();
    }
}
