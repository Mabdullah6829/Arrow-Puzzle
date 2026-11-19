package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5272a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23404a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23405b;

    public /* synthetic */ C5272a(Object obj, int i2) {
        this.f23404a = i2;
        this.f23405b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f23404a) {
            case 0:
                return DynamicColor.lambda$fromArgb$0((TonalPalette) this.f23405b, (DynamicScheme) obj);
            case 1:
                return DynamicColor.lambda$fromArgb$1((Hct) this.f23405b, (DynamicScheme) obj);
            default:
                return ((TemperatureCache) this.f23405b).lambda$getHctsByTemp$0((Hct) obj);
        }
    }
}
