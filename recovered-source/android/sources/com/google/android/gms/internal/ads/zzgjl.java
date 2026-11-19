package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjl extends zzgji {

    /* JADX INFO: renamed from: f */
    public final Map f17609f;

    /* JADX INFO: renamed from: g */
    public final zzgie f17610g;

    /* JADX INFO: renamed from: h */
    public final DisplayMetrics f17611h;

    public zzgjl(zzaxt zzaxtVar, zzgie zzgieVar, Map map, DisplayMetrics displayMetrics, zzgqo zzgqoVar) {
        super("O/IhSczWkqH+q2aziu5mnePClwI2VInt8+rK2r5DAzxhVznO7DMyVuowa8d0HFxQ", "c/euB7bpmuTDKGTS9kQ/O7Lr64QuDKreUuxk5moaYNc=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(123));
        this.f17610g = zzgieVar;
        this.f17609f = map;
        this.f17611h = displayMetrics;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        Object[] objArr;
        Map map = this.f17609f;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.f17611h;
        Object[] objArr2 = (Object[]) method.invoke("", motionEvent, displayMetrics);
        objArr2.getClass();
        zzayp zzaypVarM4533D = zzayq.m4533D();
        Object obj = objArr2[0];
        boolean z = true;
        if (obj != null && objArr2[1] != null) {
            long jLongValue = ((Long) obj).longValue();
            zzaypVarM4533D.m8326l();
            ((zzayq) zzaypVarM4533D.f19780t).m4534E(jLongValue);
            long jLongValue2 = ((Long) objArr2[1]).longValue();
            zzaypVarM4533D.m8326l();
            ((zzayq) zzaypVarM4533D.f19780t).m4535F(jLongValue2);
        }
        Object obj2 = objArr2[2];
        if (obj2 != null) {
            long jLongValue3 = ((Long) obj2).longValue();
            zzaypVarM4533D.m8326l();
            ((zzayq) zzaypVarM4533D.f19780t).m4541L(jLongValue3);
        }
        Object obj3 = objArr2[3];
        if (obj3 != null) {
            long jLongValue4 = ((Long) obj3).longValue();
            zzaypVarM4533D.m8326l();
            ((zzayq) zzaypVarM4533D.f19780t).m4539J(jLongValue4);
        }
        Object obj4 = objArr2[4];
        if (obj4 != null) {
            long jLongValue5 = ((Long) obj4).longValue();
            zzaypVarM4533D.m8326l();
            ((zzayq) zzaypVarM4533D.f19780t).m4536G(jLongValue5);
        }
        Object obj5 = objArr2[5];
        if (obj5 != null) {
            int i2 = ((Long) obj5).longValue() != 0 ? 2 : 1;
            zzaypVarM4533D.m8326l();
            ((zzayq) zzaypVarM4533D.f19780t).m4552W(i2);
        }
        Object obj6 = objArr2[6];
        if (obj6 != null) {
            long jLongValue6 = ((Long) obj6).longValue();
            zzaypVarM4533D.m8326l();
            ((zzayq) zzaypVarM4533D.f19780t).m4543N(jLongValue6);
        }
        Object obj7 = objArr2[7];
        if (obj7 != null) {
            long jLongValue7 = ((Long) obj7).longValue();
            zzaypVarM4533D.m8326l();
            ((zzayq) zzaypVarM4533D.f19780t).m4542M(jLongValue7);
        }
        Object obj8 = objArr2[8];
        if (obj8 != null) {
            int i3 = ((Long) obj8).longValue() != 0 ? 2 : 1;
            zzaypVarM4533D.m8326l();
            ((zzayq) zzaypVarM4533D.f19780t).m4553X(i3);
        }
        synchronized (zzaxtVar) {
            try {
                Method methodMo7012d = this.f17610g.mo7012d("8cUAbwpt6SKUQHhtSwuMmdGkTrID2QvHq2LA27x2GE3ivBr88edu7HCA+XurISAj", "khOZexiJY4Vla3osCKZbCsXRCvuYnTPcWDFUfUGsZNQ=");
                if (methodMo7012d == null || (objArr = (Object[]) methodMo7012d.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                    throw null;
                }
                Object obj9 = objArr[0];
                if (obj9 != null) {
                    long jLongValue8 = ((Long) obj9).longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4586O0(jLongValue8);
                }
                Object obj10 = objArr[1];
                if (obj10 != null) {
                    long jLongValue9 = ((Long) obj10).longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4588P0(jLongValue9);
                }
                Object obj11 = objArr[2];
                if (obj11 != null) {
                    long jLongValue10 = ((Long) obj11).longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4590Q0(jLongValue10);
                }
                Object obj12 = objArr[3];
                if (obj12 != null) {
                    long jLongValue11 = ((Long) obj12).longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4575J(jLongValue11);
                }
                Object obj13 = objArr[4];
                if (obj13 != null) {
                    long jLongValue12 = ((Long) obj13).longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4577K(jLongValue12);
                }
                zzggy zzggyVar = (zzggy) map.get("oe");
                if (zzggyVar != null) {
                    long j2 = zzggyVar.f17238a;
                    if (j2 > 0) {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4583N(j2);
                    }
                    long j3 = zzggyVar.f17239b;
                    if (j3 > 0) {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4581M(j3);
                    }
                    long j4 = zzggyVar.f17240c;
                    if (j4 > 0) {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4579L(j4);
                    }
                    long j5 = zzggyVar.f17241d;
                    if (j5 > 0) {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4585O(j5);
                    }
                }
                zzggy zzggyVar2 = (zzggy) map.get("oe");
                if (zzggyVar2 != null && zzggyVar2.f17238a != 0) {
                    if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                        double d = zzggyVar2.f17244g;
                        if (displayMetrics == null) {
                            throw null;
                        }
                        long jRound = Math.round(d / ((double) displayMetrics.density));
                        zzaypVarM4533D.m8326l();
                        ((zzayq) zzaypVarM4533D.f19780t).m4545P(jRound);
                        long jRound2 = Math.round(((double) (zzggyVar2.f17247j - zzggyVar2.f17245h)) / ((double) displayMetrics.density));
                        zzaypVarM4533D.m8326l();
                        ((zzayq) zzaypVarM4533D.f19780t).m4546Q(jRound2);
                        long jRound3 = Math.round(((double) (zzggyVar2.f17248k - zzggyVar2.f17246i)) / ((double) displayMetrics.density));
                        zzaypVarM4533D.m8326l();
                        ((zzayq) zzaypVarM4533D.f19780t).m4547R(jRound3);
                        long jRound4 = Math.round(((double) zzggyVar2.f17245h) / ((double) displayMetrics.density));
                        zzaypVarM4533D.m8326l();
                        ((zzayq) zzaypVarM4533D.f19780t).m4550U(jRound4);
                        long jRound5 = Math.round(((double) zzggyVar2.f17246i) / ((double) displayMetrics.density));
                        zzaypVarM4533D.m8326l();
                        ((zzayq) zzaypVarM4533D.f19780t).m4551V(jRound5);
                        MotionEvent motionEvent2 = (MotionEvent) map.get("nv");
                        if (motionEvent2 != null) {
                            long jRound6 = Math.round(((double) (((zzggyVar2.f17245h - zzggyVar2.f17247j) + motionEvent2.getRawX()) - motionEvent2.getX())) / ((double) displayMetrics.density));
                            if (jRound6 != 0) {
                                zzaypVarM4533D.m8326l();
                                ((zzayq) zzaypVarM4533D.f19780t).m4548S(jRound6);
                            }
                            long jRound7 = Math.round(((double) (((zzggyVar2.f17246i - zzggyVar2.f17248k) + motionEvent2.getRawY()) - motionEvent2.getY())) / ((double) displayMetrics.density));
                            if (jRound7 != 0) {
                                zzaypVarM4533D.m8326l();
                                ((zzayq) zzaypVarM4533D.f19780t).m4549T(jRound7);
                            }
                        }
                    }
                }
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4601W((zzayq) zzaypVarM4533D.m8328o());
                zzggz[] zzggzVarArr = (zzggz[]) map.get("ro");
                if (zzggzVarArr != null) {
                    if (displayMetrics == null || displayMetrics.density == 0.0f) {
                        z = false;
                    }
                    if (z) {
                        for (int i4 = 0; i4 <= zzggzVarArr.length - 2; i4++) {
                            zzggz zzggzVar = zzggzVarArr[i4];
                            zzayp zzaypVarM4533D2 = zzayq.m4533D();
                            double d2 = zzggzVar.f17249a;
                            if (displayMetrics == null) {
                                throw null;
                            }
                            long jRound8 = Math.round(d2 / ((double) displayMetrics.density));
                            zzaypVarM4533D2.m8326l();
                            ((zzayq) zzaypVarM4533D2.f19780t).m4534E(jRound8);
                            long jRound9 = Math.round(((double) zzggzVar.f17250b) / ((double) displayMetrics.density));
                            zzaypVarM4533D2.m8326l();
                            ((zzayq) zzaypVarM4533D2.f19780t).m4535F(jRound9);
                            zzayq zzayqVar = (zzayq) zzaypVarM4533D2.m8328o();
                            zzaxtVar.m8326l();
                            ((zzayt) zzaxtVar.f19780t).m4602X(zzayqVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
