package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class TransitionValues {
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM410r = AbstractC0271e0.m410r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM410r.append(this.view);
        sbM410r.append("\n");
        String strM414v = AbstractC0271e0.m414v(sbM410r.toString(), "    values:");
        for (String str : this.values.keySet()) {
            strM414v = strM414v + "    " + str + ": " + this.values.get(str) + "\n";
        }
        return strM414v;
    }

    public TransitionValues(View view) {
        this.view = view;
    }
}
