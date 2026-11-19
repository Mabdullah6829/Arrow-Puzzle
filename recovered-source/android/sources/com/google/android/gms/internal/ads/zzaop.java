package com.google.android.gms.internal.ads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzaop {

    /* JADX INFO: renamed from: a */
    public final String f6269a;

    /* JADX INFO: renamed from: b */
    public final String f6270b;

    /* JADX INFO: renamed from: c */
    public final boolean f6271c;

    /* JADX INFO: renamed from: d */
    public final long f6272d;

    /* JADX INFO: renamed from: e */
    public final long f6273e;

    /* JADX INFO: renamed from: f */
    public final zzaov f6274f;

    /* JADX INFO: renamed from: g */
    public final String[] f6275g;

    /* JADX INFO: renamed from: h */
    public final String f6276h;

    /* JADX INFO: renamed from: i */
    public final String f6277i;

    /* JADX INFO: renamed from: j */
    public final zzaop f6278j;

    /* JADX INFO: renamed from: k */
    public final HashMap f6279k;

    /* JADX INFO: renamed from: l */
    public final HashMap f6280l;

    /* JADX INFO: renamed from: m */
    public ArrayList f6281m;

    public zzaop(String str, String str2, long j2, long j3, zzaov zzaovVar, String[] strArr, String str3, String str4, zzaop zzaopVar) {
        this.f6269a = str;
        this.f6270b = str2;
        this.f6277i = str4;
        this.f6274f = zzaovVar;
        this.f6275g = strArr;
        this.f6271c = str2 != null;
        this.f6272d = j2;
        this.f6273e = j3;
        str3.getClass();
        this.f6276h = str3;
        this.f6278j = zzaopVar;
        this.f6279k = new HashMap();
        this.f6280l = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static zzaop m4262a(String str) {
        return new zzaop(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: b */
    public static zzaop m4263b(String str, long j2, long j3, zzaov zzaovVar, String[] strArr, String str2, String str3, zzaop zzaopVar) {
        return new zzaop(str, null, j2, j3, zzaovVar, strArr, str2, str3, zzaopVar);
    }

    /* JADX INFO: renamed from: i */
    public static SpannableStringBuilder m4264i(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            zzcx zzcxVar = new zzcx();
            zzcxVar.m5859a(new SpannableStringBuilder());
            treeMap.put(str, zzcxVar);
        }
        CharSequence charSequence = ((zzcx) treeMap.get(str)).f11649a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4265c(long j2) {
        long j3 = this.f6272d;
        long j4 = this.f6273e;
        if (j3 == -9223372036854775807L) {
            if (j4 == -9223372036854775807L) {
                return true;
            }
            j3 = -9223372036854775807L;
        }
        if (j3 <= j2 && j4 == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j2 >= j4) {
            return j3 <= j2 && j2 < j4;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final zzaop m4266d(int i2) {
        ArrayList arrayList = this.f6281m;
        if (arrayList != null) {
            return (zzaop) arrayList.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: e */
    public final int m4267e() {
        ArrayList arrayList = this.f6281m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: f */
    public final void m4268f(TreeSet treeSet, boolean z) {
        String str = this.f6269a;
        boolean zEquals = "p".equals(str);
        if (z || zEquals || ("div".equals(str) && this.f6277i != null)) {
            long j2 = this.f6272d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.f6273e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f6281m != null) {
            for (int i2 = 0; i2 < this.f6281m.size(); i2++) {
                zzaop zzaopVar = (zzaop) this.f6281m.get(i2);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                zzaopVar.m4268f(treeSet, z2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4269g(long j2, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f6276h;
        boolean zEquals = "".equals(str3);
        boolean zM4265c = m4265c(j2);
        if (true != zEquals) {
            str = str3;
        }
        if (zM4265c && "div".equals(this.f6269a) && (str2 = this.f6277i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i2 = 0; i2 < m4267e(); i2++) {
            m4266d(i2).m4269g(j2, str, arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4270h(long j2, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.f6279k;
        map.clear();
        HashMap map2 = this.f6280l;
        map2.clear();
        String str2 = this.f6269a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f6276h;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.f6271c && z) {
            SpannableStringBuilder spannableStringBuilderM4264i = m4264i(str4, treeMap);
            String str5 = this.f6270b;
            str5.getClass();
            spannableStringBuilderM4264i.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m4264i(str4, treeMap).append('\n');
            return;
        }
        if (m4265c(j2)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((zzcx) entry.getValue()).f11649a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i2 = 0; i2 < m4267e(); i2++) {
                m4266d(i2).m4270h(j2, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM4264i2 = m4264i(str4, treeMap);
                int length = spannableStringBuilderM4264i2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderM4264i2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderM4264i2.charAt(length) != '\n') {
                    spannableStringBuilderM4264i2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((zzcx) entry2.getValue()).f11649a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x020f  */
    /* JADX WARN: Code duplicated, block: B:142:0x021d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0220  */
    /* JADX WARN: Code duplicated, block: B:146:0x0223  */
    /* JADX WARN: Code duplicated, block: B:148:0x022a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0238  */
    /* JADX WARN: Code duplicated, block: B:162:0x026a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0284  */
    /* JADX WARN: Code duplicated, block: B:166:0x0293  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX INFO: renamed from: j */
    public final void m4271j(long j2, Map map, HashMap map2, String str, TreeMap treeMap) {
        int i2;
        zzaop zzaopVar;
        int i3;
        int i4;
        int i5;
        zzaov zzaovVarM4277a;
        int i6;
        float f2;
        Iterator it;
        float f3;
        int i7;
        float f4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        float sizeChange;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        RelativeSizeSpan relativeSizeSpan;
        float f5;
        int i8;
        int i9;
        int i10;
        int i11;
        Map map3 = map;
        if (m4265c(j2)) {
            String str2 = this.f6276h;
            int i12 = 1;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it2 = this.f6280l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f6279k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcx zzcxVar = (zzcx) treeMap.get(str4);
                    zzcxVar.getClass();
                    zzaot zzaotVar = (zzaot) map2.get(str3);
                    zzaotVar.getClass();
                    int i13 = zzaotVar.f6305j;
                    zzaov zzaovVarM4277a2 = zzaou.m4277a(this.f6274f, this.f6275g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcxVar.f11649a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcxVar.m5859a(spannableStringBuilder);
                    }
                    if (zzaovVarM4277a2 != null) {
                        int i14 = zzaovVarM4277a2.f6313h;
                        int i15 = -1;
                        if (((i14 == -1 && zzaovVarM4277a2.f6314i == -1) ? -1 : (i14 == i12 ? i12 : 0) | (zzaovVarM4277a2.f6314i == i12 ? 2 : 0)) != -1) {
                            int i16 = zzaovVarM4277a2.f6313h;
                            if (i16 != -1) {
                                if (i16 == i12) {
                                    i9 = i12;
                                } else {
                                    i9 = 0;
                                }
                                if (zzaovVarM4277a2.f6314i == i12) {
                                    i10 = 2;
                                } else {
                                    i10 = 0;
                                }
                                i11 = i9 | i10;
                            } else if (zzaovVarM4277a2.f6314i == -1) {
                                i11 = -1;
                                i12 = 1;
                            } else {
                                i12 = 1;
                                if (i16 == i12) {
                                    i9 = i12;
                                } else {
                                    i9 = 0;
                                }
                                if (zzaovVarM4277a2.f6314i == i12) {
                                    i10 = 2;
                                } else {
                                    i10 = 0;
                                }
                                i11 = i9 | i10;
                            }
                            StyleSpan styleSpan = new StyleSpan(i11);
                            i2 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i2 = 33;
                        }
                        if (zzaovVarM4277a2.f6311f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i2);
                        }
                        if (zzaovVarM4277a2.f6312g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i2);
                        }
                        if (zzaovVarM4277a2.f6308c) {
                            if (!zzaovVarM4277a2.f6308c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            zzde.m5906a(spannableStringBuilder, new ForegroundColorSpan(zzaovVarM4277a2.f6307b), iIntValue, iIntValue2);
                        }
                        if (zzaovVarM4277a2.f6310e) {
                            if (!zzaovVarM4277a2.f6310e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            zzde.m5906a(spannableStringBuilder, new BackgroundColorSpan(zzaovVarM4277a2.f6309d), iIntValue, iIntValue2);
                        }
                        if (zzaovVarM4277a2.f6306a != null) {
                            zzde.m5906a(spannableStringBuilder, new TypefaceSpan(zzaovVarM4277a2.f6306a), iIntValue, iIntValue2);
                        }
                        zzaoo zzaooVar = zzaovVarM4277a2.f6323r;
                        if (zzaooVar != null) {
                            int i17 = zzaooVar.f6266a;
                            if (i17 == -1) {
                                i17 = (i13 == 2 || i13 == 1) ? 3 : 1;
                                i8 = 1;
                            } else {
                                i8 = zzaooVar.f6267b;
                            }
                            int i18 = zzaooVar.f6268c;
                            if (i18 == -2) {
                                i18 = 1;
                            }
                            zzde.m5906a(spannableStringBuilder, new zzdf(i17, i8, i18), iIntValue, iIntValue2);
                        } else {
                            i15 = -1;
                        }
                        int i19 = zzaovVarM4277a2.f6318m;
                        if (i19 == 2) {
                            zzaop zzaopVar2 = this.f6278j;
                            while (true) {
                                if (zzaopVar2 == null) {
                                    zzaopVar2 = null;
                                    break;
                                }
                                zzaov zzaovVarM4277a3 = zzaou.m4277a(zzaopVar2.f6274f, zzaopVar2.f6275g, map3);
                                if (zzaovVarM4277a3 != null && zzaovVarM4277a3.f6318m == 1) {
                                    break;
                                } else {
                                    zzaopVar2 = zzaopVar2.f6278j;
                                }
                            }
                            if (zzaopVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzaopVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzaopVar = null;
                                        break;
                                    }
                                    zzaop zzaopVar3 = (zzaop) arrayDeque.pop();
                                    zzaov zzaovVarM4277a4 = zzaou.m4277a(zzaopVar3.f6274f, zzaopVar3.f6275g, map3);
                                    if (zzaovVarM4277a4 != null && zzaovVarM4277a4.f6318m == 3) {
                                        zzaopVar = zzaopVar3;
                                        break;
                                    }
                                    for (int iM4267e = zzaopVar3.m4267e() - 1; iM4267e >= 0; iM4267e--) {
                                        arrayDeque.push(zzaopVar3.m4266d(iM4267e));
                                    }
                                }
                                if (zzaopVar != null) {
                                    if (zzaopVar.m4267e() == 1) {
                                        i3 = 0;
                                        if (zzaopVar.m4266d(0).f6270b != null) {
                                            String str5 = zzaopVar.m4266d(0).f6270b;
                                            String str6 = zzfm.f16091a;
                                            zzaov zzaovVarM4277a5 = zzaou.m4277a(zzaopVar.f6274f, zzaopVar.f6275g, map3);
                                            if (zzaovVarM4277a5 != null) {
                                                i4 = zzaovVarM4277a5.f6319n;
                                                i5 = i15;
                                            } else {
                                                i4 = i15;
                                                i5 = i4;
                                            }
                                            if (i4 == i5 && (zzaovVarM4277a = zzaou.m4277a(zzaopVar2.f6274f, zzaopVar2.f6275g, map3)) != null) {
                                                i4 = zzaovVarM4277a.f6319n;
                                            }
                                            spannableStringBuilder.setSpan(new zzdd(str5, i4), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i3 = 0;
                                    }
                                    zzeh.m6210b("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (zzaovVarM4277a2.f6322q == 1) {
                                zzde.m5906a(spannableStringBuilder, new zzdc(), iIntValue, iIntValue2);
                            }
                            i6 = zzaovVarM4277a2.f6315j;
                            f2 = 100.0f;
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    it = it2;
                                    f3 = 100.0f;
                                    zzde.m5906a(spannableStringBuilder, new RelativeSizeSpan(zzaovVarM4277a2.f6316k), iIntValue, iIntValue2);
                                } else if (i6 != 3) {
                                    it = it2;
                                    f3 = 100.0f;
                                } else {
                                    sizeChange = zzaovVarM4277a2.f6316k / 100.0f;
                                    relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                    length = relativeSizeSpanArr.length;
                                    while (i3 < length) {
                                        float f6 = f2;
                                        relativeSizeSpan = relativeSizeSpanArr[i3];
                                        Iterator it3 = it2;
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                            sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                        }
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                            f5 = sizeChange;
                                        } else {
                                            f5 = sizeChange;
                                            if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                spannableStringBuilder.removeSpan(relativeSizeSpan);
                                            }
                                        }
                                        i3++;
                                        f2 = f6;
                                        it2 = it3;
                                        sizeChange = f5;
                                    }
                                    it = it2;
                                    f3 = f2;
                                    spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                                }
                                i7 = 1;
                            } else {
                                it = it2;
                                f3 = 100.0f;
                                i7 = 1;
                                zzde.m5906a(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaovVarM4277a2.f6316k, true), iIntValue, iIntValue2);
                            }
                            if ("p".equals(this.f6269a)) {
                                f4 = zzaovVarM4277a2.f6324s;
                                if (f4 != Float.MAX_VALUE) {
                                    zzcxVar.f11663o = (f4 * (-90.0f)) / f3;
                                }
                                alignment = zzaovVarM4277a2.f6320o;
                                if (alignment != null) {
                                    zzcxVar.f11651c = alignment;
                                }
                                alignment2 = zzaovVarM4277a2.f6321p;
                                if (alignment2 != null) {
                                    zzcxVar.f11652d = alignment2;
                                }
                            }
                            i12 = i7;
                            it2 = it;
                        } else if (i19 == 3 || i19 == 4) {
                            spannableStringBuilder.setSpan(new zzaon(), iIntValue, iIntValue2, 33);
                        }
                        i3 = 0;
                        if (zzaovVarM4277a2.f6322q == 1) {
                            zzde.m5906a(spannableStringBuilder, new zzdc(), iIntValue, iIntValue2);
                        }
                        i6 = zzaovVarM4277a2.f6315j;
                        f2 = 100.0f;
                        if (i6 != 1) {
                            if (i6 != 2) {
                                it = it2;
                                f3 = 100.0f;
                                zzde.m5906a(spannableStringBuilder, new RelativeSizeSpan(zzaovVarM4277a2.f6316k), iIntValue, iIntValue2);
                            } else if (i6 != 3) {
                                it = it2;
                                f3 = 100.0f;
                            } else {
                                sizeChange = zzaovVarM4277a2.f6316k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                while (i3 < length) {
                                    float f7 = f2;
                                    relativeSizeSpan = relativeSizeSpanArr[i3];
                                    Iterator it4 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                        f5 = sizeChange;
                                    } else {
                                        f5 = sizeChange;
                                    }
                                    i3++;
                                    f2 = f7;
                                    it2 = it4;
                                    sizeChange = f5;
                                }
                                it = it2;
                                f3 = f2;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            i7 = 1;
                        } else {
                            it = it2;
                            f3 = 100.0f;
                            i7 = 1;
                            zzde.m5906a(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaovVarM4277a2.f6316k, true), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.f6269a)) {
                            f4 = zzaovVarM4277a2.f6324s;
                            if (f4 != Float.MAX_VALUE) {
                                zzcxVar.f11663o = (f4 * (-90.0f)) / f3;
                            }
                            alignment = zzaovVarM4277a2.f6320o;
                            if (alignment != null) {
                                zzcxVar.f11651c = alignment;
                            }
                            alignment2 = zzaovVarM4277a2.f6321p;
                            if (alignment2 != null) {
                                zzcxVar.f11652d = alignment2;
                            }
                        }
                        i12 = i7;
                        it2 = it;
                    } else {
                        continue;
                    }
                }
            }
            int i20 = 0;
            while (i20 < m4267e()) {
                m4266d(i20).m4271j(j2, map3, map2, str3, treeMap);
                i20++;
                map3 = map;
            }
        }
    }
}
