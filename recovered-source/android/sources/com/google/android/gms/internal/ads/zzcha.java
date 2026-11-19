package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcha extends TextureView implements zzchx {

    /* JADX INFO: renamed from: s */
    public final zzcho f10005s;

    /* JADX INFO: renamed from: t */
    public final zzchy f10006t;

    public zzcha(Context context) {
        super(context);
        this.f10005s = new zzcho();
        this.f10006t = new zzchy(context, this);
    }

    /* JADX INFO: renamed from: A */
    public void mo5425A(String str, String[] strArr, Integer num) {
        mo5411k(str);
    }

    /* JADX INFO: renamed from: B */
    public void mo5426B(int i2) {
    }

    /* JADX INFO: renamed from: C */
    public void mo5427C(int i2) {
    }

    /* JADX INFO: renamed from: e */
    public void mo5428e(int i2) {
    }

    /* JADX INFO: renamed from: g */
    public void mo5429g(int i2) {
    }

    /* JADX INFO: renamed from: h */
    public void mo5430h(int i2) {
    }

    /* JADX INFO: renamed from: i */
    public abstract String mo5409i();

    /* JADX INFO: renamed from: j */
    public abstract void mo5410j(zzchi zzchiVar);

    /* JADX INFO: renamed from: k */
    public abstract void mo5411k(String str);

    /* JADX INFO: renamed from: l */
    public abstract void mo5412l();

    /* JADX INFO: renamed from: m */
    public abstract void mo5413m();

    /* JADX INFO: renamed from: n */
    public abstract void mo5414n();

    /* JADX INFO: renamed from: o */
    public abstract int mo5415o();

    /* JADX INFO: renamed from: p */
    public abstract int mo5416p();

    /* JADX INFO: renamed from: q */
    public abstract void mo5417q(int i2);

    /* JADX INFO: renamed from: r */
    public abstract void mo5418r(float f2, float f3);

    /* JADX INFO: renamed from: s */
    public abstract int mo5419s();

    /* JADX INFO: renamed from: t */
    public abstract int mo5420t();

    /* JADX INFO: renamed from: u */
    public abstract long mo5421u();

    /* JADX INFO: renamed from: v */
    public abstract long mo5422v();

    /* JADX INFO: renamed from: w */
    public abstract long mo5423w();

    /* JADX INFO: renamed from: x */
    public abstract int mo5424x();

    /* JADX INFO: renamed from: z */
    public Integer mo5431z() {
        return null;
    }
}
