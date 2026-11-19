package androidx.core.view.autofill;

import android.view.autofill.AutofillId;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC1631a;

/* JADX INFO: loaded from: classes.dex */
public class AutofillIdCompat {
    private final Object mWrappedObj;

    private AutofillIdCompat(AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    public static AutofillIdCompat toAutofillIdCompat(AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    public AutofillId toAutofillId() {
        return AbstractC1631a.m2593g(this.mWrappedObj);
    }
}
