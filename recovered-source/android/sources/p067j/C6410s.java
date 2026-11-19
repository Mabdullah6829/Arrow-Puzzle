package p067j;

/* JADX INFO: renamed from: j.s */
/* JADX INFO: loaded from: classes.dex */
public final class C6410s extends AbstractC6385F {

    /* JADX INFO: renamed from: a */
    public final C6409r f24526a;

    public C6410s(C6409r c6409r) {
        this.f24526a = c6409r;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6385F)) {
            return false;
        }
        return this.f24526a.equals(((C6410s) ((AbstractC6385F) obj)).f24526a);
    }

    public final int hashCode() {
        return this.f24526a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f24526a + "}";
    }
}
