package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzae implements Iterable, zzao, zzak {

    /* JADX INFO: renamed from: s */
    public final TreeMap f22036s;

    /* JADX INFO: renamed from: t */
    public final TreeMap f22037t;

    public zzae() {
        this.f22036s = new TreeMap();
        this.f22037t = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: a */
    public final Boolean mo9579a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: b */
    public final Iterator mo9580b() {
        return new zzac(this, this.f22036s.keySet().iterator(), this.f22037t.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: d */
    public final Double mo9581d() {
        TreeMap treeMap = this.f22036s;
        if (treeMap.size() == 1) {
            return m9590t(0).mo9581d();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (m9589s() != zzaeVar.m9589s()) {
            return false;
        }
        TreeMap treeMap = this.f22036s;
        if (treeMap.isEmpty()) {
            return zzaeVar.f22036s.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m9590t(iIntValue).equals(zzaeVar.m9590t(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    /* JADX INFO: renamed from: g */
    public final zzao mo9582g(String str) {
        zzao zzaoVar;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf(m9589s()));
        }
        return (!mo9585m(str) || (zzaoVar = (zzao) this.f22037t.get(str)) == null) ? zzao.f22237k : zzaoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    /* JADX INFO: renamed from: h */
    public final void mo9583h(String str, zzao zzaoVar) {
        TreeMap treeMap = this.f22037t;
        if (zzaoVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, zzaoVar);
        }
    }

    public final int hashCode() {
        return this.f22036s.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0189  */
    /* JADX WARN: Code duplicated, block: B:101:0x018f A[PHI: r5
  0x018f: PHI (r5v8 java.lang.String) = (r5v5 java.lang.String), (r5v7 java.lang.String), (r5v9 java.lang.String) binds: [B:107:0x01ab, B:103:0x019b, B:99:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0193  */
    /* JADX WARN: Code duplicated, block: B:104:0x019d  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:112:0x01be  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:117:0x01da  */
    /* JADX WARN: Code duplicated, block: B:118:0x01dd A[PHI: r5 r14 r15
  0x01dd: PHI (r5v51 java.lang.String) = (r5v2 java.lang.String), (r5v52 java.lang.String) binds: [B:116:0x01d8, B:53:0x00f6] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r14v13 java.lang.String) = (r14v1 java.lang.String), (r14v14 java.lang.String) binds: [B:116:0x01d8, B:53:0x00f6] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r15v12 java.lang.String) = (r15v3 java.lang.String), (r15v13 java.lang.String) binds: [B:116:0x01d8, B:53:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:123:0x0201  */
    /* JADX WARN: Code duplicated, block: B:125:0x0207  */
    /* JADX WARN: Code duplicated, block: B:127:0x0213  */
    /* JADX WARN: Code duplicated, block: B:129:0x0229 A[LOOP:0: B:126:0x0211->B:129:0x0229, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0247 A[LOOP:1: B:133:0x0241->B:135:0x0247, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x026b A[LOOP:2: B:137:0x0265->B:139:0x026b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0290  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x02da  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:158:0x0312  */
    /* JADX WARN: Code duplicated, block: B:161:0x031b A[LOOP:3: B:159:0x0313->B:161:0x031b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0333  */
    /* JADX WARN: Code duplicated, block: B:167:0x033a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0348  */
    /* JADX WARN: Code duplicated, block: B:171:0x034e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0354  */
    /* JADX WARN: Code duplicated, block: B:174:0x0358  */
    /* JADX WARN: Code duplicated, block: B:176:0x0364  */
    /* JADX WARN: Code duplicated, block: B:178:0x0370  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a4 A[ADDED_TO_REGION, LOOP:6: B:186:0x03a4->B:187:0x03a6, LOOP_START, PHI: r0
  0x03a4: PHI (r0v111 int) = (r0v110 int), (r0v112 int) binds: [B:155:0x02f2, B:187:0x03a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6 A[LOOP:6: B:186:0x03a4->B:187:0x03a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:193:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:195:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:196:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:200:0x0403 A[LOOP:7: B:199:0x0401->B:200:0x0403, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x0412  */
    /* JADX WARN: Code duplicated, block: B:203:0x042b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0433  */
    /* JADX WARN: Code duplicated, block: B:209:0x043f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0480  */
    /* JADX WARN: Code duplicated, block: B:216:0x0486  */
    /* JADX WARN: Code duplicated, block: B:218:0x0494  */
    /* JADX WARN: Code duplicated, block: B:220:0x0499  */
    /* JADX WARN: Code duplicated, block: B:222:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:223:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:226:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:228:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:229:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:233:0x0502 A[LOOP:9: B:231:0x04fd->B:233:0x0502, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x0511  */
    /* JADX WARN: Code duplicated, block: B:238:0x051f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0527  */
    /* JADX WARN: Code duplicated, block: B:242:0x0533  */
    /* JADX WARN: Code duplicated, block: B:245:0x0538  */
    /* JADX WARN: Code duplicated, block: B:247:0x053e  */
    /* JADX WARN: Code duplicated, block: B:249:0x054e  */
    /* JADX WARN: Code duplicated, block: B:253:0x055c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0566  */
    /* JADX WARN: Code duplicated, block: B:257:0x0570  */
    /* JADX WARN: Code duplicated, block: B:259:0x057a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0581 A[LOOP:11: B:260:0x057f->B:261:0x0581, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:264:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:267:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:269:0x05be  */
    /* JADX WARN: Code duplicated, block: B:271:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:273:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:275:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:277:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:279:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:281:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:284:0x061a  */
    /* JADX WARN: Code duplicated, block: B:286:0x0634  */
    /* JADX WARN: Code duplicated, block: B:288:0x063e  */
    /* JADX WARN: Code duplicated, block: B:291:0x064f  */
    /* JADX WARN: Code duplicated, block: B:292:0x0656  */
    /* JADX WARN: Code duplicated, block: B:295:0x065d  */
    /* JADX WARN: Code duplicated, block: B:297:0x0665  */
    /* JADX WARN: Code duplicated, block: B:299:0x0673  */
    /* JADX WARN: Code duplicated, block: B:301:0x0679  */
    /* JADX WARN: Code duplicated, block: B:308:0x0697  */
    /* JADX WARN: Code duplicated, block: B:310:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:312:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:314:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:316:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:320:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:323:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:325:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:328:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:330:0x071e  */
    /* JADX WARN: Code duplicated, block: B:332:0x0724  */
    /* JADX WARN: Code duplicated, block: B:334:0x072a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0731  */
    /* JADX WARN: Code duplicated, block: B:339:0x073f  */
    /* JADX WARN: Code duplicated, block: B:347:0x0768  */
    /* JADX WARN: Code duplicated, block: B:349:0x0783  */
    /* JADX WARN: Code duplicated, block: B:352:0x078a  */
    /* JADX WARN: Code duplicated, block: B:354:0x0790  */
    /* JADX WARN: Code duplicated, block: B:356:0x0796  */
    /* JADX WARN: Code duplicated, block: B:358:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:360:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:362:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:365:0x07da A[LOOP:14: B:363:0x07d4->B:365:0x07da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:367:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:369:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:371:0x0812  */
    /* JADX WARN: Code duplicated, block: B:374:0x0819  */
    /* JADX WARN: Code duplicated, block: B:380:0x0833  */
    /* JADX WARN: Code duplicated, block: B:382:0x0839  */
    /* JADX WARN: Code duplicated, block: B:384:0x084a  */
    /* JADX WARN: Code duplicated, block: B:386:0x0851  */
    /* JADX WARN: Code duplicated, block: B:388:0x0863  */
    /* JADX WARN: Code duplicated, block: B:393:0x0877 A[LOOP:16: B:391:0x0871->B:393:0x0877, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:398:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x039c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x044f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0439 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x068e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x074e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0739 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0892 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x088e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x086b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6 A[PHI: r5 r14
  0x00f6: PHI (r5v52 java.lang.String) = (r5v3 java.lang.String), (r5v4 java.lang.String), (r5v8 java.lang.String), (r5v53 java.lang.String) binds: [B:113:0x01c8, B:110:0x01b8, B:101:0x018f, B:52:0x00f2] A[DONT_GENERATE, DONT_INLINE]
  0x00f6: PHI (r14v14 java.lang.String) = (r14v2 java.lang.String), (r14v3 java.lang.String), (r14v6 java.lang.String), (r14v15 java.lang.String) binds: [B:113:0x01c8, B:110:0x01b8, B:101:0x018f, B:52:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    /* JADX WARN: Code duplicated, block: B:61:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:64:0x0118  */
    /* JADX WARN: Code duplicated, block: B:65:0x011b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0133  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:0x0145  */
    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    /* JADX WARN: Code duplicated, block: B:80:0x014e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0154  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d  */
    /* JADX WARN: Code duplicated, block: B:86:0x015f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0165  */
    /* JADX WARN: Code duplicated, block: B:89:0x0168  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:95:0x0179  */
    /* JADX WARN: Code duplicated, block: B:97:0x017f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x082b, code lost:
    
        if (com.google.android.gms.internal.measurement.zzba.m9814b(r29, r31, (com.google.android.gms.internal.measurement.zzan) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m9589s() != m9589s()) goto L376;
     */
    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzao mo9584k(java.lang.String r30, com.google.android.gms.internal.measurement.zzg r31, java.util.ArrayList r32) {
        /*
            Method dump skipped, instruction units count: 2330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzae.mo9584k(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.ArrayList):com.google.android.gms.internal.measurement.zzao");
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    /* JADX INFO: renamed from: m */
    public final boolean mo9585m(String str) {
        return "length".equals(str) || this.f22037t.containsKey(str);
    }

    /* JADX INFO: renamed from: n */
    public final List m9586n() {
        ArrayList arrayList = new ArrayList(m9589s());
        for (int i2 = 0; i2 < m9589s(); i2++) {
            arrayList.add(m9590t(i2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public final Iterator m9587q() {
        return this.f22036s.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    /* JADX INFO: renamed from: r */
    public final zzao mo9588r() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.f22036s.entrySet()) {
            boolean z = entry.getValue() instanceof zzak;
            TreeMap treeMap = zzaeVar.f22036s;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (zzao) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((zzao) entry.getValue()).mo9588r());
            }
        }
        return zzaeVar;
    }

    /* JADX INFO: renamed from: s */
    public final int m9589s() {
        TreeMap treeMap = this.f22036s;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    /* JADX INFO: renamed from: t */
    public final zzao m9590t(int i2) {
        zzao zzaoVar;
        if (i2 < m9589s()) {
            return (!m9592v(i2) || (zzaoVar = (zzao) this.f22036s.get(Integer.valueOf(i2))) == null) ? zzao.f22237k : zzaoVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String toString() {
        return m9594x(",");
    }

    /* JADX INFO: renamed from: u */
    public final void m9591u(int i2, zzao zzaoVar) {
        if (i2 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 21), "Out of bounds index: ", i2));
        }
        TreeMap treeMap = this.f22036s;
        if (zzaoVar == null) {
            treeMap.remove(Integer.valueOf(i2));
        } else {
            treeMap.put(Integer.valueOf(i2), zzaoVar);
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9592v(int i2) {
        if (i2 >= 0) {
            TreeMap treeMap = this.f22036s;
            if (i2 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i2));
            }
        }
        throw new IndexOutOfBoundsException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 21), "Out of bounds index: ", i2));
    }

    /* JADX INFO: renamed from: w */
    public final void m9593w(int i2) {
        TreeMap treeMap = this.f22036s;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i2 > iIntValue || i2 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i2));
        if (i2 == iIntValue) {
            int i3 = i2 - 1;
            Integer numValueOf = Integer.valueOf(i3);
            if (treeMap.containsKey(numValueOf) || i3 < 0) {
                return;
            }
            treeMap.put(numValueOf, zzao.f22237k);
            return;
        }
        while (true) {
            i2++;
            if (i2 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i2);
            zzao zzaoVar = (zzao) treeMap.get(numValueOf2);
            if (zzaoVar != null) {
                treeMap.put(Integer.valueOf(i2 - 1), zzaoVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m9594x(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f22036s.isEmpty()) {
            int i2 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i2 >= m9589s()) {
                    break;
                }
                zzao zzaoVarM9590t = m9590t(i2);
                sb.append(str2);
                if (!(zzaoVarM9590t instanceof zzat) && !(zzaoVarM9590t instanceof zzam)) {
                    sb.append(zzaoVarM9590t.zzc());
                }
                i2++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return m9594x(",");
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                m9591u(i2, (zzao) list.get(i2));
            }
        }
    }
}
