package androidx.core.content;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.util.Predicate;

/* JADX INFO: renamed from: androidx.core.content.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1164b implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2653b;

    public /* synthetic */ C1164b(String str, int i2) {
        this.f2652a = i2;
        this.f2653b = str;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f2652a) {
            case 0:
                return IntentSanitizer.Builder.lambda$allowExtraOutput$16(this.f2653b, (Uri) obj);
            case 1:
                return this.f2653b.equals((String) obj);
            case 2:
                return IntentSanitizer.Builder.lambda$allowComponentWithPackage$9(this.f2653b, (ComponentName) obj);
            case 3:
                return IntentSanitizer.Builder.lambda$allowDataWithAuthority$8(this.f2653b, (Uri) obj);
            case 4:
                return IntentSanitizer.Builder.lambda$allowClipDataUriWithAuthority$11(this.f2653b, (Uri) obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtraStreamUriWithAuthority$15(this.f2653b, (Uri) obj);
        }
    }
}
