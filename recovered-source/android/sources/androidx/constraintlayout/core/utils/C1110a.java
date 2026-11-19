package androidx.constraintlayout.core.utils;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.TargetIndexMatcher;
import com.google.firebase.firestore.util.AsyncQueue;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.utils.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1110a implements Comparator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2628s;

    public /* synthetic */ C1110a(int i2) {
        this.f2628s = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2628s) {
            case 0:
                return GridCore.lambda$parseSpans$0((String) obj, (String) obj2);
            case 1:
                return ((Double) obj).compareTo((Double) obj2);
            case 2:
                return CrashlyticsReportPersistence.lambda$static$0((File) obj, (File) obj2);
            case 3:
                return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
            case 4:
                return Document.lambda$static$0((Document) obj, (Document) obj2);
            case 5:
                return ((DocumentKey) obj).compareTo((DocumentKey) obj2);
            case 6:
                return FieldIndex.lambda$static$0((FieldIndex) obj, (FieldIndex) obj2);
            case 7:
                return FieldIndex.IndexOffset.lambda$static$0((MutableDocument) obj, (MutableDocument) obj2);
            case 8:
                return TargetIndexMatcher.lambda$new$0((FieldFilter) obj, (FieldFilter) obj2);
            case 9:
                return AsyncQueue.lambda$runDelayedTasksUntil$5((AsyncQueue.DelayedTask) obj, (AsyncQueue.DelayedTask) obj2);
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
