
package Array;


public class MultiDArray {
    int arr[][]=new int[3][5];
        /*
            -Fixed Size
            -Identical ( Specific datatype )
            -Sequential ( Addresses in the memory )
        */
        /*
            First Address->>Head->>h
            C->>Datatype's size in bits
            arr[i][j]=h+i*c*n_col+j*c
            **
            h=1000
            c=32 (int)
            arr[i][j]=h+i*c*n_col+j*c
            arr[0][1]=1000+0*32*5+1*32-->1032
            arr[1][1]=1000+1*32*5+1*32-->1192
            arr[2][2]=1000+2*32*5+2*32-->1384
        */
}
