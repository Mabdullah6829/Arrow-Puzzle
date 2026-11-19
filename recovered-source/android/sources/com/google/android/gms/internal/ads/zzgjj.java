package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.C1137R;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjj extends zzgji {

    /* JADX INFO: renamed from: f */
    public final Map f17602f;

    /* JADX INFO: renamed from: g */
    public final zzgen f17603g;

    public zzgjj(zzaxt zzaxtVar, zzgie zzgieVar, zzgen zzgenVar, Map map, zzgqo zzgqoVar) {
        super("0llJphW+1AJxnxbH/gLXWqExBUUJf0DQ3WuxUSKByDNRS1LORshIg0jq004o4mzE", "HgFzVQOFBY50xlS1g5v9F7L61Tt5netYE+jncsHeWeQ=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(C1137R.styleable.ConstraintSet_transitionPathRotate));
        this.f17602f = map;
        this.f17603g = zzgenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.f17602f;
        Long l2 = (Long) map.get("tcq");
        if (l2 == null) {
            l2 = -1L;
        }
        lArr[0] = l2;
        Long l3 = (Long) map.get("tpq");
        if (l3 == null) {
            l3 = -1L;
        }
        lArr[1] = l3;
        Long l4 = (Long) map.get("tcv");
        if (l4 == null) {
            l4 = -1L;
        }
        lArr[2] = l4;
        Long l5 = (Long) map.get("tpv");
        if (l5 == null) {
            l5 = -1L;
        }
        lArr[3] = l5;
        Long l6 = (Long) map.get("tchv");
        if (l6 == null) {
            l6 = -1L;
        }
        lArr[4] = l6;
        Long l7 = (Long) map.get("tphv");
        if (l7 == null) {
            l7 = -1L;
        }
        lArr[5] = l7;
        Long l8 = (Long) map.get("tcc");
        if (l8 == null) {
            l8 = -1L;
        }
        lArr[6] = l8;
        Long l9 = (Long) map.get("tpc");
        if (l9 == null) {
            l9 = -1L;
        }
        lArr[7] = l9;
        Long l10 = (Long) map.get("tst");
        if (l10 == null) {
            l10 = -1L;
        }
        lArr[8] = l10;
        for (int i2 = 0; i2 < 9; i2++) {
            if (lArr[i2] == null) {
                lArr[i2] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.f17603g.ordinal()));
        lArr2.getClass();
        synchronized (zzaxtVar) {
            long jLongValue = lArr2[0].longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4621q0(jLongValue);
            long jLongValue2 = lArr2[1].longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4570G(jLongValue2);
            long jLongValue3 = lArr2[2].longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4598U0(jLongValue3);
            long jLongValue4 = lArr2[3].longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4592R0(jLongValue4);
            long jLongValue5 = lArr2[4].longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4617m0(jLongValue5);
            long jLongValue6 = lArr2[5].longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4618n0(jLongValue6);
            long jLongValue7 = lArr2[6].longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4595T(jLongValue7);
            long jLongValue8 = lArr2[7].longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4597U(jLongValue8);
        }
    }
}
