package p027P0;

/* JADX INFO: renamed from: P0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0497d {

    /* JADX INFO: renamed from: a */
    public final boolean f1048a;

    /* JADX INFO: renamed from: b */
    public final String f1049b;

    /* JADX INFO: renamed from: c */
    public final String f1050c;

    /* JADX INFO: renamed from: d */
    public final boolean f1051d;

    /* JADX INFO: renamed from: e */
    public final EnumC0494a f1052e;

    public C0497d() {
        EnumC0494a enumC0494a = EnumC0494a.f1042s;
        this.f1048a = true;
        this.f1049b = "    ";
        this.f1050c = "type";
        this.f1051d = true;
        this.f1052e = enumC0494a;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f1048a + ", prettyPrintIndent='" + this.f1049b + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f1050c + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f1051d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f1052e + ')';
    }
}
