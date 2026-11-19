package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
final class zag extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f21552a;

    /* JADX INFO: renamed from: b */
    public int f21553b;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f21552a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        zah zahVar = new zah();
        zahVar.f21554s = 0;
        zahVar.f21556u = 255;
        zahVar.f21557v = 0;
        zahVar.f21558w = true;
        zag zagVar = new zag();
        zagVar.f21552a = this.f21552a;
        zagVar.f21553b = this.f21553b;
        zahVar.f21559x = zagVar;
        return zahVar;
    }
}
