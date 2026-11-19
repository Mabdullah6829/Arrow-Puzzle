package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Preconditions;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10 */
    public static /* synthetic */ class C150210 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State */
        static final /* synthetic */ int[] f2793xe493b431;

        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            f2793xe493b431 = iArr;
            try {
                iArr[SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2793xe493b431[SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2793xe493b431[SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2793xe493b431[SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        public AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z) {
            super(operation, cancellationSignal);
            this.mLoadedAnim = false;
            this.mIsPop = z;
        }

        public FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            if (this.mLoadedAnim) {
                return this.mAnimation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.mIsPop);
            this.mAnimation = animationOrAnimatorLoadAnimation;
            this.mLoadedAnim = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    public static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation mOperation;
        private final CancellationSignal mSignal;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal) {
            this.mOperation = operation;
            this.mSignal = cancellationSignal;
        }

        public void completeSpecialEffect() {
            this.mOperation.completeSpecialEffect(this.mSignal);
        }

        public SpecialEffectsController.Operation getOperation() {
            return this.mOperation;
        }

        public CancellationSignal getSignal() {
            return this.mSignal;
        }

        public boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(this.mOperation.getFragment().mView);
            SpecialEffectsController.Operation.State finalState = this.mOperation.getFinalState();
            if (stateFrom == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateFrom == state || finalState == state) ? false : true;
        }
    }

    public DefaultSpecialEffectsController(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void startAnimations(List<AnimationInfo> list, List<SpecialEffectsController.Operation> list2, boolean z, Map<SpecialEffectsController.Operation, Boolean> map) {
        final SpecialEffectsController.Operation operation;
        final AnimationInfo animationInfo;
        final View view;
        final ViewGroup container = getContainer();
        Context context = container.getContext();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        for (final AnimationInfo animationInfo2 : list) {
            if (animationInfo2.isVisibilityUnchanged()) {
                animationInfo2.completeSpecialEffect();
            } else {
                FragmentAnim.AnimationOrAnimator animation = animationInfo2.getAnimation(context);
                if (animation == null) {
                    animationInfo2.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo2);
                    } else {
                        final SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
                        Fragment fragment = operation2.getFragment();
                        if (Boolean.TRUE.equals(map.get(operation2))) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo2.completeSpecialEffect();
                        } else {
                            final boolean z3 = operation2.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                            if (z3) {
                                list2.remove(operation2);
                            }
                            final View view2 = fragment.mView;
                            container.startViewTransition(view2);
                            final ViewGroup viewGroup = container;
                            container = viewGroup;
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.2
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator animator2) {
                                    viewGroup.endViewTransition(view2);
                                    if (z3) {
                                        operation2.getFinalState().applyState(view2);
                                    }
                                    animationInfo2.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Animator from operation " + operation2 + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animator from operation " + operation2 + " has started.");
                            }
                            animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.3
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public void onCancel() {
                                    animator.end();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Animator from operation " + operation2 + " has been canceled.");
                                    }
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            AnimationInfo animationInfo3 = (AnimationInfo) obj;
            SpecialEffectsController.Operation operation3 = animationInfo3.getOperation();
            Fragment fragment2 = operation3.getFragment();
            if (z) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo3.completeSpecialEffect();
            } else if (z2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo3.completeSpecialEffect();
            } else {
                View view3 = fragment2.mView;
                Animation animation2 = (Animation) Preconditions.checkNotNull(((FragmentAnim.AnimationOrAnimator) Preconditions.checkNotNull(animationInfo3.getAnimation(context))).animation);
                if (operation3.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view3.startAnimation(animation2);
                    animationInfo3.completeSpecialEffect();
                    operation = operation3;
                    animationInfo = animationInfo3;
                    view = view3;
                } else {
                    container.startViewTransition(view3);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view3);
                    operation = operation3;
                    animationInfo = animationInfo3;
                    view = view3;
                    endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation3) {
                            container.post(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnimationAnimationListenerC15054 animationAnimationListenerC15054 = AnimationAnimationListenerC15054.this;
                                    container.endViewTransition(view);
                                    animationInfo.completeSpecialEffect();
                                }
                            });
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has ended.");
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation3) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has reached onAnimationStart.");
                            }
                        }
                    });
                    view.startAnimation(endViewTransitionAnimation);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has started.");
                    }
                }
                CancellationSignal signal = animationInfo.getSignal();
                final AnimationInfo animationInfo4 = animationInfo;
                final SpecialEffectsController.Operation operation4 = operation;
                final View view4 = view;
                signal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.5
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        view4.clearAnimation();
                        container.endViewTransition(view4);
                        animationInfo4.completeSpecialEffect();
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Animation from operation " + operation4 + " has been cancelled.");
                        }
                    }
                });
            }
        }
    }

    private Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> list, List<SpecialEffectsController.Operation> list2, final boolean z, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
        String str;
        View view;
        String str2;
        ArrayList<View> arrayList;
        String str3;
        Object objMergeTransitionsTogether;
        Object objMergeTransitionsTogether2;
        ArrayList arrayList2;
        View view2;
        View view3;
        ArrayList<View> arrayList3;
        Object obj;
        HashMap map;
        boolean z2;
        SpecialEffectsController.Operation operation3;
        View view4;
        ArrayList<View> arrayList4;
        ArrayMap arrayMap;
        HashMap map2;
        Rect rect;
        SharedElementCallback enterTransitionCallback;
        SharedElementCallback exitTransitionCallback;
        int i2;
        final Rect rect2;
        final View view5;
        String strFindKeyForValue;
        int i3;
        final SpecialEffectsController.Operation operation4 = operation;
        final SpecialEffectsController.Operation operation5 = operation2;
        HashMap map3 = new HashMap();
        final FragmentTransitionImpl fragmentTransitionImpl = null;
        for (TransitionInfo transitionInfo : list) {
            if (!transitionInfo.isVisibilityUnchanged()) {
                FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
                if (fragmentTransitionImpl == null) {
                    fragmentTransitionImpl = handlingImpl;
                } else if (handlingImpl != null && fragmentTransitionImpl != handlingImpl) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (fragmentTransitionImpl == null) {
            for (TransitionInfo transitionInfo2 : list) {
                map3.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return map3;
        }
        View view6 = new View(getContainer().getContext());
        Rect rect3 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        ArrayMap arrayMap2 = new ArrayMap();
        Iterator<TransitionInfo> it = list.iterator();
        Object obj2 = null;
        View view7 = null;
        boolean z3 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            str = FragmentManager.TAG;
            view = view7;
            if (!zHasNext) {
                break;
            }
            TransitionInfo next = it.next();
            if (!next.hasSharedElementTransition() || operation4 == null || operation5 == null) {
                view4 = view6;
                arrayList4 = arrayList5;
                arrayMap = arrayMap2;
                map2 = map3;
                rect = rect3;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(next.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation5.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = operation4.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = operation4.getFragment().getSharedElementTargetNames();
                HashMap map4 = map3;
                int i4 = 0;
                while (i4 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i4));
                    }
                    i4++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = operation5.getFragment().getSharedElementTargetNames();
                if (z == 0) {
                    enterTransitionCallback = operation4.getFragment().getExitTransitionCallback();
                    exitTransitionCallback = operation5.getFragment().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = operation4.getFragment().getEnterTransitionCallback();
                    exitTransitionCallback = operation5.getFragment().getExitTransitionCallback();
                }
                View view8 = view6;
                int i5 = 0;
                for (int size = sharedElementSourceNames.size(); i5 < size; size = size) {
                    arrayMap2.put(sharedElementSourceNames.get(i5), sharedElementTargetNames2.get(i5));
                    i5++;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    int i6 = 0;
                    for (int size2 = sharedElementTargetNames2.size(); i6 < size2; size2 = size2) {
                        String str4 = sharedElementTargetNames2.get(i6);
                        Log.v(FragmentManager.TAG, "Name: " + str4);
                        i6++;
                    }
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    int i7 = 0;
                    for (int size3 = sharedElementSourceNames.size(); i7 < size3; size3 = size3) {
                        String str5 = sharedElementSourceNames.get(i7);
                        Log.v(FragmentManager.TAG, "Name: " + str5);
                        i7++;
                    }
                }
                ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                findNamedViews(arrayMap3, operation4.getFragment().mView);
                arrayMap3.retainAll(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + operation4);
                    }
                    enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, arrayMap3);
                    int size4 = sharedElementSourceNames.size() - 1;
                    while (size4 >= 0) {
                        String str6 = sharedElementSourceNames.get(size4);
                        View view9 = arrayMap3.get(str6);
                        if (view9 == null) {
                            arrayMap2.remove(str6);
                            i3 = size4;
                        } else {
                            i3 = size4;
                            if (!str6.equals(ViewCompat.getTransitionName(view9))) {
                                arrayMap2.put(ViewCompat.getTransitionName(view9), (String) arrayMap2.remove(str6));
                            }
                        }
                        size4 = i3 - 1;
                    }
                } else {
                    arrayMap2.retainAll(arrayMap3.keySet());
                }
                final ArrayMap<String, View> arrayMap4 = new ArrayMap<>();
                findNamedViews(arrayMap4, operation5.getFragment().mView);
                arrayMap4.retainAll(sharedElementTargetNames2);
                arrayMap4.retainAll(arrayMap2.values());
                if (exitTransitionCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + operation5);
                    }
                    exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, arrayMap4);
                    for (int size5 = sharedElementTargetNames2.size() - 1; size5 >= 0; size5--) {
                        String str7 = sharedElementTargetNames2.get(size5);
                        View view10 = arrayMap4.get(str7);
                        if (view10 == null) {
                            String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap2, str7);
                            if (strFindKeyForValue2 != null) {
                                arrayMap2.remove(strFindKeyForValue2);
                            }
                        } else if (!str7.equals(ViewCompat.getTransitionName(view10)) && (strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap2, str7)) != null) {
                            arrayMap2.put(strFindKeyForValue, ViewCompat.getTransitionName(view10));
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap2, arrayMap4);
                }
                retainMatchingViews(arrayMap3, arrayMap2.keySet());
                retainMatchingViews(arrayMap4, arrayMap2.values());
                if (arrayMap2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    arrayList4 = arrayList5;
                    arrayMap = arrayMap2;
                    arrayList6 = arrayList6;
                    view7 = view;
                    map2 = map4;
                    view4 = view8;
                    rect = rect3;
                    obj2 = null;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation5.getFragment(), operation4.getFragment(), z, arrayMap3, true);
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.6
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentTransition.callSharedElementStartEnd(operation5.getFragment(), operation4.getFragment(), z, arrayMap4, false);
                        }
                    });
                    arrayList5.addAll(arrayMap3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        View view11 = arrayMap3.get(sharedElementSourceNames.get(0));
                        fragmentTransitionImpl.setEpicenter(objWrapTransitionInSet, view11);
                        view = view11;
                    }
                    arrayList6.addAll(arrayMap4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = arrayMap4.get(sharedElementTargetNames2.get(i2))) == null) {
                        rect2 = rect3;
                    } else {
                        rect2 = rect3;
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.7
                            @Override // java.lang.Runnable
                            public void run() {
                                fragmentTransitionImpl.getBoundsOnScreen(view5, rect2);
                            }
                        });
                        z3 = true;
                    }
                    fragmentTransitionImpl.setSharedElementTargets(objWrapTransitionInSet, view8, arrayList5);
                    Rect rect4 = rect2;
                    arrayList4 = arrayList5;
                    rect = rect4;
                    arrayMap = arrayMap2;
                    view4 = view8;
                    fragmentTransitionImpl.scheduleRemoveTargets(objWrapTransitionInSet, null, null, null, null, objWrapTransitionInSet, arrayList6);
                    Boolean bool = Boolean.TRUE;
                    map2 = map4;
                    map2.put(operation4, bool);
                    map2.put(operation5, bool);
                    obj2 = objWrapTransitionInSet;
                }
                rect3 = rect;
                arrayList6 = arrayList6;
                map3 = map2;
                arrayMap2 = arrayMap;
                view6 = view4;
                arrayList5 = arrayList4;
            }
            view7 = view;
            rect3 = rect;
            arrayList6 = arrayList6;
            map3 = map2;
            arrayMap2 = arrayMap;
            view6 = view4;
            arrayList5 = arrayList4;
        }
        ArrayList<View> arrayList8 = arrayList5;
        HashMap map5 = map3;
        Rect rect5 = rect3;
        ArrayList<View> arrayList9 = arrayList8;
        View view12 = view6;
        ArrayMap arrayMap5 = arrayMap2;
        ArrayList<View> arrayList10 = arrayList6;
        boolean z4 = true;
        ArrayList arrayList11 = new ArrayList();
        Object obj3 = null;
        Object obj4 = null;
        for (TransitionInfo transitionInfo3 : list) {
            if (transitionInfo3.isVisibilityUnchanged()) {
                map5.put(transitionInfo3.getOperation(), Boolean.FALSE);
                transitionInfo3.completeSpecialEffect();
                z4 = true;
            } else {
                Object objCloneTransition = fragmentTransitionImpl.cloneTransition(transitionInfo3.getTransition());
                SpecialEffectsController.Operation operation6 = transitionInfo3.getOperation();
                boolean z5 = obj2 != null && (operation6 == operation4 || operation6 == operation5);
                if (objCloneTransition == null) {
                    if (!z5) {
                        map5.put(operation6, Boolean.FALSE);
                        transitionInfo3.completeSpecialEffect();
                    }
                    view2 = view12;
                    str3 = str;
                    arrayList = arrayList9;
                    map = map5;
                    arrayList2 = arrayList11;
                    view3 = view;
                    z2 = true;
                    arrayList3 = arrayList10;
                } else {
                    HashMap map6 = map5;
                    final ArrayList<View> arrayList12 = new ArrayList<>();
                    ArrayList arrayList13 = arrayList11;
                    captureTransitioningViews(arrayList12, operation6.getFragment().mView);
                    if (z5) {
                        if (operation6 == operation4) {
                            arrayList12.removeAll(arrayList9);
                        } else {
                            arrayList12.removeAll(arrayList10);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        fragmentTransitionImpl.addTarget(objCloneTransition, view12);
                        view2 = view12;
                        str3 = str;
                        arrayList = arrayList9;
                        operation3 = operation6;
                        objMergeTransitionsTogether2 = obj3;
                        objMergeTransitionsTogether = obj4;
                        view3 = view;
                        arrayList2 = arrayList13;
                        arrayList3 = arrayList10;
                        obj = objCloneTransition;
                        map = map6;
                        z2 = true;
                    } else {
                        fragmentTransitionImpl.addTargets(objCloneTransition, arrayList12);
                        arrayList = arrayList9;
                        str3 = str;
                        objMergeTransitionsTogether = obj4;
                        objMergeTransitionsTogether2 = obj3;
                        arrayList2 = arrayList13;
                        view2 = view12;
                        view3 = view;
                        arrayList3 = arrayList10;
                        obj = objCloneTransition;
                        map = map6;
                        z2 = true;
                        fragmentTransitionImpl.scheduleRemoveTargets(obj, objCloneTransition, arrayList12, null, null, null, null);
                        if (operation6.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operation6;
                            list2.remove(operation3);
                            ArrayList<View> arrayList14 = new ArrayList<>(arrayList12);
                            arrayList14.remove(operation3.getFragment().mView);
                            fragmentTransitionImpl.scheduleHideFragmentView(obj, operation3.getFragment().mView, arrayList14);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentTransition.setViewVisibility(arrayList12, 4);
                                }
                            });
                        } else {
                            operation3 = operation6;
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList2.addAll(arrayList12);
                        if (z3) {
                            fragmentTransitionImpl.setEpicenter(obj, rect5);
                        }
                    } else {
                        fragmentTransitionImpl.setEpicenter(obj, view3);
                    }
                    map.put(operation3, Boolean.TRUE);
                    if (transitionInfo3.isOverlapAllowed()) {
                        objMergeTransitionsTogether2 = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, obj, null);
                    } else {
                        objMergeTransitionsTogether = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, obj, null);
                    }
                    obj3 = objMergeTransitionsTogether2;
                    obj4 = objMergeTransitionsTogether;
                }
                operation4 = operation;
                operation5 = operation2;
                map5 = map;
                arrayList11 = arrayList2;
                arrayList10 = arrayList3;
                str = str3;
                z4 = z2;
                arrayList9 = arrayList;
                view = view3;
                view12 = view2;
            }
        }
        String str8 = str;
        ArrayList<View> arrayList15 = arrayList10;
        ArrayList<View> arrayList16 = arrayList9;
        HashMap map7 = map5;
        ArrayList arrayList17 = arrayList11;
        boolean z6 = z4;
        Object objMergeTransitionsInSequence = fragmentTransitionImpl.mergeTransitionsInSequence(obj3, obj4, obj2);
        if (objMergeTransitionsInSequence == null) {
            return map7;
        }
        for (final TransitionInfo transitionInfo4 : list) {
            if (!transitionInfo4.isVisibilityUnchanged()) {
                Object transition = transitionInfo4.getTransition();
                final SpecialEffectsController.Operation operation7 = transitionInfo4.getOperation();
                boolean z7 = (obj2 == null || !(operation7 == operation || operation7 == operation2)) ? false : z6;
                if (transition == null && !z7) {
                    str2 = str8;
                } else if (ViewCompat.isLaidOut(getContainer())) {
                    str2 = str8;
                    fragmentTransitionImpl.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), objMergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.9
                        @Override // java.lang.Runnable
                        public void run() {
                            transitionInfo4.completeSpecialEffect();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Transition for operation " + operation7 + "has completed");
                            }
                        }
                    });
                } else {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        str2 = str8;
                        Log.v(str2, "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation7);
                    } else {
                        str2 = str8;
                    }
                    transitionInfo4.completeSpecialEffect();
                }
                str8 = str2;
            }
        }
        String str9 = str8;
        if (!ViewCompat.isLaidOut(getContainer())) {
            return map7;
        }
        FragmentTransition.setViewVisibility(arrayList17, 4);
        ArrayList<String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImpl.prepareSetNameOverridesReordered(arrayList15);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(str9, ">>>>> Beginning transition <<<<<");
            Log.v(str9, ">>>>> SharedElementFirstOutViews <<<<<");
            int size6 = arrayList16.size();
            int i8 = 0;
            while (i8 < size6) {
                View view13 = arrayList16.get(i8);
                i8++;
                View view14 = view13;
                Log.v(str9, "View: " + view14 + " Name: " + ViewCompat.getTransitionName(view14));
            }
            Log.v(str9, ">>>>> SharedElementLastInViews <<<<<");
            int size7 = arrayList15.size();
            int i9 = 0;
            while (i9 < size7) {
                View view15 = arrayList15.get(i9);
                i9++;
                View view16 = view15;
                Log.v(str9, "View: " + view16 + " Name: " + ViewCompat.getTransitionName(view16));
            }
        }
        fragmentTransitionImpl.beginDelayedTransition(getContainer(), objMergeTransitionsInSequence);
        fragmentTransitionImpl.setNameOverridesReordered(getContainer(), arrayList16, arrayList15, arrayListPrepareSetNameOverridesReordered, arrayMap5);
        FragmentTransition.setViewVisibility(arrayList17, 0);
        fragmentTransitionImpl.swapSharedElementTargets(obj2, arrayList16, arrayList15);
        return map7;
    }

    private void syncAnimations(List<SpecialEffectsController.Operation> list) {
        Fragment fragment = list.get(list.size() - 1).getFragment();
        for (SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    public void applyContainerChanges(SpecialEffectsController.Operation operation) {
        operation.getFinalState().applyState(operation.getFragment().mView);
    }

    public void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                captureTransitioningViews(arrayList, childAt);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    @Override // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(List<SpecialEffectsController.Operation> list, boolean z) {
        int i2;
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation operation3 : list) {
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(operation3.getFragment().mView);
            int i3 = C150210.f2793xe493b431[operation3.getFinalState().ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                if (stateFrom == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i3 == 4 && stateFrom != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Executing operations from " + operation + " to " + operation2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList(list);
        syncAnimations(list);
        Iterator<SpecialEffectsController.Operation> it = list.iterator();
        while (true) {
            i2 = 0;
            z = false;
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            final SpecialEffectsController.Operation next = it.next();
            CancellationSignal cancellationSignal = new CancellationSignal();
            next.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new AnimationInfo(next, cancellationSignal, z));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            next.markStartedSpecialEffect(cancellationSignal2);
            if (z) {
                if (next == operation) {
                    z2 = true;
                }
            } else if (next == operation2) {
                z2 = true;
            }
            arrayList2.add(new TransitionInfo(next, cancellationSignal2, z, z2));
            next.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                @Override // java.lang.Runnable
                public void run() {
                    if (arrayList3.contains(next)) {
                        arrayList3.remove(next);
                        DefaultSpecialEffectsController.this.applyContainerChanges(next);
                    }
                }
            });
        }
        Map<SpecialEffectsController.Operation, Boolean> mapStartTransitions = startTransitions(arrayList2, arrayList3, z, operation, operation2);
        startAnimations(arrayList, arrayList3, mapStartTransitions.containsValue(Boolean.TRUE), mapStartTransitions);
        int size = arrayList3.size();
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            applyContainerChanges((SpecialEffectsController.Operation) obj);
        }
        arrayList3.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Completed executing operations from " + operation + " to " + operation2);
        }
    }

    public void findNamedViews(Map<String, View> map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    public void retainMatchingViews(ArrayMap<String, View> arrayMap, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.getTransitionName(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    public static class TransitionInfo extends SpecialEffectsInfo {
        private final boolean mOverlapAllowed;
        private final Object mSharedElementTransition;
        private final Object mTransition;

        public TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal cancellationSignal, boolean z, boolean z2) {
            super(operation, cancellationSignal);
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                this.mTransition = z ? operation.getFragment().getReenterTransition() : operation.getFragment().getEnterTransition();
                this.mOverlapAllowed = z ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap();
            } else {
                this.mTransition = z ? operation.getFragment().getReturnTransition() : operation.getFragment().getExitTransition();
                this.mOverlapAllowed = true;
            }
            if (!z2) {
                this.mSharedElementTransition = null;
            } else if (z) {
                this.mSharedElementTransition = operation.getFragment().getSharedElementReturnTransition();
            } else {
                this.mSharedElementTransition = operation.getFragment().getSharedElementEnterTransition();
            }
        }

        public FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.mTransition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.mSharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl != null ? handlingImpl : handlingImpl2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.mTransition + " which uses a different Transition  type than its shared element transition " + this.mSharedElementTransition);
        }

        public Object getSharedElementTransition() {
            return this.mSharedElementTransition;
        }

        public Object getTransition() {
            return this.mTransition;
        }

        public boolean hasSharedElementTransition() {
            return this.mSharedElementTransition != null;
        }

        public boolean isOverlapAllowed() {
            return this.mOverlapAllowed;
        }

        private FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
