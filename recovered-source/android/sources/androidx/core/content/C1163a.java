package androidx.core.content;

import androidx.core.util.Consumer;
import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: renamed from: androidx.core.content.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1163a implements Consumer {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2651s;

    public /* synthetic */ C1163a(int i2) {
        this.f2651s = i2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f2651s) {
            case 0:
                IntentSanitizer.lambda$sanitizeByThrowing$1((String) obj);
                break;
            case 1:
                IntentSanitizer.lambda$sanitizeByFiltering$0((String) obj);
                break;
            case 2:
                ((FirestoreClient) obj).setIndexAutoCreationEnabled(true);
                break;
            case 3:
                ((FirestoreClient) obj).setIndexAutoCreationEnabled(false);
                break;
            default:
                ((FirestoreClient) obj).deleteAllFieldIndexes();
                break;
        }
    }
}
