package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapk implements zzans {

    /* JADX INFO: renamed from: a */
    public final zzeu f6405a = new zzeu();

    /* JADX INFO: renamed from: b */
    public final zzapb f6406b = new zzapb();

    /* JADX WARN: Code duplicated, block: B:116:0x0210  */
    /* JADX WARN: Code duplicated, block: B:126:0x0233  */
    /* JADX WARN: Code duplicated, block: B:128:0x023f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0248  */
    /* JADX WARN: Code duplicated, block: B:131:0x0251  */
    /* JADX WARN: Code duplicated, block: B:133:0x0259  */
    /* JADX WARN: Code duplicated, block: B:135:0x0261  */
    /* JADX WARN: Code duplicated, block: B:136:0x0264  */
    /* JADX WARN: Code duplicated, block: B:138:0x026c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0274  */
    /* JADX WARN: Code duplicated, block: B:141:0x027c  */
    /* JADX WARN: Code duplicated, block: B:145:0x028c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0293  */
    /* JADX WARN: Code duplicated, block: B:150:0x029b  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02af  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:161:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:165:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:170:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:171:0x031c  */
    /* JADX WARN: Code duplicated, block: B:173:0x032c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0330  */
    /* JADX WARN: Code duplicated, block: B:181:0x033f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0347  */
    /* JADX WARN: Code duplicated, block: B:184:0x0349  */
    /* JADX WARN: Code duplicated, block: B:186:0x0351  */
    /* JADX WARN: Code duplicated, block: B:187:0x0353  */
    /* JADX WARN: Code duplicated, block: B:189:0x0356  */
    /* JADX WARN: Code duplicated, block: B:191:0x0359  */
    /* JADX WARN: Code duplicated, block: B:193:0x035c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0366  */
    /* JADX WARN: Code duplicated, block: B:197:0x036b  */
    /* JADX WARN: Code duplicated, block: B:219:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:239:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c2  */
    @Override // com.google.android.gms.internal.ads.zzans
    /* JADX INFO: renamed from: a */
    public final void mo4246a(byte[] bArr, int i2, int i3, zzdu zzduVar) {
        int i4;
        char c;
        zzapd zzapdVarM4296b;
        String strTrim;
        int i5;
        char c2;
        String string;
        int i6;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b;
        boolean z;
        zzapk zzapkVar = this;
        zzeu zzeuVar = zzapkVar.f6405a;
        zzeuVar.m6397z(i2 + i3, bArr);
        zzeuVar.m6363E(i2);
        ArrayList arrayList = new ArrayList();
        try {
            int i7 = zzeuVar.f14888b;
            Charset charset = StandardCharsets.UTF_8;
            String strM6388n = zzeuVar.m6388n(charset);
            if (strM6388n == null || !strM6388n.startsWith("WEBVTT")) {
                zzeuVar.m6363E(i7);
                throw zzat.m4383a(null, "Expected WEBVTT. Got ".concat(String.valueOf(zzeuVar.m6388n(charset))));
            }
            while (!TextUtils.isEmpty(zzeuVar.m6388n(StandardCharsets.UTF_8))) {
                zzapkVar = this;
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i8 = -1;
                int i9 = 0;
                byte b2 = -1;
                int i10 = 0;
                while (true) {
                    i4 = 1;
                    c = 2;
                    if (b2 != -1) {
                        break;
                    }
                    i10 = zzeuVar.f14888b;
                    String strM6388n2 = zzeuVar.m6388n(StandardCharsets.UTF_8);
                    if (strM6388n2 == null) {
                        b2 = 0;
                    } else if ("STYLE".equals(strM6388n2)) {
                        b2 = 2;
                    } else {
                        b2 = strM6388n2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzeuVar.m6363E(i10);
                if (b2 == 0) {
                    zzanm.m4243a(new zzapn(arrayList2), zzduVar);
                    return;
                }
                if (b2 == 1) {
                    while (!TextUtils.isEmpty(zzeuVar.m6388n(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (b2 != 2) {
                        Pattern pattern = zzapj.f6401a;
                        Charset charset2 = StandardCharsets.UTF_8;
                        String strM6388n3 = zzeuVar.m6388n(charset2);
                        if (strM6388n3 == null) {
                            zzapdVarM4296b = null;
                        } else {
                            Pattern pattern2 = zzapj.f6401a;
                            Matcher matcher2 = pattern2.matcher(strM6388n3);
                            if (matcher2.matches()) {
                                zzapdVarM4296b = zzapj.m4296b(null, matcher2, zzeuVar, arrayList);
                            } else {
                                String strM6388n4 = zzeuVar.m6388n(charset2);
                                if (strM6388n4 != null) {
                                    Matcher matcher3 = pattern2.matcher(strM6388n4);
                                    if (matcher3.matches()) {
                                        zzapdVarM4296b = zzapj.m4296b(strM6388n3.trim(), matcher3, zzeuVar, arrayList);
                                    } else {
                                        zzapdVarM4296b = null;
                                    }
                                } else {
                                    zzapdVarM4296b = null;
                                }
                            }
                        }
                        if (zzapdVarM4296b != null) {
                            arrayList2.add(zzapdVarM4296b);
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        zzeuVar.m6388n(StandardCharsets.UTF_8);
                        zzapb zzapbVar = zzapkVar.f6406b;
                        StringBuilder sb = zzapbVar.f6360b;
                        sb.setLength(0);
                        int i11 = zzeuVar.f14888b;
                        while (!TextUtils.isEmpty(zzeuVar.m6388n(StandardCharsets.UTF_8))) {
                            i9 = 0;
                        }
                        zzeu zzeuVar2 = zzapbVar.f6359a;
                        zzeuVar2.m6397z(zzeuVar.f14888b, zzeuVar.f14887a);
                        zzeuVar2.m6363E(i11);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            zzapb.m4290a(zzeuVar2);
                            if (zzeuVar2.m6360B() >= 5 && "::cue".equals(zzeuVar2.m6385k(5, StandardCharsets.UTF_8))) {
                                int i12 = zzeuVar2.f14888b;
                                String strM4291b = zzapb.m4291b(zzeuVar2, sb);
                                if (strM4291b == null) {
                                    strTrim = null;
                                } else if ("{".equals(strM4291b)) {
                                    zzeuVar2.m6363E(i12);
                                    strTrim = "";
                                } else {
                                    if ("(".equals(strM4291b)) {
                                        int i13 = zzeuVar2.f14888b;
                                        int i14 = zzeuVar2.f14889c;
                                        int i15 = i9;
                                        while (i13 < i14 && i15 == 0) {
                                            int i16 = i13 + 1;
                                            int i17 = ((char) zzeuVar2.f14887a[i13]) == ')' ? i4 : i9;
                                            i13 = i16;
                                            i15 = i17;
                                        }
                                        strTrim = zzeuVar2.m6385k((i13 - 1) - zzeuVar2.f14888b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        strTrim = null;
                                    }
                                    if (!")".equals(zzapb.m4291b(zzeuVar2, sb))) {
                                        strTrim = null;
                                    }
                                }
                            } else {
                                strTrim = null;
                            }
                            if (strTrim == null || !"{".equals(zzapb.m4291b(zzeuVar2, sb))) {
                                break;
                            }
                            zzapc zzapcVar = new zzapc();
                            if (!strTrim.isEmpty()) {
                                int iIndexOf = strTrim.indexOf(91);
                                if (iIndexOf != i8) {
                                    Matcher matcher4 = zzapb.f6357c.matcher(strTrim.substring(iIndexOf));
                                    if (matcher4.matches()) {
                                        String strGroup2 = matcher4.group(i4);
                                        strGroup2.getClass();
                                        zzapcVar.f6364d = strGroup2;
                                    }
                                    strTrim = strTrim.substring(i9, iIndexOf);
                                }
                                String str = zzfm.f16091a;
                                String[] strArrSplit = strTrim.split("\\.", i8);
                                String str2 = strArrSplit[i9];
                                int iIndexOf2 = str2.indexOf(35);
                                if (iIndexOf2 != i8) {
                                    zzapcVar.f6362b = str2.substring(i9, iIndexOf2);
                                    zzapcVar.f6361a = str2.substring(iIndexOf2 + 1);
                                } else {
                                    zzapcVar.f6362b = str2;
                                }
                                int length = strArrSplit.length;
                                if (length > i4) {
                                    zzapcVar.f6363c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i4, length)));
                                }
                            }
                            int i18 = i9;
                            String str3 = null;
                            while (i18 == 0) {
                                int i19 = zzeuVar2.f14888b;
                                String strM4291b2 = zzapb.m4291b(zzeuVar2, sb);
                                int i20 = (strM4291b2 == null || "}".equals(strM4291b2)) ? i4 : i9;
                                if (i20 == 0) {
                                    zzeuVar2.m6363E(i19);
                                    zzapb.m4290a(zzeuVar2);
                                    String strM4292c = zzapb.m4292c(zzeuVar2, sb);
                                    if (!strM4292c.isEmpty() && ":".equals(zzapb.m4291b(zzeuVar2, sb))) {
                                        zzapb.m4290a(zzeuVar2);
                                        StringBuilder sb2 = new StringBuilder();
                                        boolean z2 = false;
                                        while (true) {
                                            if (z2) {
                                                string = sb2.toString();
                                                break;
                                            }
                                            int i21 = zzeuVar2.f14888b;
                                            String strM4291b3 = zzapb.m4291b(zzeuVar2, sb);
                                            if (strM4291b3 == null) {
                                                string = null;
                                                break;
                                            } else if ("}".equals(strM4291b3) || ";".equals(strM4291b3)) {
                                                zzeuVar2.m6363E(i21);
                                                z2 = true;
                                            } else {
                                                sb2.append(strM4291b3);
                                            }
                                        }
                                        if (string == null || string.isEmpty()) {
                                            i5 = 1;
                                            c2 = 2;
                                        } else {
                                            int i22 = zzeuVar2.f14888b;
                                            String strM4291b4 = zzapb.m4291b(zzeuVar2, sb);
                                            if (";".equals(strM4291b4)) {
                                                if (TypedValues.Custom.S_COLOR.equals(strM4292c)) {
                                                    i6 = 1;
                                                    zzapcVar.f6366f = zzds.m6043a(string, true);
                                                    zzapcVar.f6367g = true;
                                                } else {
                                                    i6 = 1;
                                                    if ("background-color".equals(strM4292c)) {
                                                        zzapcVar.f6368h = zzds.m6043a(string, true);
                                                        zzapcVar.f6369i = true;
                                                    } else if ("ruby-position".equals(strM4292c)) {
                                                        if ("text-combine-upright".equals(strM4292c)) {
                                                            if ("all".equals(string)) {
                                                                z = true;
                                                            } else {
                                                                z = true;
                                                            }
                                                            zzapcVar.f6376p = z;
                                                        } else if ("text-decoration".equals(strM4292c)) {
                                                            if ("underline".equals(string)) {
                                                                i6 = 1;
                                                                zzapcVar.f6370j = 1;
                                                            }
                                                            c2 = 2;
                                                        } else if ("font-family".equals(strM4292c)) {
                                                            zzapcVar.f6365e = zzgsz.m7119a(string);
                                                        } else if (!"font-weight".equals(strM4292c)) {
                                                            if ("bold".equals(string)) {
                                                                i6 = 1;
                                                                zzapcVar.f6371k = 1;
                                                            }
                                                            c2 = 2;
                                                        } else {
                                                            i6 = 1;
                                                            if ("font-style".equals(strM4292c)) {
                                                                if ("italic".equals(string)) {
                                                                    zzapcVar.f6372l = 1;
                                                                }
                                                            } else if ("font-size".equals(strM4292c)) {
                                                                matcher = zzapb.f6358d.matcher(zzgsz.m7119a(string));
                                                                if (matcher.matches()) {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    iHashCode = strGroup.hashCode();
                                                                    if (iHashCode != 37) {
                                                                        if (iHashCode != 3240) {
                                                                            if (iHashCode != 3592) {
                                                                                b = -1;
                                                                            } else {
                                                                                b = 0;
                                                                            }
                                                                        } else if (strGroup.equals("em")) {
                                                                            b = 1;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                    } else if (strGroup.equals("%")) {
                                                                        b = 2;
                                                                    } else {
                                                                        b = -1;
                                                                    }
                                                                    if (b != 0) {
                                                                        i5 = 1;
                                                                        if (b != 1) {
                                                                            c2 = 2;
                                                                            if (b == 2) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            zzapcVar.f6373m = 3;
                                                                        } else {
                                                                            c2 = 2;
                                                                            zzapcVar.f6373m = 2;
                                                                        }
                                                                    } else {
                                                                        i5 = 1;
                                                                        c2 = 2;
                                                                        zzapcVar.f6373m = 1;
                                                                    }
                                                                    String strGroup3 = matcher.group(i5);
                                                                    strGroup3.getClass();
                                                                    zzapcVar.f6374n = Float.parseFloat(strGroup3);
                                                                } else {
                                                                    StringBuilder sb3 = new StringBuilder(string.length() + 22);
                                                                    sb3.append("Invalid font-size: '");
                                                                    sb3.append(string);
                                                                    sb3.append("'.");
                                                                    zzeh.m6211c("WebvttCssParser", sb3.toString());
                                                                }
                                                            }
                                                        }
                                                        i5 = 1;
                                                        c2 = 2;
                                                    } else if ("over".equals(string)) {
                                                        zzapcVar.f6375o = 1;
                                                    } else if ("under".equals(string)) {
                                                        zzapcVar.f6375o = 2;
                                                        c2 = 2;
                                                        i5 = 1;
                                                    } else {
                                                        i5 = 1;
                                                        c2 = 2;
                                                    }
                                                }
                                                i5 = i6;
                                                c2 = 2;
                                            } else {
                                                if ("}".equals(strM4291b4)) {
                                                    zzeuVar2.m6363E(i22);
                                                    if (TypedValues.Custom.S_COLOR.equals(strM4292c)) {
                                                        i6 = 1;
                                                        zzapcVar.f6366f = zzds.m6043a(string, true);
                                                        zzapcVar.f6367g = true;
                                                    } else {
                                                        i6 = 1;
                                                        if ("background-color".equals(strM4292c)) {
                                                            zzapcVar.f6368h = zzds.m6043a(string, true);
                                                            zzapcVar.f6369i = true;
                                                        } else if ("ruby-position".equals(strM4292c)) {
                                                            if ("text-combine-upright".equals(strM4292c)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                zzapcVar.f6376p = z;
                                                            } else if ("text-decoration".equals(strM4292c)) {
                                                                if ("underline".equals(string)) {
                                                                    i6 = 1;
                                                                    zzapcVar.f6370j = 1;
                                                                }
                                                            } else if ("font-family".equals(strM4292c)) {
                                                                zzapcVar.f6365e = zzgsz.m7119a(string);
                                                            } else if (!"font-weight".equals(strM4292c)) {
                                                                i6 = 1;
                                                                if ("font-style".equals(strM4292c)) {
                                                                    if ("italic".equals(string)) {
                                                                        zzapcVar.f6372l = 1;
                                                                    }
                                                                } else if ("font-size".equals(strM4292c)) {
                                                                    matcher = zzapb.f6358d.matcher(zzgsz.m7119a(string));
                                                                    if (matcher.matches()) {
                                                                        StringBuilder sb4 = new StringBuilder(string.length() + 22);
                                                                        sb4.append("Invalid font-size: '");
                                                                        sb4.append(string);
                                                                        sb4.append("'.");
                                                                        zzeh.m6211c("WebvttCssParser", sb4.toString());
                                                                    } else {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        iHashCode = strGroup.hashCode();
                                                                        if (iHashCode != 37) {
                                                                            if (iHashCode != 3240) {
                                                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                                                    b = 0;
                                                                                } else {
                                                                                    b = -1;
                                                                                }
                                                                            } else if (strGroup.equals("em")) {
                                                                                b = 1;
                                                                            } else {
                                                                                b = -1;
                                                                            }
                                                                        } else if (strGroup.equals("%")) {
                                                                            b = 2;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        if (b != 0) {
                                                                            i5 = 1;
                                                                            if (b != 1) {
                                                                                c2 = 2;
                                                                                if (b == 2) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                zzapcVar.f6373m = 3;
                                                                            } else {
                                                                                c2 = 2;
                                                                                zzapcVar.f6373m = 2;
                                                                            }
                                                                        } else {
                                                                            i5 = 1;
                                                                            c2 = 2;
                                                                            zzapcVar.f6373m = 1;
                                                                        }
                                                                        String strGroup4 = matcher.group(i5);
                                                                        strGroup4.getClass();
                                                                        zzapcVar.f6374n = Float.parseFloat(strGroup4);
                                                                    }
                                                                }
                                                            } else if ("bold".equals(string)) {
                                                                i6 = 1;
                                                                zzapcVar.f6371k = 1;
                                                            }
                                                            i5 = 1;
                                                        } else if ("over".equals(string)) {
                                                            zzapcVar.f6375o = 1;
                                                        } else if ("under".equals(string)) {
                                                            zzapcVar.f6375o = 2;
                                                            c2 = 2;
                                                            i5 = 1;
                                                        } else {
                                                            i5 = 1;
                                                        }
                                                    }
                                                    i5 = i6;
                                                } else {
                                                    i5 = 1;
                                                }
                                                c2 = 2;
                                            }
                                        }
                                    } else {
                                        i5 = i4;
                                        c2 = c;
                                    }
                                } else {
                                    i5 = i4;
                                    c2 = c;
                                }
                                c = c2;
                                str3 = strM4291b2;
                                i18 = i20;
                                i4 = i5;
                                i9 = 0;
                            }
                            int i23 = i4;
                            char c3 = c;
                            if ("}".equals(str3)) {
                                arrayList3.add(zzapcVar);
                            }
                            c = c3;
                            i8 = -1;
                            i4 = i23;
                            i9 = 0;
                        }
                        arrayList.addAll(arrayList3);
                    }
                    zzapkVar = this;
                }
            }
        } catch (zzat e) {
            throw new IllegalArgumentException(e);
        }
    }
}
