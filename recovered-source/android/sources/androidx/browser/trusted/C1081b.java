package androidx.browser.trusted;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.browser.trusted.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1081b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
    }
}
