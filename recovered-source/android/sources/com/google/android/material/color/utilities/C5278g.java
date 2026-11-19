package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5278g implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23412a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialDynamicColors f23413b;

    public /* synthetic */ C5278g(MaterialDynamicColors materialDynamicColors, int i2) {
        this.f23412a = i2;
        this.f23413b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f23412a) {
            case 0:
                return this.f23413b.lambda$secondaryFixed$119((DynamicScheme) obj);
            case 1:
                return this.f23413b.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj);
            case 2:
                return this.f23413b.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
            case 3:
                return this.f23413b.lambda$tertiaryFixedDim$136((DynamicScheme) obj);
            case 4:
                return this.f23413b.lambda$onTertiary$84((DynamicScheme) obj);
            case 5:
                return this.f23413b.lambda$onError$96((DynamicScheme) obj);
            case 6:
                return this.f23413b.lambda$onPrimaryContainer$62((DynamicScheme) obj);
            case 7:
                return this.f23413b.lambda$onPrimaryContainer$63((DynamicScheme) obj);
            case 8:
                return this.f23413b.lambda$secondaryFixedDim$122((DynamicScheme) obj);
            case 9:
                return this.f23413b.lambda$primaryFixed$105((DynamicScheme) obj);
            case 10:
                return this.f23413b.lambda$primaryFixedDim$108((DynamicScheme) obj);
            case 11:
                return this.f23413b.lambda$tertiaryContainer$86((DynamicScheme) obj);
            case 12:
                return this.f23413b.lambda$tertiaryContainer$87((DynamicScheme) obj);
            default:
                return this.f23413b.highestSurface((DynamicScheme) obj);
        }
    }
}
