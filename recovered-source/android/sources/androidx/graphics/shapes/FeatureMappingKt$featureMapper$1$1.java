package androidx.graphics.shapes;

import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6283e;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureMappingKt$featureMapper$1$1 extends AbstractC6453l implements InterfaceC6498l {
    public static final FeatureMappingKt$featureMapper$1$1 INSTANCE = new FeatureMappingKt$featureMapper$1$1();

    public FeatureMappingKt$featureMapper$1$1() {
        super(1);
    }

    @Override // p078p0.InterfaceC6498l
    public final CharSequence invoke(C6283e it) {
        AbstractC6452k.m12181e(it, "it");
        return ((Number) it.f24308s).floatValue() + " -> " + ((Number) it.f24309t).floatValue();
    }
}
