package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzwr implements zzxw, zzum {

    /* JADX INFO: renamed from: a */
    public final Object f21230a;

    /* JADX INFO: renamed from: b */
    public zzxv f21231b;

    /* JADX INFO: renamed from: c */
    public zzul f21232c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzwt f21233d;

    public zzwr(zzwt zzwtVar, Object obj) {
        this.f21233d = zzwtVar;
        this.f21231b = new zzxv(zzwtVar.f21218c.f21305b, null);
        this.f21232c = new zzul(zzwtVar.f21219d.f21007b, null);
        this.f21230a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8996a(zzxl zzxlVar) {
        zzxl zzxlVarMo9001i;
        Object obj = this.f21230a;
        zzwt zzwtVar = this.f21233d;
        if (zzxlVar != null) {
            zzxlVarMo9001i = zzwtVar.mo9001i(obj, zzxlVar);
            if (zzxlVarMo9001i == null) {
                return false;
            }
        } else {
            zzxlVarMo9001i = null;
        }
        zzwtVar.mo9000h(obj);
        zzxv zzxvVar = this.f21231b;
        zzxvVar.getClass();
        if (!Objects.equals(zzxvVar.f21304a, zzxlVarMo9001i)) {
            this.f21231b = new zzxv(zzwtVar.f21218c.f21305b, zzxlVarMo9001i);
        }
        zzul zzulVar = this.f21232c;
        zzulVar.getClass();
        if (Objects.equals(zzulVar.f21006a, zzxlVarMo9001i)) {
            return true;
        }
        this.f21232c = new zzul(zzwtVar.f21219d.f21007b, zzxlVarMo9001i);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8997b(zzxh zzxhVar, zzxl zzxlVar) {
        long j2 = zzxhVar.f21276c;
        zzwt zzwtVar = this.f21233d;
        Object obj = this.f21230a;
        zzwtVar.mo9002j(j2, obj);
        zzwtVar.mo9002j(zzxhVar.f21277d, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: e */
    public final void mo8737e(int i2, zzxl zzxlVar, zzxh zzxhVar) {
        if (m8996a(zzxlVar)) {
            zzxv zzxvVar = this.f21231b;
            m8997b(zzxhVar, zzxlVar);
            zzxvVar.getClass();
            zzxvVar.m9029a(new zzxs(zzxvVar, zzxhVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: g */
    public final void mo8738g(int i2, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar) {
        if (m8996a(zzxlVar)) {
            zzxv zzxvVar = this.f21231b;
            m8997b(zzxhVar, zzxlVar);
            zzxvVar.getClass();
            zzxvVar.m9029a(new zzxp(zzxvVar, zzxcVar, zzxhVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: j */
    public final void mo8739j(int i2, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar) {
        if (m8996a(zzxlVar)) {
            zzxv zzxvVar = this.f21231b;
            m8997b(zzxhVar, zzxlVar);
            zzxvVar.getClass();
            zzxvVar.m9029a(new zzxq(zzxvVar, zzxcVar, zzxhVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: l */
    public final void mo8740l(int i2, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar, IOException iOException, boolean z) {
        if (m8996a(zzxlVar)) {
            zzxv zzxvVar = this.f21231b;
            m8997b(zzxhVar, zzxlVar);
            zzxvVar.getClass();
            zzxvVar.m9029a(new zzxr(zzxvVar, zzxcVar, zzxhVar, iOException, z));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    /* JADX INFO: renamed from: p */
    public final void mo8741p(int i2, zzxl zzxlVar, zzxc zzxcVar, zzxh zzxhVar, int i3) {
        if (m8996a(zzxlVar)) {
            zzxv zzxvVar = this.f21231b;
            m8997b(zzxhVar, zzxlVar);
            zzxvVar.getClass();
            zzxvVar.m9029a(new zzxu(zzxvVar, zzxcVar, zzxhVar, i3));
        }
    }
}
