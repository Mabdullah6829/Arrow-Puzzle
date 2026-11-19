package androidx.core.content;

import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

/* JADX INFO: renamed from: androidx.core.content.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1165c implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2655b;

    public /* synthetic */ C1165c(Object obj, int i2) {
        this.f2654a = i2;
        this.f2655b = obj;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f2654a) {
            case 0:
                return ((ComponentName) this.f2655b).equals((ComponentName) obj);
            default:
                return UriMatcherCompat.lambda$asPredicate$0((UriMatcher) this.f2655b, (Uri) obj);
        }
    }
}
