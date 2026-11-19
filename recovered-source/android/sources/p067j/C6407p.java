package p067j;

/* JADX INFO: renamed from: j.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6407p extends AbstractC6382C {

    /* JADX INFO: renamed from: a */
    public final C6410s f24522a;

    public C6407p(C6410s c6410s) {
        EnumC6381B enumC6381B = EnumC6381B.f24450s;
        this.f24522a = c6410s;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6382C)) {
            return false;
        }
        AbstractC6382C abstractC6382C = (AbstractC6382C) obj;
        if (!this.f24522a.equals(((C6407p) abstractC6382C).f24522a)) {
            return false;
        }
        Object obj2 = EnumC6381B.f24450s;
        ((C6407p) abstractC6382C).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f24522a.hashCode() ^ 1000003) * 1000003) ^ EnumC6381B.f24450s.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f24522a + ", productIdOrigin=" + EnumC6381B.f24450s + "}";
    }
}
