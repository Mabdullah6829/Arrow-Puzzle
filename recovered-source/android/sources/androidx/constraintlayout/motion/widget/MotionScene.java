package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.C1137R;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class MotionScene {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final String CONSTRAINTSET_TAG = "ConstraintSet";
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DESKTOP = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final String INCLUDE_TAG = "include";
    private static final String INCLUDE_TAG_UC = "Include";
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final String KEYFRAMESET_TAG = "KeyFrameSet";
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    static final int LINEAR = 3;
    private static final int MIN_DURATION = 8;
    private static final String MOTIONSCENE_TAG = "MotionScene";
    private static final String ONCLICK_TAG = "OnClick";
    private static final String ONSWIPE_TAG = "OnSwipe";
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final String STATESET_TAG = "StateSet";
    private static final String TAG = "MotionScene";
    static final int TRANSITION_BACKWARD = 0;
    static final int TRANSITION_FORWARD = 1;
    private static final String TRANSITION_TAG = "Transition";
    public static final int UNSET = -1;
    private static final String VIEW_TRANSITION = "ViewTransition";
    private MotionEvent mLastTouchDown;
    float mLastTouchX;
    float mLastTouchY;
    private final MotionLayout mMotionLayout;
    private boolean mRtl;
    private MotionLayout.MotionTracker mVelocityTracker;
    final ViewTransitionController mViewTransitionController;
    StateSet mStateSet = null;
    Transition mCurrentTransition = null;
    private boolean mDisableAutoTransition = false;
    private ArrayList<Transition> mTransitionList = new ArrayList<>();
    private Transition mDefaultTransition = null;
    private ArrayList<Transition> mAbstractTransitionList = new ArrayList<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private HashMap<String, Integer> mConstraintSetIdMap = new HashMap<>();
    private SparseIntArray mDeriveMap = new SparseIntArray();
    private int mDefaultDuration = 400;
    private int mLayoutDuringTransition = 0;
    private boolean mIgnoreTouch = false;
    private boolean mMotionOutsideRegion = false;

    public MotionScene(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
    }

    private int getId(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e(TypedValues.MotionScene.NAME, "error in parsing id");
        }
        return identifier;
    }

    private int getIndex(Transition transition) {
        int i2 = transition.mId;
        if (i2 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i3 = 0; i3 < this.mTransitionList.size(); i3++) {
            if (this.mTransitionList.get(i3).mId == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static String getLine(Context context, int i2, XmlPullParser xmlPullParser) {
        return ".(" + Debug.getName(context, i2) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    private int getRealID(int i2) {
        int iStateGetConstraintID;
        StateSet stateSet = this.mStateSet;
        return (stateSet == null || (iStateGetConstraintID = stateSet.stateGetConstraintID(i2, -1, -1)) == -1) ? i2 : iStateGetConstraintID;
    }

    private boolean hasCycleDependency(int i2) {
        int i3 = this.mDeriveMap.get(i2);
        int size = this.mDeriveMap.size();
        while (i3 > 0) {
            if (i3 == i2) {
                return true;
            }
            int i4 = size - 1;
            if (size < 0) {
                return true;
            }
            i3 = this.mDeriveMap.get(i3);
            size = i4;
        }
        return false;
    }

    private boolean isProcessingTouch() {
        return this.mVelocityTracker != null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    private void load(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            int eventType = xml.getEventType();
            Transition transition = null;
            while (true) {
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    switch (xml.getName()) {
                        case "MotionScene":
                            parseMotionSceneTags(context, xml);
                            break;
                        case "Transition":
                            ArrayList<Transition> arrayList = this.mTransitionList;
                            transition = new Transition(this, context, xml);
                            arrayList.add(transition);
                            if (this.mCurrentTransition == null && !transition.mIsAbstract) {
                                this.mCurrentTransition = transition;
                                if (transition.mTouchResponse != null) {
                                    this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
                                }
                            }
                            if (!transition.mIsAbstract) {
                                break;
                            } else {
                                if (transition.mConstraintSetEnd == -1) {
                                    this.mDefaultTransition = transition;
                                } else {
                                    this.mAbstractTransitionList.add(transition);
                                }
                                this.mTransitionList.remove(transition);
                                break;
                            }
                            break;
                        case "OnSwipe":
                            if (transition == null) {
                                Log.v(TypedValues.MotionScene.NAME, " OnSwipe (" + context.getResources().getResourceEntryName(i2) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (transition == null) {
                                break;
                            } else {
                                transition.mTouchResponse = new TouchResponse(context, this.mMotionLayout, xml);
                                break;
                            }
                            break;
                        case "OnClick":
                            if (transition != null && !this.mMotionLayout.isInEditMode()) {
                                transition.addOnClick(context, xml);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "StateSet":
                            this.mStateSet = new StateSet(context, xml);
                            break;
                        case "ConstraintSet":
                            parseConstraintSet(context, xml);
                            break;
                        case "include":
                        case "Include":
                            parseInclude(context, xml);
                            break;
                        case "KeyFrameSet":
                            KeyFrames keyFrames = new KeyFrames(context, xml);
                            if (transition == null) {
                                break;
                            } else {
                                transition.mKeyFramesList.add(keyFrames);
                                break;
                            }
                            break;
                        case "ViewTransition":
                            this.mViewTransitionController.add(new ViewTransition(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            Log.e(TypedValues.MotionScene.NAME, "Error parsing resource: " + i2, e);
        } catch (XmlPullParserException e2) {
            Log.e(TypedValues.MotionScene.NAME, "Error parsing resource: " + i2, e2);
        }
    }

    private int parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int id = -1;
        int id2 = -1;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    id2 = getId(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        constraintSet.mRotate = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                constraintSet.mRotate = 4;
                                break;
                            case "left":
                                constraintSet.mRotate = 2;
                                break;
                            case "none":
                                constraintSet.mRotate = 0;
                                break;
                            case "right":
                                constraintSet.mRotate = 1;
                                break;
                            case "x_right":
                                constraintSet.mRotate = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    id = getId(context, attributeValue);
                    this.mConstraintSetIdMap.put(stripID(attributeValue), Integer.valueOf(id));
                    constraintSet.mIdString = Debug.getName(context, id);
                    break;
                case "stateLabels":
                    constraintSet.setStateLabels(attributeValue);
                    break;
            }
        }
        if (id != -1) {
            if (this.mMotionLayout.mDebugPath != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, xmlPullParser);
            if (id2 != -1) {
                this.mDeriveMap.put(id, id2);
            }
            this.mConstraintSetMap.put(id, constraintSet);
        }
        return id;
    }

    private void parseInclude(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1137R.styleable.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C1137R.styleable.include_constraintSet) {
                parseInclude(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void parseMotionSceneTags(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1137R.styleable.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C1137R.styleable.MotionScene_defaultDuration) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.mDefaultDuration);
                this.mDefaultDuration = i3;
                if (i3 < 8) {
                    this.mDefaultDuration = 8;
                }
            } else if (index == C1137R.styleable.MotionScene_layoutDuringTransition) {
                this.mLayoutDuringTransition = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void readConstraintChain(int i2, MotionLayout motionLayout) {
        ConstraintSet constraintSet = this.mConstraintSetMap.get(i2);
        constraintSet.derivedState = constraintSet.mIdString;
        int i3 = this.mDeriveMap.get(i2);
        if (i3 > 0) {
            readConstraintChain(i3, motionLayout);
            ConstraintSet constraintSet2 = this.mConstraintSetMap.get(i3);
            if (constraintSet2 == null) {
                Log.e(TypedValues.MotionScene.NAME, "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.getName(this.mMotionLayout.getContext(), i3));
                return;
            } else {
                constraintSet.derivedState += "/" + constraintSet2.derivedState;
                constraintSet.readFallback(constraintSet2);
            }
        } else {
            constraintSet.derivedState = AbstractC0271e0.m403k(new StringBuilder(), constraintSet.derivedState, "  layout");
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    public static String stripID(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    public void addOnClickListeners(MotionLayout motionLayout, int i2) {
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Transition transition = arrayList.get(i3);
            i3++;
            Transition transition2 = transition;
            if (transition2.mOnClicks.size() > 0) {
                ArrayList arrayList2 = transition2.mOnClicks;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    ((Transition.TransitionOnClick) obj).removeOnClickListeners(motionLayout);
                }
            }
        }
        ArrayList<Transition> arrayList3 = this.mAbstractTransitionList;
        int size3 = arrayList3.size();
        int i5 = 0;
        while (i5 < size3) {
            Transition transition3 = arrayList3.get(i5);
            i5++;
            Transition transition4 = transition3;
            if (transition4.mOnClicks.size() > 0) {
                ArrayList arrayList4 = transition4.mOnClicks;
                int size4 = arrayList4.size();
                int i6 = 0;
                while (i6 < size4) {
                    Object obj2 = arrayList4.get(i6);
                    i6++;
                    ((Transition.TransitionOnClick) obj2).removeOnClickListeners(motionLayout);
                }
            }
        }
        ArrayList<Transition> arrayList5 = this.mTransitionList;
        int size5 = arrayList5.size();
        int i7 = 0;
        while (i7 < size5) {
            Transition transition5 = arrayList5.get(i7);
            i7++;
            Transition transition6 = transition5;
            if (transition6.mOnClicks.size() > 0) {
                ArrayList arrayList6 = transition6.mOnClicks;
                int size6 = arrayList6.size();
                int i8 = 0;
                while (i8 < size6) {
                    Object obj3 = arrayList6.get(i8);
                    i8++;
                    ((Transition.TransitionOnClick) obj3).addOnClickListeners(motionLayout, i2, transition6);
                }
            }
        }
        ArrayList<Transition> arrayList7 = this.mAbstractTransitionList;
        int size7 = arrayList7.size();
        int i9 = 0;
        while (i9 < size7) {
            Transition transition7 = arrayList7.get(i9);
            i9++;
            Transition transition8 = transition7;
            if (transition8.mOnClicks.size() > 0) {
                ArrayList arrayList8 = transition8.mOnClicks;
                int size8 = arrayList8.size();
                int i10 = 0;
                while (i10 < size8) {
                    Object obj4 = arrayList8.get(i10);
                    i10++;
                    ((Transition.TransitionOnClick) obj4).addOnClickListeners(motionLayout, i2, transition8);
                }
            }
        }
    }

    public void addTransition(Transition transition) {
        int index = getIndex(transition);
        if (index == -1) {
            this.mTransitionList.add(transition);
        } else {
            this.mTransitionList.set(index, transition);
        }
    }

    public boolean applyViewTransition(int i2, MotionController motionController) {
        return this.mViewTransitionController.applyViewTransition(i2, motionController);
    }

    public boolean autoTransition(MotionLayout motionLayout, int i2) {
        Transition transition;
        if (isProcessingTouch() || this.mDisableAutoTransition) {
            return false;
        }
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Transition transition2 = arrayList.get(i3);
            i3++;
            Transition transition3 = transition2;
            if (transition3.mAutoTransition != 0 && ((transition = this.mCurrentTransition) != transition3 || !transition.isTransitionFlag(2))) {
                if (i2 == transition3.mConstraintSetStart && (transition3.mAutoTransition == 4 || transition3.mAutoTransition == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(transition3);
                    if (transition3.mAutoTransition == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
                if (i2 == transition3.mConstraintSetEnd && (transition3.mAutoTransition == 3 || transition3.mAutoTransition == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(transition3);
                    if (transition3.mAutoTransition == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public Transition bestTransitionFor(int i2, float f2, float f3, MotionEvent motionEvent) {
        if (i2 == -1) {
            return this.mCurrentTransition;
        }
        List<Transition> transitionsWithState = getTransitionsWithState(i2);
        RectF rectF = new RectF();
        float f4 = 0.0f;
        Transition transition = null;
        for (Transition transition2 : transitionsWithState) {
            if (!transition2.mDisable && transition2.mTouchResponse != null) {
                transition2.mTouchResponse.setRTL(this.mRtl);
                RectF touchRegion = transition2.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                if (touchRegion == null || motionEvent == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF limitBoundsTo = transition2.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo == null || motionEvent == null || limitBoundsTo.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fDot = transition2.mTouchResponse.dot(f2, f3);
                        if (transition2.mTouchResponse.mIsRotateMode && motionEvent != null) {
                            float x = motionEvent.getX() - transition2.mTouchResponse.mRotateCenterX;
                            float y2 = motionEvent.getY() - transition2.mTouchResponse.mRotateCenterY;
                            fDot = ((float) (Math.atan2(f3 + y2, f2 + x) - Math.atan2(x, y2))) * 10.0f;
                        }
                        float f5 = fDot * (transition2.mConstraintSetEnd == i2 ? -1.0f : 1.1f);
                        if (f5 > f4) {
                            transition = transition2;
                            f4 = f5;
                        }
                    }
                }
            }
        }
        return transition;
    }

    public void disableAutoTransition(boolean z) {
        this.mDisableAutoTransition = z;
    }

    public void enableViewTransition(int i2, boolean z) {
        this.mViewTransitionController.enableViewTransition(i2, z);
    }

    public int gatPathMotionArc() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mPathMotionArc;
        }
        return -1;
    }

    public int getAutoCompleteMode() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getAutoCompleteMode();
    }

    public ConstraintSet getConstraintSet(Context context, String str) {
        for (int i2 = 0; i2 < this.mConstraintSetMap.size(); i2++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i2);
            if (str.equals(context.getResources().getResourceName(iKeyAt))) {
                return this.mConstraintSetMap.get(iKeyAt);
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.mConstraintSetMap.keyAt(i2);
        }
        return iArr;
    }

    public ArrayList<Transition> getDefinedTransitions() {
        return this.mTransitionList;
    }

    public int getDuration() {
        Transition transition = this.mCurrentTransition;
        return transition != null ? transition.mDuration : this.mDefaultDuration;
    }

    public int getEndId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetEnd;
    }

    public Interpolator getInterpolator() {
        int i2 = this.mCurrentTransition.mDefaultInterpolator;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), this.mCurrentTransition.mDefaultInterpolatorID);
        }
        if (i2 == -1) {
            final Easing interpolator = Easing.getInterpolator(this.mCurrentTransition.mDefaultInterpolatorString);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f2) {
                    return (float) interpolator.get(f2);
                }
            };
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 == 5) {
            return new OvershootInterpolator();
        }
        if (i2 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public Key getKeyFrame(Context context, int i2, int i3, int i4) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return null;
        }
        ArrayList arrayList = transition.mKeyFramesList;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            KeyFrames keyFrames = (KeyFrames) obj;
            for (Integer num : keyFrames.getKeys()) {
                if (i3 == num.intValue()) {
                    ArrayList<Key> keyFramesForView = keyFrames.getKeyFramesForView(num.intValue());
                    int size2 = keyFramesForView.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Key key = keyFramesForView.get(i6);
                        i6++;
                        Key key2 = key;
                        if (key2.mFramePosition == i4 && key2.mType == i2) {
                            return key2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void getKeyFrames(MotionController motionController) {
        Transition transition = this.mCurrentTransition;
        int i2 = 0;
        if (transition != null) {
            ArrayList arrayList = transition.mKeyFramesList;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((KeyFrames) obj).addFrames(motionController);
            }
            return;
        }
        Transition transition2 = this.mDefaultTransition;
        if (transition2 != null) {
            ArrayList arrayList2 = transition2.mKeyFramesList;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                ((KeyFrames) obj2).addFrames(motionController);
            }
        }
    }

    public int[] getMatchingStateLabels(String... strArr) {
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintSet constraintSetValueAt = this.mConstraintSetMap.valueAt(i3);
            int iKeyAt = this.mConstraintSetMap.keyAt(i3);
            if (constraintSetValueAt.matchesLabels(strArr)) {
                constraintSetValueAt.getStateLabels();
                iArr[i2] = iKeyAt;
                i2++;
            }
        }
        return Arrays.copyOf(iArr, i2);
    }

    public float getMaxAcceleration() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxAcceleration();
    }

    public float getMaxVelocity() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxVelocity();
    }

    public boolean getMoveWhenScrollAtTop() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return false;
        }
        return this.mCurrentTransition.mTouchResponse.getMoveWhenScrollAtTop();
    }

    public float getPathPercent(View view, int i2) {
        return 0.0f;
    }

    public float getProgressDirection(float f2, float f3) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getProgressDirection(f2, f3);
    }

    public int getSpringBoundary() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringBoundary();
    }

    public float getSpringDamping() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringDamping();
    }

    public float getSpringMass() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringMass();
    }

    public float getSpringStiffiness() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStiffness();
    }

    public float getSpringStopThreshold() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStopThreshold();
    }

    public float getStaggered() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mStagger;
        }
        return 0.0f;
    }

    public int getStartId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetStart;
    }

    public Transition getTransitionById(int i2) {
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Transition transition = arrayList.get(i3);
            i3++;
            Transition transition2 = transition;
            if (transition2.mId == i2) {
                return transition2;
            }
        }
        return null;
    }

    public int getTransitionDirection(int i2) {
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Transition transition = arrayList.get(i3);
            i3++;
            if (transition.mConstraintSetStart == i2) {
                return 0;
            }
        }
        return 1;
    }

    public List<Transition> getTransitionsWithState(int i2) {
        int realID = getRealID(i2);
        ArrayList arrayList = new ArrayList();
        ArrayList<Transition> arrayList2 = this.mTransitionList;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Transition transition = arrayList2.get(i3);
            i3++;
            Transition transition2 = transition;
            if (transition2.mConstraintSetStart == realID || transition2.mConstraintSetEnd == realID) {
                arrayList.add(transition2);
            }
        }
        return arrayList;
    }

    public boolean hasKeyFramePosition(View view, int i2) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return false;
        }
        ArrayList arrayList = transition.mKeyFramesList;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList<Key> keyFramesForView = ((KeyFrames) obj).getKeyFramesForView(view.getId());
            int size2 = keyFramesForView.size();
            int i4 = 0;
            while (i4 < size2) {
                Key key = keyFramesForView.get(i4);
                i4++;
                if (key.mFramePosition == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isViewTransitionEnabled(int i2) {
        return this.mViewTransitionController.isViewTransitionEnabled(i2);
    }

    public int lookUpConstraintId(String str) {
        Integer num = this.mConstraintSetIdMap.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String lookUpConstraintName(int i2) {
        for (Map.Entry<String, Integer> entry : this.mConstraintSetIdMap.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i2) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public void processScrollMove(float f2, float f3) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollMove(f2, f3);
    }

    public void processScrollUp(float f2, float f3) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollUp(f2, f3);
    }

    public void processTouchEvent(MotionEvent motionEvent, int i2, MotionLayout motionLayout) {
        MotionLayout.MotionTracker motionTracker;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = this.mMotionLayout.obtainVelocityTracker();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (i2 != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.mLastTouchX = motionEvent.getRawX();
                this.mLastTouchY = motionEvent.getRawY();
                this.mLastTouchDown = motionEvent;
                this.mIgnoreTouch = false;
                if (this.mCurrentTransition.mTouchResponse != null) {
                    RectF limitBoundsTo = this.mCurrentTransition.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo != null && !limitBoundsTo.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        this.mLastTouchDown = null;
                        this.mIgnoreTouch = true;
                        return;
                    }
                    RectF touchRegion = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion == null || touchRegion.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        this.mMotionOutsideRegion = false;
                    } else {
                        this.mMotionOutsideRegion = true;
                    }
                    this.mCurrentTransition.mTouchResponse.setDown(this.mLastTouchX, this.mLastTouchY);
                    return;
                }
                return;
            }
            if (action == 2 && !this.mIgnoreTouch) {
                float rawY = motionEvent.getRawY() - this.mLastTouchY;
                float rawX = motionEvent.getRawX() - this.mLastTouchX;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.mLastTouchDown) == null) {
                    return;
                }
                Transition transitionBestTransitionFor = bestTransitionFor(i2, rawX, rawY, motionEvent2);
                if (transitionBestTransitionFor != null) {
                    motionLayout.setTransition(transitionBestTransitionFor);
                    RectF touchRegion2 = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion2 != null && !touchRegion2.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        z = true;
                    }
                    this.mMotionOutsideRegion = z;
                    this.mCurrentTransition.mTouchResponse.setUpTouchEvent(this.mLastTouchX, this.mLastTouchY);
                }
            }
        }
        if (this.mIgnoreTouch) {
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null && !this.mMotionOutsideRegion) {
            this.mCurrentTransition.mTouchResponse.processTouchEvent(motionEvent, this.mVelocityTracker, i2, this);
        }
        this.mLastTouchX = motionEvent.getRawX();
        this.mLastTouchY = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (motionTracker = this.mVelocityTracker) == null) {
            return;
        }
        motionTracker.recycle();
        this.mVelocityTracker = null;
        int i3 = motionLayout.mCurrentState;
        if (i3 != -1) {
            autoTransition(motionLayout, i3);
        }
    }

    public void readFallback(MotionLayout motionLayout) {
        for (int i2 = 0; i2 < this.mConstraintSetMap.size(); i2++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i2);
            if (hasCycleDependency(iKeyAt)) {
                Log.e(TypedValues.MotionScene.NAME, "Cannot be derived from yourself");
                return;
            }
            readConstraintChain(iKeyAt, motionLayout);
        }
    }

    public void removeTransition(Transition transition) {
        int index = getIndex(transition);
        if (index != -1) {
            this.mTransitionList.remove(index);
        }
    }

    public void setConstraintSet(int i2, ConstraintSet constraintSet) {
        this.mConstraintSetMap.put(i2, constraintSet);
    }

    public void setDuration(int i2) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            transition.setDuration(i2);
        } else {
            this.mDefaultDuration = i2;
        }
    }

    public void setKeyframe(View view, int i2, String str, Object obj) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return;
        }
        ArrayList arrayList = transition.mKeyFramesList;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ArrayList<Key> keyFramesForView = ((KeyFrames) obj2).getKeyFramesForView(view.getId());
            int size2 = keyFramesForView.size();
            int i4 = 0;
            while (i4 < size2) {
                Key key = keyFramesForView.get(i4);
                i4++;
                if (key.mFramePosition == i2 && obj != null) {
                }
            }
        }
    }

    public void setRtl(boolean z) {
        this.mRtl = z;
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0075 A[SYNTHETIC] */
    public void setTransition(int i2, int i3) {
        int iStateGetConstraintID;
        int iStateGetConstraintID2;
        Transition transition;
        ArrayList<Transition> arrayList;
        int size;
        int i4;
        int i5;
        Transition transition2;
        ArrayList<Transition> arrayList2;
        int size2;
        Transition transition3;
        Transition transition4;
        Transition transition5;
        StateSet stateSet = this.mStateSet;
        if (stateSet != null) {
            iStateGetConstraintID = stateSet.stateGetConstraintID(i2, -1, -1);
            if (iStateGetConstraintID == -1) {
                iStateGetConstraintID = i2;
            }
            iStateGetConstraintID2 = this.mStateSet.stateGetConstraintID(i3, -1, -1);
            if (iStateGetConstraintID2 == -1) {
            }
            transition = this.mCurrentTransition;
            if (transition == null && transition.mConstraintSetEnd == i3 && this.mCurrentTransition.mConstraintSetStart == i2) {
                return;
            }
            arrayList = this.mTransitionList;
            size = arrayList.size();
            i4 = 0;
            i5 = 0;
            while (true) {
                if (i5 < size) {
                    transition2 = this.mDefaultTransition;
                    arrayList2 = this.mAbstractTransitionList;
                    size2 = arrayList2.size();
                    while (i4 < size2) {
                        Transition transition6 = arrayList2.get(i4);
                        i4++;
                        transition4 = transition6;
                        if (transition4.mConstraintSetEnd == i3) {
                            transition2 = transition4;
                        }
                    }
                    transition3 = new Transition(this, transition2);
                    transition3.mConstraintSetStart = iStateGetConstraintID;
                    transition3.mConstraintSetEnd = iStateGetConstraintID2;
                    if (iStateGetConstraintID != -1) {
                        this.mTransitionList.add(transition3);
                    }
                    this.mCurrentTransition = transition3;
                    return;
                }
                Transition transition7 = arrayList.get(i5);
                i5++;
                transition5 = transition7;
                if ((transition5.mConstraintSetEnd != iStateGetConstraintID2 && transition5.mConstraintSetStart == iStateGetConstraintID) || (transition5.mConstraintSetEnd == i3 && transition5.mConstraintSetStart == i2)) {
                    break;
                }
            }
            this.mCurrentTransition = transition5;
            if (transition5 != null || transition5.mTouchResponse == null) {
            }
            this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
            return;
        }
        iStateGetConstraintID = i2;
        iStateGetConstraintID2 = i3;
        transition = this.mCurrentTransition;
        if (transition == null) {
        }
        arrayList = this.mTransitionList;
        size = arrayList.size();
        i4 = 0;
        i5 = 0;
        while (true) {
            if (i5 < size) {
                transition2 = this.mDefaultTransition;
                arrayList2 = this.mAbstractTransitionList;
                size2 = arrayList2.size();
                while (i4 < size2) {
                    Transition transition8 = arrayList2.get(i4);
                    i4++;
                    transition4 = transition8;
                    if (transition4.mConstraintSetEnd == i3) {
                        transition2 = transition4;
                    }
                }
                transition3 = new Transition(this, transition2);
                transition3.mConstraintSetStart = iStateGetConstraintID;
                transition3.mConstraintSetEnd = iStateGetConstraintID2;
                if (iStateGetConstraintID != -1) {
                    this.mTransitionList.add(transition3);
                }
                this.mCurrentTransition = transition3;
                return;
            }
            Transition transition9 = arrayList.get(i5);
            i5++;
            transition5 = transition9;
            if (transition5.mConstraintSetEnd != iStateGetConstraintID2) {
            }
        }
        this.mCurrentTransition = transition5;
        if (transition5 != null) {
        }
    }

    public void setupTouch() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setupTouch();
    }

    public boolean supportTouch() {
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Transition transition = arrayList.get(i2);
            i2++;
            if (transition.mTouchResponse != null) {
                return true;
            }
        }
        Transition transition2 = this.mCurrentTransition;
        return (transition2 == null || transition2.mTouchResponse == null) ? false : true;
    }

    public boolean validateLayout(MotionLayout motionLayout) {
        return motionLayout == this.mMotionLayout && motionLayout.mScene == this;
    }

    public void viewTransition(int i2, View... viewArr) {
        this.mViewTransitionController.viewTransition(i2, viewArr);
    }

    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        static final int TRANSITION_FLAG_INTERCEPT_TOUCH = 4;
        static final int TRANSITION_FLAG_INTRA_AUTO = 2;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private boolean mIsAbstract;
        private ArrayList<KeyFrames> mKeyFramesList;
        private int mLayoutDuringTransition;
        private final MotionScene mMotionScene;
        private ArrayList<TransitionOnClick> mOnClicks;
        private int mPathMotionArc;
        private float mStagger;
        private TouchResponse mTouchResponse;
        private int mTransitionFlags;

        public Transition(MotionScene motionScene, Transition transition) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mMotionScene = motionScene;
            this.mDuration = motionScene.mDefaultDuration;
            if (transition != null) {
                this.mPathMotionArc = transition.mPathMotionArc;
                this.mDefaultInterpolator = transition.mDefaultInterpolator;
                this.mDefaultInterpolatorString = transition.mDefaultInterpolatorString;
                this.mDefaultInterpolatorID = transition.mDefaultInterpolatorID;
                this.mDuration = transition.mDuration;
                this.mKeyFramesList = transition.mKeyFramesList;
                this.mStagger = transition.mStagger;
                this.mLayoutDuringTransition = transition.mLayoutDuringTransition;
            }
        }

        private void fill(MotionScene motionScene, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                if (index == C1137R.styleable.Transition_constraintSetEnd) {
                    this.mConstraintSetEnd = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintSetEnd);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.load(context, this.mConstraintSetEnd);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetEnd, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.mConstraintSetEnd = motionScene.parseInclude(context, this.mConstraintSetEnd);
                    }
                } else if (index == C1137R.styleable.Transition_constraintSetStart) {
                    this.mConstraintSetStart = typedArray.getResourceId(index, this.mConstraintSetStart);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.mConstraintSetStart);
                    if ("layout".equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.load(context, this.mConstraintSetStart);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetStart, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.mConstraintSetStart = motionScene.parseInclude(context, this.mConstraintSetStart);
                    }
                } else if (index == C1137R.styleable.Transition_motionInterpolator) {
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.mDefaultInterpolatorID = resourceId;
                        if (resourceId != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (i3 == 3) {
                        String string = typedArray.getString(index);
                        this.mDefaultInterpolatorString = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.mDefaultInterpolatorID = typedArray.getResourceId(index, -1);
                                this.mDefaultInterpolator = -2;
                            } else {
                                this.mDefaultInterpolator = -1;
                            }
                        }
                    } else {
                        this.mDefaultInterpolator = typedArray.getInteger(index, this.mDefaultInterpolator);
                    }
                } else if (index == C1137R.styleable.Transition_duration) {
                    int i4 = typedArray.getInt(index, this.mDuration);
                    this.mDuration = i4;
                    if (i4 < 8) {
                        this.mDuration = 8;
                    }
                } else if (index == C1137R.styleable.Transition_staggered) {
                    this.mStagger = typedArray.getFloat(index, this.mStagger);
                } else if (index == C1137R.styleable.Transition_autoTransition) {
                    this.mAutoTransition = typedArray.getInteger(index, this.mAutoTransition);
                } else if (index == C1137R.styleable.Transition_android_id) {
                    this.mId = typedArray.getResourceId(index, this.mId);
                } else if (index == C1137R.styleable.Transition_transitionDisable) {
                    this.mDisable = typedArray.getBoolean(index, this.mDisable);
                } else if (index == C1137R.styleable.Transition_pathMotionArc) {
                    this.mPathMotionArc = typedArray.getInteger(index, -1);
                } else if (index == C1137R.styleable.Transition_layoutDuringTransition) {
                    this.mLayoutDuringTransition = typedArray.getInteger(index, 0);
                } else if (index == C1137R.styleable.Transition_transitionFlags) {
                    this.mTransitionFlags = typedArray.getInteger(index, 0);
                }
            }
            if (this.mConstraintSetStart == -1) {
                this.mIsAbstract = true;
            }
        }

        private void fillFromAttributeList(MotionScene motionScene, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1137R.styleable.Transition);
            fill(motionScene, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void addKeyFrame(KeyFrames keyFrames) {
            this.mKeyFramesList.add(keyFrames);
        }

        public void addOnClick(int i2, int i3) {
            ArrayList<TransitionOnClick> arrayList = this.mOnClicks;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                TransitionOnClick transitionOnClick = arrayList.get(i4);
                i4++;
                TransitionOnClick transitionOnClick2 = transitionOnClick;
                if (transitionOnClick2.mTargetId == i2) {
                    transitionOnClick2.mMode = i3;
                    return;
                }
            }
            this.mOnClicks.add(new TransitionOnClick(this, i2, i3));
        }

        public String debugString(Context context) {
            String resourceEntryName = this.mConstraintSetStart == -1 ? "null" : context.getResources().getResourceEntryName(this.mConstraintSetStart);
            if (this.mConstraintSetEnd == -1) {
                return AbstractC0271e0.m414v(resourceEntryName, " -> null");
            }
            StringBuilder sbM410r = AbstractC0271e0.m410r(resourceEntryName, " -> ");
            sbM410r.append(context.getResources().getResourceEntryName(this.mConstraintSetEnd));
            return sbM410r.toString();
        }

        public int getAutoTransition() {
            return this.mAutoTransition;
        }

        public int getDuration() {
            return this.mDuration;
        }

        public int getEndConstraintSetId() {
            return this.mConstraintSetEnd;
        }

        public int getId() {
            return this.mId;
        }

        public List<KeyFrames> getKeyFrameList() {
            return this.mKeyFramesList;
        }

        public int getLayoutDuringTransition() {
            return this.mLayoutDuringTransition;
        }

        public List<TransitionOnClick> getOnClickList() {
            return this.mOnClicks;
        }

        public int getPathMotionArc() {
            return this.mPathMotionArc;
        }

        public float getStagger() {
            return this.mStagger;
        }

        public int getStartConstraintSetId() {
            return this.mConstraintSetStart;
        }

        public TouchResponse getTouchResponse() {
            return this.mTouchResponse;
        }

        public boolean isEnabled() {
            return !this.mDisable;
        }

        public boolean isTransitionFlag(int i2) {
            return (i2 & this.mTransitionFlags) != 0;
        }

        public void removeOnClick(int i2) {
            TransitionOnClick transitionOnClick;
            ArrayList<TransitionOnClick> arrayList = this.mOnClicks;
            int size = arrayList.size();
            int i3 = 0;
            do {
                if (i3 >= size) {
                    transitionOnClick = null;
                    break;
                } else {
                    TransitionOnClick transitionOnClick2 = arrayList.get(i3);
                    i3++;
                    transitionOnClick = transitionOnClick2;
                }
            } while (transitionOnClick.mTargetId != i2);
            if (transitionOnClick != null) {
                this.mOnClicks.remove(transitionOnClick);
            }
        }

        public void setAutoTransition(int i2) {
            this.mAutoTransition = i2;
        }

        public void setDuration(int i2) {
            this.mDuration = Math.max(i2, 8);
        }

        public void setEnabled(boolean z) {
            this.mDisable = !z;
        }

        public void setInterpolatorInfo(int i2, String str, int i3) {
            this.mDefaultInterpolator = i2;
            this.mDefaultInterpolatorString = str;
            this.mDefaultInterpolatorID = i3;
        }

        public void setLayoutDuringTransition(int i2) {
            this.mLayoutDuringTransition = i2;
        }

        public void setOnSwipe(OnSwipe onSwipe) {
            this.mTouchResponse = onSwipe == null ? null : new TouchResponse(this.mMotionScene.mMotionLayout, onSwipe);
        }

        public void setOnTouchUp(int i2) {
            TouchResponse touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.setTouchUpMode(i2);
            }
        }

        public void setPathMotionArc(int i2) {
            this.mPathMotionArc = i2;
        }

        public void setStagger(float f2) {
            this.mStagger = f2;
        }

        public void setTransitionFlag(int i2) {
            this.mTransitionFlags = i2;
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
            this.mOnClicks.add(new TransitionOnClick(context, this, xmlPullParser));
        }

        public static class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            int mMode;
            int mTargetId;
            private final Transition mTransition;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser xmlPullParser) {
                this.mTargetId = -1;
                this.mMode = 17;
                this.mTransition = transition;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1137R.styleable.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    if (index == C1137R.styleable.OnClick_targetId) {
                        this.mTargetId = typedArrayObtainStyledAttributes.getResourceId(index, this.mTargetId);
                    } else if (index == C1137R.styleable.OnClick_clickAction) {
                        this.mMode = typedArrayObtainStyledAttributes.getInt(index, this.mMode);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void addOnClickListeners(MotionLayout motionLayout, int i2, Transition transition) {
                boolean z;
                View viewFindViewById;
                int i3 = this.mTargetId;
                View view = motionLayout;
                if (i3 != -1) {
                    viewFindViewById = motionLayout.findViewById(i3);
                }
                if (view == null) {
                    view = viewFindViewById;
                    Log.e(TypedValues.MotionScene.NAME, "OnClick could not find id " + this.mTargetId);
                    return;
                }
                int i4 = transition.mConstraintSetStart;
                int i5 = transition.mConstraintSetEnd;
                if (i4 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i6 = this.mMode;
                boolean z2 = false;
                if ((i6 & 1) == 0 || i2 != i4) {
                    view = viewFindViewById;
                    z = false;
                } else {
                    z = true;
                }
                boolean z3 = ((i6 & 1) != 0 && i2 == i4) | z | ((i6 & 256) != 0 && i2 == i4) | ((i6 & 16) != 0 && i2 == i5);
                if ((i6 & 4096) != 0 && i2 == i5) {
                    z2 = true;
                }
                if (z3 || z2) {
                    view.setOnClickListener(this);
                }
            }

            public boolean isTransitionViable(Transition transition, MotionLayout motionLayout) {
                Transition transition2 = this.mTransition;
                if (transition2 == transition) {
                    return true;
                }
                int i2 = transition2.mConstraintSetEnd;
                int i3 = this.mTransition.mConstraintSetStart;
                if (i3 == -1) {
                    return motionLayout.mCurrentState != i2;
                }
                int i4 = motionLayout.mCurrentState;
                return i4 == i3 || i4 == i2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.mTransition.mMotionScene.mMotionLayout;
                if (motionLayout.isInteractionEnabled()) {
                    if (this.mTransition.mConstraintSetStart == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.transitionToState(this.mTransition.mConstraintSetEnd);
                            return;
                        }
                        Transition transition = new Transition(this.mTransition.mMotionScene, this.mTransition);
                        transition.mConstraintSetStart = currentState;
                        transition.mConstraintSetEnd = this.mTransition.mConstraintSetEnd;
                        motionLayout.setTransition(transition);
                        motionLayout.transitionToEnd();
                        return;
                    }
                    Transition transition2 = this.mTransition.mMotionScene.mCurrentTransition;
                    int i2 = this.mMode;
                    boolean z = false;
                    boolean z2 = ((i2 & 1) == 0 && (i2 & 256) == 0) ? false : true;
                    boolean z3 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        Transition transition3 = this.mTransition.mMotionScene.mCurrentTransition;
                        Transition transition4 = this.mTransition;
                        if (transition3 != transition4) {
                            motionLayout.setTransition(transition4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z3 = false;
                            z = z2;
                        }
                    } else {
                        z = z2;
                    }
                    if (isTransitionViable(transition2, motionLayout)) {
                        if (z && (this.mMode & 1) != 0) {
                            motionLayout.setTransition(this.mTransition);
                            motionLayout.transitionToEnd();
                            return;
                        }
                        if (z3 && (this.mMode & 16) != 0) {
                            motionLayout.setTransition(this.mTransition);
                            motionLayout.transitionToStart();
                        } else if (z && (this.mMode & 256) != 0) {
                            motionLayout.setTransition(this.mTransition);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z3 || (this.mMode & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.mTransition);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
                int i2 = this.mTargetId;
                if (i2 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i2);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e(TypedValues.MotionScene.NAME, " (*)  could not find id " + this.mTargetId);
            }

            public TransitionOnClick(Transition transition, int i2, int i3) {
                this.mTransition = transition;
                this.mTargetId = i2;
                this.mMode = i3;
            }
        }

        public Transition(int i2, MotionScene motionScene, int i3, int i4) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mId = i2;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = i3;
            this.mConstraintSetEnd = i4;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
        }

        public Transition(MotionScene motionScene, Context context, XmlPullParser xmlPullParser) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
            this.mMotionScene = motionScene;
            fillFromAttributeList(motionScene, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    public ConstraintSet getConstraintSet(int i2) {
        return getConstraintSet(i2, -1, -1);
    }

    public ConstraintSet getConstraintSet(int i2, int i3, int i4) {
        int iStateGetConstraintID;
        StateSet stateSet = this.mStateSet;
        if (stateSet != null && (iStateGetConstraintID = stateSet.stateGetConstraintID(i2, i3, i4)) != -1) {
            i2 = iStateGetConstraintID;
        }
        if (this.mConstraintSetMap.get(i2) == null) {
            Log.e(TypedValues.MotionScene.NAME, "Warning could not find ConstraintSet id/" + Debug.getName(this.mMotionLayout.getContext(), i2) + " In MotionScene");
            SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.mConstraintSetMap.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int parseInclude(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && CONSTRAINTSET_TAG.equals(name)) {
                    return parseConstraintSet(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e(TypedValues.MotionScene.NAME, "Error parsing resource: " + i2, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e(TypedValues.MotionScene.NAME, "Error parsing resource: " + i2, e2);
            return -1;
        }
    }

    public MotionScene(Context context, MotionLayout motionLayout, int i2) {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
        load(context, i2);
        SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
        int i3 = C1137R.id.motion_base;
        sparseArray.put(i3, new ConstraintSet());
        this.mConstraintSetIdMap.put("motion_base", Integer.valueOf(i3));
    }

    public void setTransition(Transition transition) {
        this.mCurrentTransition = transition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }
}
