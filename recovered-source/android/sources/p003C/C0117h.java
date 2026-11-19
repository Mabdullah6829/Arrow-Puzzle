package p003C;

/* JADX INFO: renamed from: C.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0117h {

    /* JADX INFO: renamed from: a */
    public final Object f169a;

    /* JADX INFO: renamed from: b */
    public final Object f170b;

    /* JADX INFO: renamed from: c */
    public final Object f171c;

    public C0117h(Object obj, Object obj2, Object obj3) {
        this.f169a = obj;
        this.f170b = obj2;
        this.f171c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m196a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f169a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f170b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f171c);
        return new IllegalArgumentException(sb.toString());
    }
}
