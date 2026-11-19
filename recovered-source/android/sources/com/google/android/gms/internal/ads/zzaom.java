package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.firebase.firestore.util.ExponentialBackoff;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaom implements zzans {

    /* JADX INFO: renamed from: d */
    public static final Pattern f6256d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e */
    public static final Pattern f6257e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a */
    public final StringBuilder f6258a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final ArrayList f6259b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final zzeu f6260c = new zzeu();

    /* JADX INFO: renamed from: b */
    public static long m4261b(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j2 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i2 + 2);
        strGroup2.getClass();
        long j3 = (Long.parseLong(strGroup2) * ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS) + j2;
        String strGroup3 = matcher.group(i2 + 3);
        strGroup3.getClass();
        long j4 = (Long.parseLong(strGroup3) * 1000) + j3;
        String strGroup4 = matcher.group(i2 + 4);
        if (strGroup4 != null) {
            j4 += Long.parseLong(strGroup4);
        }
        return j4 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:115:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:121:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0185  */
    @Override // com.google.android.gms.internal.ads.zzans
    /* JADX INFO: renamed from: a */
    public final void mo4246a(byte[] bArr, int i2, int i3, zzdu zzduVar) {
        String str;
        byte b;
        byte b2;
        int i4;
        int i5;
        float f2;
        float f3;
        int i6;
        zzcy zzcyVarM5860b;
        zzaom zzaomVar = this;
        zzeu zzeuVar = zzaomVar.f6260c;
        zzeuVar.m6397z(i2 + i3, bArr);
        zzeuVar.m6363E(i2);
        Charset charsetM6391q = zzeuVar.m6391q();
        if (charsetM6391q == null) {
            charsetM6391q = StandardCharsets.UTF_8;
        }
        while (true) {
            String strM6388n = zzeuVar.m6388n(charsetM6391q);
            if (strM6388n == null) {
                return;
            }
            if (strM6388n.isEmpty()) {
                charsetM6391q = charsetM6391q;
            } else {
                try {
                    Integer.parseInt(strM6388n);
                    String strM6388n2 = zzeuVar.m6388n(charsetM6391q);
                    if (strM6388n2 == null) {
                        zzeh.m6211c("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f6256d.matcher(strM6388n2);
                    if (matcher.matches()) {
                        long jM4261b = m4261b(matcher, 1);
                        long jM4261b2 = m4261b(matcher, 6);
                        StringBuilder sb = zzaomVar.f6258a;
                        int i7 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = zzaomVar.f6259b;
                        arrayList.clear();
                        String strM6388n3 = zzeuVar.m6388n(charsetM6391q);
                        while (!TextUtils.isEmpty(strM6388n3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strM6388n3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f6257e.matcher(strTrim);
                            int i8 = i7;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i8;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i8 += length;
                            }
                            sb.append(sb2.toString());
                            strM6388n3 = zzeuVar.m6388n(charsetM6391q);
                            i7 = 0;
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i9 = 0;
                        while (true) {
                            if (i9 < arrayList.size()) {
                                str = (String) arrayList.get(i9);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i9++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcx zzcxVar = new zzcx();
                        zzcxVar.m5859a(spannedFromHtml);
                        if (str == null) {
                            zzcyVarM5860b = zzcxVar.m5860b();
                        } else {
                            switch (str) {
                                case "{\an1}":
                                    b = 0;
                                    break;
                                case "{\an3}":
                                    b = 3;
                                    break;
                                case "{\an4}":
                                    b = 1;
                                    break;
                                case "{\an6}":
                                    b = 4;
                                    break;
                                case "{\an7}":
                                    b = 2;
                                    break;
                                case "{\an9}":
                                    b = 5;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0 || b == 1 || b == 2) {
                                zzcxVar.f11657i = 0;
                            } else if (b == 3 || b == 4 || b == 5) {
                                zzcxVar.f11657i = 2;
                            } else {
                                zzcxVar.f11657i = 1;
                            }
                            switch (str) {
                                case "{\an1}":
                                    b2 = 0;
                                    break;
                                case "{\an2}":
                                    b2 = 1;
                                    break;
                                case "{\an3}":
                                    b2 = 2;
                                    break;
                                case "{\an7}":
                                    b2 = 3;
                                    break;
                                case "{\an8}":
                                    b2 = 4;
                                    break;
                                case "{\an9}":
                                    b2 = 5;
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            if (b2 == 0 || b2 == 1) {
                                i4 = 2;
                            } else {
                                if (b2 != 2) {
                                    if (b2 == 3 || b2 == 4 || b2 == 5) {
                                        zzcxVar.f11655g = 0;
                                    } else {
                                        zzcxVar.f11655g = 1;
                                    }
                                    i4 = 2;
                                } else {
                                    i4 = 2;
                                }
                                i5 = zzcxVar.f11657i;
                                f2 = 0.08f;
                                if (i5 != 0) {
                                    f3 = 0.08f;
                                } else if (i5 != 1) {
                                    f3 = 0.5f;
                                } else {
                                    if (i5 == i4) {
                                        throw new IllegalArgumentException();
                                    }
                                    f3 = 0.92f;
                                }
                                zzcxVar.f11656h = f3;
                                i6 = zzcxVar.f11655g;
                                if (i6 != 0) {
                                    if (i6 != 1) {
                                        f2 = 0.5f;
                                    } else {
                                        if (i6 == i4) {
                                            throw new IllegalArgumentException();
                                        }
                                        f2 = 0.92f;
                                    }
                                }
                                zzcxVar.f11653e = f2;
                                zzcxVar.f11654f = 0;
                                zzcyVarM5860b = zzcxVar.m5860b();
                            }
                            zzcxVar.f11655g = i4;
                            i5 = zzcxVar.f11657i;
                            f2 = 0.08f;
                            if (i5 != 0) {
                                f3 = 0.08f;
                            } else if (i5 != 1) {
                                f3 = 0.5f;
                            } else {
                                if (i5 == i4) {
                                    throw new IllegalArgumentException();
                                }
                                f3 = 0.92f;
                            }
                            zzcxVar.f11656h = f3;
                            i6 = zzcxVar.f11655g;
                            if (i6 != 0) {
                                if (i6 != 1) {
                                    f2 = 0.5f;
                                } else {
                                    if (i6 == i4) {
                                        throw new IllegalArgumentException();
                                    }
                                    f2 = 0.92f;
                                }
                            }
                            zzcxVar.f11653e = f2;
                            zzcxVar.f11654f = 0;
                            zzcyVarM5860b = zzcxVar.m5860b();
                        }
                        ((zzanu) zzduVar).mo3942b(new zzank(zzgwt.m7216n(zzcyVarM5860b), jM4261b, jM4261b2 - jM4261b));
                    } else {
                        charsetM6391q = charsetM6391q;
                        zzeh.m6211c("SubripParser", "Skipping invalid timing: ".concat(strM6388n2));
                    }
                } catch (NumberFormatException unused) {
                    charsetM6391q = charsetM6391q;
                    zzeh.m6211c("SubripParser", "Skipping invalid index: ".concat(strM6388n));
                }
            }
            zzaomVar = this;
            charsetM6391q = charsetM6391q;
        }
    }
}
