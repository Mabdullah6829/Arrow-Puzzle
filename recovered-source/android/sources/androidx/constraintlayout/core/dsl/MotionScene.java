package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MotionScene {
    ArrayList<Transition> mTransitions = new ArrayList<>();
    ArrayList<ConstraintSet> mConstraintSets = new ArrayList<>();

    public void addConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSets.add(constraintSet);
    }

    public void addTransition(Transition transition) {
        this.mTransitions.add(transition);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        int i2 = 0;
        if (!this.mTransitions.isEmpty()) {
            sb.append("Transitions:{\n");
            ArrayList<Transition> arrayList = this.mTransitions;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Transition transition = arrayList.get(i3);
                i3++;
                sb.append(transition.toString());
            }
            sb.append("},\n");
        }
        if (!this.mConstraintSets.isEmpty()) {
            sb.append("ConstraintSets:{\n");
            ArrayList<ConstraintSet> arrayList2 = this.mConstraintSets;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                ConstraintSet constraintSet = arrayList2.get(i2);
                i2++;
                sb.append(constraintSet.toString());
            }
            sb.append("},\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
