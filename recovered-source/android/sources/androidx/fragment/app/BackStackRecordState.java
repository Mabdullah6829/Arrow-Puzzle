package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new Parcelable.Creator<BackStackRecordState>() { // from class: androidx.fragment.app.BackStackRecordState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState[] newArray(int i2) {
            return new BackStackRecordState[i2];
        }
    };
    private static final String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final ArrayList<String> mFragmentWhos;
    final int mIndex;
    final String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;

    public BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.mOps.size();
        this.mOps = new int[size * 6];
        if (!backStackRecord.mAddToBackStack) {
            throw new IllegalStateException("Not on back stack");
        }
        this.mFragmentWhos = new ArrayList<>(size);
        this.mOldMaxLifecycleStates = new int[size];
        this.mCurrentMaxLifecycleStates = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            FragmentTransaction.C1545Op c1545Op = backStackRecord.mOps.get(i3);
            int i4 = i2 + 1;
            this.mOps[i2] = c1545Op.mCmd;
            ArrayList<String> arrayList = this.mFragmentWhos;
            Fragment fragment = c1545Op.mFragment;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.mOps;
            iArr[i4] = c1545Op.mFromExpandedOp ? 1 : 0;
            iArr[i2 + 2] = c1545Op.mEnterAnim;
            iArr[i2 + 3] = c1545Op.mExitAnim;
            int i5 = i2 + 5;
            iArr[i2 + 4] = c1545Op.mPopEnterAnim;
            i2 += 6;
            iArr[i5] = c1545Op.mPopExitAnim;
            this.mOldMaxLifecycleStates[i3] = c1545Op.mOldMaxState.ordinal();
            this.mCurrentMaxLifecycleStates[i3] = c1545Op.mCurrentMaxState.ordinal();
        }
        this.mTransition = backStackRecord.mTransition;
        this.mName = backStackRecord.mName;
        this.mIndex = backStackRecord.mIndex;
        this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
        this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
        this.mSharedElementSourceNames = backStackRecord.mSharedElementSourceNames;
        this.mSharedElementTargetNames = backStackRecord.mSharedElementTargetNames;
        this.mReorderingAllowed = backStackRecord.mReorderingAllowed;
    }

    private void fillInBackStackRecord(BackStackRecord backStackRecord) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.mOps.length) {
                backStackRecord.mTransition = this.mTransition;
                backStackRecord.mName = this.mName;
                backStackRecord.mAddToBackStack = true;
                backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
                backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
                backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
                backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
                backStackRecord.mSharedElementSourceNames = this.mSharedElementSourceNames;
                backStackRecord.mSharedElementTargetNames = this.mSharedElementTargetNames;
                backStackRecord.mReorderingAllowed = this.mReorderingAllowed;
                return;
            }
            FragmentTransaction.C1545Op c1545Op = new FragmentTransaction.C1545Op();
            int i4 = i2 + 1;
            c1545Op.mCmd = this.mOps[i2];
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i3 + " base fragment #" + this.mOps[i4]);
            }
            c1545Op.mOldMaxState = Lifecycle.State.values()[this.mOldMaxLifecycleStates[i3]];
            c1545Op.mCurrentMaxState = Lifecycle.State.values()[this.mCurrentMaxLifecycleStates[i3]];
            int[] iArr = this.mOps;
            int i5 = i2 + 2;
            if (iArr[i4] == 0) {
                z = false;
            }
            c1545Op.mFromExpandedOp = z;
            int i6 = iArr[i5];
            c1545Op.mEnterAnim = i6;
            int i7 = iArr[i2 + 3];
            c1545Op.mExitAnim = i7;
            int i8 = i2 + 5;
            int i9 = iArr[i2 + 4];
            c1545Op.mPopEnterAnim = i9;
            i2 += 6;
            int i10 = iArr[i8];
            c1545Op.mPopExitAnim = i10;
            backStackRecord.mEnterAnim = i6;
            backStackRecord.mExitAnim = i7;
            backStackRecord.mPopEnterAnim = i9;
            backStackRecord.mPopExitAnim = i10;
            backStackRecord.addOp(c1545Op);
            i3++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BackStackRecord instantiate(FragmentManager fragmentManager) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        fillInBackStackRecord(backStackRecord);
        backStackRecord.mIndex = this.mIndex;
        for (int i2 = 0; i2 < this.mFragmentWhos.size(); i2++) {
            String str = this.mFragmentWhos.get(i2);
            if (str != null) {
                backStackRecord.mOps.get(i2).mFragment = fragmentManager.findActiveFragment(str);
            }
        }
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.mOps);
        parcel.writeStringList(this.mFragmentWhos);
        parcel.writeIntArray(this.mOldMaxLifecycleStates);
        parcel.writeIntArray(this.mCurrentMaxLifecycleStates);
        parcel.writeInt(this.mTransition);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed ? 1 : 0);
    }

    public BackStackRecord instantiate(FragmentManager fragmentManager, Map<String, Fragment> map) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        fillInBackStackRecord(backStackRecord);
        for (int i2 = 0; i2 < this.mFragmentWhos.size(); i2++) {
            String str = this.mFragmentWhos.get(i2);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment != null) {
                    backStackRecord.mOps.get(i2).mFragment = fragment;
                } else {
                    throw new IllegalStateException(AbstractC1456a.m2451r(new StringBuilder("Restoring FragmentTransaction "), this.mName, " failed due to missing saved state for Fragment (", str, ")"));
                }
            }
        }
        return backStackRecord;
    }

    public BackStackRecordState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mFragmentWhos = parcel.createStringArrayList();
        this.mOldMaxLifecycleStates = parcel.createIntArray();
        this.mCurrentMaxLifecycleStates = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.mBreadCrumbTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        this.mReorderingAllowed = parcel.readInt() != 0;
    }
}
