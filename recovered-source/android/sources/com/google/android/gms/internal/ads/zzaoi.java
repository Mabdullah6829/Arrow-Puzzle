package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.work.WorkRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaoi implements zzans {

    /* JADX INFO: renamed from: g */
    public static final Pattern f6224g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a */
    public final boolean f6225a;

    /* JADX INFO: renamed from: b */
    public final zzaoh f6226b;

    /* JADX INFO: renamed from: c */
    public final zzeu f6227c;

    /* JADX INFO: renamed from: d */
    public LinkedHashMap f6228d;

    /* JADX INFO: renamed from: e */
    public float f6229e;

    /* JADX INFO: renamed from: f */
    public float f6230f;

    public zzaoi() {
        this(null);
    }

    /* JADX INFO: renamed from: c */
    public static long m4256c(String str) {
        Matcher matcher = f6224g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzfm.f16091a;
        long j2 = Long.parseLong(strGroup) * 3600000000L;
        long j3 = Long.parseLong(matcher.group(2)) * 60000000;
        return j2 + j3 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX INFO: renamed from: d */
    public static int m4257d(long j2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j2) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j2) {
                i2 = size + 1;
                break;
            }
        }
        arrayList.add(i2, Long.valueOf(j2));
        arrayList2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i2 - 1)));
        return i2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:198:0x0193
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // com.google.android.gms.internal.ads.zzans
    /* JADX INFO: renamed from: a */
    public final void mo4246a(byte[] r29, int r30, int r31, com.google.android.gms.internal.ads.zzdu r32) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoi.mo4246a(byte[], int, int, com.google.android.gms.internal.ads.zzdu):void");
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0301  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final void m4258b(zzeu zzeuVar, Charset charset) {
        byte b;
        int i2;
        int i3;
        float f2;
        int i4;
        zzaol zzaolVar;
        int i5;
        while (true) {
            String strM6388n = zzeuVar.m6388n(charset);
            if (strM6388n == null) {
                return;
            }
            int i6 = 2;
            int i7 = 91;
            int i8 = 0;
            if ("[Script Info]".equalsIgnoreCase(strM6388n)) {
                while (true) {
                    String strM6388n2 = zzeuVar.m6388n(charset);
                    if (strM6388n2 == null) {
                        break;
                    }
                    if (zzeuVar.m6360B() != 0) {
                        int iM6394t = zzeuVar.m6394t(charset);
                        if ((iM6394t != 0 ? zzhaq.m7304a(iM6394t >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strM6388n2.split(":");
                    if (strArrSplit.length == 2) {
                        switch (zzgsz.m7119a(strArrSplit[0].trim())) {
                            case "playresx":
                                b = 0;
                                break;
                            case "playresy":
                                b = 1;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 0) {
                            this.f6229e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (b == 1) {
                            try {
                                this.f6230f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM6388n)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    zzaoj zzaojVar = null;
                    while (true) {
                        String strM6388n3 = zzeuVar.m6388n(charset);
                        if (strM6388n3 != null) {
                            if (zzeuVar.m6360B() != 0) {
                                int iM6394t2 = zzeuVar.m6394t(charset);
                                if ((iM6394t2 != 0 ? zzhaq.m7304a(iM6394t2 >>> 8) : 1114112) == i7) {
                                }
                            }
                            if (strM6388n3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strM6388n3.substring(7), ",");
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = i8;
                                while (true) {
                                    int length = strArrSplit2.length;
                                    if (i19 < length) {
                                        String strM7119a = zzgsz.m7119a(strArrSplit2[i19].trim());
                                        switch (strM7119a.hashCode()) {
                                            case -1178781136:
                                                i2 = !strM7119a.equals("italic") ? -1 : 6;
                                                break;
                                            case -1026963764:
                                                i2 = !strM7119a.equals("underline") ? -1 : 7;
                                                break;
                                            case -192095652:
                                                i2 = !strM7119a.equals("strikeout") ? -1 : 8;
                                                break;
                                            case -70925746:
                                                i2 = !strM7119a.equals("primarycolour") ? -1 : i6;
                                                break;
                                            case 3029637:
                                                i2 = !strM7119a.equals("bold") ? -1 : 5;
                                                break;
                                            case 3373707:
                                                i2 = !strM7119a.equals(AppMeasurementSdk.ConditionalUserProperty.NAME) ? -1 : i8;
                                                break;
                                            case 366554320:
                                                i2 = !strM7119a.equals("fontsize") ? -1 : 4;
                                                break;
                                            case 767321349:
                                                i2 = !strM7119a.equals("borderstyle") ? -1 : 9;
                                                break;
                                            case 1767875043:
                                                i2 = !strM7119a.equals("alignment") ? -1 : 1;
                                                break;
                                            case 1988365454:
                                                i2 = !strM7119a.equals("outlinecolour") ? -1 : 3;
                                                break;
                                            default:
                                                i2 = -1;
                                                break;
                                        }
                                        switch (i2) {
                                            case 0:
                                                i9 = i19;
                                                break;
                                            case 1:
                                                i10 = i19;
                                                break;
                                            case 2:
                                                i11 = i19;
                                                break;
                                            case 3:
                                                i12 = i19;
                                                break;
                                            case 4:
                                                i13 = i19;
                                                break;
                                            case 5:
                                                i14 = i19;
                                                break;
                                            case 6:
                                                i15 = i19;
                                                break;
                                            case 7:
                                                i16 = i19;
                                                break;
                                            case 8:
                                                i17 = i19;
                                                break;
                                            case 9:
                                                i18 = i19;
                                                break;
                                        }
                                        i19++;
                                    } else if (i9 != -1) {
                                        zzaojVar = new zzaoj(i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, length);
                                    }
                                }
                            } else {
                                if (strM6388n3.startsWith("Style:")) {
                                    if (zzaojVar == null) {
                                        zzeh.m6211c("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strM6388n3));
                                    } else {
                                        zzgtr.m7128a(strM6388n3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strM6388n3.substring(6), ",");
                                        int length2 = strArrSplit3.length;
                                        int i20 = zzaojVar.f6241k;
                                        if (length2 != i20) {
                                            String str = zzfm.f16091a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbM409q = AbstractC0271e0.m409q("Skipping malformed 'Style:' line (expected ", i20, " values, found ", length2, "): '");
                                            sbM409q.append(strM6388n3);
                                            sbM409q.append("'");
                                            zzeh.m6211c("SsaStyle", sbM409q.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[zzaojVar.f6231a].trim();
                                                int i21 = zzaojVar.f6232b;
                                                if (i21 != -1) {
                                                    String strTrim2 = strArrSplit3[i21].trim();
                                                    try {
                                                        i5 = Integer.parseInt(strTrim2.trim());
                                                        switch (i5) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                break;
                                                            default:
                                                                zzeh.m6211c("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(strTrim2)));
                                                                i5 = -1;
                                                                break;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    i3 = -1;
                                                }
                                                int i22 = zzaojVar.f6233c;
                                                Integer numM4259a = i22 != -1 ? zzaol.m4259a(strArrSplit3[i22].trim()) : null;
                                                int i23 = zzaojVar.f6234d;
                                                Integer numM4259a2 = i23 != -1 ? zzaol.m4259a(strArrSplit3[i23].trim()) : null;
                                                int i24 = zzaojVar.f6235e;
                                                if (i24 != -1) {
                                                    String strTrim3 = strArrSplit3[i24].trim();
                                                    try {
                                                        f2 = Float.parseFloat(strTrim3);
                                                    } catch (NumberFormatException e) {
                                                        StringBuilder sb = new StringBuilder(String.valueOf(strTrim3).length() + 29);
                                                        sb.append("Failed to parse font size: '");
                                                        sb.append(strTrim3);
                                                        sb.append("'");
                                                        zzeh.m6212d("SsaStyle", sb.toString(), e);
                                                        f2 = -3.4028235E38f;
                                                    }
                                                } else {
                                                    f2 = -3.4028235E38f;
                                                }
                                                int i25 = zzaojVar.f6236f;
                                                boolean z = i25 != -1 && zzaol.m4260b(strArrSplit3[i25].trim());
                                                int i26 = zzaojVar.f6237g;
                                                boolean z2 = i26 != -1 && zzaol.m4260b(strArrSplit3[i26].trim());
                                                int i27 = zzaojVar.f6238h;
                                                boolean z3 = i27 != -1 && zzaol.m4260b(strArrSplit3[i27].trim());
                                                int i28 = zzaojVar.f6239i;
                                                boolean z4 = i28 != -1 && zzaol.m4260b(strArrSplit3[i28].trim());
                                                int i29 = zzaojVar.f6240j;
                                                if (i29 != -1) {
                                                    String strTrim4 = strArrSplit3[i29].trim();
                                                    try {
                                                        int i30 = Integer.parseInt(strTrim4.trim());
                                                        if (i30 == 1 || i30 == 3) {
                                                            i4 = i30;
                                                        } else {
                                                            zzeh.m6211c("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim4)));
                                                            i4 = -1;
                                                        }
                                                    } catch (NumberFormatException unused3) {
                                                    }
                                                } else {
                                                    i4 = -1;
                                                }
                                                zzaolVar = new zzaol(strTrim, i3, numM4259a, numM4259a2, f2, z, z2, z3, z4, i4);
                                            } catch (RuntimeException e2) {
                                                zzeh.m6212d("SsaStyle", AbstractC1456a.m2450q(new StringBuilder(strM6388n3.length() + 36), "Skipping malformed 'Style:' line: '", strM6388n3, "'"), e2);
                                                zzaolVar = null;
                                            }
                                            if (zzaolVar != null) {
                                                linkedHashMap.put(zzaolVar.f6246a, zzaolVar);
                                            }
                                        }
                                        zzaolVar = null;
                                        if (zzaolVar != null) {
                                            linkedHashMap.put(zzaolVar.f6246a, zzaolVar);
                                        }
                                    }
                                }
                                i6 = 2;
                                i7 = 91;
                                i8 = 0;
                            }
                        }
                    }
                }
                this.f6228d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM6388n)) {
                zzeh.m6210b("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM6388n)) {
                return;
            }
        }
    }

    public zzaoi(List list) {
        this.f6229e = -3.4028235E38f;
        this.f6230f = -3.4028235E38f;
        this.f6227c = new zzeu();
        if (list == null || list.isEmpty()) {
            this.f6225a = false;
            this.f6226b = null;
            return;
        }
        this.f6225a = true;
        byte[] bArr = (byte[]) list.get(0);
        String str = zzfm.f16091a;
        Charset charset = StandardCharsets.UTF_8;
        String str2 = new String(bArr, charset);
        zzgtr.m7128a(str2.startsWith("Format:"));
        zzaoh zzaohVarM4255a = zzaoh.m4255a(str2);
        zzaohVarM4255a.getClass();
        this.f6226b = zzaohVarM4255a;
        m4258b(new zzeu((byte[]) list.get(1)), charset);
    }
}
