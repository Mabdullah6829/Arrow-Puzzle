package androidx.core.util;

import androidx.core.content.IntentSanitizer;

/* JADX INFO: renamed from: androidx.core.util.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1232a implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Predicate f2707b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2708c;

    public /* synthetic */ C1232a(Predicate predicate, Predicate predicate2, int i2) {
        this.f2706a = i2;
        this.f2707b = predicate;
        this.f2708c = predicate2;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f2706a) {
            case 0:
                return this.f2707b.lambda$or$2((Predicate) this.f2708c, obj);
            case 1:
                return this.f2707b.lambda$and$0((Predicate) this.f2708c, obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.f2708c, this.f2707b, obj);
        }
    }

    public /* synthetic */ C1232a(Class cls, Predicate predicate) {
        this.f2706a = 2;
        this.f2708c = cls;
        this.f2707b = predicate;
    }
}
