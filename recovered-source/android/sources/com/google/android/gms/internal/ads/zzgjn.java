package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjn extends zzgji {

    /* JADX INFO: renamed from: f */
    public final DisplayMetrics f17617f;

    /* JADX INFO: renamed from: g */
    public final View f17618g;

    public zzgjn(zzaxt zzaxtVar, zzgie zzgieVar, DisplayMetrics displayMetrics, View view, zzgqo zzgqoVar) {
        super("jfdrT3YDVcDOM9UB5LzDpqcbuDp5keVZHqGcg+MV5UCB23uYRRp2NQL5QwO7s7yD", "z81VgQq8DV/RpboX+za4HXvceA1wD9mZ3Lv8nuAqQVE=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(124));
        this.f17617f = displayMetrics;
        this.f17618g = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.f17618g;
        if (view == null) {
            return;
        }
        Object objInvoke = method.invoke("", this.f17617f, view);
        objInvoke.getClass();
        Long[] lArr = (Long[]) objInvoke;
        zzayr zzayrVarM4554D = zzays.m4554D();
        long jLongValue = lArr[2].longValue();
        zzayrVarM4554D.m8326l();
        ((zzays) zzayrVarM4554D.f19780t).m4556F(jLongValue);
        long jLongValue2 = lArr[1].longValue();
        zzayrVarM4554D.m8326l();
        ((zzays) zzayrVarM4554D.f19780t).m4557G(jLongValue2);
        long jLongValue3 = lArr[0].longValue();
        zzayrVarM4554D.m8326l();
        ((zzays) zzayrVarM4554D.f19780t).m4558H(jLongValue3);
        long jLongValue4 = lArr[3].longValue();
        zzayrVarM4554D.m8326l();
        ((zzays) zzayrVarM4554D.f19780t).m4555E(jLongValue4);
        long jLongValue5 = lArr[4].longValue();
        zzayrVarM4554D.m8326l();
        ((zzays) zzayrVarM4554D.f19780t).m4559I(jLongValue5);
        zzays zzaysVar = (zzays) zzayrVarM4554D.m8328o();
        zzaxtVar.m8326l();
        ((zzayt) zzaxtVar.f19780t).m4604Z(zzaysVar);
    }
}
