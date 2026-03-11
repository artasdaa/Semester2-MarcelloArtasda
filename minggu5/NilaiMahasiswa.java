package minggu5;

public class NilaiMahasiswa {

    int utsTertinggi(Mahasiswa arr[], int l, int r){
        if(l == r){
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int leftMax = utsTertinggi(arr, l, mid);
        int rightMax = utsTertinggi(arr, mid+1, r);

        return Math.max(leftMax, rightMax);
    }

    int utsTerendah(Mahasiswa arr[], int l, int r){
        if(l == r){
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int leftMin = utsTerendah(arr, l, mid);
        int rightMin = utsTerendah(arr, mid+1, r);

        return Math.min(leftMin, rightMin);
    }

    double rataUAS(Mahasiswa arr[]){
        double total = 0;

        for(int i = 0; i < arr.length; i++){
            total = total + arr[i].uas;
        }

        return total / arr.length;
    }
}