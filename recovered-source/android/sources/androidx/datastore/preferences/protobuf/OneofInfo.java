package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* JADX INFO: renamed from: id */
    private final int f2762id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i2, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f2762id = i2;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f2762id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
