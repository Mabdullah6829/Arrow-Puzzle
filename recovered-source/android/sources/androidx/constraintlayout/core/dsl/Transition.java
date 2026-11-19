package androidx.constraintlayout.core.dsl;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class Transition {
    private String mConstraintSetEnd;
    private String mConstraintSetStart;
    private String mId;
    private OnSwipe mOnSwipe = null;
    final int UNSET = -1;
    private final int DEFAULT_DURATION = 400;
    private final float DEFAULT_STAGGER = 0.0f;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mDuration = 400;
    private float mStagger = 0.0f;
    private KeyFrames mKeyFrames = new KeyFrames();

    public Transition(String str, String str2) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = "default";
        this.mConstraintSetStart = str;
        this.mConstraintSetEnd = str2;
    }

    public String getId() {
        return this.mId;
    }

    public void setDuration(int i2) {
        this.mDuration = i2;
    }

    public void setFrom(String str) {
        this.mConstraintSetStart = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setKeyFrames(Keys keys) {
        this.mKeyFrames.add(keys);
    }

    public void setOnSwipe(OnSwipe onSwipe) {
        this.mOnSwipe = onSwipe;
    }

    public void setStagger(float f2) {
        this.mStagger = f2;
    }

    public void setTo(String str) {
        this.mConstraintSetEnd = str;
    }

    public String toJson() {
        return toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mId);
        sb.append(":{\nfrom:'");
        sb.append(this.mConstraintSetStart);
        sb.append("',\nto:'");
        String strM403k = AbstractC0271e0.m403k(sb, this.mConstraintSetEnd, "',\n");
        if (this.mDuration != 400) {
            strM403k = AbstractC0271e0.m402j(AbstractC0271e0.m410r(strM403k, "duration:"), ",\n", this.mDuration);
        }
        if (this.mStagger != 0.0f) {
            StringBuilder sbM410r = AbstractC0271e0.m410r(strM403k, "stagger:");
            sbM410r.append(this.mStagger);
            sbM410r.append(",\n");
            strM403k = sbM410r.toString();
        }
        if (this.mOnSwipe != null) {
            StringBuilder sbM408p = AbstractC0271e0.m408p(strM403k);
            sbM408p.append(this.mOnSwipe.toString());
            strM403k = sbM408p.toString();
        }
        StringBuilder sbM408p2 = AbstractC0271e0.m408p(strM403k);
        sbM408p2.append(this.mKeyFrames.toString());
        return AbstractC0271e0.m414v(sbM408p2.toString(), "},\n");
    }

    public Transition(String str, String str2, String str3) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = str;
        this.mConstraintSetStart = str2;
        this.mConstraintSetEnd = str3;
    }
}
