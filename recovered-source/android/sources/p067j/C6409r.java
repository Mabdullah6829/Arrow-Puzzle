package p067j;

/* JADX INFO: renamed from: j.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6409r extends AbstractC6384E {

    /* JADX INFO: renamed from: a */
    public final Integer f24525a;

    public C6409r(Integer num) {
        this.f24525a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6384E)) {
            return false;
        }
        Integer num = this.f24525a;
        C6409r c6409r = (C6409r) ((AbstractC6384E) obj);
        if (num == null) {
            return c6409r.f24525a == null;
        }
        return num.equals(c6409r.f24525a);
    }

    public final int hashCode() {
        Integer num = this.f24525a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f24525a + "}";
    }
}
