package androidx.graphics.shapes;

import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureMappingKt$featureMapper$2$1$2 extends AbstractC6453l implements InterfaceC6498l {

    /* JADX INFO: renamed from: $N */
    final /* synthetic */ int f2804$N;
    final /* synthetic */ DoubleMapper $dm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureMappingKt$featureMapper$2$1$2(DoubleMapper doubleMapper, int i2) {
        super(1);
        this.$dm = doubleMapper;
        this.f2804$N = i2;
    }

    @Override // p078p0.InterfaceC6498l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final CharSequence invoke(int i2) {
        return Format_jvmKt.toStringWithLessPrecision(this.$dm.mapBack(i2 / this.f2804$N));
    }
}
