package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class DiffUtil {
    private static final Comparator<Diagonal> DIAGONAL_COMPARATOR = new Comparator<Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Diagonal diagonal, Diagonal diagonal2) {
            return diagonal.f2831x - diagonal2.f2831x;
        }
    };

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i2, int i3);

        public abstract boolean areItemsTheSame(int i2, int i3);

        public Object getChangePayload(int i2, int i3) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class CenteredArray {
        private final int[] mData;
        private final int mMid;

        public CenteredArray(int i2) {
            int[] iArr = new int[i2];
            this.mData = iArr;
            this.mMid = iArr.length / 2;
        }

        public int[] backingData() {
            return this.mData;
        }

        public void fill(int i2) {
            Arrays.fill(this.mData, i2);
        }

        public int get(int i2) {
            return this.mData[i2 + this.mMid];
        }

        public void set(int i2, int i3) {
            this.mData[i2 + this.mMid] = i3;
        }
    }

    public static class Diagonal {
        public final int size;

        /* JADX INFO: renamed from: x */
        public final int f2831x;

        /* JADX INFO: renamed from: y */
        public final int f2832y;

        public Diagonal(int i2, int i3, int i4) {
            this.f2831x = i2;
            this.f2832y = i3;
            this.size = i4;
        }

        public int endX() {
            return this.f2831x + this.size;
        }

        public int endY() {
            return this.f2832y + this.size;
        }
    }

    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final List<Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        public DiffResult(Callback callback, List<Diagonal> list, int[] iArr, int[] iArr2, boolean z) {
            this.mDiagonals = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            Diagonal diagonal = this.mDiagonals.isEmpty() ? null : this.mDiagonals.get(0);
            if (diagonal == null || diagonal.f2831x != 0 || diagonal.f2832y != 0) {
                this.mDiagonals.add(0, new Diagonal(0, 0, 0));
            }
            this.mDiagonals.add(new Diagonal(this.mOldListSize, this.mNewListSize, 0));
        }

        private void findMatchingAddition(int i2) {
            int size = this.mDiagonals.size();
            int iEndY = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Diagonal diagonal = this.mDiagonals.get(i3);
                while (iEndY < diagonal.f2832y) {
                    if (this.mNewItemStatuses[iEndY] == 0 && this.mCallback.areItemsTheSame(i2, iEndY)) {
                        int i4 = this.mCallback.areContentsTheSame(i2, iEndY) ? 8 : 4;
                        this.mOldItemStatuses[i2] = (iEndY << 4) | i4;
                        this.mNewItemStatuses[iEndY] = (i2 << 4) | i4;
                        return;
                    }
                    iEndY++;
                }
                iEndY = diagonal.endY();
            }
        }

        private void findMatchingItems() {
            for (Diagonal diagonal : this.mDiagonals) {
                for (int i2 = 0; i2 < diagonal.size; i2++) {
                    int i3 = diagonal.f2831x + i2;
                    int i4 = diagonal.f2832y + i2;
                    int i5 = this.mCallback.areContentsTheSame(i3, i4) ? 1 : 2;
                    this.mOldItemStatuses[i3] = (i4 << 4) | i5;
                    this.mNewItemStatuses[i4] = (i3 << 4) | i5;
                }
            }
            if (this.mDetectMoves) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int iEndX = 0;
            for (Diagonal diagonal : this.mDiagonals) {
                while (iEndX < diagonal.f2831x) {
                    if (this.mOldItemStatuses[iEndX] == 0) {
                        findMatchingAddition(iEndX);
                    }
                    iEndX++;
                }
                iEndX = diagonal.endX();
            }
        }

        private static PostponedUpdate getPostponedUpdate(Collection<PostponedUpdate> collection, int i2, boolean z) {
            PostponedUpdate next;
            Iterator<PostponedUpdate> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.posInOwnerList == i2 && next.removal == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate next2 = it.next();
                if (z) {
                    next2.currentPos--;
                } else {
                    next2.currentPos++;
                }
            }
            return next;
        }

        public int convertNewPositionToOld(int i2) {
            if (i2 < 0 || i2 >= this.mNewListSize) {
                StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index out of bounds - passed position = ", ", new list size = ");
                sbM404l.append(this.mNewListSize);
                throw new IndexOutOfBoundsException(sbM404l.toString());
            }
            int i3 = this.mNewItemStatuses[i2];
            if ((i3 & 15) == 0) {
                return -1;
            }
            return i3 >> 4;
        }

        public int convertOldPositionToNew(int i2) {
            if (i2 < 0 || i2 >= this.mOldListSize) {
                StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index out of bounds - passed position = ", ", old list size = ");
                sbM404l.append(this.mOldListSize);
                throw new IndexOutOfBoundsException(sbM404l.toString());
            }
            int i3 = this.mOldItemStatuses[i2];
            if ((i3 & 15) == 0) {
                return -1;
            }
            return i3 >> 4;
        }

        public void dispatchUpdatesTo(RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(ListUpdateCallback listUpdateCallback) {
            int i2;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            int i3 = this.mOldListSize;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i4 = this.mOldListSize;
            int i5 = this.mNewListSize;
            for (int size = this.mDiagonals.size() - 1; size >= 0; size--) {
                Diagonal diagonal = this.mDiagonals.get(size);
                int iEndX = diagonal.endX();
                int iEndY = diagonal.endY();
                while (true) {
                    if (i4 <= iEndX) {
                        break;
                    }
                    i4--;
                    int i6 = this.mOldItemStatuses[i4];
                    if ((i6 & 12) != 0) {
                        int i7 = i6 >> 4;
                        PostponedUpdate postponedUpdate = getPostponedUpdate(arrayDeque, i7, false);
                        if (postponedUpdate != null) {
                            int i8 = (i3 - postponedUpdate.currentPos) - 1;
                            batchingListUpdateCallback.onMoved(i4, i8);
                            if ((i6 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i8, 1, this.mCallback.getChangePayload(i4, i7));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i4, (i3 - i4) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i4, 1);
                        i3--;
                    }
                }
                while (i5 > iEndY) {
                    i5--;
                    int i9 = this.mNewItemStatuses[i5];
                    if ((i9 & 12) != 0) {
                        int i10 = i9 >> 4;
                        PostponedUpdate postponedUpdate2 = getPostponedUpdate(arrayDeque, i10, true);
                        if (postponedUpdate2 == null) {
                            arrayDeque.add(new PostponedUpdate(i5, i3 - i4, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i3 - postponedUpdate2.currentPos) - 1, i4);
                            if ((i9 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i4, 1, this.mCallback.getChangePayload(i10, i5));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i4, 1);
                        i3++;
                    }
                }
                int i11 = diagonal.f2831x;
                int i12 = diagonal.f2832y;
                for (i2 = 0; i2 < diagonal.size; i2++) {
                    if ((this.mOldItemStatuses[i11] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i11, 1, this.mCallback.getChangePayload(i11, i12));
                    }
                    i11++;
                    i12++;
                }
                i4 = diagonal.f2831x;
                i5 = diagonal.f2832y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    public static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        public PostponedUpdate(int i2, int i3, boolean z) {
            this.posInOwnerList = i2;
            this.currentPos = i3;
            this.removal = z;
        }
    }

    public static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
        }

        public int newSize() {
            return this.newListEnd - this.newListStart;
        }

        public int oldSize() {
            return this.oldListEnd - this.oldListStart;
        }

        public Range(int i2, int i3, int i4, int i5) {
            this.oldListStart = i2;
            this.oldListEnd = i3;
            this.newListStart = i4;
            this.newListEnd = i5;
        }
    }

    public static class Snake {
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        public int diagonalSize() {
            return Math.min(this.endX - this.startX, this.endY - this.startY);
        }

        public boolean hasAdditionOrRemoval() {
            return this.endY - this.startY != this.endX - this.startX;
        }

        public boolean isAddition() {
            return this.endY - this.startY > this.endX - this.startX;
        }

        public Diagonal toDiagonal() {
            if (!hasAdditionOrRemoval()) {
                int i2 = this.startX;
                return new Diagonal(i2, this.startY, this.endX - i2);
            }
            if (this.reverse) {
                return new Diagonal(this.startX, this.startY, diagonalSize());
            }
            return isAddition() ? new Diagonal(this.startX, this.startY + 1, diagonalSize()) : new Diagonal(this.startX + 1, this.startY, diagonalSize());
        }
    }

    private DiffUtil() {
    }

    private static Snake backward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = (range.oldSize() - range.newSize()) % 2 == 0;
        int iOldSize = range.oldSize() - range.newSize();
        int i6 = -i2;
        for (int i7 = i6; i7 <= i2; i7 += 2) {
            if (i7 == i6 || (i7 != i2 && centeredArray2.get(i7 + 1) < centeredArray2.get(i7 - 1))) {
                i3 = centeredArray2.get(i7 + 1);
                i4 = i3;
            } else {
                i3 = centeredArray2.get(i7 - 1);
                i4 = i3 - 1;
            }
            int i8 = range.newListEnd - ((range.oldListEnd - i4) - i7);
            int i9 = (i2 == 0 || i4 != i3) ? i8 : i8 + 1;
            while (i4 > range.oldListStart && i8 > range.newListStart && callback.areItemsTheSame(i4 - 1, i8 - 1)) {
                i4--;
                i8--;
            }
            centeredArray2.set(i7, i4);
            if (z && (i5 = iOldSize - i7) >= i6 && i5 <= i2 && centeredArray.get(i5) >= i4) {
                Snake snake = new Snake();
                snake.startX = i4;
                snake.startY = i8;
                snake.endX = i3;
                snake.endY = i9;
                snake.reverse = true;
                return snake;
            }
        }
        return null;
    }

    public static DiffResult calculateDiff(Callback callback) {
        return calculateDiff(callback, true);
    }

    private static Snake forward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = Math.abs(range.oldSize() - range.newSize()) % 2 == 1;
        int iOldSize = range.oldSize() - range.newSize();
        int i6 = -i2;
        for (int i7 = i6; i7 <= i2; i7 += 2) {
            if (i7 == i6 || (i7 != i2 && centeredArray.get(i7 + 1) > centeredArray.get(i7 - 1))) {
                i3 = centeredArray.get(i7 + 1);
                i4 = i3;
            } else {
                i3 = centeredArray.get(i7 - 1);
                i4 = i3 + 1;
            }
            int i8 = ((i4 - range.oldListStart) + range.newListStart) - i7;
            int i9 = (i2 == 0 || i4 != i3) ? i8 : i8 - 1;
            while (i4 < range.oldListEnd && i8 < range.newListEnd && callback.areItemsTheSame(i4, i8)) {
                i4++;
                i8++;
            }
            centeredArray.set(i7, i4);
            if (z && (i5 = iOldSize - i7) >= i6 + 1 && i5 <= i2 - 1 && centeredArray2.get(i5) <= i4) {
                Snake snake = new Snake();
                snake.startX = i3;
                snake.startY = i9;
                snake.endX = i4;
                snake.endY = i8;
                snake.reverse = false;
                return snake;
            }
        }
        return null;
    }

    private static Snake midPoint(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2) {
        if (range.oldSize() >= 1 && range.newSize() >= 1) {
            int iOldSize = ((range.oldSize() + range.newSize()) + 1) / 2;
            centeredArray.set(1, range.oldListStart);
            centeredArray2.set(1, range.oldListEnd);
            for (int i2 = 0; i2 < iOldSize; i2++) {
                Snake snakeForward = forward(range, callback, centeredArray, centeredArray2, i2);
                if (snakeForward != null) {
                    return snakeForward;
                }
                Snake snakeBackward = backward(range, callback, centeredArray, centeredArray2, i2);
                if (snakeBackward != null) {
                    return snakeBackward;
                }
            }
        }
        return null;
    }

    public static DiffResult calculateDiff(Callback callback, boolean z) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int i2 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        CenteredArray centeredArray = new CenteredArray(i2);
        CenteredArray centeredArray2 = new CenteredArray(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake snakeMidPoint = midPoint(range, callback, centeredArray, centeredArray2);
            if (snakeMidPoint != null) {
                if (snakeMidPoint.diagonalSize() > 0) {
                    arrayList.add(snakeMidPoint.toDiagonal());
                }
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                range2.oldListEnd = snakeMidPoint.startX;
                range2.newListEnd = snakeMidPoint.startY;
                arrayList2.add(range2);
                range.oldListEnd = range.oldListEnd;
                range.newListEnd = range.newListEnd;
                range.oldListStart = snakeMidPoint.endX;
                range.newListStart = snakeMidPoint.endY;
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, DIAGONAL_COMPARATOR);
        return new DiffResult(callback, arrayList, centeredArray.backingData(), centeredArray2.backingData(), z);
    }
}
