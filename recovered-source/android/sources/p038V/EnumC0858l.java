package p038V;

/* JADX INFO: renamed from: V.l */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0858l {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* JADX INFO: renamed from: s */
    public final String f2375s;

    EnumC0858l(String str) {
        this.f2375s = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2375s;
    }
}
