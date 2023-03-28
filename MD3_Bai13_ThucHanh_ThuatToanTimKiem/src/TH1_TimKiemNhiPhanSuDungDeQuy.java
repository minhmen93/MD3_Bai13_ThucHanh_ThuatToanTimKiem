public class TH1_TimKiemNhiPhanSuDungDeQuy {
    public class BinarySearch {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 70, 79};

        int binarySearch(int[] list, int value) {
            int low = 0;
            int high = list.length - 1;
            while (high >= low) {
                int mid = (low + high) / 2;
                if (value < list[mid])
                    high = mid - 1;
                else if (value == list[mid])
                    return mid;
                else low = mid + 1;
            }
            return -1;
        }

        public void main(String[] args) {
            System.out.println(binarySearch(list,11));
            System.out.println(binarySearch(list,9));
            System.out.println(binarySearch(list,8));
        }
    }
}
