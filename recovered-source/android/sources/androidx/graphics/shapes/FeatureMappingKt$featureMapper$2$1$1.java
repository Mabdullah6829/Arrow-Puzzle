package androidx.graphics.shapes;

import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureMappingKt$featureMapper$2$1$1 extends AbstractC6453l implements InterfaceC6498l {

    /* JADX INFO: renamed from: $N */
    final /* synthetic */ int f2803$N;
    final /* synthetic */ DoubleMapper $dm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureMappingKt$featureMapper$2$1$1(DoubleMapper doubleMapper, int i2) {
        super(1);
        this.$dm = doubleMapper;
        this.f2803$N = i2;
    }

    public final CharSequence invoke(int i2) {
        return Format_jvmKt.toStringWithLessPrecision(this.$dm.map(i2 / this.f2803$N));
    }

    @Override // p078p0.InterfaceC6498l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
