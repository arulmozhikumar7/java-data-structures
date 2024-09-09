import java.util.Arrays;

public class Array{
// Inserting element in an array
static void insert(int num,int pos,int arr[]){
   try{
    for(int itr = arr.length -1; itr>pos;itr--){
        arr[itr]=arr[itr-1];
    }
    arr[pos] = num;
   } catch (IndexOutOfBoundsException err){{
    System.out.println(err);
    System.out.println("Array is full");
   }}
   catch(Exception err){
    System.out.println(err);
   }
};

// Displaying an array
static void display(int arr[]){
    for(int itr = 0;itr<arr.length;itr++){
        System.out.println(arr[itr]);
    }
};

// Reversing an array with new array
static void reverse(int arr[]){
    int[] temp_arr = new int[arr.length];
    int temp_itr = 0;
    for(int itr=arr.length-1;itr>0;itr--){
        temp_arr[temp_itr] = arr[itr];
        temp_itr++; 
    }
    for(int itr = 0;itr<arr.length;itr++){
        arr[itr]=temp_arr[itr];
    }
}

// Reversing an array without new array
static void Reverse(int arr[]){
    int n = arr.length;
    for(int itr = 0;itr <n/2;itr++){
        int temp = arr[itr];
        arr[itr] = arr[n-itr-1];
        arr[n-itr-1] = temp;
    }
}

// Rotate array in right 
static void RotateR(int arr[]){
    int n = arr.length;
    int temp = arr[n-1];
    for(int itr = n-1;itr>0;itr--){
        arr[itr] = arr[itr-1];
    }
    arr[0]= temp;
}

// Rotate array in left
static void RotateL(int arr[]){
    int n = arr.length;
    int temp = arr[0];
    for(int itr = 0;itr<n-1;itr++){
        arr[itr]=arr[itr+1];
    }
    arr[n-1] = temp;
}
// Rotate array in right (d times) 
static void RotateRN(int arr[],int d){
    for(int itr = 0;itr<d;itr++){
        RotateR(arr);
    }
}
// Rotate array in left (d times)
static void RotateLN(int arr[],int d){
    for(int itr = 0;itr<d;itr++){
        RotateL(arr);
    }
}

// Linear Search
static void Linear_Search(int arr[],int target){
    int flag = 0 ;
    for(int itr = 0; itr < arr.length;itr++){
        if(arr[itr] == target){
            System.out.println("Target found at index: "+itr);
            flag++;
            break;
        }
    }
    if(flag==0){
        System.out.println("Element not found.");
    }
}

// Binary Search - Works only in a sorted array
static void Binary_Search(int arr[], int target){
    
    
    int size_arr = arr.length;
    int low = 0;
    int high = size_arr - 1;
    int mid;
    int flag = 0;
    while(low<=high){
        mid = low + (high-low)/2;
        if(arr[mid]==target){
            System.out.println("Target found at index "+ mid);
            flag++;
            break;
        }
        else if(arr[mid]>target){
            high = mid -1;
        }
        else{
           low = mid + 1;
        }
    } 
    if(flag==0){
        System.out.println("Element Not Found");
    }
}

public static void main(String args[]){
    int[] arr = new int[20];
    for(int i =0;i<20;i++){
        insert(i,i,arr);
    }
   

   display(arr);
   Linear_Search(arr,19);
   Arrays.sort(arr);
   Binary_Search(arr,19);
}
}