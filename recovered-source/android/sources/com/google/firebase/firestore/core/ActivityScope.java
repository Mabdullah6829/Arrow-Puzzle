package com.google.firebase.firestore.core;

import android.app.Activity;
import android.app.Fragment;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p011H.AbstractC0271e0;
import p011H.RunnableC0294w;
import p034T.RunnableC0758m;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityScope {
    private static final String FRAGMENT_TAG = "FirestoreOnStopObserverFragment";
    private static final String SUPPORT_FRAGMENT_TAG = "FirestoreOnStopObserverSupportFragment";

    public static class CallbackList {
        private final List<Runnable> callbacks;

        private CallbackList() {
            this.callbacks = new ArrayList();
        }

        public synchronized void add(Runnable runnable) {
            this.callbacks.add(runnable);
        }

        public void run() {
            for (Runnable runnable : this.callbacks) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static class StopListenerFragment extends Fragment {
        CallbackList callbacks = new CallbackList();

        @Override // android.app.Fragment
        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.callbacks) {
                callbackList = this.callbacks;
                this.callbacks = new CallbackList();
            }
            callbackList.run();
        }
    }

    public static class StopListenerSupportFragment extends androidx.fragment.app.Fragment {
        CallbackList callbacks = new CallbackList();

        @Override // androidx.fragment.app.Fragment
        public void onStop() {
            CallbackList callbackList;
            super.onStop();
            synchronized (this.callbacks) {
                callbackList = this.callbacks;
                this.callbacks = new CallbackList();
            }
            callbackList.run();
        }
    }

    public static ListenerRegistration bind(@Nullable Activity activity, ListenerRegistration listenerRegistration) {
        if (activity != null) {
            if (activity instanceof FragmentActivity) {
                Objects.requireNonNull(listenerRegistration);
                onFragmentActivityStopCallOnce((FragmentActivity) activity, new RunnableC0758m(listenerRegistration, 9));
                return listenerRegistration;
            }
            Objects.requireNonNull(listenerRegistration);
            onActivityStopCallOnce(activity, new RunnableC0758m(listenerRegistration, 9));
        }
        return listenerRegistration;
    }

    @Nullable
    private static <T> T castFragment(Class<T> cls, @Nullable Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            StringBuilder sbM411s = AbstractC0271e0.m411s("Fragment with tag '", str, "' is a ");
            sbM411s.append(obj.getClass().getName());
            sbM411s.append(" but should be a ");
            sbM411s.append(cls.getName());
            throw new IllegalStateException(sbM411s.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onActivityStopCallOnce$0(Activity activity, Runnable runnable) {
        StopListenerFragment stopListenerFragment = (StopListenerFragment) castFragment(StopListenerFragment.class, activity.getFragmentManager().findFragmentByTag(FRAGMENT_TAG), FRAGMENT_TAG);
        if (stopListenerFragment == null || stopListenerFragment.isRemoving()) {
            stopListenerFragment = new StopListenerFragment();
            activity.getFragmentManager().beginTransaction().add(stopListenerFragment, FRAGMENT_TAG).commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        stopListenerFragment.callbacks.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onFragmentActivityStopCallOnce$1(FragmentActivity fragmentActivity, Runnable runnable) {
        StopListenerSupportFragment stopListenerSupportFragment = (StopListenerSupportFragment) castFragment(StopListenerSupportFragment.class, fragmentActivity.getSupportFragmentManager().findFragmentByTag(SUPPORT_FRAGMENT_TAG), SUPPORT_FRAGMENT_TAG);
        if (stopListenerSupportFragment == null || stopListenerSupportFragment.isRemoving()) {
            stopListenerSupportFragment = new StopListenerSupportFragment();
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(stopListenerSupportFragment, SUPPORT_FRAGMENT_TAG).commitAllowingStateLoss();
            fragmentActivity.getSupportFragmentManager().executePendingTransactions();
        }
        stopListenerSupportFragment.callbacks.add(runnable);
    }

    private static void onActivityStopCallOnce(Activity activity, Runnable runnable) {
        Assert.hardAssert(!(activity instanceof FragmentActivity), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new RunnableC0294w(9, activity, runnable));
    }

    private static void onFragmentActivityStopCallOnce(FragmentActivity fragmentActivity, Runnable runnable) {
        fragmentActivity.runOnUiThread(new RunnableC0294w(8, fragmentActivity, runnable));
    }
}
